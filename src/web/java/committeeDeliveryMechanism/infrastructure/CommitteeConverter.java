package committeeDeliveryMechanism.infrastructure;

import committeeDeliveryMechanism.view.CommitteeInfoDTO;
import committeeDeliveryMechanism.view.MemberRoleDTO;
import sa.gov.sfd.committee.core.committee.MemberRole;
import sa.gov.sfd.committee.core.committee.MemberRoleID;
import sa.gov.sfd.committee.core.committee.MemberRoleName;

import java.util.List;
import java.util.stream.Collectors;


public class CommitteeConverter {


    public static List<MemberRoleDTO> convertMemberRolesList(List<MemberRole> memberRole) {

        return memberRole.stream().map(x ->
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

    /*
    public static CommitteeInfoDTO convertCommitteeDTO(CommitteeEntity committeeEntity){
        
        //DTO Object 
        CommitteeInfoDTO committee = new CommitteeInfoDTO();
        
        //get data from entity to DTO
        committee.setCommitteeId(committeeEntity.getCommitteeId().getId());
        committee.setCommitteeNameAr(committeeEntity.getCommitteeName().getCommitteeNameAr());
        committee.setCommitteeNameEn(committeeEntity.getCommitteeName().getCommitteeNameEn());

        return committee;

    }*/

}
