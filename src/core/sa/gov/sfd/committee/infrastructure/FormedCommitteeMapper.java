package sa.gov.sfd.committee.infrastructure;


import org.springframework.jdbc.core.RowMapper;
import sa.gov.sfd.committee.core.committee.CommitteeEntity;
import sa.gov.sfd.committee.core.employee.EmployeeNID;
import sa.gov.sfd.committee.core.formedCommittee.FormationStatus;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeEntity;
import sa.gov.sfd.committee.core.shared.BinaryDate;
import sa.gov.sfd.committee.core.shared.MasterId;
import sa.gov.sfd.committee.core.shared.RowStatus;

import java.sql.ResultSet;
import java.sql.SQLException;


public class FormedCommitteeMapper implements RowMapper<FormedCommitteeEntity> {


    @Override
    public FormedCommitteeEntity mapRow(ResultSet resultSet, int i) throws SQLException {

        return new FormedCommitteeEntity(
                new MasterId(resultSet.getLong("SC_FORMATION_NO")),
                new CommitteeEntity(new MasterId(resultSet.getLong("SC_COMMITTEE_ID"))),
                resultSet.getBoolean("SC_REWARD"),
                resultSet.getString("SC_DECISION_NO"),
                new BinaryDate(resultSet.getString("SC_DECISION_DATE_AH"), (resultSet.getDate("SC_DECISION_DATE_AD")).toLocalDate()),
                new BinaryDate(resultSet.getString("SC_FORMATION_END_DATE_AH"), (resultSet.getDate("SC_FORMATION_END_DATE_AD")).toLocalDate()),
                null,
                new FormationStatus(resultSet.getString("SC_FORMATION_STATUS")),
                new EmployeeNID(),
                new RowStatus(resultSet.getString("SC_ROW_STATUS").charAt(0)));
    }
}
