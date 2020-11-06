package sa.gov.sfd.committeeApproval.core;


import sa.gov.sfd.committee.core.employee.EmployeeNID;

import java.util.List;


public interface ApprovalRepository {

    Long applyNewApproval(ApprovalTransactionEntity approvalTransactionEntity);

    List<ApprovalTransactionEntity> loadApprovalPendingByApproverNID(EmployeeNID employeeNID);

    List<ApprovalPath> approvalPathForEmployee(List<Long> EmployeesNID);

    int approvalPathForEmployee(EmployeeNID EmployeesNID);

    ApproverTeamEntity getRolesListByEmpNID(EmployeeNID employeeNID, WorkflowNumber workflowNumber, int step, String workflowType);

    int declineRequest(ApprovalTransactionEntity approvalTransactionEntity);

    int approveRequest(ApprovalTransactionEntity approvalTransactionEntity);

    ApprovalTransactionEntity getLastRecordInTransaction(EmployeeNID employeeNID);

}
