package sa.gov.sfd.committeeApproval.core;

import sa.gov.sfd.committee.core.employee.EmployeeNID;

public class ApprovalTransactionEntity {

    private ApprovalTransactionID id;
    private int step;
    private Workflow workflow;
    private EmployeeNID userNID;
    private String requestID;
    private String requestTitle;
    private String action;
    private String type;
    private String note;

    public ApprovalTransactionEntity() {
    }

    public ApprovalTransactionEntity(ApprovalTransactionID id, int step, Workflow workflow, EmployeeNID userNID, String requestID, String requestTitle, String action, String type, String note) {
        this.id = id;
        this.step = step;
        this.workflow = workflow;
        this.userNID = userNID;
        this.requestID = requestID;
        this.requestTitle = requestTitle;
        this.action = action;
        this.type = type;
        this.note = note;
    }

    public ApprovalTransactionID getId() {
        return id;
    }

    public void setId(ApprovalTransactionID id) {
        this.id = id;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public Workflow getWorkflow() {
        return workflow;
    }

    public void setWorkflow(Workflow workflow) {
        this.workflow = workflow;
    }

    public EmployeeNID getUserNID() {
        return userNID;
    }

    public void setUserNID(EmployeeNID userNID) {
        this.userNID = userNID;
    }

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public String getRequestTitle() {
        return requestTitle;
    }

    public void setRequestTitle(String requestTitle) {
        this.requestTitle = requestTitle;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
