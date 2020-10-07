package sa.gov.sfd.permission.core;

public class PermissionEntity {
    
    private EmployeeNID employeeNID;
    private ModuleId moduleId;

    public PermissionEntity(){}
    
    public PermissionEntity(EmployeeNID employeeNID, ModuleId moduleId) {
        this.employeeNID = employeeNID;
        this.moduleId = moduleId;
    }


    public EmployeeNID getEmployeeNID() {
        return employeeNID;
    }

    public void setEmployeeNID(EmployeeNID employeeNID) {
        this.employeeNID = employeeNID;
    }

    public ModuleId getModuleId() {
        return moduleId;
    }

    public void setModuleId(ModuleId moduleId) {
        this.moduleId = moduleId;
    }



    
}