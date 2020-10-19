package sa.gov.sfd.committee.actions.committee;


import sa.gov.sfd.committee.core.committee.CommitteeEntity;
import sa.gov.sfd.committee.core.committee.CommitteeService;

import java.util.List;

public class GetAllCommittees {

    private final CommitteeService committeeService;

    public GetAllCommittees(CommitteeService committeeService) {
        this.committeeService = committeeService;
    }

    public List<CommitteeEntity> getAllCommittees() {
        return this.committeeService.getAllCommittees();
    }
}
