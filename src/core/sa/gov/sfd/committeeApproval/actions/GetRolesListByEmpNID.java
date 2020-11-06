package sa.gov.sfd.committeeApproval.actions;


import sa.gov.sfd.committeeApproval.core.ApprovalServices;
import sa.gov.sfd.committeeApproval.core.ApproverTeamEntity;
import sa.gov.sfd.committeeApproval.core.WorkflowNumber;
import sa.gov.sfd.committee.core.employee.EmployeeNID;

public class GetRolesListByEmpNID {
    private final ApprovalServices approvalServices;

    public GetRolesListByEmpNID(ApprovalServices approvalServices) {
        this.approvalServices = approvalServices;
    }

    public ApproverTeamEntity getRolesListByEmpNID(EmployeeNID employeeNID, WorkflowNumber workflowNumber, int step, String workflowType) {
        return this.approvalServices.getRolesListByEmpNID(employeeNID, workflowNumber, step, workflowType);
    }
}
