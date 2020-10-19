package sa.gov.sfd.permission.infrastructure;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper /*implements RowMapper<sa.gov.sfd.permission.core.Employee2Entity*/ {

    /*@Override
    public sa.gov.sfd.permission.core.Employee2Entity mapRow(ResultSet rs, int rowNum) throws SQLException {
        sa.gov.sfd.permission.core.Employee2Entity employee = new sa.gov.sfd.permission.core.Employee2Entity();
        employee.setEmpNid(new sa.gov.sfd.permission.core.Employee2NID(rs.getLong("EM_NATIONAL_ID")));
        employee.setEmpName(new sa.gov.sfd.permission.core.Employee2Name(
            rs.getString("FULLNAME"),
            rs.getString("FULLNAMEEN"),
            rs.getString("EM_ACTIVEDIRECTORY_UNAME")
         ));
        return employee;
    }*/
}