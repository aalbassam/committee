package sa.gov.sfd.committee.actions.formedCommittee;


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
