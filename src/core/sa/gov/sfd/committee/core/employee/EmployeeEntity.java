package sa.gov.sfd.committee.core.employee;

public class EmployeeEntity {

    private EmployeeNID employeeNID;
    private String fullName;
    private String deptName;

    public EmployeeEntity(EmployeeNID employeeNID, String fullName, String deptName) {
        this.employeeNID = employeeNID;
        this.fullName = fullName;
        this.deptName = deptName;
    }

    public EmployeeEntity(EmployeeNID employeeNID) {
        this.employeeNID = employeeNID;
    }

    public EmployeeNID getEmployeeNID() {
        return employeeNID;
    }

    public void setEmployeeNID(EmployeeNID employeeNID) {
        this.employeeNID = employeeNID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
