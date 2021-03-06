package sa.gov.sfd.committee.core.formedCommittee;

import sa.gov.sfd.committee.core.committee.CommitteeEntity;
import sa.gov.sfd.committee.core.employee.EmployeeNID;
import sa.gov.sfd.committee.core.shared.BinaryDate;
import sa.gov.sfd.committee.core.shared.MasterId;
import sa.gov.sfd.committee.core.shared.RowStatus;

import java.util.List;

public class FormedCommitteeEntity {

    private MasterId formationID;
    private CommitteeEntity committeeEntity;
    private boolean reward;
    private String decisionNo;
    private BinaryDate decisionDate;
    private BinaryDate endDate;
    private List<MasterId> memberIDList;
    private FormationStatus formationStatus;
    private EmployeeNID approverId;
    private RowStatus rowStatus;  // A: Active  D: Deleted

    public FormedCommitteeEntity(MasterId formationID, CommitteeEntity committeeEntity, boolean reward, String decisionNo, BinaryDate decisionDate, BinaryDate endDate, List<MasterId> memberIDList, FormationStatus formationStatus, EmployeeNID approverId, RowStatus rowStatus) {
        this.formationID = formationID;
        this.committeeEntity = committeeEntity;
        this.reward = reward;
        this.decisionNo = decisionNo;
        this.decisionDate = decisionDate;
        this.endDate = endDate;
        this.memberIDList = memberIDList;
        this.formationStatus = formationStatus;
        this.approverId = approverId;
        this.rowStatus = rowStatus;
    }

    @Override
    public String toString() {
        return "FormedCommitteeEntity{" +
                "formationID=" + formationID +
                ", committeeEntity=" + committeeEntity +
                ", reward=" + reward +
                ", decisionNo='" + decisionNo + '\'' +
                ", decisionDate=" + decisionDate +
                ", endDate=" + endDate +
                ", memberIDList=" + memberIDList +
                ", formationStatus=" + formationStatus +
                ", approverId=" + approverId +
                ", rowStatus=" + rowStatus +
                '}';
    }

    public MasterId getFormationID() {
        return formationID;
    }

    public void setFormationID(MasterId formationID) {
        this.formationID = formationID;
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

    public List<MasterId> getMemberIDList() {
        return memberIDList;
    }

    public void setMemberIDList(List<MasterId> memberIDList) {
        this.memberIDList = memberIDList;
    }

    public FormationStatus getFormationStatus() {
        return formationStatus;
    }

    public void setFormationStatus(FormationStatus formationStatus) {
        this.formationStatus = formationStatus;
    }

    public EmployeeNID getApproverId() {
        return approverId;
    }

    public void setApproverId(EmployeeNID approverId) {
        this.approverId = approverId;
    }

    public RowStatus getRowStatus() {
        return rowStatus;
    }

    public void setRowStatus(RowStatus rowStatus) {
        this.rowStatus = rowStatus;
    }
}
