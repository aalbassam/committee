package committeeDeliveryMechanism.controller;

import committeeDeliveryMechanism.view.CommitteeDTO;
import committeeDeliveryMechanism.view.FormedCommitteeDTO;
import committeeDeliveryMechanism.view.MemberRoleDTO;
import sa.gov.sfd.committee.actions.committee.AddNewMemberRole;
import sa.gov.sfd.committee.actions.committee.GetAllCommittees;
import sa.gov.sfd.committee.actions.committee.GetAllFormedCommittees;
import sa.gov.sfd.committee.actions.committee.GetAllMemberRoles;
import sa.gov.sfd.committee.core.committee.MemberRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import committeeDeliveryMechanism.infrastructure.CommitteeConverter;

import java.util.List;


@RestController
@RequestMapping("/api/committees")     //http://localhost:8081/api/committees
public class CommitteeController {


    @Autowired
    private GetAllCommittees getAllCommittees; //4
    @Autowired
    private AddNewMemberRole addNewMemberRole; //3
    @Autowired
    private GetAllMemberRoles getAllMemberRoles; //6
    @Autowired
    private GetAllFormedCommittees getAllFormedCommittees; //5


    @GetMapping("/")
    public List<CommitteeDTO> getAllCommittees() {

        return CommitteeConverter.convertCommitteesList(this.getAllCommittees.getAllCommittees());
    }

    @GetMapping("/fc")
    public List<FormedCommitteeDTO> getAllFormedCommittees() {

        return CommitteeConverter.convertFormedCommitteeList(this.getAllFormedCommittees.getAllFormedCommittees());
    }


    @GetMapping("/mr")
    public List<MemberRoleDTO> getAllMemberRoles() {

        return CommitteeConverter.convertMemberRolesList(this.getAllMemberRoles.getAllMemberRoles());
    }


    @PostMapping("/")
    public MemberRole addNewMemberRole(@RequestBody MemberRoleDTO memberRoleDTO) {
        return this.addNewMemberRole.addMemberRole(CommitteeConverter.convertMemberRoleDTO(memberRoleDTO));
    }


}