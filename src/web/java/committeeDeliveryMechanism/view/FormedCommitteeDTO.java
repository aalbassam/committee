package committeeDeliveryMechanism.view;

import java.time.LocalDate;

public class FormedCommitteeDTO {

    private Long formedCommitteeNo;
    private int committeeId;
    private boolean reward;
    private String decisionNo;
    private String formedCommitteeDecisionDateAH;
    private LocalDate formedCommitteeDecisionDateAD;
    private String formedCommitteeEndDateAH;
    private LocalDate formedCommitteeEndDateAD;

    public FormedCommitteeDTO(Long formedCommitteeNo, int committeeId, boolean reward, String decisionNo, String formedCommitteeDecisionDateAH, LocalDate formedCommitteeDecisionDateAD, String formedCommitteeEndDateAH, LocalDate formedCommitteeEndDateAD) {
        this.formedCommitteeNo = formedCommitteeNo;
        this.committeeId = committeeId;
        this.reward = reward;
        this.decisionNo = decisionNo;
        this.formedCommitteeDecisionDateAH = formedCommitteeDecisionDateAH;
        this.formedCommitteeDecisionDateAD = formedCommitteeDecisionDateAD;
        this.formedCommitteeEndDateAH = formedCommitteeEndDateAH;
        this.formedCommitteeEndDateAD = formedCommitteeEndDateAD;
    }

    public Long getFormedCommitteeNo() {
        return formedCommitteeNo;
    }

    public void setFormedCommitteeNo(Long formedCommitteeNo) {
        this.formedCommitteeNo = formedCommitteeNo;
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

    public String getFormedCommitteeDecisionDateAH() {
        return formedCommitteeDecisionDateAH;
    }

    public void setFormedCommitteeDecisionDateAH(String formedCommitteeDecisionDateAH) {
        this.formedCommitteeDecisionDateAH = formedCommitteeDecisionDateAH;
    }

    public LocalDate getFormedCommitteeDecisionDateAD() {
        return formedCommitteeDecisionDateAD;
    }

    public void setFormedCommitteeDecisionDateAD(LocalDate formedCommitteeDecisionDateAD) {
        this.formedCommitteeDecisionDateAD = formedCommitteeDecisionDateAD;
    }

    public String getFormedCommitteeEndDateAH() {
        return formedCommitteeEndDateAH;
    }

    public void setFormedCommitteeEndDateAH(String formedCommitteeEndDateAH) {
        this.formedCommitteeEndDateAH = formedCommitteeEndDateAH;
    }

    public LocalDate getFormedCommitteeEndDateAD() {
        return formedCommitteeEndDateAD;
    }

    public void setFormedCommitteeEndDateAD(LocalDate formedCommitteeEndDateAD) {
        this.formedCommitteeEndDateAD = formedCommitteeEndDateAD;
    }
}
