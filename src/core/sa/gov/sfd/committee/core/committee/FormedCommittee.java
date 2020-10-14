package core.sa.gov.sfd.committee.core.committee;

import java.util.List;

public class FormedCommittee {

    private final FormedCommitteeNo formedCommitteeNo;
    private final boolean reward;
    private final String decisionNo;
    private final FormedCommitteeDecisionDate formedCommitteeDecisionDate;
    private final FormedCommitteeEndDate formedCommitteeEndDate;
    private final List<Member> memberList;
    private final String createdBy;
    private final String createdDate;

    public FormedCommittee(FormedCommitteeNo formedCommitteeNo, boolean reward, String decisionNo, FormedCommitteeDecisionDate formedCommitteeDecisionDate, FormedCommitteeEndDate formedCommitteeEndDate, List<Member> memberList, String createdBy, String createdDate) {
        this.formedCommitteeNo = formedCommitteeNo;
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
        return "FormedCommittee{" +
                "formedCommitteeNo=" + formedCommitteeNo +
                ", reward=" + reward +
                ", decisionNo='" + decisionNo + '\'' +
                ", formedCommitteeDecisionDate=" + formedCommitteeDecisionDate +
                ", formedCommitteeEndDate=" + formedCommitteeEndDate +
                ", memberList=" + memberList +
                ", createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                '}';
    }

    public FormedCommitteeNo getFormedCommitteeNo() {
        return formedCommitteeNo;
    }

    public boolean isReward() {
        return reward;
    }

    public String getDecisionNo() {
        return decisionNo;
    }

    public FormedCommitteeDecisionDate getFormedCommitteeDecisionDate() {
        return formedCommitteeDecisionDate;
    }

    public FormedCommitteeEndDate getFormedCommitteeEndDate() {
        return formedCommitteeEndDate;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }
}
