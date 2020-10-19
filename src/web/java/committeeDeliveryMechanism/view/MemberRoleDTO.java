package committeeDeliveryMechanism.view;

public class MemberRoleDTO {

    private int id;
    private String arName;
    private String enName;


    public MemberRoleDTO(int id, String arName, String enName) {
        this.id = id;
        this.arName = arName;
        this.enName = enName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
