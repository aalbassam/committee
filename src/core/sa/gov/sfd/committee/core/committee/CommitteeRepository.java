package core.sa.gov.sfd.committee.core.committee;
import java.util.List;

public interface CommitteeRepository {

    List<CommitteeEntity> findAllCommittees();

    int updateCommittee(CommitteeEntity committeeEntity);

    int addMemberToFormedCommittee(Member member, int formationNo);

    int addMemberListToFormedCommittee(List<Member> members);

    List<FormedCommittee> findAllFormedCommittees();

    FormedCommittee getFormedCommitteeById(Long id);

    int addFormedCommittee(CommitteeEntity committeeEntity, FormedCommittee formedCommittee);

    int addNewMemberRole(MemberRole memberRole);


}
