package sa.gov.sfd.committeeApproval.infrastructure;


import org.springframework.jdbc.core.RowMapper;
import sa.gov.sfd.committeeApproval.core.ApprovalTransactionEntity;
import sa.gov.sfd.committeeApproval.core.ApprovalTransactionID;
import sa.gov.sfd.committeeApproval.core.Workflow;
import sa.gov.sfd.committeeApproval.core.WorkflowNumber;
import sa.gov.sfd.committee.core.employee.EmployeeNID;


import java.sql.ResultSet;
import java.sql.SQLException;

public class ApprovalTransactionMapper implements RowMapper<ApprovalTransactionEntity> {
    @Override
    public ApprovalTransactionEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        return new ApprovalTransactionEntity
                (
                        new ApprovalTransactionID(resultSet.getLong("ID")),
                        resultSet.getInt("STEP"),
                        new Workflow(new WorkflowNumber(resultSet.getInt("WORKFLOW_NUMBER")), 0, null, null),
                        new EmployeeNID(resultSet.getLong("USER_NID")),
                        resultSet.getString("REQUEST_ID"),
                        resultSet.getString("REQUEST_TITLE"),
                        resultSet.getString("ACTION"),
                        resultSet.getString("TYPE"),
                        null
                );
    }
}






