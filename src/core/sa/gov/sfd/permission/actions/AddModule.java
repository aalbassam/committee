package sa.gov.sfd.permission.actions;

import sa.gov.sfd.permission.core.ModuleInfo;
import sa.gov.sfd.permission.core.ModuleService;


public class AddModule {
    private ModuleService moduleService;

    public AddModule(ModuleService moduleService) {
        this.moduleService = moduleService;
    }
    
    public int add(ModuleInfo moduleInfo){
        return moduleService.addModule(moduleInfo);
    }


}