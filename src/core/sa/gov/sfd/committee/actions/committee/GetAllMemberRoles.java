package sa.gov.sfd.committee.actions.committee;

import sa.gov.sfd.committee.core.committee.CommitteeService;
import sa.gov.sfd.committee.core.committee.MemberRole;

import java.util.List;

public class GetAllMemberRoles {

    private final CommitteeService committeeService;

    public GetAllMemberRoles(CommitteeService committeeService) {
        this.committeeService = committeeService;
    }

    public List<MemberRole> getAllMemberRoles() {
        return committeeService.getAllMemberRoles();
    }
}
