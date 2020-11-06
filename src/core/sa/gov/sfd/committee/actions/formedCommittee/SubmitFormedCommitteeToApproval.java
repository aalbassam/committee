package sa.gov.sfd.committee.actions.formedCommittee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import sa.gov.sfd.committee.core.employee.EmployeeNID;
import sa.gov.sfd.committee.core.formedCommittee.FormationStatus;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeService;
import sa.gov.sfd.committee.core.shared.MasterId;
import sa.gov.sfd.committee.core.trackingLog.TrackingLogEntity;
import sa.gov.sfd.committee.core.trackingLog.TrackingLogService;
import sa.gov.sfd.committeeApproval.core.*;

public class SubmitFormedCommitteeToApproval {


    private final FormedCommitteeService formedCommitteeService;
    private final ApprovalServices approvalServices;

    @Autowired
    private TrackingLogService trackingLogService;


    public SubmitFormedCommitteeToApproval(FormedCommitteeService formedCommitteeService, ApprovalServices approvalServices) {
        this.formedCommitteeService = formedCommitteeService;
        this.approvalServices = approvalServices;
    }

    @Transactional
    public int submitFormedCommitteeToApproval(MasterId formationID, EmployeeNID userNID) {

        /* First Step: add to Approval Transaction */
        int workFlowNO = this.approvalServices.approvalPathForEmployee(userNID); // to get workflow Number

        ApprovalTransactionEntity approvalTransactionEntity = new ApprovalTransactionEntity();
        approvalTransactionEntity.setWorkflow(new Workflow(
                new WorkflowNumber(workFlowNO),
                0,
                new TeamID(0),
                ""));
        approvalTransactionEntity.setStep(1);
        approvalTransactionEntity.setUserNID(userNID);
        approvalTransactionEntity.setRequestID(formationID.getId().toString());
        approvalTransactionEntity.setRequestTitle("approval on new formed Committee");
        approvalTransactionEntity.setAction(null);
        approvalTransactionEntity.setType("approval");

        Long newApprovalTransId = this.approvalServices.applyNewApproval(approvalTransactionEntity);

        /* Second Step: add to log */
        if (newApprovalTransId != 0) {
            TrackingLogEntity newLog = new TrackingLogEntity("C_APPROVAL_TRANSACTION", new MasterId(newApprovalTransId), "submitFormedCommitteeToApproval", "INSERT", "com");
            this.trackingLogService.addTrackingLog(newLog);
        }

        /* Third step: update FormedCommittee Status to in progress PR */
        int update = this.formedCommitteeService.updateFormedCommitteeStatusByFormationID(formationID, new FormationStatus("PR"));

        /* Fourth Step: add to log */
        if (update != 0) {
            TrackingLogEntity newLog = new TrackingLogEntity("FORMED_COMMITTEES", new MasterId(formationID.getId()), "submitFormedCommitteeToApproval", "UPDATE", "com");
            this.trackingLogService.addTrackingLog(newLog);
        }

        return 1;

    }
}
