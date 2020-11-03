package sa.gov.sfd.committee.core.formedCommittee;


import sa.gov.sfd.committee.core.shared.MasterId;

import java.util.List;


public class FormedCommitteeService {

    private final FormedCommitteeRepository formedCommitteeRepository;

    public FormedCommitteeService(FormedCommitteeRepository formedCommitteeRepository) {
        this.formedCommitteeRepository = formedCommitteeRepository;
    }

    //---- Service Methods ----
    public FormedCommitteeEntity getFormedCommitteeByNO(MasterId formedCommitteeNo) {
        return formedCommitteeRepository.getFormedCommitteeByNO(formedCommitteeNo);
    }

    public Long addFormedCommittee(MasterId committeeID, FormedCommitteeEntity formedCommitteeEntity) {
        return formedCommitteeRepository.addFormedCommittee(committeeID, formedCommitteeEntity);
    }

    public List<FormedCommitteeEntity> getAllFormedCommittees() {
        return formedCommitteeRepository.findAllFormedCommittees();
    }
}
