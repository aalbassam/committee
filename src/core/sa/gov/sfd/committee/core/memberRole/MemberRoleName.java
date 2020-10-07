package sa.gov.sfd.committee.core.memberRole;

public class MemberRoleName {

    private final String arName;
    private final String enName;

    public MemberRoleName(String arName, String enName) {
        this.arName = arName;
        this.enName = enName;
    }

    public String getArName() {
        return this.arName;
    }

    public String getEnName() {
        return this.enName;
    }
}
