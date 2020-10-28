package sa.gov.sfd.committee.core.member;


import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeNo;
import sa.gov.sfd.committee.core.memberRole.MemberRoleEntity;
import sa.gov.sfd.committee.core.employee.EmployeeEntity;

public class MemberEntity {

    private MemberID memberId;
    private FormedCommitteeNo formedCommitteeNo;
    private EmployeeEntity employeeEntity;
    private MemberRoleEntity memberRoleEntity;
    private MemberDecisionDate memberDecisionDate;
    private MemberEndJoinDate memberEndJoinDate;
    private char rowStatus;  // A: Active  D: Deleted

    public MemberEntity(MemberID memberId, FormedCommitteeNo formedCommitteeNo, EmployeeEntity employeeEntity, MemberRoleEntity memberRoleEntity, MemberDecisionDate memberDecisionDate, MemberEndJoinDate memberEndJoinDate, char rowStatus) {
        this.memberId = memberId;
        this.formedCommitteeNo = formedCommitteeNo;
        this.employeeEntity = employeeEntity;
        this.memberRoleEntity = memberRoleEntity;
        this.memberDecisionDate = memberDecisionDate;
        this.memberEndJoinDate = memberEndJoinDate;
        this.rowStatus = rowStatus;
    }

    public MemberEntity() {
    }

    public MemberID getMemberId() {
        return memberId;
    }

    public void setMemberId(MemberID memberId) {
        this.memberId = memberId;
    }

    public FormedCommitteeNo getFormedCommitteeNo() {
        return formedCommitteeNo;
    }

    public void setFormedCommitteeNo(FormedCommitteeNo formedCommitteeNo) {
        this.formedCommitteeNo = formedCommitteeNo;
    }

    public EmployeeEntity getEmployeeEntity() {
        return employeeEntity;
    }

    public void setEmployeeEntity(EmployeeEntity employeeEntity) {
        this.employeeEntity = employeeEntity;
    }

    public MemberRoleEntity getMemberRoleEntity() {
        return memberRoleEntity;
    }

    public void setMemberRoleEntity(MemberRoleEntity memberRoleEntity) {
        this.memberRoleEntity = memberRoleEntity;
    }

    public MemberDecisionDate getMemberDecisionDate() {
        return memberDecisionDate;
    }

    public void setMemberDecisionDate(MemberDecisionDate memberDecisionDate) {
        this.memberDecisionDate = memberDecisionDate;
    }

    public MemberEndJoinDate getMemberEndJoinDate() {
        return memberEndJoinDate;
    }

    public void setMemberEndJoinDate(MemberEndJoinDate memberEndJoinDate) {
        this.memberEndJoinDate = memberEndJoinDate;
    }

    public char getRowStatus() {
        return rowStatus;
    }

    public void setRowStatus(char rowStatus) {
        this.rowStatus = rowStatus;
    }
}
