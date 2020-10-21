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
