package sa.gov.sfd.committee.actions.trackingLog;

import sa.gov.sfd.committee.core.trackingLog.TrackingLogEntity;
import sa.gov.sfd.committee.core.trackingLog.TrackingLogService;

public class AddNewTrackingLog {

    private final TrackingLogService trackingLogService;

    public AddNewTrackingLog(TrackingLogService trackingLogService) {
        this.trackingLogService = trackingLogService;
    }

    public TrackingLogEntity addNewTrackingLog(TrackingLogEntity trackingLogEntity) {
        return trackingLogService.addTrackingLog(trackingLogEntity);
    }
}
