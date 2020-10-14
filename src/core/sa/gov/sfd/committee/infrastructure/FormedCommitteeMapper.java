package core.sa.gov.sfd.committee.infrastructure;


import core.sa.gov.sfd.committee.core.committee.*;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class FormedCommitteeMapper implements RowMapper<FormedCommittee> {


    @Override
    public FormedCommittee mapRow(ResultSet resultSet, int i) throws SQLException {

        return new FormedCommittee(

                new FormedCommitteeNo(resultSet.getLong("SC_FORMATION_NO")),
                resultSet.getBoolean("SC_REWARD"),
                resultSet.getString("SC_DECISION_NO"),
                new FormedCommitteeDecisionDate(resultSet.getString("SC_DECISION_DATE_AH"), (resultSet.getDate("SC_DECISION_DATE_AD")).toLocalDate()),
                new FormedCommitteeEndDate(resultSet.getString("SC_FORMATION_END_DATE_AH"), (resultSet.getDate("SC_FORMATION_END_DATE_AD")).toLocalDate()),
                null,
                null,
                null);

    }
}
