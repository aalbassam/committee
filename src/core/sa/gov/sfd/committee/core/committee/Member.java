package core.sa.gov.sfd.committee.core.committee;

import sa.gov.sfd.committee.core.employee.EmployeeEntity;

public class Member {

    private final MemberID memberID;
    private final sa.gov.sfd.committee.core.employee.EmployeeEntity employeeEntity;
    private final MemberRole memberRole;
    private final MemberDecisionDate memberDecisionDate;
    private final MemberEndJoinDate memberEndJoinDate;
    private final char status; // M Role ov

    public Member(MemberID memberID, EmployeeEntity employeeEntity, MemberRole memberRole, MemberDecisionDate memberDecisionDate, MemberEndJoinDate memberEndJoinDate, char status) {
        this.memberID = memberID;
        this.employeeEntity = employeeEntity;
        this.memberRole = memberRole;
        this.memberDecisionDate = memberDecisionDate;
        this.memberEndJoinDate = memberEndJoinDate;
        this.status = status;
    }

    public MemberID getMemberID() {
        return memberID;
    }

    public EmployeeEntity getEmployeeEntity() {
        return employeeEntity;
    }

    public MemberRole getMemberRole() {
        return memberRole;
    }

    public MemberDecisionDate getMemberDecisionDate() {
        return memberDecisionDate;
    }

    public MemberEndJoinDate getMemberEndJoinDate() {
        return memberEndJoinDate;
    }

    public char getStatus() {
        return status;
    }
}
