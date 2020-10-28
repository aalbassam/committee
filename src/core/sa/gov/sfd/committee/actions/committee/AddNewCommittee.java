package sa.gov.sfd.committee.actions.committee;

import sa.gov.sfd.committee.core.committee.CommitteeEntity;
import sa.gov.sfd.committee.core.committee.CommitteeService;

public class AddNewCommittee {

    private final CommitteeService committeeService;

    public AddNewCommittee(CommitteeService committeeService) {
        this.committeeService = committeeService;
    }

    public CommitteeEntity addNewCommittee(CommitteeEntity committeeEntity) {
        return this.committeeService.addCommittee(committeeEntity);
    }
}
