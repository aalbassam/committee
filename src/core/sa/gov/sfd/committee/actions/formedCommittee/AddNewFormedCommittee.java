package sa.gov.sfd.committee.actions.formedCommittee;


import org.springframework.beans.factory.annotation.Autowired;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeEntity;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeService;
import sa.gov.sfd.committee.core.shared.MasterId;
import sa.gov.sfd.committee.core.trackingLog.TrackingLogEntity;
import sa.gov.sfd.committee.core.trackingLog.TrackingLogService;

public class AddNewFormedCommittee {

    private final FormedCommitteeService formedCommitteeService;

    @Autowired
    private TrackingLogService trackingLoService;

    public AddNewFormedCommittee(FormedCommitteeService formedCommitteeService) {
        this.formedCommitteeService = formedCommitteeService;
    }

    public Long addFormedCommittee(MasterId committeeID, FormedCommitteeEntity formedCommitteeEntity) {

        Long newKey = this.formedCommitteeService.addFormedCommittee(committeeID, formedCommitteeEntity);

        if (newKey != 0) {
            TrackingLogEntity newLog = new TrackingLogEntity("FORMED_COMMITTEES", new MasterId(newKey), "addFormedCommittee", "INSERT", "com");
            this.trackingLoService.addTrackingLog(newLog);
        }

        return newKey;
    }

}
