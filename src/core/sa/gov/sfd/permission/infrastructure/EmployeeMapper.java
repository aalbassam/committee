package sa.gov.sfd.permission.infrastructure;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import sa.gov.sfd.permission.core.EmployeeEntity;
import sa.gov.sfd.permission.core.EmployeeNID;
import sa.gov.sfd.permission.core.EmployeeName;

public class EmployeeMapper implements RowMapper<EmployeeEntity> {

    @Override
    public EmployeeEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        EmployeeEntity employee = new EmployeeEntity();
        employee.setEmpNid(new EmployeeNID(rs.getLong("EM_NATIONAL_ID")));
        employee.setEmpName(new EmployeeName(
            rs.getString("FULLNAME"),
            rs.getString("FULLNAMEEN"),
            rs.getString("EM_ACTIVEDIRECTORY_UNAME")
         ));
        return employee;
    }
}