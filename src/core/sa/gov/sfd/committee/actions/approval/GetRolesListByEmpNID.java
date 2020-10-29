package sa.gov.sfd.committee.actions.approval;


import sa.gov.sfd.committee.core.approval.ApprovalServices;
import sa.gov.sfd.committee.core.approval.ApproverTeamEntity;
import sa.gov.sfd.committee.core.approval.WorkflowNumber;
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
