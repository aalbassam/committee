package core.sa.gov.sfd.committee.actions.committee;

import core.sa.gov.sfd.committee.core.committee.CommitteeEntity;
import core.sa.gov.sfd.committee.core.committee.CommitteeService;

public class AddNewCommittee_action {

    private final CommitteeService committeeService;

    public AddNewCommittee_action(CommitteeService committeeService) {
        this.committeeService = committeeService;
    }

    public int addCommittee(CommitteeEntity committeeEntity) {
        return this.committeeService.addCommittee(committeeEntity);
    }
}
