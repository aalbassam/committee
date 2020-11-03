package sa.gov.sfd.committee.core.trackingLog;

public class TrackingLogService {

    private final TrackingLogRepository trackingLogRepository;

    public TrackingLogService(TrackingLogRepository trackingLogRepository) {
        this.trackingLogRepository = trackingLogRepository;
    }

    public TrackingLogEntity addTrackingLog(TrackingLogEntity trackingLogEntity) {
        return this.trackingLogRepository.addTrackingLog(trackingLogEntity);
    }
}
