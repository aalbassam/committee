package sa.gov.sfd.committee.infrastructure;


import org.springframework.jdbc.core.RowMapper;
import sa.gov.sfd.committee.core.committee.CommitteeEntity;
import sa.gov.sfd.committee.core.committee.CommitteeID;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeDecisionDate;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeEndDate;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeEntity;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeNo;

import java.sql.ResultSet;
import java.sql.SQLException;


public class FormedCommitteeMapper implements RowMapper<FormedCommitteeEntity> {


    @Override
    public FormedCommitteeEntity mapRow(ResultSet resultSet, int i) throws SQLException {

        return new FormedCommitteeEntity(
                new FormedCommitteeNo(resultSet.getLong("SC_FORMATION_NO")),
                new CommitteeEntity(new CommitteeID(resultSet.getInt("SC_COMMITTEE_ID"))),
                resultSet.getBoolean("SC_REWARD"),
                resultSet.getString("SC_DECISION_NO"),
                new FormedCommitteeDecisionDate(resultSet.getString("SC_DECISION_DATE_AH"), (resultSet.getDate("SC_DECISION_DATE_AD")).toLocalDate()),
                new FormedCommitteeEndDate(resultSet.getString("SC_FORMATION_END_DATE_AH"), (resultSet.getDate("SC_FORMATION_END_DATE_AD")).toLocalDate()),
                null,
                ' ');
    }
}
