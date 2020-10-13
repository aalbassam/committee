package core.sa.gov.sfd.committee.core.committee;

public class MemberRole {

    private final MemberRoleID memberRoleID;
    private final MemberRoleName memberRoleName;

    public MemberRole(MemberRoleID memberRoleID, MemberRoleName memberRoleName) {
        this.memberRoleID = memberRoleID;
        this.memberRoleName = memberRoleName;
    }

    @Override
    public String toString() {
        return "MemberRole{" +
                "memberRoleID=" + memberRoleID +
                ", memberRoleName=" + memberRoleName +
                '}';
    }

    public MemberRoleID getMemberRoleID() {
        return memberRoleID;
    }


    public MemberRoleName getMemberRoleName() {
        return memberRoleName;
    }

}
