package committeeDeliveryMechanism.infrastructure;

import committeeDeliveryMechanism.view.MemberDTO;
import sa.gov.sfd.committee.core.employee.EmployeeEntity;
import sa.gov.sfd.committee.core.employee.EmployeeNID;
import sa.gov.sfd.committee.core.member.MemberEntity;
import sa.gov.sfd.committee.core.shared.BinaryDate;
import sa.gov.sfd.committee.core.shared.MasterId;

import java.util.List;
import java.util.stream.Collectors;

public class MemberConverter {

    public static List<MemberDTO> convertMemberList(List<MemberEntity> memberEntities) {


        return memberEntities.stream().map(x ->
                new MemberDTO(
                        x.getMemberId().getId(),
                        x.getEmployeeEntity().getEmployeeNID().getId(),
                        x.getFormedCommitteeNo().getId(),
                        x.getMemberRoleId().getId(),
                        x.getMemberDecisionDate().getHijri(),
                        x.getMemberEndJoinDate().getHijri()
                )).collect(Collectors.toList());
    }

    public static MemberEntity convertMemberDTO(MemberDTO memberDTO) {

        MemberEntity memberEntity = new MemberEntity();

        memberEntity.setFormedCommitteeNo(new MasterId(memberDTO.getFormationNo()));
        memberEntity.setEmployeeEntity(new EmployeeEntity(new EmployeeNID(memberDTO.getMemberNationalID())));
        memberEntity.setMemberRoleId(new MasterId(memberDTO.getRoleId()));

        memberEntity.setMemberDecisionDate(new BinaryDate(memberDTO.getJoinDate(), null));
        memberEntity.setMemberEndJoinDate(new BinaryDate(memberDTO.getEndDate(), null));

        return memberEntity;

    }


}
