package sa.gov.sfd.committee.core.formedCommittee;

import sa.gov.sfd.committee.core.employee.EmployeeNID;
import sa.gov.sfd.committee.core.shared.MasterId;

import java.util.List;


public interface FormedCommitteeRepository {

    FormedCommitteeEntity getFormedCommitteeByNO(MasterId formedCommitteeNo);

    List<FormedCommitteeEntity> findAllFormedCommittees();

    Long addFormedCommittee(MasterId committeeID, FormedCommitteeEntity formedCommitteeEntity);

    int updateFormedCommitteeStatusByFormationID(MasterId formationId, FormationStatus formationStatus);

    int approvalFormedCommittee();

    int updateFormedCommitteeStatusAndApproverByFormationID(MasterId formationId, FormationStatus formationStatus, EmployeeNID approverId);

}
