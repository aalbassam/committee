package core.sa.gov.sfd.committee.core.committee;
import java.time.LocalDate;

public class FormedCommitteeEndDate {

    private final String endDateAH;
    private final LocalDate endDateAD;

    public FormedCommitteeEndDate(String endDateAH, LocalDate endDateAD) {
        this.endDateAH = endDateAH;
        this.endDateAD = endDateAD;
    }

    public String getEndDateAH() {
        return endDateAH;
    }

    public LocalDate getEndDateAD() {
        return endDateAD;
    }
}
