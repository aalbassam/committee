package core.sa.gov.sfd.committee.core.committee;

public class CommitteeEntity {

    private CommitteeID committeeID;
    private CommitteeName committeeName;
    private String tasks;
    private char committeeType;  // P:permanent     or T:temporary
    private FormedCommittee formedCommittee;

    public CommitteeEntity(CommitteeID committeeID, CommitteeName committeeName, String tasks, char committeeType, FormedCommittee formedCommittee) {
        this.committeeID = committeeID;
        this.committeeName = committeeName;
        this.tasks = tasks;
        this.committeeType = committeeType;
        this.formedCommittee = formedCommittee;
    }
}
