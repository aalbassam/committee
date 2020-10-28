package committeeDeliveryMechanism.view;

public class EmployeeDTO {

    private Long nationalId;
    private String fullName;
    private String deptName;

    public EmployeeDTO(Long nationalId, String fullName, String deptName) {
        this.nationalId = nationalId;
        this.fullName = fullName;
        this.deptName = deptName;
    }

    public Long getNationalId() {
        return nationalId;
    }

    public void setNationalId(Long nationalId) {
        this.nationalId = nationalId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
