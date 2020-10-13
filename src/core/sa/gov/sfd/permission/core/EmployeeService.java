package core.sa.gov.sfd.permission.core;

public class EmployeeService {
    private sa.gov.sfd.permission.core.EmployeeRepository employeeRepository;

    public EmployeeService(sa.gov.sfd.permission.core.EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public sa.gov.sfd.permission.core.EmployeeEntity getEmployee(sa.gov.sfd.permission.core.EmployeeNID empNid) {
        return null; //employeeRepository.findEmployeeByNationalId(empNid);
    }

}