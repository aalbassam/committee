package sa.gov.sfd.committee.actions.committee;


import sa.gov.sfd.committee.core.committee.CommitteeEntity;
import sa.gov.sfd.committee.core.committee.CommitteeID;
import sa.gov.sfd.committee.core.committee.CommitteeService;
import sa.gov.sfd.committee.core.committee.FormedCommittee;

public class AddNewFormedCommittee {

    private final CommitteeService committeeService;

    public AddNewFormedCommittee(CommitteeService committeeService) {
        this.committeeService = committeeService;
    }

    public FormedCommittee addFormedCommittee(CommitteeID committeeID, FormedCommittee formedCommittee) {
        return this.committeeService.addFormedCommittee(committeeID, formedCommittee);
    }

}
