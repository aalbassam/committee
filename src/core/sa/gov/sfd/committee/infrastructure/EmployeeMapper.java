package sa.gov.sfd.committee.infrastructure;


import org.springframework.jdbc.core.RowMapper;
import sa.gov.sfd.committee.core.employee.EmployeeEntity;
import sa.gov.sfd.committee.core.employee.EmployeeNID;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper implements RowMapper<EmployeeEntity> {

    @Override
    public EmployeeEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        return new EmployeeEntity(
                new EmployeeNID(resultSet.getLong("EM_NATIONAL_ID")),
                resultSet.getString("FULLNAME"),
                resultSet.getString("DEPTSEC_NAME")
        );

    }

}
