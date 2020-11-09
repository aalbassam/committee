package committeeDeliveryMechanism.infrastructure;


import committeeDeliveryMechanism.view.ApprovalTransactionDTO;
import sa.gov.sfd.committeeApproval.core.ApprovalTransactionEntity;

import java.util.List;
import java.util.stream.Collectors;

public class ApprovalTransactionConverter {

    public static List<ApprovalTransactionDTO> convertApprovalTransactionList(List<ApprovalTransactionEntity> approvalTransactionEntities) {


        return approvalTransactionEntities.stream().map(x ->
                new ApprovalTransactionDTO(
                        x.getId().getId(),
                        x.getWorkflow().getWorkflowNumber().getId(),
                        x.getStep(),
                        x.getUserNID().getId(),
                        x.getRequestID(),
                        x.getAction(),
                        x.getNote(),
                        x.getRequestTitle(),
                        x.getType()
                )).collect(Collectors.toList());
    }
}