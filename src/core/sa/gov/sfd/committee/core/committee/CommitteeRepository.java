package core.sa.gov.sfd.committee.core.committee;
import java.util.List;

public interface CommitteeRepository {

    List<CommitteeEntity> findAllCommittees();

    int updateCommittee(CommitteeEntity committeeEntity);

    Member addMemberToFormedCommittee(Member member, FormedCommitteeNo formedCommitteeNo);

    List<Member> addMemberListToFormedCommittee(List<Member> members);

    List<FormedCommittee> findAllFormedCommittees();

    FormedCommittee getFormedCommitteeById(FormedCommitteeNo formedCommitteeNo);

    FormedCommittee addFormedCommittee(CommitteeEntity committeeEntity, FormedCommittee formedCommittee);

    MemberRole addNewMemberRole(MemberRole memberRole);

    List<MemberRole> getAllMemberRoles();


}
