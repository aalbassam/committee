package sa.gov.sfd.committeeApproval.actions;

public class DeclineRequest {/*

    private final ApprovalServices approvalServices;
    private final RequestServices requestServices;
    private final ConfirmationServices confirmationServices;

    public DeclineRequest(ApprovalServices approvalServices, RequestServices requestServices, ConfirmationServices confirmationServices) {
        this.approvalServices = approvalServices;
        this.requestServices = requestServices;
        this.confirmationServices = confirmationServices;
    }

    public int declineRequest(ApprovalTransactionEntity approvalTransactionEntity) {

        int reslut = this.approvalServices.declineRequest(approvalTransactionEntity);

        if (approvalTransactionEntity.getRequestType().equalsIgnoreCase("Loan")) {
            this.requestServices.rejectRequestByRequestID(new RequestID(approvalTransactionEntity.getRequestID()));
        }
        if (approvalTransactionEntity.getRequestType().equalsIgnoreCase("Confirmation")) {
            this.confirmationServices.rejectConfirmationByConfirmationNumber(new ConfirmationNumber(approvalTransactionEntity.getRequestID()));
            List<RequestID> requestIDS = this.requestServices.getAllRequestIdByConfirmationNumber(new ConfirmationNumber(approvalTransactionEntity.getRequestID()));
            for (RequestID requestID : requestIDS) {
                this.requestServices.rejectRequestByRequestID(requestID);
            }
        }
        return reslut;

    }*/
}