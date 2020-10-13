package core.sa.gov.sfd.committee.actions.employee;

import core.sa.gov.sfd.committee.core.employee.EmployeeEntity;
import core.sa.gov.sfd.committee.core.employee.EmployeeService;

import java.util.List;

public class GetEmployeesList {


    private final EmployeeService employeeService;

    public GetEmployeesList(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public List<EmployeeEntity> getAllEmployeeList() {
        return this.employeeService.getAllEmployeeList();
    }
}
