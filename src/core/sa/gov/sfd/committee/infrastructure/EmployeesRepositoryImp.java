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
        return null;
    }
}
