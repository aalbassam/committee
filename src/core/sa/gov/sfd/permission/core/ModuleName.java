package sa.gov.sfd.permission.core;

public class ModuleName {
    private final String moduleNameEn;
    private final String moduleNameAr;

    public ModuleName(String moduleNameEn, String moduleNameAr){
        this.moduleNameAr = moduleNameAr;
        this.moduleNameEn = moduleNameEn;
    }

    public String getModuleNameEn() {
        return moduleNameEn;
    }

    public String getModuleNameAr() {
        return moduleNameAr;
    }

    
}