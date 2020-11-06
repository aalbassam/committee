package sa.gov.sfd.committeeApproval.infrastructure;


import org.springframework.jdbc.core.RowMapper;
import sa.gov.sfd.committeeApproval.core.*;
import sa.gov.sfd.committee.core.employee.EmployeeNID;


import java.sql.ResultSet;
import java.sql.SQLException;

public class ApproverTeamMapper implements RowMapper<ApproverTeamEntity> {
    @Override
    public ApproverTeamEntity mapRow(ResultSet resultSet, int i) throws SQLException {
        ApproverTeamEntity approverTeamEntity = new ApproverTeamEntity();
        approverTeamEntity.setApproverTeamID(new ApproverTeamID(resultSet.getInt("APPROVAL_TEAM_ID")));
        approverTeamEntity.setTeamId(new TeamID(resultSet.getInt("TEAM_ID")));
        approverTeamEntity.setTeamName(resultSet.getString("TEAM_NAME"));
        approverTeamEntity.setEmployeeNID(new EmployeeNID(resultSet.getLong("EMPLOYEE_NID")));
        approverTeamEntity.setApproverRoles(
                new ApproverRoles(
                        resultSet.getInt("APPROVAL_ROLE"),
                        resultSet.getInt("DECLINED_ROLE"),
                        resultSet.getInt("VIEW_ROLE"),
                        resultSet.getInt("CONFIRMED_ROLE")
                )
        );

        return approverTeamEntity;
    }
}
