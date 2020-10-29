package sa.gov.sfd.committee.core.approval;


import sa.gov.sfd.committee.core.employee.EmployeeNID;

public class ApprovalTransactionEntity {

    private int id;
    private int step;
    private Workflow workflow;
    private EmployeeNID employeeNID;
    private String requestID;
    private String requestTitle;
    private String requestType;
    private String action;
    private String type;
    private String note;


    public ApprovalTransactionEntity() {
    }

    public ApprovalTransactionEntity(int id, int step, Workflow workflow, EmployeeNID employeeNID, String requestID, String requestTitle, String requestType, String action, String type, String note) {
        this.id = id;
        this.step = step;
        this.workflow = workflow;
        this.employeeNID = employeeNID;
        this.requestID = requestID;
        this.requestTitle = requestTitle;
        this.requestType = requestType;
        this.action = action;
        this.type = type;
        this.note = note;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public EmployeeNID getEmployeeNID() {
        return employeeNID;
    }

    public void setEmployeeNID(EmployeeNID employeeNID) {
        this.employeeNID = employeeNID;
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

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
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
