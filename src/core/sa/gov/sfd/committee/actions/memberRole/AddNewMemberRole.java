package sa.gov.sfd.committee.actions.memberRole;


import sa.gov.sfd.committee.core.memberRole.MemberRoleEntity;
import sa.gov.sfd.committee.core.memberRole.MemberRoleService;

public class AddNewMemberRole {

    private final MemberRoleService memberRoleService;

    public AddNewMemberRole(MemberRoleService memberRoleService) {
        this.memberRoleService = memberRoleService;
    }

    public Long addMemberRole(MemberRoleEntity memberRoleEntity) {
        return this.memberRoleService.addNewMemberRole(memberRoleEntity);
    }
}
