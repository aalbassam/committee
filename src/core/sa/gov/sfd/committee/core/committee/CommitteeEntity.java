package sa.gov.sfd.committee.core.committee;

public class CommitteeEntity {

    private CommitteeID committeeID;
    private CommitteeName committeeName;
    private String tasks;
    private char committeeType;  // P:permanent     or T:temporary
    private FormedCommitteeEntity formedCommitteeEntity;

    public CommitteeEntity(CommitteeID committeeID, CommitteeName committeeName, String tasks, char committeeType) {
        this.committeeID = committeeID;
        this.committeeName = committeeName;
        this.tasks = tasks;
        this.committeeType = committeeType;
    }

    @Override
    public String toString() {
        return "CommitteeEntity{" +
                "committeeID=" + committeeID +
                ", committeeName=" + committeeName +
                ", tasks='" + tasks + '\'' +
                ", committeeType=" + committeeType +
                '}';
    }

    public CommitteeID getCommitteeID() {
        return committeeID;
    }

    public void setCommitteeID(CommitteeID committeeID) {
        this.committeeID = committeeID;
    }

    public CommitteeName getCommitteeName() {
        return committeeName;
    }

    public void setCommitteeName(CommitteeName committeeName) {
        this.committeeName = committeeName;
    }

    public String getTasks() {
        return tasks;
    }

    public void setTasks(String tasks) {
        this.tasks = tasks;
    }

    public char getCommitteeType() {
        return committeeType;
    }

    public void setCommitteeType(char committeeType) {
        this.committeeType = committeeType;
    }
}
