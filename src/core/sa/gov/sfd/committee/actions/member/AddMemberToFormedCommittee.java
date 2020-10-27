package sa.gov.sfd.committee.actions.member;


import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeNo;
import sa.gov.sfd.committee.core.member.MemberEntity;
import sa.gov.sfd.committee.core.member.MemberService;

public class AddMemberToFormedCommittee {

    private final MemberService memberService;

    public AddMemberToFormedCommittee(MemberService memberService) {
        this.memberService = memberService;
    }

    public MemberEntity addMemberToFormedCommittee(MemberEntity memberEntity, FormedCommitteeNo formedCommitteeNo) {
        return this.memberService.addMemberToFormedCommittee(memberEntity, formedCommitteeNo);
    }
}
