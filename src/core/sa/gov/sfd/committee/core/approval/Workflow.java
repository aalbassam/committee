package sa.gov.sfd.committee.core.approval;

public class Workflow {
    private final WorkflowNumber workflowNumber;
    private final int step;
    private final TeamId teamId;
    private final String action;

    public Workflow(WorkflowNumber workflowNumber, int step, TeamId teamId, String action) {
        this.workflowNumber = workflowNumber;
        this.step = step;
        this.teamId = teamId;
        this.action = action;
    }

    public WorkflowNumber getWorkflowNumber() {
        return workflowNumber;
    }

    public int getStep() {
        return step;
    }


    public TeamId getTeamId() {
        return teamId;
    }

    public String getAction() {
        return action;
    }

}
