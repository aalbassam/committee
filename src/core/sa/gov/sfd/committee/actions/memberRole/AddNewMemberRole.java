package sa.gov.sfd.committee.actions.memberRole;


import org.springframework.beans.factory.annotation.Autowired;
import sa.gov.sfd.committee.core.memberRole.MemberRoleEntity;
import sa.gov.sfd.committee.core.memberRole.MemberRoleService;
import sa.gov.sfd.committee.core.shared.MasterId;
import sa.gov.sfd.committee.core.trackingLog.TrackingLogEntity;
import sa.gov.sfd.committee.core.trackingLog.TrackingLogService;

public class AddNewMemberRole {

    private final MemberRoleService memberRoleService;

    @Autowired
    private TrackingLogService trackingLogService;

    public AddNewMemberRole(MemberRoleService memberRoleService) {
        this.memberRoleService = memberRoleService;
    }

    public Long addMemberRole(MemberRoleEntity memberRoleEntity) {

        Long newKey = this.memberRoleService.addNewMemberRole(memberRoleEntity);

        if (newKey != 0) {
            TrackingLogEntity newLog = new TrackingLogEntity("MEMBER_ROLES", new MasterId(newKey), "addMemberRole", "INSERT", "com");
            this.trackingLogService.addTrackingLog(newLog);
        }

        return newKey;


    }
}
