package sa.gov.sfd.committee.actions.member;


import sa.gov.sfd.committee.core.member.MemberEntity;
import sa.gov.sfd.committee.core.member.MemberService;
import sa.gov.sfd.committee.core.shared.MasterId;

public class AddMemberToFormedCommittee {

    private final MemberService memberService;

    public AddMemberToFormedCommittee(MemberService memberService) {
        this.memberService = memberService;
    }

    public MemberEntity addMemberToFormedCommittee(MemberEntity memberEntity, MasterId formedCommitteeNo) {
        return this.memberService.addMemberToFormedCommittee(memberEntity, formedCommitteeNo);
    }
}
