package sa.gov.sfd.committee.actions.formedCommittee;


import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeEntity;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeNo;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeService;


public class GetFormedCommitteeDetailByNO {

    //service:
    private final FormedCommitteeService formedCommitteeService;

    public GetFormedCommitteeDetailByNO(FormedCommitteeService formedCommitteeService) {
        this.formedCommitteeService = formedCommitteeService;
    }

    public FormedCommitteeEntity getFormedCommitteeDetailByNO(FormedCommitteeNo formedCommitteeNo) {
        return formedCommitteeService.getFormedCommitteeByNO(formedCommitteeNo);
    }

}
