package core.sa.gov.sfd.permission.actions;

import sa.gov.sfd.permission.core.EmployeeNID;
import sa.gov.sfd.permission.core.ModuleId;
import sa.gov.sfd.permission.core.PermissionService;

public class RemoveModulePermission {

    private PermissionService permissionService;

    public RemoveModulePermission(PermissionService permissionService) {
        this.permissionService = permissionService;
    }
    
    public int remove(Long empNid,Long moduleId){
        return permissionService.removePermission(new EmployeeNID(empNid), new ModuleId(moduleId));
    }



    
}