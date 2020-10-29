package sa.gov.sfd.committee.core.approval;


import sa.gov.sfd.committee.core.employee.EmployeeNID;

import java.util.List;


public interface ApprovalRepository {
    ApprovalTransactionEntity applyNewApproval(ApprovalTransactionEntity approvalTransactionEntity);

    List<ApprovalTransactionEntity> loadApprovalPendingByApproverNID(EmployeeNID employeeNID);

    List<ApprovalPath> approvalPathForEmployee(List<Long> EmployeesNID);

    ApproverTeamEntity getRolesListByEmpNID(EmployeeNID employeeNID, WorkflowNumber workflowNumber, int step, String workflowType);

    int declineRequest(ApprovalTransactionEntity approvalTransactionEntity);

    int approveRequest(ApprovalTransactionEntity approvalTransactionEntity);

    ApprovalTransactionEntity getLastRecordInTransaction(EmployeeNID employeeNID);


}
