package sa.gov.sfd.permission.infrastructure;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PermissionRepositoryImpl /*implements PermissionRepository*/ {

    /*@Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<PermissionEntity> findEmployeePermissions(sa.gov.sfd.permission.core.Employee2NID empNid) {
        return jdbcTemplate.query("SELECT * FROM PER_MODULES_PERMISSIONS WHERE EM_NATIONAL_ID = ? ", new Object[]{empNid.getId()},new PermissionMapper());
    }

    @Override
    public int addPermission(PermissionEntity permission) {
        return jdbcTemplate.update("INSERT INTO PER_MODULES_PERMISSIONS (MODULE_ID,EM_NATIONAL_ID) " + "values(?,?)",
				new Object[] {permission.getModuleId().getId(), permission.getEmployeeNID().getId()});
    }

    @Override
    public int removePermission(sa.gov.sfd.permission.core.Employee2NID empNid, ModuleId moduleId) {
        return jdbcTemplate.update("DELETE FROM PER_MODULES_PERMISSIONS WHERE MODULE_ID = ? AND EM_NATIONAL_ID = ? ", new Object[] { moduleId.getId() , empNid.getId() });  
    }*/

}