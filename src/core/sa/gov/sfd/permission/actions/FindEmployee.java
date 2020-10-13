package core.sa.gov.sfd.permission.actions;

import core.sa.gov.sfd.permission.core.EmployeeService;

public class FindEmployee {

    private EmployeeService employeeService;

    public FindEmployee(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public sa.gov.sfd.permission.core.EmployeeEntity find(Long empNid) {
        return employeeService.getEmployee(new sa.gov.sfd.permission.core.EmployeeNID(empNid));
    }
}