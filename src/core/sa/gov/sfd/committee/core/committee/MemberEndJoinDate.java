package core.sa.gov.sfd.committee.core.committee;
import java.time.LocalDate;

public class MemberEndJoinDate {

    private final String joinDateAH;
    private final LocalDate joinDateAD;

    public MemberEndJoinDate(String endDateAH, LocalDate endDateAD) {
        this.joinDateAH = endDateAH;
        this.joinDateAD = endDateAD;
    }

    public String getJoinDateAH() {
        return joinDateAH;
    }

    public LocalDate getJoinDateAD() {
        return joinDateAD;
    }
}