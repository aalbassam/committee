package committeeDeliveryMechanism.controller;

import committeeDeliveryMechanism.view.MemberRoleDTO;
import sa.gov.sfd.committee.actions.committee.AddNewMemberRole;
import sa.gov.sfd.committee.actions.committee.GetAllCommittees;
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
    private GetAllCommittees getCommittees;
    @Autowired
    private AddNewMemberRole addNewMemberRole;
    @Autowired
    private GetAllMemberRoles getAllMemberRoles;


    @GetMapping("/")
    public List<MemberRoleDTO> getAllMemberRoles() {

        return CommitteeConverter.convertMemberRolesList(this.getAllMemberRoles.getAllMemberRoles());
    }


    @PostMapping("/")
    public MemberRole addNewMemberRole(@RequestBody MemberRoleDTO memberRoleDTO) {
        return this.addNewMemberRole.addMemberRole(CommitteeConverter.convertMemberRoleDTO(memberRoleDTO));
    }

/*
    @GetMapping("/a")
    public List<CommitteeInfoDTO> getAllCommittees(){
        // return CommitteeConverter.convertCommitteeDTO(getCommittees.findAll());
        System.out.println("hi");
        return getCommittees.getAllCommittees().stream().map(CommitteeConverter::convertCommitteeDTO).collect(Collectors.toList());
    }*/

}
