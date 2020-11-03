package sa.gov.sfd.committee.core.memberRole;

import java.util.List;

public class MemberRoleService {

    private final MemberRoleRepository memberRoleRepository;

    public MemberRoleService(MemberRoleRepository memberRoleRepository) {
        this.memberRoleRepository = memberRoleRepository;
    }

    //---- Service Methods ----
    public List<MemberRoleEntity> getAllMemberRoles() {
        return memberRoleRepository.getAllMemberRoles();
    }

    public Long addNewMemberRole(MemberRoleEntity memberRoleEntity) {
        return memberRoleRepository.addNewMemberRole(memberRoleEntity);
    }
}
