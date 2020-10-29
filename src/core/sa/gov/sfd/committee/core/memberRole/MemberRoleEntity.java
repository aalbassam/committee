package sa.gov.sfd.committee.core.memberRole;

import sa.gov.sfd.committee.core.shared.BinaryName;

public class MemberRoleEntity {

    private MemberRoleID memberRoleID;
    private BinaryName memberRoleName;
    private char rowStatus;

    public MemberRoleEntity(MemberRoleID memberRoleID, BinaryName memberRoleName, char rowStatus) {
        this.memberRoleID = memberRoleID;
        this.memberRoleName = memberRoleName;
        this.rowStatus = rowStatus;
    }

    public MemberRoleEntity(MemberRoleID memberRoleID) {
        this.memberRoleID = memberRoleID;
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

    public BinaryName getMemberRoleName() {
        return memberRoleName;
    }

    public void setMemberRoleName(BinaryName memberRoleName) {
        this.memberRoleName = memberRoleName;
    }

    public char getRowStatus() {
        return rowStatus;
    }

    public void setRowStatus(char rowStatus) {
        this.rowStatus = rowStatus;
    }
}
