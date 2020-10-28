package committeeDeliveryMechanism.view;

import java.time.LocalDate;

public class FormedCommitteeDTO {

    private Long formedNo;
    private int committeeId;
    private boolean reward;
    private String decisionNo;
    private String decisionDateAH;
    private LocalDate decisionDateAD;
    private String endDateAH;
    private LocalDate endDateAD;

    public FormedCommitteeDTO(Long formedNo, int committeeId, boolean reward, String decisionNo, String decisionDateAH, LocalDate decisionDateAD, String endDateAH, LocalDate endDateAD) {
        this.formedNo = formedNo;
        this.committeeId = committeeId;
        this.reward = reward;
        this.decisionNo = decisionNo;
        this.decisionDateAH = decisionDateAH;
        this.decisionDateAD = decisionDateAD;
        this.endDateAH = endDateAH;
        this.endDateAD = endDateAD;
    }

    public Long getFormedNo() {
        return formedNo;
    }

    public void setFormedNo(Long formedNo) {
        this.formedNo = formedNo;
    }

    public int getCommitteeId() {
        return committeeId;
    }

    public void setCommitteeId(int committeeId) {
        this.committeeId = committeeId;
    }

    public boolean isReward() {
        return reward;
    }

    public void setReward(boolean reward) {
        this.reward = reward;
    }

    public String getDecisionNo() {
        return decisionNo;
    }

    public void setDecisionNo(String decisionNo) {
        this.decisionNo = decisionNo;
    }

    public String getDecisionDateAH() {
        return decisionDateAH;
    }

    public void setDecisionDateAH(String decisionDateAH) {
        this.decisionDateAH = decisionDateAH;
    }

    public LocalDate getDecisionDateAD() {
        return decisionDateAD;
    }

    public void setDecisionDateAD(LocalDate decisionDateAD) {
        this.decisionDateAD = decisionDateAD;
    }

    public String getEndDateAH() {
        return endDateAH;
    }

    public void setEndDateAH(String endDateAH) {
        this.endDateAH = endDateAH;
    }

    public LocalDate getEndDateAD() {
        return endDateAD;
    }

    public void setEndDateAD(LocalDate endDateAD) {
        this.endDateAD = endDateAD;
    }
}
