package committeeDeliveryMechanism.infrastructure;

import committeeDeliveryMechanism.view.CommitteeDTO;
import committeeDeliveryMechanism.view.MemberDTO;
import sa.gov.sfd.committee.core.committee.CommitteeEntity;
import sa.gov.sfd.committee.core.committee.CommitteeName;
import sa.gov.sfd.committee.core.employee.EmployeeEntity;
import sa.gov.sfd.committee.core.employee.EmployeeNID;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeNo;
import sa.gov.sfd.committee.core.member.MemberDecisionDate;
import sa.gov.sfd.committee.core.member.MemberEndJoinDate;
import sa.gov.sfd.committee.core.member.MemberEntity;
import sa.gov.sfd.committee.core.member.MemberID;
import sa.gov.sfd.committee.core.memberRole.MemberRoleEntity;
import sa.gov.sfd.committee.core.memberRole.MemberRoleID;

import java.util.List;
import java.util.stream.Collectors;

public class MemberConverter {

    public static List<MemberDTO> convertMemberList(List<MemberEntity> memberEntities) {


        return memberEntities.stream().map(x ->
                new MemberDTO(
                        x.getMemberId().getId(),
                        x.getEmployeeEntity().getEmployeeNID().getId(),
                        x.getFormedCommitteeNo().getNo(),
                        x.getMemberRoleEntity().getMemberRoleID().getId(),
                        x.getMemberDecisionDate().getDecisionDateAH(),
                        x.getMemberEndJoinDate().getJoinDateAH()
                )).collect(Collectors.toList());
    }

    public static MemberEntity convertMemberDTO(MemberDTO memberDTO) {

        MemberEntity memberEntity = new MemberEntity();

        memberEntity.setFormedCommitteeNo(new FormedCommitteeNo(memberDTO.getFormationNo()));
        memberEntity.setEmployeeEntity(new EmployeeEntity(new EmployeeNID(memberDTO.getMemberNationalID())));
        memberEntity.setMemberRoleEntity(new MemberRoleEntity(new MemberRoleID(memberDTO.getRoleId())));

        memberEntity.setMemberDecisionDate(new MemberDecisionDate(memberDTO.getJoinDate(), null));
        memberEntity.setMemberEndJoinDate(new MemberEndJoinDate(memberDTO.getEndDate(), null));

        return memberEntity;

    }


}
