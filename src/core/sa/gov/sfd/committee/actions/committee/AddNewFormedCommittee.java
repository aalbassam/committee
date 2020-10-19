package sa.gov.sfd.committee.actions.committee;


import sa.gov.sfd.committee.core.committee.CommitteeEntity;
import sa.gov.sfd.committee.core.committee.CommitteeService;
import sa.gov.sfd.committee.core.committee.FormedCommittee;

public class AddNewFormedCommittee {

    private final CommitteeService committeeService;

    public AddNewFormedCommittee(CommitteeService committeeService) {
        this.committeeService = committeeService;
    }

    public FormedCommittee addFormedCommittee(CommitteeEntity committeeEntity, FormedCommittee formedCommittee) {
        return this.committeeService.addFormedCommittee(committeeEntity, formedCommittee);
    }
}
