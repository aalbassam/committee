package sa.gov.sfd.committee.core.member;

import sa.gov.sfd.committee.core.shared.MasterId;

import java.util.List;


public interface MemberRepository {

    Long addMemberToFormedCommittee(MemberEntity memberEntity, MasterId formedCommitteeNo);

    List<MemberEntity> addMemberListToFormedCommittee(List<MemberEntity> memberEntities);

    List<MemberEntity> findAllMembersByFormationNo(MasterId formedCommitteeNo);
}
