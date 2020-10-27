package sa.gov.sfd.committee.infrastructure;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import sa.gov.sfd.committee.core.employee.EmployeeEntity;
import sa.gov.sfd.committee.core.employee.EmployeeRepository;

import java.util.List;

@Repository
public class EmployeesRepositoryImp implements EmployeeRepository {


    private final JdbcTemplate jdbcTemplate;

    public EmployeesRepositoryImp(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<EmployeeEntity> findAllEmployeeList() {

        String q1 = "SELECT FULLNAME, EM_NATIONAL_ID, DEPTSEC_NAME FROM itdev_viewTablePool.EMPLOYEE_RECORD order by FULLNAME";
        String test = "SELECT EM_NATIONAL_ID, EM_FULL_NAME, EM_DEPARTMENT_NAME FROM BASSAM_EMPLOYEES";

        return jdbcTemplate.query(test, new EmployeeMapper());
    }
}

