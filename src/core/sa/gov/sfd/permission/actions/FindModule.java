package sa.gov.sfd.permission.actions;

import sa.gov.sfd.permission.core.ModuleEntity;
import sa.gov.sfd.permission.core.ModuleId;
import sa.gov.sfd.permission.core.ModuleService;

public class FindModule {
    private ModuleService moduleService;

    public FindModule(ModuleService moduleService) {
        this.moduleService = moduleService;
    }

    public ModuleEntity findModule(Long moduleId){
        return moduleService.getModuleById(new ModuleId(moduleId));
    }

}