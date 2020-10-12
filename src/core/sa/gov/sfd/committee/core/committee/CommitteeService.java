package core.sa.gov.sfd.committee.core.committee;
import java.util.List;

public class CommitteeService {

    CommitteeRepository committeeRepository;

    public CommitteeService(CommitteeRepository committeeRepository) {
        this.committeeRepository = committeeRepository;
    }


    //---- Service Methods ----

    public List<CommitteeEntity> getAllCommittees() {
        return committeeRepository.findAllCommittees();
    }

    public int addMemberToFormedCommittee(Member member) {
        return committeeRepository.addMemberToFormedCommittee(member);
    }

    public int addMemberListToFormedCommittee(List<Member> members) {
        return committeeRepository.addMemberListToFormedCommittee(members);
    }

    public List<FormedCommittee> getAllFormedCommittees() {
        return committeeRepository.findAllFormedCommittees();
    }

    public int addNewMemberRole(MemberRole memberRole) {
        return committeeRepository.addNewMemberRole(memberRole);
    }

    public FormedCommittee getFormedCommitteeById(Long id) {
        return committeeRepository.getFormedCommitteeById(id);
    }

    public int addFormedCommittee(CommitteeEntity committeeEntity, FormedCommittee formedCommittee) {
        return committeeRepository.addFormedCommittee(committeeEntity, formedCommittee);
    }

    public int updateCommittee(CommitteeEntity committeeEntity) {
        return committeeRepository.updateCommittee(committeeEntity);
    }

}
