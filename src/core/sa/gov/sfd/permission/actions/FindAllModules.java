package core.sa.gov.sfd.permission.actions;

import java.util.List;
import sa.gov.sfd.permission.core.ModuleEntity;
import sa.gov.sfd.permission.core.ModuleService;

public class FindAllModules {

    private ModuleService moduleService;

    public FindAllModules(ModuleService moduleService) {
        this.moduleService = moduleService;
    }
    
    public List<ModuleEntity> findAll(){
        return moduleService.getAllModules();
    }



    
}