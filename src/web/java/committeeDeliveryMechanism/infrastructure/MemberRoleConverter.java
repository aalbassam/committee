package committeeDeliveryMechanism.infrastructure;

import committeeDeliveryMechanism.view.MemberRoleDTO;
import sa.gov.sfd.committee.core.memberRole.MemberRoleEntity;
import sa.gov.sfd.committee.core.memberRole.MemberRoleID;
import sa.gov.sfd.committee.core.memberRole.MemberRoleName;

import java.util.List;
import java.util.stream.Collectors;

public class MemberRoleConverter {

    public static List<MemberRoleDTO> convertMemberRolesList(List<MemberRoleEntity> memberRoleEntities) {

        return memberRoleEntities.stream().map(x ->
                new MemberRoleDTO(
                        x.getMemberRoleID().getId(),
                        x.getMemberRoleName().getArName(),
                        x.getMemberRoleName().getEnName()
                )).collect(Collectors.toList());
    }

    public static MemberRoleEntity convertMemberRoleDTO(MemberRoleDTO memberRoleDTO) {

        return new MemberRoleEntity(
                new MemberRoleID(memberRoleDTO.getId()),
                new MemberRoleName(memberRoleDTO.getArName(), memberRoleDTO.getEnName()));

    }
}
