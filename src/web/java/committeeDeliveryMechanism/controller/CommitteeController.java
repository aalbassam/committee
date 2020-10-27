package committeeDeliveryMechanism.controller;

import committeeDeliveryMechanism.infrastructure.FormedCommitteeConverter;
import committeeDeliveryMechanism.infrastructure.MemberRoleConverter;
import committeeDeliveryMechanism.view.CommitteeDTO;
import committeeDeliveryMechanism.view.FormedCommitteeDTO;
import committeeDeliveryMechanism.view.MemberRoleDTO;
import sa.gov.sfd.committee.actions.committee.*;
import sa.gov.sfd.committee.actions.formedCommittee.AddNewFormedCommittee;
import sa.gov.sfd.committee.actions.formedCommittee.GetAllFormedCommittees;
import sa.gov.sfd.committee.actions.formedCommittee.GetFormedCommitteeDetailByNO;
import sa.gov.sfd.committee.actions.memberRole.AddNewMemberRole;
import sa.gov.sfd.committee.actions.memberRole.GetAllMemberRoles;
import sa.gov.sfd.committee.core.committee.CommitteeID;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeEntity;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeNo;
import sa.gov.sfd.committee.core.memberRole.MemberRoleEntity;
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
    @Autowired
    private GetFormedCommitteeDetailByNO getFormedCommitteeDetailByNO; //7
    @Autowired
    private AddNewFormedCommittee addNewFormedCommittee; //2


    @GetMapping("/")
    public List<CommitteeDTO> getAllCommittees() {

        return CommitteeConverter.convertCommitteesList(this.getAllCommittees.getAllCommittees());
    }


    @GetMapping("/i/{formedNo}")
    public FormedCommitteeDTO getFormedCommitteeDetailById(@PathVariable Long formedNo) {

        return FormedCommitteeConverter.convertFormedCommittee(this.getFormedCommitteeDetailByNO.getFormedCommitteeDetailById(new FormedCommitteeNo(formedNo)));
    }


    @GetMapping("/formedCommittees")
    public List<FormedCommitteeDTO> getAllFormedCommittees() {

        return FormedCommitteeConverter.convertFormedCommitteeList(this.getAllFormedCommittees.getAllFormedCommittees());
    }


    @GetMapping("/memberRoles")
    public List<MemberRoleDTO> getAllMemberRoles() {

        return MemberRoleConverter.convertMemberRolesList(this.getAllMemberRoles.getAllMemberRoles());
    }


    @PostMapping("/memberRoles")
    public MemberRoleEntity addNewMemberRole(@RequestBody MemberRoleDTO memberRoleDTO) {
        return this.addNewMemberRole.addMemberRole(MemberRoleConverter.convertMemberRoleDTO(memberRoleDTO));
    }


    @PostMapping("/formedCommittees/{committeeID}")
    public FormedCommitteeEntity addNewFormedCommittee(@PathVariable int committeeID, @RequestBody FormedCommitteeDTO formedCommitteeDTO) {
        return this.addNewFormedCommittee.addFormedCommittee(new CommitteeID(committeeID), FormedCommitteeConverter.convertFormedCommitteeDTO(formedCommitteeDTO));
    }

}