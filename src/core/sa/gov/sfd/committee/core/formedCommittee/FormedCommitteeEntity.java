package sa.gov.sfd.committee.core.formedCommittee;

import sa.gov.sfd.committee.core.committee.CommitteeEntity;

import java.lang.reflect.Member;
import java.util.List;

public class FormedCommitteeEntity {

    private FormedCommitteeNo formedCommitteeID;
    //private CommitteeEntity committeeEntity;
    private boolean reward;
    private String decisionNo;
    private FormedCommitteeDecisionDate formedCommitteeDecisionDate;
    private FormedCommitteeEndDate formedCommitteeEndDate;
    private List<Member> memberList;
    private String createdBy;
    private String createdDate;

    public FormedCommitteeEntity(FormedCommitteeNo formedCommitteeID, CommitteeEntity committeeEntity, boolean reward, String decisionNo, FormedCommitteeDecisionDate formedCommitteeDecisionDate, FormedCommitteeEndDate formedCommitteeEndDate, List<Member> memberList, String createdBy, String createdDate) {
        this.formedCommitteeID = formedCommitteeID;
        this.committeeEntity = committeeEntity;
        this.reward = reward;
        this.decisionNo = decisionNo;
        this.formedCommitteeDecisionDate = formedCommitteeDecisionDate;
        this.formedCommitteeEndDate = formedCommitteeEndDate;
        this.memberList = memberList;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "FormedCommitteeEntity{" +
                "formedCommitteeID=" + formedCommitteeID +
                ", committeeEntity=" + committeeEntity +
                ", reward=" + reward +
                ", decisionNo='" + decisionNo + '\'' +
                ", formedCommitteeDecisionDate=" + formedCommitteeDecisionDate +
                ", formedCommitteeEndDate=" + formedCommitteeEndDate +
                ", memberList=" + memberList +
                ", createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                '}';
    }

    public FormedCommitteeNo getFormedCommitteeID() {
        return formedCommitteeID;
    }

    public void setFormedCommitteeID(FormedCommitteeNo formedCommitteeID) {
        this.formedCommitteeID = formedCommitteeID;
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

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
}
