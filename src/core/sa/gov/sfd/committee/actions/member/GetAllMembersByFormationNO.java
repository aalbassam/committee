package sa.gov.sfd.committee.actions.member;

import sa.gov.sfd.committee.core.member.MemberEntity;
import sa.gov.sfd.committee.core.member.MemberService;
import sa.gov.sfd.committee.core.shared.MasterId;

import java.util.List;

public class GetAllMembersByFormationNO {

    private final MemberService memberService;

    public GetAllMembersByFormationNO(MemberService memberService) {
        this.memberService = memberService;
    }

    public List<MemberEntity> getAllMembersByFormationNo(MasterId formedCommitteeNo) {
        return this.memberService.getAllMembersByFormationNo(formedCommitteeNo);
    }
}
