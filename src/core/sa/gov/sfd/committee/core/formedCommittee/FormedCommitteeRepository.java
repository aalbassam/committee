package sa.gov.sfd.committee.core.formedCommittee;

import sa.gov.sfd.committee.core.committee.CommitteeID;

import java.util.List;


public interface FormedCommitteeRepository {

    FormedCommitteeEntity getFormedCommitteeByNO(FormedCommitteeNo formedCommitteeNo);

    List<FormedCommitteeEntity> findAllFormedCommittees();

    FormedCommitteeEntity addFormedCommittee(CommitteeID committeeID, FormedCommitteeEntity formedCommitteeEntity);

}
