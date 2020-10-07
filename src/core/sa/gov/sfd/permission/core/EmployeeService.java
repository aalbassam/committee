package sa.gov.sfd.permission.core;

public class EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeEntity getEmployee(EmployeeNID empNid){
        return employeeRepository.findEmployeeByNationalId(empNid);
    }
    
}