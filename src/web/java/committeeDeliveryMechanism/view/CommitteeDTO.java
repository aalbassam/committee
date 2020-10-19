package committeeDeliveryMechanism.view;

public class CommitteeDTO {

    private int committeeId;
    private String committeeArName;
    private String committeeEnName;
    private String committeeTasks;
    private char committeeType;

    public CommitteeDTO(int committeeId, String committeeArName, String committeeEnName, String committeeTasks, char committeeType) {
        this.committeeId = committeeId;
        this.committeeArName = committeeArName;
        this.committeeEnName = committeeEnName;
        this.committeeTasks = committeeTasks;
        this.committeeType = committeeType;
    }


    public int getCommitteeId() {
        return committeeId;
    }

    public void setCommitteeId(int committeeId) {
        this.committeeId = committeeId;
    }

    public String getCommitteeArName() {
        return committeeArName;
    }

    public void setCommitteeArName(String committeeArName) {
        this.committeeArName = committeeArName;
    }

    public String getCommitteeEnName() {
        return committeeEnName;
    }

    public void setCommitteeEnName(String committeeEnName) {
        this.committeeEnName = committeeEnName;
    }

    public String getCommitteeTasks() {
        return committeeTasks;
    }

    public void setCommitteeTasks(String committeeTasks) {
        this.committeeTasks = committeeTasks;
    }

    public char getCommitteeType() {
        return committeeType;
    }

    public void setCommitteeType(char committeeType) {
        this.committeeType = committeeType;
    }
}
