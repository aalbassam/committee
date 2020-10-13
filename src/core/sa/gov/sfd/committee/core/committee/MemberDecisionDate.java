package core.sa.gov.sfd.committee.core.committee;

import java.time.LocalDate;

public class MemberDecisionDate {

    private final String decisionDateAH;
    private final LocalDate decisionDateAD;

    public MemberDecisionDate(String decisionDateAH, LocalDate decisionDateAD) {
        this.decisionDateAH = decisionDateAH;
        this.decisionDateAD = decisionDateAD;
    }

    public String getDecisionDateAH() {
        return decisionDateAH;
    }

    public LocalDate getDecisionDateAD() {
        return decisionDateAD;
    }
}