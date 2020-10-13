package core.sa.gov.sfd.committee.actions.committee;


import core.sa.gov.sfd.committee.core.committee.CommitteeService;
import core.sa.gov.sfd.committee.core.committee.FormedCommitteeNo;
import core.sa.gov.sfd.committee.core.committee.Member;

public class AddMemberToFormedCommittee_action {

    private final CommitteeService committeeService;

    public AddMemberToFormedCommittee_action(CommitteeService committeeService) {
        this.committeeService = committeeService;
    }

    public Member addMemberToFormedCommittee(Member member, FormedCommitteeNo formedCommitteeNo) {
        return this.committeeService.addMemberToFormedCommittee(member, formedCommitteeNo);
    }
}
