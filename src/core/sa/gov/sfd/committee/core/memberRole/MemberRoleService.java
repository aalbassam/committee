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

    public MemberRoleEntity addNewMemberRole(MemberRoleEntity memberRoleEntity) {
        return memberRoleRepository.addNewMemberRole(memberRoleEntity);
    }
}
