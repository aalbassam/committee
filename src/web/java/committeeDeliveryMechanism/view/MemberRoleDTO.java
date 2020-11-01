package committeeDeliveryMechanism.view;

public class MemberRoleDTO {

    private Long id;
    private String arName;
    private String enName;


    public MemberRoleDTO(Long id, String arName, String enName) {
        this.id = id;
        this.arName = arName;
        this.enName = enName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArName() {
        return arName;
    }

    public void setArName(String arName) {
        this.arName = arName;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }
}
