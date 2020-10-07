package sa.gov.sfd.permission.core;

import java.util.List;

public class ModuleService {

    ModuleRepository moduleRepo;

    public ModuleService(ModuleRepository moduleRepo) {
        this.moduleRepo = moduleRepo;
    }

    public int addModule(ModuleInfo moduleInfo){
        return moduleRepo.insertNew(moduleInfo);
    }

    public ModuleEntity getModuleById(ModuleId id){
        return moduleRepo.findModuleById(id); 
    }

    public List<ModuleEntity> getAllModules(){
        return moduleRepo.findAllModules();
    }

    public int updateModule(ModuleId moduleId, ModuleInfo moduleInfo){
        return moduleRepo.updateModule(moduleId, moduleInfo);
    }

    


}