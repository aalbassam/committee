package committeeDeliveryMechanism.infrastructure;

import committeeDeliveryMechanism.view.CommitteeDTO;
import sa.gov.sfd.committee.core.committee.*;
import sa.gov.sfd.committee.core.shared.BinaryName;

import java.util.List;
import java.util.stream.Collectors;


public class CommitteeConverter {



    public static List<CommitteeDTO> convertCommitteesList(List<CommitteeEntity> committeeEntities) {

        return committeeEntities.stream().map(x ->
                new CommitteeDTO(
                        x.getCommitteeID().getId(),
                        x.getCommitteeName().getArabicName(),
                        x.getCommitteeName().getEnglishName(),
                        x.getTasks(),
                        x.getCommitteeType()
                )).collect(Collectors.toList());
    }


    public static CommitteeEntity convertCommitteeDTO(CommitteeDTO committeeDTO) {

        CommitteeEntity committeeEntity = new CommitteeEntity();

        committeeEntity.setCommitteeName(new BinaryName(committeeDTO.getArName(), committeeDTO.getEnName()));
        committeeEntity.setTasks(committeeDTO.getTasks());
        committeeEntity.setCommitteeType(committeeDTO.getType());

        return committeeEntity;

    }

}
