package committeeDeliveryMechanism.controller;

import committeeDeliveryMechanism.infrastructure.*;
import committeeDeliveryMechanism.view.*;
import sa.gov.sfd.committee.actions.committee.*;
import sa.gov.sfd.committee.actions.employee.GetEmployeesList;
import sa.gov.sfd.committee.actions.formedCommittee.AddNewFormedCommittee;
import sa.gov.sfd.committee.actions.formedCommittee.GetAllFormedCommittees;
import sa.gov.sfd.committee.actions.formedCommittee.GetFormedCommitteeDetailByNO;
import sa.gov.sfd.committee.actions.member.AddMemberToFormedCommittee;
import sa.gov.sfd.committee.actions.member.GetAllMembersByFormationNO;
import sa.gov.sfd.committee.actions.memberRole.AddNewMemberRole;
import sa.gov.sfd.committee.actions.memberRole.GetAllMemberRoles;
import sa.gov.sfd.committee.core.committee.CommitteeEntity;
import sa.gov.sfd.committee.core.committee.CommitteeID;
import sa.gov.sfd.committee.core.employee.EmployeeEntity;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeEntity;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeNo;
import sa.gov.sfd.committee.core.member.MemberEntity;
import sa.gov.sfd.committee.core.memberRole.MemberRoleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @Autowired
    private AddNewCommittee addNewCommittee;
    @Autowired
    private GetAllMembersByFormationNO getAllMembersByFormationNO;
    @Autowired
    private AddMemberToFormedCommittee addMemberToFormedCommittee;
    @Autowired
    private GetEmployeesList getEmployeesList;

    //---------------------------Committees-----------------------------------------------------------------------------


    @GetMapping("/") //tested
    public List<CommitteeDTO> getAllCommittees() {

        return CommitteeConverter.convertCommitteesList(this.getAllCommittees.getAllCommittees());
    }

    @PostMapping("/addCommittee") //tested
    public CommitteeEntity addNewCommittee(@RequestBody CommitteeDTO committeeDTO) {
        return this.addNewCommittee.addNewCommittee(CommitteeConverter.convertCommitteeDTO(committeeDTO));
    }


    //--------------------------FormedCommittees------------------------------------------------------------------------

    @GetMapping("/formedCommittees/{formedNo}") //tested
    public FormedCommitteeDTO getFormedCommitteeDetailByNO(@PathVariable Long formedNo) {

        return FormedCommitteeConverter.convertFormedCommittee(this.getFormedCommitteeDetailByNO.getFormedCommitteeDetailByNO(new FormedCommitteeNo(formedNo)));
    }

    @GetMapping("/formedCommittees") //tested
    public List<FormedCommitteeDTO> getAllFormedCommittees() {

        return FormedCommitteeConverter.convertFormedCommitteeList(this.getAllFormedCommittees.getAllFormedCommittees());
    }

    @PostMapping("/formedCommittees/{committeeID}") //tested
    public FormedCommitteeEntity addNewFormedCommittee(@PathVariable int committeeID, @RequestBody FormedCommitteeDTO formedCommitteeDTO) {
        return this.addNewFormedCommittee.addFormedCommittee(new CommitteeID(committeeID), FormedCommitteeConverter.convertFormedCommitteeDTO(formedCommitteeDTO));
    }


    //-------------------------------Member Roles-----------------------------------------------------------------------

    @GetMapping("/memberRoles") //tested
    public List<MemberRoleDTO> getAllMemberRoles() {

        return MemberRoleConverter.convertMemberRolesList(this.getAllMemberRoles.getAllMemberRoles());
    }

    @PostMapping("/memberRoles") //tested
    public MemberRoleEntity addNewMemberRole(@RequestBody MemberRoleDTO memberRoleDTO) {
        return this.addNewMemberRole.addMemberRole(MemberRoleConverter.convertMemberRoleDTO(memberRoleDTO));
    }

    //-------------------------------Members-----------------------------------------------------------------------------

    @GetMapping("/getMembers/{formedNo}") //tested
    public List<MemberDTO> getAllMembersByFormationNo(@PathVariable Long formedNo) {

        return MemberConverter.convertMemberList(this.getAllMembersByFormationNO.getAllMembersByFormationNo(new FormedCommitteeNo(formedNo)));
    }

    @PostMapping("/addMember/{formedNo}") //tested
    public MemberEntity addMemberToFormedCommittee(@PathVariable Long formedNo, @RequestBody MemberDTO memberDTO) {
        return this.addMemberToFormedCommittee.addMemberToFormedCommittee(MemberConverter.convertMemberDTO(memberDTO), new FormedCommitteeNo(formedNo));
    }

    //--------------------------------Employees-------------------------------------------------------------------------

    @GetMapping("/employeeList") //tested
    public List<EmployeeDTO> getEmployeesList() {

        return EmployeeConverter.convertEmployeeList(this.getEmployeesList.getAllEmployeeList());
    }
}