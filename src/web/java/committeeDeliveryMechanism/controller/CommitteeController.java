package committeeDeliveryMechanism.controller;

import core.sa.gov.sfd.committee.actions.committee.GetAllCommittees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import committeeDeliveryMechanism.infrastructure.ModuleConverter;
import committeeDeliveryMechanism.infrastructure.CommitteeConverter;
import committeeDeliveryMechanism.view.CommitteeInfoDTO;
import sa.gov.sfd.committee.actions.formedCommittee.GetDetailsOfFormedCommitteeByID_action;

import java.util.List;
import java.util.stream.Collectors;



@RestController
//http://localhost:8080/api/committees
@RequestMapping("/api/committees")
public class CommitteeController {

    //Action (1): 
    @Autowired
    private GetAllCommittees getCommittees;



    @GetMapping("/a")
    public List<CommitteeInfoDTO> getAllCommittees(){
        // return CommitteeConverter.convertCommitteeDTO(getCommittees.findAll());
        System.out.println("hi");
        return getCommittees.getAllCommittees().stream().map(CommitteeConverter::convertCommitteeDTO).collect(Collectors.toList());
    }

}
