package sa.gov.sfd.committee.core.committee;

import sa.gov.sfd.committee.core.shared.BinaryName;
import sa.gov.sfd.committee.core.shared.MasterId;
import sa.gov.sfd.committee.core.shared.RowStatus;


public class CommitteeEntity {

    private MasterId committeeID;
    private BinaryName committeeName;
    private String tasks;
    private char committeeType;  // P:permanent-دائمة     or T:temporary-مؤقتة
    private RowStatus rowStatus;  // A: Active  D: Deleted


    public CommitteeEntity(MasterId committeeID, BinaryName committeeName, String tasks, char committeeType, RowStatus rowStatus) {
        this.committeeID = committeeID;
        this.committeeName = committeeName;
        this.tasks = tasks;
        this.committeeType = committeeType;
        this.rowStatus = rowStatus;
    }

    public CommitteeEntity() {
    }

    public CommitteeEntity(MasterId committeeID) {
        this.committeeID = committeeID;
    }

    @Override
    public String toString() {
        return "CommitteeEntity{" +
                "committeeID=" + committeeID +
                ", committeeName=" + committeeName +
                ", tasks='" + tasks + '\'' +
                ", committeeType=" + committeeType +
                ", rowStatus=" + rowStatus +
                '}';
    }


    public MasterId getCommitteeID() {
        return committeeID;
    }

    public void setCommitteeID(MasterId committeeID) {
        this.committeeID = committeeID;
    }

    public BinaryName getCommitteeName() {
        return committeeName;
    }

    public void setCommitteeName(BinaryName committeeName) {
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

    public RowStatus getRowStatus() {
        return rowStatus;
    }

    public void setRowStatus(RowStatus rowStatus) {
        this.rowStatus = rowStatus;
    }
}
