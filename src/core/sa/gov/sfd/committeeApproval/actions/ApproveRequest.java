package sa.gov.sfd.committeeApproval.actions;


import sa.gov.sfd.committeeApproval.core.ApprovalServices;
import sa.gov.sfd.committeeApproval.core.ApprovalTransactionEntity;

public class ApproveRequest {
    private final ApprovalServices approvalServices;

    public ApproveRequest(ApprovalServices approvalServices) {
        this.approvalServices = approvalServices;
    }

    public int approveRequest(ApprovalTransactionEntity approvalTransactionEntity) {

        int result = this.approvalServices.approveRequest(approvalTransactionEntity);

        approvalTransactionEntity.setStep(approvalTransactionEntity.getStep() + 1);
        this.approvalServices.applyNewApproval(approvalTransactionEntity);
        return result;

    }


}


