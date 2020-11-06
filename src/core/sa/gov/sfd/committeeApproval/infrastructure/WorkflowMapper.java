package sa.gov.sfd.committeeApproval.infrastructure;

import org.springframework.jdbc.core.RowMapper;
import sa.gov.sfd.committeeApproval.core.TeamID;
import sa.gov.sfd.committeeApproval.core.Workflow;
import sa.gov.sfd.committeeApproval.core.WorkflowNumber;


import java.sql.ResultSet;
import java.sql.SQLException;


public class WorkflowMapper implements RowMapper<Workflow> {

    @Override
    public Workflow mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Workflow(
                new WorkflowNumber(resultSet.getInt("WORKFLOW_NUMBER")),
                resultSet.getInt("STEP"),
                new TeamID(resultSet.getInt("TEAM_ID")),
                resultSet.getString("ACTION")
        );
    }
}