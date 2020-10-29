package sa.gov.sfd.committee.core.formedCommittee;

import sa.gov.sfd.committee.core.committee.CommitteeEntity;
import sa.gov.sfd.committee.core.member.MemberID;
import sa.gov.sfd.committee.core.shared.BinaryDate;

import java.util.List;

public class FormedCommitteeEntity {

    private FormedCommitteeNo formationNo;
    private CommitteeEntity committeeEntity;
    private boolean reward;
    private String decisionNo;
    private BinaryDate decisionDate;
    private BinaryDate endDate;
    private List<MemberID> memberIDList;
    private char rowStatus;  // A: Active  D: Deleted

    public FormedCommitteeEntity(FormedCommitteeNo formationNo, CommitteeEntity committeeEntity, boolean reward, String decisionNo, BinaryDate decisionDate, BinaryDate endDate, List<MemberID> memberIDList, char rowStatus) {
        this.formationNo = formationNo;
        this.committeeEntity = committeeEntity;
        this.reward = reward;
        this.decisionNo = decisionNo;
        this.decisionDate = decisionDate;
        this.endDate = endDate;
        this.memberIDList = memberIDList;
        this.rowStatus = rowStatus;
    }


    public FormedCommitteeNo getFormationNo() {
        return formationNo;
    }

    public void setFormationNo(FormedCommitteeNo formationNo) {
        this.formationNo = formationNo;
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

    public BinaryDate getDecisionDate() {
        return decisionDate;
    }

    public void setDecisionDate(BinaryDate decisionDate) {
        this.decisionDate = decisionDate;
    }

    public BinaryDate getEndDate() {
        return endDate;
    }

    public void setEndDate(BinaryDate endDate) {
        this.endDate = endDate;
    }

    public List<MemberID> getMemberIDList() {
        return memberIDList;
    }

    public void setMemberIDList(List<MemberID> memberIDList) {
        this.memberIDList = memberIDList;
    }

    public char getRowStatus() {
        return rowStatus;
    }

    public void setRowStatus(char rowStatus) {
        this.rowStatus = rowStatus;
    }
}
