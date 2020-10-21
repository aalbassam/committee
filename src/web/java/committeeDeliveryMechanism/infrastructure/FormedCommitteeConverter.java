package committeeDeliveryMechanism.infrastructure;

import committeeDeliveryMechanism.view.FormedCommitteeDTO;
import sa.gov.sfd.committee.core.committee.FormedCommittee;
import sa.gov.sfd.committee.core.committee.FormedCommitteeDecisionDate;
import sa.gov.sfd.committee.core.committee.FormedCommitteeEndDate;
import sa.gov.sfd.committee.core.committee.FormedCommitteeNo;

import java.util.List;
import java.util.stream.Collectors;

public class FormedCommitteeConverter {

    public static List<FormedCommitteeDTO> convertFormedCommitteeList(List<FormedCommittee> formedCommittees) {

        return formedCommittees.stream().map(x ->
                new FormedCommitteeDTO(
                        x.getFormedCommitteeNo().getNo(),
                        x.isReward(),
                        x.getDecisionNo(),
                        x.getFormedCommitteeDecisionDate().getDecisionDateAH(),
                        x.getFormedCommitteeDecisionDate().getDecisionDateAD(),
                        x.getFormedCommitteeEndDate().getEndDateAH(),
                        x.getFormedCommitteeEndDate().getEndDateAD()
                )).collect(Collectors.toList());
    }

    public static FormedCommitteeDTO convertFormedCommittee(FormedCommittee formedCommittee) {

        return new FormedCommitteeDTO(
                formedCommittee.getFormedCommitteeNo().getNo(),
                formedCommittee.isReward(),
                formedCommittee.getDecisionNo(),
                formedCommittee.getFormedCommitteeDecisionDate().getDecisionDateAH(),
                formedCommittee.getFormedCommitteeDecisionDate().getDecisionDateAD(),
                formedCommittee.getFormedCommitteeEndDate().getEndDateAH(),
                formedCommittee.getFormedCommitteeEndDate().getEndDateAD()
        );
    }

    public static FormedCommittee convertFormedCommitteeDTO(FormedCommitteeDTO formedCommitteeDTO) {

        return new FormedCommittee(

                new FormedCommitteeNo(formedCommitteeDTO.getFormedCommitteeNo()),
                formedCommitteeDTO.isReward(),
                formedCommitteeDTO.getDecisionNo(),
                new FormedCommitteeDecisionDate(formedCommitteeDTO.getFormedCommitteeDecisionDateAH(), formedCommitteeDTO.getFormedCommitteeDecisionDateAD()),
                new FormedCommitteeEndDate(formedCommitteeDTO.getFormedCommitteeEndDateAH(), formedCommitteeDTO.getFormedCommitteeEndDateAD()),
                null,
                null,
                null);

    }
}
