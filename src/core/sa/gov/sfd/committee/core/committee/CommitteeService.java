package sa.gov.sfd.committee.core.committee;
import java.util.List;

public class CommitteeService {


    private final CommitteeRepository committeeRepository;

    public CommitteeService(CommitteeRepository committeeRepository) {
        this.committeeRepository = committeeRepository;
    }


    //---- Service Methods ----

    public List<CommitteeEntity> getAllCommittees() {
        return committeeRepository.findAllCommittees();
    }

    public Member addMemberToFormedCommittee(Member member, FormedCommitteeNo formedCommitteeNo) {
        return committeeRepository.addMemberToFormedCommittee(member, formedCommitteeNo);
    }

    public List<Member> addMemberListToFormedCommittee(List<Member> members) {
        return committeeRepository.addMemberListToFormedCommittee(members);
    }

    public List<FormedCommittee> getAllFormedCommittees() {
        return committeeRepository.findAllFormedCommittees();
    }

    public MemberRole addNewMemberRole(MemberRole memberRole) {
        return committeeRepository.addNewMemberRole(memberRole);
    }

    public FormedCommittee getFormedCommitteeById(FormedCommitteeNo formedCommitteeNo) {
        return committeeRepository.getFormedCommitteeById(formedCommitteeNo);
    }

    public FormedCommittee addFormedCommittee(CommitteeEntity committeeEntity, FormedCommittee formedCommittee) {
        return committeeRepository.addFormedCommittee(committeeEntity, formedCommittee);
    }

    public int updateCommittee(CommitteeEntity committeeEntity) {
        return committeeRepository.updateCommittee(committeeEntity);
    }

    public List<MemberRole> getAllMemberRoles() {
        return committeeRepository.getAllMemberRoles();
    }

}
