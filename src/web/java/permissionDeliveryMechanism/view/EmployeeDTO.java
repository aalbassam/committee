package permissionDeliveryMechanism.view;

public class EmployeeDTO {
    private Long empNid;
    private String empNameAr;
    private String empNameEn;
    private String samAccount;

    public EmployeeDTO(Long empNid, String empNameAr, String empNameEn, String samAccount) {
        this.empNid = empNid;
        this.empNameAr = empNameAr;
        this.empNameEn = empNameEn;
        this.samAccount = samAccount;
    }

    public Long getEmpNid() {
        return empNid;
    }

    public void setEmpNid(Long empNid) {
        this.empNid = empNid;
    }

    public String getEmpNameAr() {
        return empNameAr;
    }

    public void setEmpNameAr(String empNameAr) {
        this.empNameAr = empNameAr;
    }

    public String getEmpNameEn() {
        return empNameEn;
    }

    public void setEmpNameEn(String empNameEn) {
        this.empNameEn = empNameEn;
    }

    public String getSamAccount() {
        return samAccount;
    }

    public void setSamAccount(String samAccount) {
        this.samAccount = samAccount;
    }

    
}