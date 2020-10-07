package sa.gov.sfd.permission.actions;

import sa.gov.sfd.permission.core.ModuleId;
import sa.gov.sfd.permission.core.ModuleInfo;
import sa.gov.sfd.permission.core.ModuleService;


public class UpdateModule {
    private ModuleService moduleService;

    public UpdateModule(ModuleService moduleService) {
        this.moduleService = moduleService;
    }
    
    public int update(Long moduleId, ModuleInfo moduleInfo){
        return moduleService.updateModule(new ModuleId(moduleId), moduleInfo);
    }



    
}