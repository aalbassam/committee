package sa.gov.sfd.committee.actions.formedCommittee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import sa.gov.sfd.committee.core.employee.EmployeeNID;
import sa.gov.sfd.committee.core.formedCommittee.FormationStatus;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeService;
import sa.gov.sfd.committee.core.shared.MasterId;
import sa.gov.sfd.committee.core.trackingLog.TrackingLogEntity;
import sa.gov.sfd.committee.core.trackingLog.TrackingLogService;
import sa.gov.sfd.committeeApproval.actions.ApproveRequest;
import sa.gov.sfd.committeeApproval.core.ApprovalTransactionEntity;

public class ConfirmFormedCommittee {

    private final FormedCommitteeService formedCommitteeService;

    @Autowired
    private ApproveRequest approveRequest;

    @Autowired
    private TrackingLogService trackingLogService;

    public ConfirmFormedCommittee(FormedCommitteeService formedCommitteeService) {
        this.formedCommitteeService = formedCommitteeService;
    }

    @Transactional
    public int confirmFormedCommittee(ApprovalTransactionEntity approvalTransactionEntity, EmployeeNID approverId) {

        /*Step 1*/
        int approval = this.approveRequest.approveRequest(approvalTransactionEntity); // log?

        /*Step 2*/
        int update = this.formedCommitteeService.updateFormedCommitteeStatusAndApproverByFormationID(new MasterId(Long.valueOf(approvalTransactionEntity.getRequestID())), new FormationStatus("AP"), approverId);

        /*Step 3*/
        if (update != 0) {
            TrackingLogEntity newLog = new TrackingLogEntity("FORMED_COMMITTEES", new MasterId(Long.valueOf(approvalTransactionEntity.getRequestID())), "confirmFormedCommittee", "UPDATE", "com");
            this.trackingLogService.addTrackingLog(newLog);
        }

        return 1;
    }
}
