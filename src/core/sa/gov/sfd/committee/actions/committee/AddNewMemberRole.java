package sa.gov.sfd.committee.actions.committee;


import sa.gov.sfd.committee.core.committee.CommitteeService;
import sa.gov.sfd.committee.core.committee.MemberRole;

public class AddNewMemberRole {

    private final CommitteeService committeeService;

    public AddNewMemberRole(CommitteeService committeeService) {
        this.committeeService = committeeService;
    }

    public MemberRole addMemberRole(MemberRole memberRole) {
        return this.committeeService.addNewMemberRole(memberRole);
    }
}
