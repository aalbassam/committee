package sa.gov.sfd.committee.infrastructure;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import sa.gov.sfd.committee.core.employee.EmployeeEntity;
import sa.gov.sfd.committee.core.employee.EmployeeRepository;

import java.util.List;

@Repository
public class EmployeesRepositoryImp implements EmployeeRepository {


    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public EmployeesRepositoryImp(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }


    @Override
    public List<EmployeeEntity> findAllEmployeeList() {

        final String q1 = "SELECT FULLNAME, EM_NATIONAL_ID, DEPTSEC_NAME FROM itdev_viewTablePool.EMPLOYEE_RECORD order by FULLNAME";

        return this.namedParameterJdbcTemplate.query(q1, new EmployeeMapper());
    }
}

