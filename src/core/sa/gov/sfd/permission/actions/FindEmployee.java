package sa.gov.sfd.permission.actions;

import sa.gov.sfd.permission.core.EmployeeEntity;
import sa.gov.sfd.permission.core.EmployeeNID;
import sa.gov.sfd.permission.core.EmployeeService;

public class FindEmployee {

    private EmployeeService employeeService;

    public FindEmployee(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public EmployeeEntity find(Long empNid){
        return employeeService.getEmployee(new EmployeeNID(empNid));
    }
}