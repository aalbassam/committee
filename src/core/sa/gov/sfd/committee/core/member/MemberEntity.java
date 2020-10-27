package sa.gov.sfd.committee.core.member;


import sa.gov.sfd.committee.core.memberRole.MemberRoleEntity;
import sa.gov.sfd.committee.core.employee.EmployeeEntity;

public class MemberEntity {

    private MemberID memberID;
    private EmployeeEntity employeeEntity;
    private MemberRoleEntity memberRoleEntity;
    private MemberDecisionDate memberDecisionDate;
    private MemberEndJoinDate memberEndJoinDate;
    private char rowStatus;  // A: Active  D: Deleted

    public MemberEntity(MemberID memberID, EmployeeEntity employeeEntity, MemberRoleEntity memberRoleEntity, MemberDecisionDate memberDecisionDate, MemberEndJoinDate memberEndJoinDate, char rowStatus) {
        this.memberID = memberID;
        this.employeeEntity = employeeEntity;
        this.memberRoleEntity = memberRoleEntity;
        this.memberDecisionDate = memberDecisionDate;
        this.memberEndJoinDate = memberEndJoinDate;
        this.rowStatus = rowStatus;
    }

    @Override
    public String toString() {
        return "MemberEntity{" +
                "memberID=" + memberID +
                ", employeeEntity=" + employeeEntity +
                ", memberRole=" + memberRoleEntity +
                ", memberDecisionDate=" + memberDecisionDate +
                ", memberEndJoinDate=" + memberEndJoinDate +
                ", rowStatus=" + rowStatus +
                '}';
    }

    public MemberID getMemberID() {
        return memberID;
    }

    public void setMemberID(MemberID memberID) {
        this.memberID = memberID;
    }

    public EmployeeEntity getEmployeeEntity() {
        return employeeEntity;
    }

    public void setEmployeeEntity(EmployeeEntity employeeEntity) {
        this.employeeEntity = employeeEntity;
    }

    public MemberRoleEntity getMemberRole() {
        return memberRoleEntity;
    }

    public void setMemberRole(MemberRoleEntity memberRoleEntity) {
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
