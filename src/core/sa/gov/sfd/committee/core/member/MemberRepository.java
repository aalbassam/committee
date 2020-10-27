package sa.gov.sfd.committee.core.member;

import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeNo;

import java.util.List;


public interface MemberRepository {

    MemberEntity addMemberToFormedCommittee(MemberEntity memberEntity, FormedCommitteeNo formedCommitteeNo);

    List<MemberEntity> addMemberListToFormedCommittee(List<MemberEntity> memberEntities);
}
