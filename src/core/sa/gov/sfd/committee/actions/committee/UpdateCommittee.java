package core.sa.gov.sfd.committee.actions.committee;

import core.sa.gov.sfd.committee.core.committee.CommitteeEntity;
import core.sa.gov.sfd.committee.core.committee.CommitteeService;

public class UpdateCommittee {

    private final CommitteeService committeeService;

    public UpdateCommittee(CommitteeService committeeService) {
        this.committeeService = committeeService;
    }

    public int updateCommittee(CommitteeEntity committeeEntity) {
        return this.committeeService.updateCommittee(committeeEntity);
    }
}
