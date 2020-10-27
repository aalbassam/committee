package sa.gov.sfd.committee.core.formedCommittee;

import sa.gov.sfd.committee.core.committee.CommitteeEntity;
import sa.gov.sfd.committee.core.member.MemberEntity;

import java.util.List;

public class FormedCommitteeEntity {

    private FormedCommitteeNo formedCommitteeNo;
    private CommitteeEntity committeeEntity;
    private boolean reward;
    private String decisionNo;
    private FormedCommitteeDecisionDate formedCommitteeDecisionDate;
    private FormedCommitteeEndDate formedCommitteeEndDate;
    private List<MemberEntity> memberEntityList;
    private char rowStatus;  // A: Active  D: Deleted

    public FormedCommitteeEntity(FormedCommitteeNo formedCommitteeNo, CommitteeEntity committeeEntity, boolean reward, String decisionNo, FormedCommitteeDecisionDate formedCommitteeDecisionDate, FormedCommitteeEndDate formedCommitteeEndDate, List<MemberEntity> memberEntityList, char rowStatus) {
        this.formedCommitteeNo = formedCommitteeNo;
        this.committeeEntity = committeeEntity;
        this.reward = reward;
        this.decisionNo = decisionNo;
        this.formedCommitteeDecisionDate = formedCommitteeDecisionDate;
        this.formedCommitteeEndDate = formedCommitteeEndDate;
        this.memberEntityList = memberEntityList;
        this.rowStatus = rowStatus;
    }

    @Override
    public String toString() {
        return "FormedCommitteeEntity{" +
                "formedCommitteeNo=" + formedCommitteeNo +
                ", committeeEntity=" + committeeEntity +
                ", reward=" + reward +
                ", decisionNo='" + decisionNo + '\'' +
                ", formedCommitteeDecisionDate=" + formedCommitteeDecisionDate +
                ", formedCommitteeEndDate=" + formedCommitteeEndDate +
                ", memberEntityList=" + memberEntityList +
                ", rowStatus=" + rowStatus +
                '}';
    }

    public FormedCommitteeNo getFormedCommitteeNo() {
        return formedCommitteeNo;
    }

    public void setFormedCommitteeNo(FormedCommitteeNo formedCommitteeNo) {
        this.formedCommitteeNo = formedCommitteeNo;
    }

    public CommitteeEntity getCommitteeEntity() {
        return committeeEntity;
    }

    public void setCommitteeEntity(CommitteeEntity committeeEntity) {
        this.committeeEntity = committeeEntity;
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

    public FormedCommitteeDecisionDate getFormedCommitteeDecisionDate() {
        return formedCommitteeDecisionDate;
    }

    public void setFormedCommitteeDecisionDate(FormedCommitteeDecisionDate formedCommitteeDecisionDate) {
        this.formedCommitteeDecisionDate = formedCommitteeDecisionDate;
    }

    public FormedCommitteeEndDate getFormedCommitteeEndDate() {
        return formedCommitteeEndDate;
    }

    public void setFormedCommitteeEndDate(FormedCommitteeEndDate formedCommitteeEndDate) {
        this.formedCommitteeEndDate = formedCommitteeEndDate;
    }

    public List<MemberEntity> getMemberEntityList() {
        return memberEntityList;
    }

    public void setMemberEntityList(List<MemberEntity> memberEntityList) {
        this.memberEntityList = memberEntityList;
    }

    public char getRowStatus() {
        return rowStatus;
    }

    public void setRowStatus(char rowStatus) {
        this.rowStatus = rowStatus;
    }
}
