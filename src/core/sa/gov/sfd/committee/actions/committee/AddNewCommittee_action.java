package sa.gov.sfd.committee.actions.committee;

import sa.gov.sfd.committee.core.committee.CommitteeEntity;
import sa.gov.sfd.committee.core.committee.CommitteeService;

public class AddNewCommittee_action {


    private final CommitteeService committeeService;

    public AddNewCommittee_action(CommitteeService committeeService) {
        this.committeeService = committeeService;
    }

    public int addCommittee(CommitteeEntity committeeEntity)
    {
        return this.committeeService.addCommittee(committeeEntity);
    }
}
