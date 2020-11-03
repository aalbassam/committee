package sa.gov.sfd.committee.actions.committee;

import org.springframework.beans.factory.annotation.Autowired;
import sa.gov.sfd.committee.core.committee.CommitteeEntity;
import sa.gov.sfd.committee.core.committee.CommitteeService;
import sa.gov.sfd.committee.core.shared.MasterId;
import sa.gov.sfd.committee.core.trackingLog.TrackingLogEntity;
import sa.gov.sfd.committee.core.trackingLog.TrackingLogService;

public class AddNewCommittee {

    private final CommitteeService committeeService;

    @Autowired
    private TrackingLogService trackingLoService;


    public AddNewCommittee(CommitteeService committeeService) {
        this.committeeService = committeeService;
    }


    public Long addNewCommittee(CommitteeEntity committeeEntity) {

        Long newKey = this.committeeService.addCommittee(committeeEntity);

        if (newKey != 0 || newKey.equals(null)) {
            TrackingLogEntity newLog = new TrackingLogEntity("COMMITTEES", new MasterId(newKey), "addCommittee", "INSERT", "com");
            this.trackingLoService.addTrackingLog(newLog);
        }

        return newKey;
    }
}
