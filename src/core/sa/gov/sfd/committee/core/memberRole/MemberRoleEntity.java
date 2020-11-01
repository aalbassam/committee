package sa.gov.sfd.committee.core.memberRole;

import sa.gov.sfd.committee.core.shared.BinaryName;
import sa.gov.sfd.committee.core.shared.MasterId;
import sa.gov.sfd.committee.core.shared.RowStatus;

public class MemberRoleEntity {

    private MasterId memberRoleID;
    private BinaryName memberRoleName;
    private RowStatus rowStatus;

    public MemberRoleEntity(MasterId memberRoleID, BinaryName memberRoleName, RowStatus rowStatus) {
        this.memberRoleID = memberRoleID;
        this.memberRoleName = memberRoleName;
        this.rowStatus = rowStatus;
    }

    public MemberRoleEntity(MasterId memberRoleID) {
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

    public MasterId getMemberRoleID() {
        return memberRoleID;
    }

    public void setMemberRoleID(MasterId memberRoleID) {
        this.memberRoleID = memberRoleID;
    }

    public BinaryName getMemberRoleName() {
        return memberRoleName;
    }

    public void setMemberRoleName(BinaryName memberRoleName) {
        this.memberRoleName = memberRoleName;
    }

    public RowStatus getRowStatus() {
        return rowStatus;
    }

    public void setRowStatus(RowStatus rowStatus) {
        this.rowStatus = rowStatus;
    }
}
