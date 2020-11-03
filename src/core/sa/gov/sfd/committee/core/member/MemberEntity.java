package sa.gov.sfd.committee.core.member;

import sa.gov.sfd.committee.core.employee.EmployeeEntity;
import sa.gov.sfd.committee.core.shared.BinaryDate;
import sa.gov.sfd.committee.core.shared.MasterId;
import sa.gov.sfd.committee.core.shared.RowStatus;

public class MemberEntity {

    private MasterId memberID;
    private MasterId formedCommitteeId;
    private EmployeeEntity employeeEntity;
    private MasterId memberRoleId;
    private BinaryDate memberDecisionDate;
    private BinaryDate memberEndJoinDate;
    private RowStatus rowStatus;  // A: Active  D: Deleted

    public MemberEntity(MasterId memberID, MasterId formedCommitteeId, EmployeeEntity employeeEntity, MasterId memberRoleId, BinaryDate memberDecisionDate, BinaryDate memberEndJoinDate, RowStatus rowStatus) {
        this.memberID = memberID;
        this.formedCommitteeId = formedCommitteeId;
        this.employeeEntity = employeeEntity;
        this.memberRoleId = memberRoleId;
        this.memberDecisionDate = memberDecisionDate;
        this.memberEndJoinDate = memberEndJoinDate;
        this.rowStatus = rowStatus;
    }

    public MemberEntity() {
    }

    public MasterId getMemberID() {
        return memberID;
    }

    public void setMemberID(MasterId memberID) {
        this.memberID = memberID;
    }

    public MasterId getFormedCommitteeId() {
        return formedCommitteeId;
    }

    public void setFormedCommitteeId(MasterId formedCommitteeId) {
        this.formedCommitteeId = formedCommitteeId;
    }

    public EmployeeEntity getEmployeeEntity() {
        return employeeEntity;
    }

    public void setEmployeeEntity(EmployeeEntity employeeEntity) {
        this.employeeEntity = employeeEntity;
    }

    public MasterId getMemberRoleId() {
        return memberRoleId;
    }

    public void setMemberRoleId(MasterId memberRoleId) {
        this.memberRoleId = memberRoleId;
    }

    public BinaryDate getMemberDecisionDate() {
        return memberDecisionDate;
    }

    public void setMemberDecisionDate(BinaryDate memberDecisionDate) {
        this.memberDecisionDate = memberDecisionDate;
    }

    public BinaryDate getMemberEndJoinDate() {
        return memberEndJoinDate;
    }

    public void setMemberEndJoinDate(BinaryDate memberEndJoinDate) {
        this.memberEndJoinDate = memberEndJoinDate;
    }

    public RowStatus getRowStatus() {
        return rowStatus;
    }

    public void setRowStatus(RowStatus rowStatus) {
        this.rowStatus = rowStatus;
    }
}
