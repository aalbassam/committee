package sa.gov.sfd.committee.core.employee;

import java.util.List;

public interface EmployeeRepository {

    List<EmployeeEntity> findAllEmployeeList();

}
