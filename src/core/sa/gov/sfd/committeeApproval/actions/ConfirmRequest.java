package sa.gov.sfd.committeeApproval.actions;


public class ConfirmRequest {/*

    private final ApprovalServices approvalServices;
    private final RequestServices requestServices;
    private final ConfirmationServices confirmationServices;

    public ConfirmRequest(ApprovalServices approvalServices, RequestServices requestServices, ConfirmationServices confirmationServices) {
        this.approvalServices = approvalServices;
        this.requestServices = requestServices;
        this.confirmationServices = confirmationServices;
    }


    public int confirmRequest(ApprovalTransactionEntity approvalTransactionEntity) {
        int reslut = this.approvalServices.approveRequest(approvalTransactionEntity);
        List<RequestID> requestIDS = this.requestServices.getAllRequestIdByConfirmationNumber(new ConfirmationNumber(approvalTransactionEntity.getRequestID()));
        for (RequestID requestID : requestIDS) {
            this.requestServices.acceptRequestByRequestID(requestID);
        }
        this.confirmationServices.acceptConfirmationByConfirmationNumber(new ConfirmationNumber(approvalTransactionEntity.getRequestID()));
        return reslut;

    }*/
}
