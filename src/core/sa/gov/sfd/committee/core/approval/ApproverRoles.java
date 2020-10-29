package sa.gov.sfd.committee.core.approval;

public class ApproverRoles {

    private final int approvedRole;
    private final int declinedRole;
    private final int issuedNewConformation;
    private final int viewRole;
    private final int confirmedRole;

    public ApproverRoles(int approvedRole, int declinedRole, int issuedNewConformation, int viewRole, int confirmedRole) {
        this.approvedRole = approvedRole;
        this.declinedRole = declinedRole;
        this.issuedNewConformation = issuedNewConformation;
        this.viewRole = viewRole;
        this.confirmedRole = confirmedRole;
    }

    public int getApprovedRole() {
        return approvedRole;
    }

    public int getDeclinedRole() {
        return declinedRole;
    }

    public int getIssuedNewConformation() {
        return issuedNewConformation;
    }

    public int getViewRole() {
        return viewRole;
    }

    public int getConfirmedRole() {
        return confirmedRole;
    }
}


