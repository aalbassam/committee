package sa.gov.sfd.permission.infrastructure;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import sa.gov.sfd.permission.core.EmployeeNID;
import sa.gov.sfd.permission.core.ModuleId;
import sa.gov.sfd.permission.core.PermissionEntity;

public class PermissionMapper implements RowMapper<PermissionEntity> {
    @Override
    public PermissionEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        PermissionEntity permision = new PermissionEntity();
        permision.setEmployeeNID(new EmployeeNID(rs.getLong("EM_NATIONAL_ID")));
        permision.setModuleId(new ModuleId(rs.getLong("MODULE_ID")));
        return permision;
    }

}