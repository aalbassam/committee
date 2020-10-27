package sa.gov.sfd.committee.core.committee;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeEntity;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeNo;
import sa.gov.sfd.committee.core.member.MemberEntity;
import sa.gov.sfd.committee.core.memberRole.MemberRoleEntity;

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

    public int updateCommittee(CommitteeEntity committeeEntity) {
        return committeeRepository.updateCommittee(committeeEntity);
    }


}
