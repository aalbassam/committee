package committeeDeliveryMechanism.infrastructure;

import committeeDeliveryMechanism.view.FormedCommitteeDTO;
import sa.gov.sfd.committee.core.committee.CommitteeEntity;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeEntity;
import sa.gov.sfd.committee.core.shared.BinaryDate;
import sa.gov.sfd.committee.core.shared.MasterId;
import sa.gov.sfd.committee.core.shared.RowStatus;

import java.util.List;
import java.util.stream.Collectors;

public class FormedCommitteeConverter {

    public static List<FormedCommitteeDTO> convertFormedCommitteeList(List<FormedCommitteeEntity> formedCommitteeEntities) {

        return formedCommitteeEntities.stream().map(x ->
                new FormedCommitteeDTO(
                        x.getFormationID().getId(),
                        x.getCommitteeEntity().getCommitteeID().getId(),
                        x.isReward(),
                        x.getDecisionNo(),
                        x.getDecisionDate().getHijri(),
                        x.getDecisionDate().getGregorian(),
                        x.getEndDate().getHijri(),
                        x.getEndDate().getGregorian()
                )).collect(Collectors.toList());
    }

    public static FormedCommitteeDTO convertFormedCommittee(FormedCommitteeEntity formedCommitteeEntity) {

        return new FormedCommitteeDTO(
                formedCommitteeEntity.getFormationID().getId(),
                formedCommitteeEntity.getCommitteeEntity().getCommitteeID().getId(),
                formedCommitteeEntity.isReward(),
                formedCommitteeEntity.getDecisionNo(),
                formedCommitteeEntity.getDecisionDate().getHijri(),
                formedCommitteeEntity.getDecisionDate().getGregorian(),
                formedCommitteeEntity.getEndDate().getHijri(),
                formedCommitteeEntity.getEndDate().getGregorian()
        );
    }

    public static FormedCommitteeEntity convertFormedCommitteeDTO(FormedCommitteeDTO formedCommitteeDTO) {

        return new FormedCommitteeEntity(

                new MasterId(formedCommitteeDTO.getFormedNo()),
                new CommitteeEntity(new MasterId(formedCommitteeDTO.getCommitteeId())),
                formedCommitteeDTO.isReward(),
                formedCommitteeDTO.getDecisionNo(),
                new BinaryDate(formedCommitteeDTO.getDecisionDateAH(), formedCommitteeDTO.getDecisionDateAD()),
                new BinaryDate(formedCommitteeDTO.getEndDateAH(), formedCommitteeDTO.getEndDateAD()),
                null,
                new RowStatus());

    }
}
