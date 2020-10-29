package sa.gov.sfd.committee.infrastructure.approval;


import org.springframework.jdbc.core.RowMapper;
import sa.gov.sfd.committee.core.approval.ApprovalPath;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ApprovalPathMapper implements RowMapper<ApprovalPath> {
    @Override
    public ApprovalPath mapRow(ResultSet resultSet, int i) throws SQLException {
        return new ApprovalPath(
                null,
                resultSet.getInt("WORKFLOW_NUMBER")
        );
    }
}
