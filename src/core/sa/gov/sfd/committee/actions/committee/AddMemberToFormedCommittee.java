package sa.gov.sfd.committee.actions.committee;


import sa.gov.sfd.committee.core.committee.CommitteeService;
import sa.gov.sfd.committee.core.committee.FormedCommitteeNo;
import sa.gov.sfd.committee.core.committee.Member;

public class AddMemberToFormedCommittee {

    private final CommitteeService committeeService;

    public AddMemberToFormedCommittee(CommitteeService committeeService) {
        this.committeeService = committeeService;
    }

    public Member addMemberToFormedCommittee(Member member, FormedCommitteeNo formedCommitteeNo) {
        return this.committeeService.addMemberToFormedCommittee(member, formedCommitteeNo);
    }
}
