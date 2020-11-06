package sa.gov.sfd.committeeApproval.core;

public class Workflow {

    private final WorkflowNumber workflowNumber;
    private final int step;
    private final TeamID teamId;
    private final String action;

    public Workflow(WorkflowNumber workflowNumber, int step, TeamID teamId, String action) {
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


    public TeamID getTeamId() {
        return teamId;
    }

    public String getAction() {
        return action;
    }

}
