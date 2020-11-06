package sa.gov.sfd.committeeApproval.core;


import sa.gov.sfd.committee.core.employee.EmployeeNID;

public class ApprovalPath {
    private final EmployeeNID employeeNID;
    private final int workFlowNumber;


    public ApprovalPath(EmployeeNID employeeNID, int workFlowNumber) {
        this.employeeNID = employeeNID;
        this.workFlowNumber = workFlowNumber;
    }

    public EmployeeNID getEmployeeNID() {
        return employeeNID;
    }

    public int getWorkFlowNumber() {
        return workFlowNumber;
    }
}
