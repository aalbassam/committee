package sa.gov.sfd.committee.infrastructure;


import sa.gov.sfd.committee.core.committee.CommitteeEntity;
import sa.gov.sfd.committee.core.committee.CommitteeID;
import sa.gov.sfd.committee.core.committee.CommitteeName;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CommitteeMapper implements RowMapper<CommitteeEntity> {


    @Override
    public CommitteeEntity mapRow(ResultSet resultSet, int i) throws SQLException {

        CommitteeEntity committee = new CommitteeEntity();

        committee.setCommitteeID(new CommitteeID(resultSet.getInt("CC_SID")));
        committee.setCommitteeName(new CommitteeName(resultSet.getString("CC_AR_NAME"), resultSet.getString("CC_EN_NAME")));
        committee.setCommitteeType(resultSet.getString("CC_TYPE").charAt(0));
        committee.setTasks(resultSet.getString("CC_TASKS"));

        return committee;
    }
}
