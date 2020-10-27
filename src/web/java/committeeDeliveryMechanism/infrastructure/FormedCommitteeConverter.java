package committeeDeliveryMechanism.infrastructure;

import committeeDeliveryMechanism.view.FormedCommitteeDTO;
import sa.gov.sfd.committee.core.committee.CommitteeEntity;
import sa.gov.sfd.committee.core.committee.CommitteeID;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeEntity;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeDecisionDate;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeEndDate;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeNo;

import java.util.List;
import java.util.stream.Collectors;

public class FormedCommitteeConverter {

    public static List<FormedCommitteeDTO> convertFormedCommitteeList(List<FormedCommitteeEntity> formedCommitteeEntities) {

        return formedCommitteeEntities.stream().map(x ->
                new FormedCommitteeDTO(
                        x.getFormedCommitteeNo().getNo(),
                        x.getCommitteeEntity().getCommitteeID().getId(),
                        x.isReward(),
                        x.getDecisionNo(),
                        x.getFormedCommitteeDecisionDate().getDecisionDateAH(),
                        x.getFormedCommitteeDecisionDate().getDecisionDateAD(),
                        x.getFormedCommitteeEndDate().getEndDateAH(),
                        x.getFormedCommitteeEndDate().getEndDateAD()
                )).collect(Collectors.toList());
    }

    public static FormedCommitteeDTO convertFormedCommittee(FormedCommitteeEntity formedCommitteeEntity) {

        return new FormedCommitteeDTO(
                formedCommitteeEntity.getFormedCommitteeNo().getNo(),
                formedCommitteeEntity.getCommitteeEntity().getCommitteeID().getId(),
                formedCommitteeEntity.isReward(),
                formedCommitteeEntity.getDecisionNo(),
                formedCommitteeEntity.getFormedCommitteeDecisionDate().getDecisionDateAH(),
                formedCommitteeEntity.getFormedCommitteeDecisionDate().getDecisionDateAD(),
                formedCommitteeEntity.getFormedCommitteeEndDate().getEndDateAH(),
                formedCommitteeEntity.getFormedCommitteeEndDate().getEndDateAD()
        );
    }

    public static FormedCommitteeEntity convertFormedCommitteeDTO(FormedCommitteeDTO formedCommitteeDTO) {

        return new FormedCommitteeEntity(

                new FormedCommitteeNo(formedCommitteeDTO.getFormedCommitteeNo()),
                new CommitteeEntity(new CommitteeID(formedCommitteeDTO.getCommitteeId())),
                formedCommitteeDTO.isReward(),
                formedCommitteeDTO.getDecisionNo(),
                new FormedCommitteeDecisionDate(formedCommitteeDTO.getFormedCommitteeDecisionDateAH(), formedCommitteeDTO.getFormedCommitteeDecisionDateAD()),
                new FormedCommitteeEndDate(formedCommitteeDTO.getFormedCommitteeEndDateAH(), formedCommitteeDTO.getFormedCommitteeEndDateAD()),
                null,
                ' ');

    }
}
