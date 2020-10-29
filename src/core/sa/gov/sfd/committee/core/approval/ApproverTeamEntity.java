package sa.gov.sfd.committee.core.approval;


import sa.gov.sfd.committee.core.employee.EmployeeNID;

public class ApproverTeamEntity {

    private ApproverTeamId approverTeamId;
    private TeamId teamId;
    private TeamName teamName;
    private EmployeeNID employeeNID;
    private ApproverRoles approverRoles;

    public ApproverTeamEntity() {
    }

    public ApproverTeamEntity(ApproverTeamId approverTeamId, TeamId teamId, TeamName teamName, EmployeeNID employeeNID, ApproverRoles approverRoles) {
        this.approverTeamId = approverTeamId;
        this.teamId = teamId;
        this.teamName = teamName;
        this.employeeNID = employeeNID;
        this.approverRoles = approverRoles;
    }

    public ApproverTeamId getApproverTeamId() {
        return approverTeamId;
    }

    public void setApproverTeamId(ApproverTeamId approverTeamId) {
        this.approverTeamId = approverTeamId;
    }

    public TeamId getTeamId() {
        return teamId;
    }

    public void setTeamId(TeamId teamId) {
        this.teamId = teamId;
    }

    public TeamName getTeamName() {
        return teamName;
    }

    public void setTeamName(TeamName teamName) {
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
