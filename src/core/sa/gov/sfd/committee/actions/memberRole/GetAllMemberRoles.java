package sa.gov.sfd.committee.actions.memberRole;

import sa.gov.sfd.committee.core.memberRole.MemberRoleEntity;
import sa.gov.sfd.committee.core.memberRole.MemberRoleService;

import java.util.List;

public class GetAllMemberRoles {

    private final MemberRoleService memberRoleService;

    public GetAllMemberRoles(MemberRoleService memberRoleService) {
        this.memberRoleService = memberRoleService;
    }

    public List<MemberRoleEntity> getAllMemberRoles() {
        return this.memberRoleService.getAllMemberRoles();
    }
}
