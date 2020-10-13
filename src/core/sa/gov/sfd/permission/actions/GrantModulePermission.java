package core.sa.gov.sfd.permission.actions;

import sa.gov.sfd.permission.core.EmployeeNID;
import sa.gov.sfd.permission.core.ModuleId;
import sa.gov.sfd.permission.core.PermissionEntity;
import sa.gov.sfd.permission.core.PermissionService;

public class GrantModulePermission {
    
    private PermissionService permissionService;

    public GrantModulePermission(PermissionService permissionService) {
        this.permissionService = permissionService;
    }

    public int grant(Long empNID,Long moduleId){
        return permissionService.grantPermission(new PermissionEntity(new EmployeeNID(empNID),new ModuleId(moduleId)));
    }


}