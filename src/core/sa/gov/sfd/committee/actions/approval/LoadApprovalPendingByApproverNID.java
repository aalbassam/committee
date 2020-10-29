package sa.gov.sfd.committee.actions.approval;


import sa.gov.sfd.committee.core.approval.ApprovalServices;
import sa.gov.sfd.committee.core.approval.ApprovalTransactionEntity;
import sa.gov.sfd.committee.core.employee.EmployeeNID;

import java.util.List;

public class LoadApprovalPendingByApproverNID {

    private final ApprovalServices approvalServices;


    public LoadApprovalPendingByApproverNID(ApprovalServices approvalServices) {
        this.approvalServices = approvalServices;
    }

    public List<ApprovalTransactionEntity> loadApprovalPendingByApproverNID(EmployeeNID employeeNID) {
        return this.approvalServices.loadApprovalPendingByApproverNID(employeeNID);
    }
}
