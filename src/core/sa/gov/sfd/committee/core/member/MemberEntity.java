package sa.gov.sfd.committee.core.member;

import sa.gov.sfd.committee.core.employee.EmployeeEntity;
import sa.gov.sfd.committee.core.shared.BinaryDate;
import sa.gov.sfd.committee.core.shared.MasterId;
import sa.gov.sfd.committee.core.shared.RowStatus;

public class MemberEntity {

    private MasterId memberId;
    private MasterId formedCommitteeNo;
    private EmployeeEntity employeeEntity;
    private MasterId memberRoleId;
    private BinaryDate memberDecisionDate;
    private BinaryDate memberEndJoinDate;
    private RowStatus rowStatus;  // A: Active  D: Deleted

    public MemberEntity(MasterId memberId, MasterId formedCommitteeNo, EmployeeEntity employeeEntity, MasterId memberRoleId, BinaryDate memberDecisionDate, BinaryDate memberEndJoinDate, RowStatus rowStatus) {
        this.memberId = memberId;
        this.formedCommitteeNo = formedCommitteeNo;
        this.employeeEntity = employeeEntity;
        this.memberRoleId = memberRoleId;
        this.memberDecisionDate = memberDecisionDate;
        this.memberEndJoinDate = memberEndJoinDate;
        this.rowStatus = rowStatus;
    }

    public MemberEntity() {
    }

    public MasterId getMemberId() {
        return memberId;
    }

    public void setMemberId(MasterId memberId) {
        this.memberId = memberId;
    }

    public MasterId getFormedCommitteeNo() {
        return formedCommitteeNo;
    }

    public void setFormedCommitteeNo(MasterId formedCommitteeNo) {
        this.formedCommitteeNo = formedCommitteeNo;
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
