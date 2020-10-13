package core.sa.gov.sfd.committee.actions.committee;


import core.sa.gov.sfd.committee.core.committee.CommitteeEntity;
import core.sa.gov.sfd.committee.core.committee.CommitteeService;

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