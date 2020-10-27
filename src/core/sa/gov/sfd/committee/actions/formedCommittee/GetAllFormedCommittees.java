package sa.gov.sfd.committee.actions.formedCommittee;


import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeEntity;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeService;

import java.util.List;

public class GetAllFormedCommittees {

    private final FormedCommitteeService formedCommitteeService;

    public GetAllFormedCommittees(FormedCommitteeService formedCommitteeService) {
        this.formedCommitteeService = formedCommitteeService;
    }

    public List<FormedCommitteeEntity> getAllFormedCommittees() {
        return this.formedCommitteeService.getAllFormedCommittees();
    }
}
