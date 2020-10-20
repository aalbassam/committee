package committeeDeliveryMechanism.infrastructure;

import committeeDeliveryMechanism.view.CommitteeDTO;
import committeeDeliveryMechanism.view.FormedCommitteeDTO;
import committeeDeliveryMechanism.view.MemberRoleDTO;
import sa.gov.sfd.committee.core.committee.*;

import java.util.List;
import java.util.stream.Collectors;


public class CommitteeConverter {


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

    public static List<CommitteeDTO> convertCommitteesList(List<CommitteeEntity> committeeEntities) {

        return committeeEntities.stream().map(x ->
                new CommitteeDTO(
                        x.getCommitteeID().getId(),
                        x.getCommitteeName().getArName(),
                        x.getCommitteeName().getEnName(),
                        x.getTasks(),
                        x.getCommitteeType()
                )).collect(Collectors.toList());
    }

    public static List<FormedCommitteeDTO> convertFormedCommitteeList(List<FormedCommittee> formedCommittees) {

        return formedCommittees.stream().map(x ->
                new FormedCommitteeDTO(
                        x.getFormedCommitteeNo().getNo(),
                        x.isReward(),
                        x.getDecisionNo(),
                        x.getFormedCommitteeDecisionDate().getDecisionDateAH(),
                        x.getFormedCommitteeDecisionDate().getDecisionDateAD(),
                        x.getFormedCommitteeEndDate().getEndDateAH(),
                        x.getFormedCommitteeEndDate().getEndDateAD()
                )).collect(Collectors.toList());
    }

    public static FormedCommitteeDTO convertFormedCommittee(FormedCommittee formedCommittee) {

        return new FormedCommitteeDTO(
                formedCommittee.getFormedCommitteeNo().getNo(),
                formedCommittee.isReward(),
                formedCommittee.getDecisionNo(),
                formedCommittee.getFormedCommitteeDecisionDate().getDecisionDateAH(),
                formedCommittee.getFormedCommitteeDecisionDate().getDecisionDateAD(),
                formedCommittee.getFormedCommitteeEndDate().getEndDateAH(),
                formedCommittee.getFormedCommitteeEndDate().getEndDateAD()
        );
    }

    public static FormedCommittee convertFormedCommitteeDTO(FormedCommitteeDTO formedCommitteeDTO) {

        return new FormedCommittee(

                new FormedCommitteeNo(formedCommitteeDTO.getFormedCommitteeNo()),
                formedCommitteeDTO.isReward(),
                formedCommitteeDTO.getDecisionNo(),
                new FormedCommitteeDecisionDate(formedCommitteeDTO.getFormedCommitteeDecisionDateAH(), formedCommitteeDTO.getFormedCommitteeDecisionDateAD()),
                new FormedCommitteeEndDate(formedCommitteeDTO.getFormedCommitteeEndDateAH(), formedCommitteeDTO.getFormedCommitteeEndDateAD()),
                null,
                null,
                null);

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
