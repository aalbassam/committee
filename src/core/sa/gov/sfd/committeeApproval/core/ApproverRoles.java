package sa.gov.sfd.committeeApproval.core;

public class ApproverRoles {

    private final int approvalRole;
    private final int declinedRole;
    private final int viewRole;
    private final int confirmedRole;

    public ApproverRoles(int approvalRole, int declinedRole, int viewRole, int confirmedRole) {
        this.approvalRole = approvalRole;
        this.declinedRole = declinedRole;
        this.viewRole = viewRole;
        this.confirmedRole = confirmedRole;
    }

    public int getApprovalRole() {
        return approvalRole;
    }

    public int getDeclinedRole() {
        return declinedRole;
    }

    public int getViewRole() {
        return viewRole;
    }

    public int getConfirmedRole() {
        return confirmedRole;
    }
}


