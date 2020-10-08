package core.sa.gov.sfd.committee.actions.committee;

import core.sa.gov.sfd.committee.core.committee.CommitteeEntity;
import core.sa.gov.sfd.committee.core.committee.CommitteeService;

import java.util.List;

public class GetDetailsOfFormedCommitteeByID_action {

    //service:
    private CommitteeService committeeService;
    
    //constructor:
    public GetDetailsOfFormedCommitteeByID_action(CommitteeService committeeService) {
        this.committeeService = committeeService;
    }
    
    //to get data from Repo(DB) by service
    public  List<CommitteeEntity> findAll(){
        return committeeService.getAllCommittees();
    }
    
}
