package committeeDeliveryMechanism.infrastructure;

import committeeDeliveryMechanism.view.MemberRoleDTO;
import sa.gov.sfd.committee.core.committee.MemberRole;
import sa.gov.sfd.committee.core.committee.MemberRoleID;
import sa.gov.sfd.committee.core.committee.MemberRoleName;

import java.util.List;
import java.util.stream.Collectors;

public class MemberRoleConverter {

    public static List<MemberRoleDTO> convertMemberRolesList(List<MemberRole> memberRoles) {

        return memberRoles.stream().map(x ->
                new MemberRoleDTO(
                        x.getMemberRoleID().getId(),
                        x.getMemberRoleName().getArName(),
                        x.getMemberRoleName().getEnName()
                )).collect(Collectors.toList());
    }

    public static MemberRole convertMemberRoleDTO(MemberRoleDTO memberRoleDTO) {

        return new MemberRole(
                new MemberRoleID(memberRoleDTO.getId()),
                new MemberRoleName(memberRoleDTO.getArName(), memberRoleDTO.getEnName()));

    }
}
