package sa.gov.sfd.committeeApproval.core;


import sa.gov.sfd.committee.core.employee.EmployeeNID;

import java.util.List;

public class ApprovalServices {
    private final ApprovalRepository approvalRepository;

    public ApprovalServices(ApprovalRepository approvalRepository) {
        this.approvalRepository = approvalRepository;
    }


    public Long applyNewApproval(ApprovalTransactionEntity approvalTransactionEntity) {
        return this.approvalRepository.applyNewApproval(approvalTransactionEntity); //used
    }

    public List<ApprovalPath> approvalPathForEmployee(List<Long> EmployeesNID) {
        return this.approvalRepository.approvalPathForEmployee(EmployeesNID);
    }

    public int approvalPathForEmployee(EmployeeNID employeesNID) {
        return this.approvalRepository.approvalPathForEmployee(employeesNID);  //used
    }

    public List<ApprovalTransactionEntity> loadApprovalPendingByApproverNID(EmployeeNID employeeNID) {
        return this.approvalRepository.loadApprovalPendingByApproverNID(employeeNID);
    }

    public ApproverTeamEntity getRolesListByEmpNID(EmployeeNID employeeNID, WorkflowNumber workflowNumber, int step, String workflowType) {
        return this.approvalRepository.getRolesListByEmpNID(employeeNID, workflowNumber, step, workflowType);
    }

    public int declineRequest(ApprovalTransactionEntity approvalTransactionEntity) {
        return this.approvalRepository.declineRequest(approvalTransactionEntity);
    }

    public int approveRequest(ApprovalTransactionEntity approvalTransactionEntity) {
        return this.approvalRepository.approveRequest(approvalTransactionEntity);
    }

    public ApprovalTransactionEntity getLastRecordInTransaction(EmployeeNID employeeNID) {
        return this.approvalRepository.getLastRecordInTransaction(employeeNID);
    }


}
