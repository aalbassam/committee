package sa.gov.sfd.committeeApproval.core;

import sa.gov.sfd.committee.core.employee.EmployeeNID;

public class ApproverTeamEntity {

    private ApproverTeamID approverTeamID;
    private TeamID teamId;
    private String teamName;
    private EmployeeNID employeeNID;
    private ApproverRoles approverRoles;

    public ApproverTeamEntity() {
    }

    public ApproverTeamEntity(ApproverTeamID approverTeamID, TeamID teamId, String teamName, EmployeeNID employeeNID, ApproverRoles approverRoles) {
        this.approverTeamID = approverTeamID;
        this.teamId = teamId;
        this.teamName = teamName;
        this.employeeNID = employeeNID;
        this.approverRoles = approverRoles;
    }

    public ApproverTeamID getApproverTeamID() {
        return approverTeamID;
    }

    public void setApproverTeamID(ApproverTeamID approverTeamID) {
        this.approverTeamID = approverTeamID;
    }

    public TeamID getTeamId() {
        return teamId;
    }

    public void setTeamId(TeamID teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public EmployeeNID getEmployeeNID() {
        return employeeNID;
    }

    public void setEmployeeNID(EmployeeNID employeeNID) {
        this.employeeNID = employeeNID;
    }

    public ApproverRoles getApproverRoles() {
        return approverRoles;
    }

    public void setApproverRoles(ApproverRoles approverRoles) {
        this.approverRoles = approverRoles;
    }
}