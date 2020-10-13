package core.sa.gov.sfd.committee.actions.committee;


import core.sa.gov.sfd.committee.core.committee.CommitteeEntity;
import core.sa.gov.sfd.committee.core.committee.CommitteeService;
import core.sa.gov.sfd.committee.core.committee.FormedCommittee;

public class AddNewFormedCommittee_action {

    private final CommitteeService committeeService;

    public AddNewFormedCommittee_action(CommitteeService committeeService) {
        this.committeeService = committeeService;
    }

    public FormedCommittee addFormedCommittee(CommitteeEntity committeeEntity, FormedCommittee formedCommittee) {
        return this.committeeService.addFormedCommittee(committeeEntity, formedCommittee);
    }
}
