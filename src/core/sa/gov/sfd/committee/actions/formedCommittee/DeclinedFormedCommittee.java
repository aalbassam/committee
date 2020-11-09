package sa.gov.sfd.committee.actions.formedCommittee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import sa.gov.sfd.committee.core.formedCommittee.FormationStatus;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeService;
import sa.gov.sfd.committee.core.shared.MasterId;
import sa.gov.sfd.committee.core.trackingLog.TrackingLogEntity;
import sa.gov.sfd.committee.core.trackingLog.TrackingLogService;
import sa.gov.sfd.committeeApproval.core.ApprovalServices;
import sa.gov.sfd.committeeApproval.core.ApprovalTransactionEntity;

public class DeclinedFormedCommittee {

    private final FormedCommitteeService formedCommitteeService;

    @Autowired
    private ApprovalServices approvalServices;

    @Autowired
    private TrackingLogService trackingLogService;

    public DeclinedFormedCommittee(FormedCommitteeService formedCommitteeService) {
        this.formedCommitteeService = formedCommitteeService;
    }

    @Transactional
    public int declinedFormedCommittee(ApprovalTransactionEntity approvalTransactionEntity) {

        /*Step 1*/
        int declined = this.approvalServices.declineRequest(approvalTransactionEntity); // log?

        /*Step 2*/
        int update = this.formedCommitteeService.updateFormedCommitteeStatusByFormationID(new MasterId(Long.valueOf(approvalTransactionEntity.getRequestID())), new FormationStatus("DE"));

        /*Step 3*/
        if (update != 0) {
            TrackingLogEntity newLog = new TrackingLogEntity("FORMED_COMMITTEES", new MasterId(Long.valueOf(approvalTransactionEntity.getRequestID())), "declinedFormedCommittee", "UPDATE", "com");
            this.trackingLogService.addTrackingLog(newLog);
        }

        return 1;
    }
}
