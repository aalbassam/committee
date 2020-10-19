package sa.gov.sfd.committee.core.employee;

import java.util.List;

public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeEntity> getAllEmployeeList() {
        return this.employeeRepository.findAllEmployeeList();
    }
}


