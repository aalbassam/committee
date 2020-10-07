package committeeDeliveryMechanism.infrastructure;

import committeeDeliveryMechanism.view.CommitteeInfoDTO;
import sa.gov.sfd.committee.core.*;

public class CommitteeConverter {

    
    public static CommitteeInfoDTO convertCommitteeDTO(CommitteeEntity committeeEntity){
        
        //DTO Object 
        CommitteeInfoDTO committee = new CommitteeInfoDTO();
        
        //get data from entity to DTO
        committee.setCommitteeId(committeeEntity.getCommitteeId().getId());
        committee.setCommitteeNameAr(committeeEntity.getCommitteeName().getCommitteeNameAr());
        committee.setCommitteeNameEn(committeeEntity.getCommitteeName().getCommitteeNameEn());

        return committee;

    }

}
