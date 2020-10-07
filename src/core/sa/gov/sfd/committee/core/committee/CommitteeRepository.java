package sa.gov.sfd.committee.core.committee;

import java.util.List;

public interface CommitteeRepository {

    List<CommitteeEntity> findAllCommittees();
    int addCommittee(CommitteeEntity committeeEntity);
    int updateCommittee(CommitteeEntity committeeEntity);

}
