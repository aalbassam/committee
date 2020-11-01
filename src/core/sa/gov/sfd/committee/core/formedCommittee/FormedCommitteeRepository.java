package sa.gov.sfd.committee.core.formedCommittee;

import sa.gov.sfd.committee.core.shared.MasterId;

import java.util.List;


public interface FormedCommitteeRepository {

    FormedCommitteeEntity getFormedCommitteeByNO(MasterId formedCommitteeNo);

    List<FormedCommitteeEntity> findAllFormedCommittees();

    FormedCommitteeEntity addFormedCommittee(MasterId committeeID, FormedCommitteeEntity formedCommitteeEntity);

}
