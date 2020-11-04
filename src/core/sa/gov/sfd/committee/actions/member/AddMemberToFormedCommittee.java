package sa.gov.sfd.committee.actions.member;


import org.springframework.beans.factory.annotation.Autowired;
import sa.gov.sfd.committee.core.member.MemberEntity;
import sa.gov.sfd.committee.core.member.MemberService;
import sa.gov.sfd.committee.core.shared.MasterId;
import sa.gov.sfd.committee.core.trackingLog.TrackingLogEntity;
import sa.gov.sfd.committee.core.trackingLog.TrackingLogService;

public class AddMemberToFormedCommittee {

    private final MemberService memberService;

    @Autowired
    private TrackingLogService trackingLoService;

    public AddMemberToFormedCommittee(MemberService memberService) {
        this.memberService = memberService;
    }

    public Long addMemberToFormedCommittee(MemberEntity memberEntity, MasterId formedCommitteeNo) {

        Long newKey = this.memberService.addMemberToFormedCommittee(memberEntity, formedCommitteeNo);

        if (newKey != 0) {
            TrackingLogEntity newLog = new TrackingLogEntity("COMMITTEE_MEMBERS", new MasterId(newKey), "addMemberToFormedCommittee", "INSERT", "com");
            this.trackingLoService.addTrackingLog(newLog);
        }

        return newKey;
    }
}
