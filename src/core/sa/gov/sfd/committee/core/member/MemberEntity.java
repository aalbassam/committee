package sa.gov.sfd.committee.core.member;

import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeEntity;
import sa.gov.sfd.committee.core.memberRole.MemberRoleEntity;
import sa.gov.sfd.permission.core.EmployeeEntity;

public class MemberEntity {

    private MemberID memberID;
    private EmployeeEntity employeeEntity;
    private FormedCommitteeEntity formedCommitteeEntity;
    private MemberRoleEntity memberRoleEntity;
    private MemberDecisionDate memberDecisionDate;
    private MemberEndJoinDate memberEndJoinDate;
    private char status;
    // M Role ov

    public MemberEntity(MemberID memberID, EmployeeEntity employeeEntity, FormedCommitteeEntity formedCommitteeEntity, MemberRoleEntity memberRoleEntity, MemberDecisionDate memberDecisionDate, MemberEndJoinDate memberEndJoinDate, char status) {
        this.memberID = memberID;
        this.employeeEntity = employeeEntity;
        this.formedCommitteeEntity = formedCommitteeEntity;
        this.memberRoleEntity = memberRoleEntity;
        this.memberDecisionDate = memberDecisionDate;
        this.memberEndJoinDate = memberEndJoinDate;
        this.status = status;
    }

    @Override
    public String toString() {
        return "MemberEntity{" +
                "memberID=" + memberID +
                ", employeeEntity=" + employeeEntity +
                ", formedCommitteeEntity=" + formedCommitteeEntity +
                ", memberRoleEntity=" + memberRoleEntity +
                ", memberDecisionDate=" + memberDecisionDate +
                ", memberEndJoinDate=" + memberEndJoinDate +
                ", status=" + status +
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

    public FormedCommitteeEntity getFormedCommitteeEntity() {
        return formedCommitteeEntity;
    }

    public void setFormedCommitteeEntity(FormedCommitteeEntity formedCommitteeEntity) {
        this.formedCommitteeEntity = formedCommitteeEntity;
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

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
}
