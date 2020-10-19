package sa.gov.sfd.permission.infrastructure;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PermissionMapper /*implements RowMapper<PermissionEntity>*/ {
    /*@Override
    public PermissionEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        PermissionEntity permision = new PermissionEntity();
        permision.setEmployeeNID(new sa.gov.sfd.permission.core.Employee2NID(rs.getLong("EM_NATIONAL_ID")));
        permision.setModuleId(new ModuleId(rs.getLong("MODULE_ID")));
        return permision;
    }
*/
}