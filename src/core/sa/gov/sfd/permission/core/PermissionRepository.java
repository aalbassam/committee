package sa.gov.sfd.permission.core;

import java.util.List;

public interface PermissionRepository {
    
    //SELECT
    List<PermissionEntity> findEmployeePermissions(EmployeeNID empNid);

    //INSERT
    int addPermission(PermissionEntity permission);

    //DELETE
    int removePermission(EmployeeNID empNid, ModuleId moduleId);
}