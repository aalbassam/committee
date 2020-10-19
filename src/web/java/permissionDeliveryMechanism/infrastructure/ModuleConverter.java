package permissionDeliveryMechanism.infrastructure;

import permissionDeliveryMechanism.view.ModuleDTO;
import permissionDeliveryMechanism.view.ModuleInfoDTO;


public class ModuleConverter {
    
    /*public static ModuleDTO convertModuleVO(ModuleEntity moduleEntity){
        ModuleDTO module = new ModuleDTO();
        module.setModuleId(moduleEntity.getModuleId().getId());
        module.setModuleInfo(new ModuleInfoDTO(
                moduleEntity.getModuleInfo().getModuleName().getModuleNameAr(),
                moduleEntity.getModuleInfo().getModuleName().getModuleNameEn(),
                moduleEntity.getModuleInfo().getModuleIcon().getIcon(),
                moduleEntity.getModuleInfo().getModuleLink().getLink()
                ));
        return module;
    }

    public static ModuleInfo convertModuleInfo(ModuleInfoDTO moduleInfoVO){
        ModuleInfo moduleInfo = new ModuleInfo(
            new ModuleName(moduleInfoVO.getModuleNameEn(),moduleInfoVO.getModuleNameAr()),
            new ModuleIcon(moduleInfoVO.getModuleIcon()),
            new ModuleLink(moduleInfoVO.getModuleLink())
        );
        return moduleInfo;
    }*/
}