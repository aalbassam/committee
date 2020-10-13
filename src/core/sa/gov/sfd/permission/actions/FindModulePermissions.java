package core.sa.gov.sfd.permission.actions;

import java.util.List;

import sa.gov.sfd.permission.core.EmployeeNID;
import sa.gov.sfd.permission.core.PermissionEntity;
import sa.gov.sfd.permission.core.PermissionService;


public class FindModulePermissions {
    
    private PermissionService permissionService;

    public FindModulePermissions(PermissionService permissionService) {
        this.permissionService = permissionService;
    }

    public List<PermissionEntity> find(Long empNid){
        return permissionService.getEmployeePermissions(new EmployeeNID(empNid));
    }


}