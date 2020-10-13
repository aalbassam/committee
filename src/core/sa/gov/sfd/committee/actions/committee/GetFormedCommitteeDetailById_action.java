package core.sa.gov.sfd.committee.actions.committee;


import core.sa.gov.sfd.committee.core.committee.CommitteeService;
import core.sa.gov.sfd.committee.core.committee.FormedCommittee;
import core.sa.gov.sfd.committee.core.committee.FormedCommitteeNo;


public class GetFormedCommitteeDetailById_action {

    //service:
    private CommitteeService committeeService;

    //constructor:
    public GetFormedCommitteeDetailById_action(CommitteeService committeeService) {
        this.committeeService = committeeService;
    }

    //to get data from Repo(DB) by service
    public FormedCommittee getFormedCommitteeDetailById(FormedCommitteeNo formedCommitteeNo) {
        return committeeService.getFormedCommitteeById(formedCommitteeNo);
    }
    
}