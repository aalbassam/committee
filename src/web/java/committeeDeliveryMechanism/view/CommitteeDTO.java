package committeeDeliveryMechanism.view;

public class CommitteeDTO {

    private int id;
    private String arName;
    private String enName;
    private String tasks;
    private char type;

    public CommitteeDTO(int id, String arName, String enName, String tasks, char type) {
        this.id = id;
        this.arName = arName;
        this.enName = enName;
        this.tasks = tasks;
        this.type = type;
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

    public String getTasks() {
        return tasks;
    }

    public void setTasks(String tasks) {
        this.tasks = tasks;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }
}
