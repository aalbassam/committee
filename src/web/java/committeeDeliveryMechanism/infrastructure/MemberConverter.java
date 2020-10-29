package committeeDeliveryMechanism.infrastructure;

import committeeDeliveryMechanism.view.MemberDTO;
import sa.gov.sfd.committee.core.employee.EmployeeEntity;
import sa.gov.sfd.committee.core.employee.EmployeeNID;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeNo;
import sa.gov.sfd.committee.core.member.MemberEntity;
import sa.gov.sfd.committee.core.memberRole.MemberRoleEntity;
import sa.gov.sfd.committee.core.memberRole.MemberRoleID;
import sa.gov.sfd.committee.core.shared.BinaryDate;

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
                        x.getMemberDecisionDate().getHijri(),
                        x.getMemberEndJoinDate().getHijri()
                )).collect(Collectors.toList());
    }

    public static MemberEntity convertMemberDTO(MemberDTO memberDTO) {

        MemberEntity memberEntity = new MemberEntity();

        memberEntity.setFormedCommitteeNo(new FormedCommitteeNo(memberDTO.getFormationNo()));
        memberEntity.setEmployeeEntity(new EmployeeEntity(new EmployeeNID(memberDTO.getMemberNationalID())));
        memberEntity.setMemberRoleEntity(new MemberRoleEntity(new MemberRoleID(memberDTO.getRoleId())));

        memberEntity.setMemberDecisionDate(new BinaryDate(memberDTO.getJoinDate(), null));
        memberEntity.setMemberEndJoinDate(new BinaryDate(memberDTO.getEndDate(), null));

        return memberEntity;

    }


}
