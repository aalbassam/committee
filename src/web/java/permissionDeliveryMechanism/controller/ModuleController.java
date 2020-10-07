package permissionDeliveryMechanism.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import permissionDeliveryMechanism.infrastructure.ModuleConverter;
import permissionDeliveryMechanism.view.ModuleDTO;
import permissionDeliveryMechanism.view.ModuleInfoDTO;
import sa.gov.sfd.permission.actions.AddModule;
import sa.gov.sfd.permission.actions.FindAllModules;
import sa.gov.sfd.permission.actions.FindModule;
import sa.gov.sfd.permission.actions.UpdateModule;

@RestController
@RequestMapping("/api/modules")
public class ModuleController {

    @Autowired
    private FindAllModules findModules;

    @Autowired
    private AddModule addModule;

    @Autowired
    private UpdateModule updateModule;

    @Autowired
    private FindModule findModule;
    
    @GetMapping("/{id}")
    public ModuleDTO getModule(@PathVariable("id") Long id)
    {   
        return ModuleConverter.convertModuleVO(findModule.findModule(id));
    }
    
    @GetMapping("/")
    public List<ModuleDTO> getAllModules(){
        return findModules.findAll().stream().map(ModuleConverter::convertModuleVO).collect(Collectors.toList());
    }

    @PostMapping("/")
    public int addModule(@RequestBody ModuleInfoDTO moduleInfoDTO){
        System.out.println(moduleInfoDTO);
        return addModule.add(ModuleConverter.convertModuleInfo(moduleInfoDTO));
    }

    @PutMapping("/{id}")
    public int updateModule(@PathVariable("id") Long moduleId,@RequestBody ModuleInfoDTO moduleInfoDTO){
        return updateModule.update(moduleId, ModuleConverter.convertModuleInfo(moduleInfoDTO));
    }
}