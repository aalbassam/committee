package core.sa.gov.sfd.committee.actions.committee;


import core.sa.gov.sfd.committee.core.committee.CommitteeService;
import core.sa.gov.sfd.committee.core.committee.MemberRole;

public class AddNewMemberRole_action {

    private final CommitteeService committeeService;

    public AddNewMemberRole_action(CommitteeService committeeService) {
        this.committeeService = committeeService;
    }

    public MemberRole addMemberRole(MemberRole memberRole) {
        return this.committeeService.addNewMemberRole(memberRole);
    }
}
