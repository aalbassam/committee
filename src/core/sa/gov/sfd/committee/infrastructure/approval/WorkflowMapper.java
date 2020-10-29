package sa.gov.sfd.committee.infrastructure.approval;

import org.springframework.jdbc.core.RowMapper;
import sa.gov.sfd.committee.core.approval.TeamId;
import sa.gov.sfd.committee.core.approval.Workflow;
import sa.gov.sfd.committee.core.approval.WorkflowNumber;


import java.sql.ResultSet;
import java.sql.SQLException;


public class WorkflowMapper implements RowMapper<Workflow> {

    @Override
    public Workflow mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Workflow(
                new WorkflowNumber(resultSet.getInt("WORKFLOW_NUMBER")),
                resultSet.getInt("STEP"),
                new TeamId(resultSet.getInt("TEAM_ID")),
                resultSet.getString("ACTION")
        );
    }
}