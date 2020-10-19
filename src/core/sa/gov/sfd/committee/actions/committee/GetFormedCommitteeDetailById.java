package sa.gov.sfd.committee.actions.committee;


import sa.gov.sfd.committee.core.committee.CommitteeService;
import sa.gov.sfd.committee.core.committee.FormedCommittee;
import sa.gov.sfd.committee.core.committee.FormedCommitteeNo;


public class GetFormedCommitteeDetailById {

    //service:
    private CommitteeService committeeService;

    //constructor:
    public GetFormedCommitteeDetailById(CommitteeService committeeService) {
        this.committeeService = committeeService;
    }

    //to get data from Repo(DB) by service
    public FormedCommittee getFormedCommitteeDetailById(FormedCommitteeNo formedCommitteeNo) {
        return committeeService.getFormedCommitteeById(formedCommitteeNo);
    }
    
}
