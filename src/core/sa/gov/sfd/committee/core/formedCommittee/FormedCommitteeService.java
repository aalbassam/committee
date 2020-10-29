package sa.gov.sfd.committee.core.formedCommittee;


import sa.gov.sfd.committee.core.committee.CommitteeID;

import java.util.List;


public class FormedCommitteeService {

    private final FormedCommitteeRepository formedCommitteeRepository;

    public FormedCommitteeService(FormedCommitteeRepository formedCommitteeRepository) {
        this.formedCommitteeRepository = formedCommitteeRepository;
    }

    //---- Service Methods ----
    public FormedCommitteeEntity getFormedCommitteeByNO(FormedCommitteeNo formedCommitteeNo) {
        return formedCommitteeRepository.getFormedCommitteeByNO(formedCommitteeNo);
    }

    public FormedCommitteeEntity addFormedCommittee(CommitteeID committeeID, FormedCommitteeEntity formedCommitteeEntity) {
        return formedCommitteeRepository.addFormedCommittee(committeeID, formedCommitteeEntity);
    }

    public List<FormedCommitteeEntity> getAllFormedCommittees() {
        return formedCommitteeRepository.findAllFormedCommittees();
    }
}
