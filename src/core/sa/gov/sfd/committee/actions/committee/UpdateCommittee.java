package sa.gov.sfd.committee.actions.committee;

import org.springframework.beans.factory.annotation.Autowired;
import sa.gov.sfd.committee.core.committee.CommitteeEntity;
import sa.gov.sfd.committee.core.committee.CommitteeService;
import sa.gov.sfd.committee.core.shared.MasterId;
import sa.gov.sfd.committee.core.trackingLog.TrackingLogEntity;
import sa.gov.sfd.committee.core.trackingLog.TrackingLogService;

public class UpdateCommittee {

    private final CommitteeService committeeService;

    @Autowired
    private TrackingLogService trackingLogService;

    public UpdateCommittee(CommitteeService committeeService) {
        this.committeeService = committeeService;
    }

    public int updateCommittee(CommitteeEntity committeeEntity) {

        int updateResult = this.committeeService.updateCommittee(committeeEntity);

        if (updateResult == 1) {
            TrackingLogEntity newLog = new TrackingLogEntity("COMMITTEES", new MasterId(committeeEntity.getCommitteeID().getId()), "updateCommittee", "UPDATE", "com");
            this.trackingLogService.addTrackingLog(newLog);
        }
        return this.committeeService.updateCommittee(committeeEntity);
    }
}
