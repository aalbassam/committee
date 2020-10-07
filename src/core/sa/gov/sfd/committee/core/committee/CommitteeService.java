package sa.gov.sfd.committee.core.committee;

import java.util.List;

public class CommitteeService {

    CommitteeRepository committeeRepository;

    public CommitteeService(CommitteeRepository committeeRepository) {
        this.committeeRepository = committeeRepository;
    }

    public int addCommittee(CommitteeEntity committeeEntity){
        return committeeRepository.addCommittee(committeeEntity);
    }

    public List<CommitteeEntity> getAllCommittees(){
        return committeeRepository.findAllCommittees();
    }

    public int updateCommittee(CommitteeEntity committeeEntity){
        return committeeRepository.updateCommittee(committeeEntity);
    }
}
