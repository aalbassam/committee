package committeeDeliveryMechanism.infrastructure;

import committeeDeliveryMechanism.view.MemberRoleDTO;
import sa.gov.sfd.committee.core.memberRole.MemberRoleEntity;
import sa.gov.sfd.committee.core.shared.BinaryName;
import sa.gov.sfd.committee.core.shared.MasterId;
import sa.gov.sfd.committee.core.shared.RowStatus;

import java.util.List;
import java.util.stream.Collectors;

public class MemberRoleConverter {

    public static List<MemberRoleDTO> convertMemberRolesList(List<MemberRoleEntity> memberRoleEntities) {

        return memberRoleEntities.stream().map(x ->
                new MemberRoleDTO(
                        x.getMemberRoleID().getId(),
                        x.getMemberRoleName().getArabicName(),
                        x.getMemberRoleName().getEnglishName()
                )).collect(Collectors.toList());
    }

    public static MemberRoleEntity convertMemberRoleDTO(MemberRoleDTO memberRoleDTO) {

        return new MemberRoleEntity(
                new MasterId(memberRoleDTO.getId()),
                new BinaryName(memberRoleDTO.getArName(), memberRoleDTO.getEnName()),
                new RowStatus());

    }
}
