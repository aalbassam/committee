package sa.gov.sfd.permission.core;

import java.util.List;

public class PermissionService {

    private PermissionRepository permissionRepo;

    public PermissionService(PermissionRepository permissionRepo) {
        this.permissionRepo = permissionRepo;
    }

    public List<PermissionEntity> getEmployeePermissions(EmployeeNID empNid){
        return permissionRepo.findEmployeePermissions(empNid);
    }

    public int grantPermission(PermissionEntity permission){
        return permissionRepo.addPermission(permission);
    }

    public int removePermission(EmployeeNID empNid,ModuleId moduleId){
        return permissionRepo.removePermission(empNid, moduleId);
    }

}