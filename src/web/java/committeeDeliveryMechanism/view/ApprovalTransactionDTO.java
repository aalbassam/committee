package committeeDeliveryMechanism.view;

public class ApprovalTransactionDTO {

    private Long id;
    private int workflowNo;
    private int step;
    private Long userId;
    private String requestId;
    private String action;
    private String note;
    private String requestTitle;
    private String type;

    public ApprovalTransactionDTO(Long id, int workflowNo, int step, Long userId, String requestId, String action, String note, String requestTitle, String type) {
        this.id = id;
        this.workflowNo = workflowNo;
        this.step = step;
        this.userId = userId;
        this.requestId = requestId;
        this.action = action;
        this.note = note;
        this.requestTitle = requestTitle;
        this.type = type;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getWorkflowNo() {
        return workflowNo;
    }

    public void setWorkflowNo(int workflowNo) {
        this.workflowNo = workflowNo;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getRequestTitle() {
        return requestTitle;
    }

    public void setRequestTitle(String requestTitle) {
        this.requestTitle = requestTitle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
