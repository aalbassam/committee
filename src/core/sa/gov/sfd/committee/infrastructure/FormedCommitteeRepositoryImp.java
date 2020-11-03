package sa.gov.sfd.committee.infrastructure;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeEntity;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeRepository;
import sa.gov.sfd.committee.core.shared.MasterId;

import java.util.List;

@Repository
public class FormedCommitteeRepositoryImp implements FormedCommitteeRepository {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public FormedCommitteeRepositoryImp(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }


    @Override
    public FormedCommitteeEntity getFormedCommitteeByNO(MasterId formedCommitteeNo) {

        final String q1 = "SELECT SC_FORMATION_NO, SC_COMMITTEE_ID, SC_REWARD, SC_DECISION_NO, SC_DECISION_DATE_AH, SC_DECISION_DATE_AD," +
                " SC_FORMATION_END_DATE_AH, SC_FORMATION_END_DATE_AD  FROM FORMED_COMMITTEES WHERE SC_FORMATION_NO= :1";

        return this.namedParameterJdbcTemplate.queryForObject(q1, new MapSqlParameterSource(
                "1", formedCommitteeNo.getId().toString()), new FormedCommitteeMapper());
    }

    @Override
    public List<FormedCommitteeEntity> findAllFormedCommittees() {

        final String q1 = "SELECT SC_FORMATION_NO,SC_COMMITTEE_ID, SC_REWARD, SC_DECISION_NO, SC_DECISION_DATE_AH, SC_DECISION_DATE_AD," +
                " SC_FORMATION_END_DATE_AH, SC_FORMATION_END_DATE_AD  FROM FORMED_COMMITTEES WHERE SC_ROW_STATUS != 'D'";
        return this.namedParameterJdbcTemplate.query(q1, new FormedCommitteeMapper());
    }

    @Override
    public Long addFormedCommittee(MasterId committeeID, FormedCommitteeEntity formedCommitteeEntity) {

        final String InsertQuery = "INSERT INTO FORMED_COMMITTEES(SC_FORMATION_NO,SC_COMMITTEE_ID, SC_REWARD," +
                " SC_DECISION_NO, SC_DECISION_DATE_AH, SC_DECISION_DATE_AD, SC_FORMATION_END_DATE_AH, " +
                "SC_FORMATION_END_DATE_AD,SC_APPROVER_ID, SC_ROW_STATUS) " +
                "VALUES (SC_FORMATION_NO_SEQ.NEXTVAL,:1,:2,:3,:4,:5,:6,:7,:8,'A')";

        KeyHolder keyHolder = new GeneratedKeyHolder();
        MapSqlParameterSource namedParams = new MapSqlParameterSource();

        namedParams.addValue("1", committeeID.getId());
        namedParams.addValue("2", formedCommitteeEntity.isReward());
        namedParams.addValue("3", formedCommitteeEntity.getDecisionNo());
        namedParams.addValue("4", formedCommitteeEntity.getDecisionDate().getHijri());

        namedParams.addValue("5", formedCommitteeEntity.getDecisionDate().getGregorian());
        namedParams.addValue("6", formedCommitteeEntity.getEndDate().getHijri());
        namedParams.addValue("7", formedCommitteeEntity.getDecisionNo());
        namedParams.addValue("8", formedCommitteeEntity.getDecisionDate().getGregorian());

        this.namedParameterJdbcTemplate.update(InsertQuery, namedParams, keyHolder, new String[]{"SC_FORMATION_NO"});

        return keyHolder.getKey().longValue();

            /*Date dateDecisionAD = Date.valueOf(formedCommitteeEntity.getDecisionDate().getGregorian());
            preparedStatement.setDate(5, dateDecisionAD);
            Date dateEndAD = Date.valueOf(formedCommitteeEntity.getDecisionDate().getGregorian());
            preparedStatement.setDate(7, dateEndAD);*/
    }


}
