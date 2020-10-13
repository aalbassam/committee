package core.sa.gov.sfd.committee.actions.committee;


import core.sa.gov.sfd.committee.core.committee.CommitteeService;
import core.sa.gov.sfd.committee.core.committee.FormedCommittee;

import java.util.List;

public class GetAllFormedCommittees {

    private final CommitteeService committeeService;

    public GetAllFormedCommittees(CommitteeService committeeService) {
        this.committeeService = committeeService;
    }

    public List<FormedCommittee> getAllFormedCommittees() {
        return this.committeeService.getAllFormedCommittees();
    }
}
