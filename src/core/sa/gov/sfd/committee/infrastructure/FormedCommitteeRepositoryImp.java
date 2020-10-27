package sa.gov.sfd.committee.infrastructure;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import sa.gov.sfd.committee.core.committee.CommitteeID;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeEntity;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeNo;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeRepository;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.List;

@Repository
public class FormedCommitteeRepositoryImp implements FormedCommitteeRepository {

    private final JdbcTemplate jdbcTemplate;

    public FormedCommitteeRepositoryImp(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public FormedCommitteeEntity getFormedCommitteeByNO(FormedCommitteeNo formedCommitteeNo) {

        final String q1 = "SELECT SC_FORMATION_NO, SC_COMMITTEE_ID, SC_REWARD, SC_DECISION_NO, SC_DECISION_DATE_AH, SC_DECISION_DATE_AD," +
                " SC_FORMATION_END_DATE_AH, SC_FORMATION_END_DATE_AD  FROM BASSAM_FORMED_COMMITTEES WHERE SC_FORMATION_NO=" + formedCommitteeNo.getNo().toString();

        return jdbcTemplate.queryForObject(q1, new FormedCommitteeMapper());
    }

    @Override
    public List<FormedCommitteeEntity> findAllFormedCommittees() {

        final String q1 = "SELECT SC_FORMATION_NO,SC_COMMITTEE_ID, SC_REWARD, SC_DECISION_NO, SC_DECISION_DATE_AH, SC_DECISION_DATE_AD," +
                " SC_FORMATION_END_DATE_AH, SC_FORMATION_END_DATE_AD  FROM BASSAM_FORMED_COMMITTEES WHERE SC_ROW_STATUS != 'D'";
        return this.jdbcTemplate.query(q1, new FormedCommitteeMapper());
    }

    @Override
    public FormedCommitteeEntity addFormedCommittee(CommitteeID committeeID, FormedCommitteeEntity formedCommitteeEntity) {

        final String InsertQuery = "INSERT INTO BASSAM_FORMED_COMMITTEES VALUES (SC_FORMATION_NO_SEQ.NEXTVAL,?,?,?,?,?,?,?,?,?,'A')";

        jdbcTemplate.update(connection -> {
            PreparedStatement preparedStatement = connection.prepareStatement(InsertQuery);

            preparedStatement.setInt(1, committeeID.getId());
            preparedStatement.setBoolean(2, formedCommitteeEntity.isReward());
            preparedStatement.setString(3, formedCommitteeEntity.getDecisionNo());
            preparedStatement.setString(4, formedCommitteeEntity.getFormedCommitteeDecisionDate().getDecisionDateAH());

            Date dateDecisionAH = Date.valueOf(formedCommitteeEntity.getFormedCommitteeDecisionDate().getDecisionDateAD());
            preparedStatement.setDate(5, dateDecisionAH);

            preparedStatement.setString(6, formedCommitteeEntity.getFormedCommitteeEndDate().getEndDateAH());

            Date dateEndAH = Date.valueOf(formedCommitteeEntity.getFormedCommitteeDecisionDate().getDecisionDateAD());
            preparedStatement.setDate(7, dateEndAH);

            return preparedStatement;
        });

        return formedCommitteeEntity;
    }


}
