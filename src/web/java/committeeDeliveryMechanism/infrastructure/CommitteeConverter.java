package committeeDeliveryMechanism.infrastructure;

import committeeDeliveryMechanism.view.CommitteeDTO;
import sa.gov.sfd.committee.core.committee.*;

import java.util.List;
import java.util.stream.Collectors;


public class CommitteeConverter {



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


    public static CommitteeEntity convertCommitteeDTO(CommitteeDTO committeeDTO) {

        CommitteeEntity committeeEntity = new CommitteeEntity();

        committeeEntity.setCommitteeName(new CommitteeName(committeeDTO.getArName(), committeeDTO.getEnName()));
        committeeEntity.setTasks(committeeDTO.getTasks());
        committeeEntity.setCommitteeType(committeeDTO.getType());

        return committeeEntity;

    }

}
