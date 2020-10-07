package permissionDeliveryMechanism.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import permissionDeliveryMechanism.infrastructure.PermissionConverter;
import permissionDeliveryMechanism.view.PermissionDTO;
import sa.gov.sfd.permission.actions.FindModulePermissions;
import sa.gov.sfd.permission.actions.GrantModulePermission;
import sa.gov.sfd.permission.actions.RemoveModulePermission;

@RestController
@RequestMapping("/api/permissions")
public class PermissionController {

    @Autowired
    private GrantModulePermission grantPermissionAction;
    @Autowired
    private FindModulePermissions findEmployeePermissionAction;
    @Autowired
    private RemoveModulePermission removeModulePermissionAction;

    // grant user permission
    @PostMapping("/grant")
    public int grantPermission(@RequestBody PermissionDTO permissionDTO){
        System.out.println(permissionDTO);
        return grantPermissionAction.grant(permissionDTO.getEmpNID(), permissionDTO.getModuleId());
    }
    // remove user permission
    @PostMapping("/remove")
    public int removePermission(@RequestBody PermissionDTO permissionDTO){
        return removeModulePermissionAction.remove(permissionDTO.getEmpNID(), permissionDTO.getModuleId());
    }

    // get user permissions
    @GetMapping("/{id}")
    public List<PermissionDTO> getEmployeePermissions(@PathVariable("id") Long empNid){
        return findEmployeePermissionAction.find(empNid).stream().map(PermissionConverter::convertPermissionDTO).collect(Collectors.toList());
    }
}