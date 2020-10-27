package sa.gov.sfd.committee.core.memberRole;

public class MemberRoleEntity {

    private MemberRoleID memberRoleID;
    private MemberRoleName memberRoleName;
    private char rowStatus;

    public MemberRoleEntity(MemberRoleID memberRoleID, MemberRoleName memberRoleName, char rowStatus) {
        this.memberRoleID = memberRoleID;
        this.memberRoleName = memberRoleName;
        this.rowStatus = rowStatus;
    }

    @Override
    public String toString() {
        return "MemberRoleEntity{" +
                "memberRoleID=" + memberRoleID +
                ", memberRoleName=" + memberRoleName +
                ", rowStatus=" + rowStatus +
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

    public char getRowStatus() {
        return rowStatus;
    }

    public void setRowStatus(char rowStatus) {
        this.rowStatus = rowStatus;
    }
}
