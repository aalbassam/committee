package sa.gov.sfd.committee.core.committee;

public class CommitteeName {

    private final String arName;
    private final String enName;

    public CommitteeName(String arName, String enName) {
        this.arName = arName;
        this.enName = enName;
    }

    public String getArName() {
        return arName;
    }

    public String getEnName() {
        return enName;
    }
}
