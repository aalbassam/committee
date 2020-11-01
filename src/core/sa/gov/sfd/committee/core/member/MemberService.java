package sa.gov.sfd.committee.core.member;

import sa.gov.sfd.committee.core.shared.MasterId;

import java.util.List;

public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    //---- Service Methods ----
    public MemberEntity addMemberToFormedCommittee(MemberEntity memberEntity, MasterId formedCommitteeNo) {
        return memberRepository.addMemberToFormedCommittee(memberEntity, formedCommitteeNo);
    }

    public List<MemberEntity> addMemberListToFormedCommittee(List<MemberEntity> memberEntities) {
        return memberRepository.addMemberListToFormedCommittee(memberEntities);
    }

    public List<MemberEntity> getAllMembersByFormationNo(MasterId formedCommitteeNo) {
        return memberRepository.findAllMembersByFormationNo(formedCommitteeNo);
    }
}
