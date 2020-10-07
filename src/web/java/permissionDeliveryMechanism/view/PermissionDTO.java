package permissionDeliveryMechanism.view;

public class PermissionDTO {
    private Long empNID;
    private Long moduleId;

    public PermissionDTO() {}
    
    public PermissionDTO(Long empNID, Long moduleId) {
        this.empNID = empNID;
        this.moduleId = moduleId;
    }
    
    public Long getEmpNID() {
        return empNID;
    }

    public void setEmpNID(Long empNID) {
        this.empNID = empNID;
    }

    public Long getModuleId() {
        return moduleId;
    }

    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    @Override
    public String toString() {
        return "PermissionDTO [empNID=" + empNID + ", moduleId=" + moduleId + "]";
    }


    
}