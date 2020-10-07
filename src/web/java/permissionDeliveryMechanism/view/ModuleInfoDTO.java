package permissionDeliveryMechanism.view;

public class ModuleInfoDTO {
    private final String moduleNameAr;
    private final String moduleNameEn;
    private final String moduleIcon;
    private final String moduleLink;

    public ModuleInfoDTO(String moduleNameAr, String moduleNameEn, String moduleIcon, String moduleLink) {
        this.moduleNameAr = moduleNameAr;
        this.moduleNameEn = moduleNameEn;
        this.moduleIcon = moduleIcon;
        this.moduleLink = moduleLink;
    }

    public String getModuleNameAr() {
        return moduleNameAr;
    }

    public String getModuleNameEn() {
        return moduleNameEn;
    }

    public String getModuleIcon() {
        return moduleIcon;
    }

    public String getModuleLink() {
        return moduleLink;
    }

    @Override
    public String toString() {
        return "ModuleInfoDTO [moduleIcon=" + moduleIcon + ", moduleLink=" + moduleLink + ", moduleNameAr="
                + moduleNameAr + ", moduleNameEn=" + moduleNameEn + "]";
    }


}