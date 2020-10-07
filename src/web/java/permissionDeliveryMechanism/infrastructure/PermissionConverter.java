package permissionDeliveryMechanism.infrastructure;

import permissionDeliveryMechanism.view.PermissionDTO;
import sa.gov.sfd.permission.core.PermissionEntity;

public class PermissionConverter {
    public static PermissionDTO convertPermissionDTO(PermissionEntity permissionEntity){
        PermissionDTO permissionDTO = new PermissionDTO(
            permissionEntity.getEmployeeNID().getId(),
            permissionEntity.getModuleId().getId()
        );
        return permissionDTO;
    }
}