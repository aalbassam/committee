package sa.gov.sfd.permission.infrastructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import sa.gov.sfd.permission.core.EmployeeEntity;
import sa.gov.sfd.permission.core.EmployeeNID;
import sa.gov.sfd.permission.core.EmployeeRepository;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Override
    public EmployeeEntity findEmployeeByNationalId(EmployeeNID empNid) {
        return jdbcTemplate.queryForObject("SELECT * FROM EMPLOYEE_RECORD WHERE EM_NATIONAL_ID = ? ", new Object[] { empNid.getId() }, new EmployeeMapper());

    }

}