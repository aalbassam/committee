package sa.gov.sfd.committee.core.formedCommittee;


import sa.gov.sfd.committee.core.employee.EmployeeNID;
import sa.gov.sfd.committee.core.shared.MasterId;

import java.util.List;


public class FormedCommitteeService {

    private final FormedCommitteeRepository formedCommitteeRepository;

    public FormedCommitteeService(FormedCommitteeRepository formedCommitteeRepository) {
        this.formedCommitteeRepository = formedCommitteeRepository;
    }

    //---- Service Methods ----
    public FormedCommitteeEntity getFormedCommitteeByNO(MasterId formedCommitteeNo) {
        return this.formedCommitteeRepository.getFormedCommitteeByNO(formedCommitteeNo);
    }

    public Long addFormedCommittee(MasterId committeeID, FormedCommitteeEntity formedCommitteeEntity) {
        return this.formedCommitteeRepository.addFormedCommittee(committeeID, formedCommitteeEntity);
    }

    public List<FormedCommitteeEntity> getAllFormedCommittees() {
        return this.formedCommitteeRepository.findAllFormedCommittees();
    }

    public int updateFormedCommitteeStatusByFormationID(MasterId formationId, FormationStatus formationStatus) {
        return this.formedCommitteeRepository.updateFormedCommitteeStatusByFormationID(formationId, formationStatus);
    }

    public int approvalFormedCommittee() {
        return this.formedCommitteeRepository.approvalFormedCommittee();
    }

    public int updateFormedCommitteeStatusAndApproverByFormationID(MasterId formationId, FormationStatus formationStatus, EmployeeNID approverId) {
        return this.formedCommitteeRepository.updateFormedCommitteeStatusAndApproverByFormationID(formationId, formationStatus, approverId);
    }
}