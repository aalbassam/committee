package sa.gov.sfd.committee.core.memberRole;

import java.util.List;


public interface MemberRoleRepository {

    List<MemberRoleEntity> getAllMemberRoles();

    MemberRoleEntity addNewMemberRole(MemberRoleEntity memberRoleEntity);
}
