package sa.gov.sfd.permission.core;

import java.util.List;



public interface ModuleRepository {
    
    //SELECT
    List<ModuleEntity> findAllModules();
    ModuleEntity findModuleById(ModuleId id);
    
    //UPDATE
    int updateModule(ModuleId moduleId, ModuleInfo moduleInfo);
    //INSERT
    int insertNew(ModuleInfo moduleInfo);
}