package sa.gov.sfd.committee.core.member;

import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeNo;

import java.util.List;

public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    //---- Service Methods ----
    public MemberEntity addMemberToFormedCommittee(MemberEntity memberEntity, FormedCommitteeNo formedCommitteeNo) {
        return memberRepository.addMemberToFormedCommittee(memberEntity, formedCommitteeNo);
    }

    public List<MemberEntity> addMemberListToFormedCommittee(List<MemberEntity> memberEntities) {
        return memberRepository.addMemberListToFormedCommittee(memberEntities);
    }

    public List<MemberEntity> getAllMembersByFormationNo(FormedCommitteeNo formedCommitteeNo) {
        return memberRepository.findAllMembersByFormationNo(formedCommitteeNo);
    }
}
