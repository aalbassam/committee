package sa.gov.sfd.committee.infrastructure;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CommitteeMapper implements RowMapper<CommitteeEntity> {


    @Override
    public CommitteeEntity mapRow(ResultSet rs, int rowNum) throws SQLException {

        CommitteeEntity  committee = new CommitteeEntity();
        committee.setCommitteeId(new CommitteeId(rs.getLong("COMMITTEE_ID")));
        committee.setCommitteeName(new CommitteeInfo(rs.getString("COMMITTEE_EN_NAME"), rs.getString("COMMITTEE_AR_NAME")));

        return committee;
    }
}
