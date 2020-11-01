package sa.gov.sfd.committee.actions.formedCommittee;


import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeEntity;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeService;
import sa.gov.sfd.committee.core.shared.MasterId;

public class AddNewFormedCommittee {

    private final FormedCommitteeService formedCommitteeService;

    public AddNewFormedCommittee(FormedCommitteeService formedCommitteeService) {
        this.formedCommitteeService = formedCommitteeService;
    }

    public FormedCommitteeEntity addFormedCommittee(MasterId committeeID, FormedCommitteeEntity formedCommitteeEntity) {
        return this.formedCommitteeService.addFormedCommittee(committeeID, formedCommitteeEntity);
    }

}
