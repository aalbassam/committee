package sa.gov.sfd.committee.core.committee;

import java.util.List;

public interface CommitteeRepository {

    List<CommitteeEntity> findAllCommittees();

    int updateCommittee(CommitteeEntity committeeEntity);

    Long addCommittee(CommitteeEntity committeeEntity);

}
