package sa.gov.sfd.committee.actions.approval;


import sa.gov.sfd.committee.core.approval.ApprovalServices;
import sa.gov.sfd.committee.core.approval.ApprovalTransactionEntity;

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


// update (action)
// insert new Transaction (step +1)
// approver (hr) update stute = redy


//        ApprovalTransactionEntity approvalTransactionEntity2 = approvalTransactionEntity;//
//        approvalTransactionEntity2.setStep(approvalTransactionEntity.getStep()+1);
//        this.approvalServices.applyNewApproval(approvalTransactionEntity2);


