package sa.gov.sfd.committee.core.memberRole;

public class MemberRoleEntity {

    private MemberRoleID memberRoleID;
    private MemberRoleName memberRoleName;

    public MemberRoleEntity(MemberRoleID memberRoleID, MemberRoleName memberRoleName) {
        this.memberRoleID = memberRoleID;
        this.memberRoleName = memberRoleName;
    }

    @Override
    public String toString() {
        return "MemberRoleEntity{" +
                "memberRoleID=" + memberRoleID +
                ", memberRoleName=" + memberRoleName +
                '}';
    }

    public MemberRoleID getMemberRoleID() {
        return memberRoleID;
    }

    public void setMemberRoleID(MemberRoleID memberRoleID) {
        this.memberRoleID = memberRoleID;
    }

    public MemberRoleName getMemberRoleName() {
        return memberRoleName;
    }

    public void setMemberRoleName(MemberRoleName memberRoleName) {
        this.memberRoleName = memberRoleName;
    }
}
