package sa.gov.sfd.permission.core;

public class ModuleInfo {
    private final ModuleName moduleName;
    private final ModuleIcon moduleIcon;
    private final ModuleLink moduleLink;

    public ModuleInfo(ModuleName moduleName, ModuleIcon moduleIcon,ModuleLink moduleLink){
        this.moduleName = moduleName;
        this.moduleIcon = moduleIcon;
        this.moduleLink = moduleLink;
    }
    public ModuleName getModuleName() {
        return moduleName;
    }
    
    public ModuleIcon getModuleIcon() {
        return moduleIcon;
    }

    public ModuleLink getModuleLink() {
        return moduleLink;
    }
    
}