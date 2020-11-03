package sa.gov.sfd.committee.infrastructure;


import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import sa.gov.sfd.committee.core.committee.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CommitteeRepositoryImp implements CommitteeRepository {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public CommitteeRepositoryImp(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    public List<CommitteeEntity> findAllCommittees() {
        final String q1 = "SELECT CC_SID, CC_AR_NAME, CC_EN_NAME, CC_TYPE, CC_TASKS  FROM COMMITTEES WHERE CC_ROW_STATUS != 'D'";
        return this.namedParameterJdbcTemplate.query(q1, new CommitteeMapper());
    }

    @Override
    public int updateCommittee(CommitteeEntity committeeEntity) {
        return 0;
    }

    @Override
    public Long addCommittee(CommitteeEntity committeeEntity) {

        final String InsertQuery = "INSERT INTO COMMITTEES (CC_SID, CC_AR_NAME, CC_EN_NAME, CC_TYPE, CC_TASKS, " +
                "CC_ROW_STATUS) VALUES (CCM_SID_SEQ.NEXTVAL,:1,:2,:3,:4,'A')";

        KeyHolder keyHolder = new GeneratedKeyHolder();

        /*jdbcTemplate.update(connection -> {
            PreparedStatement preparedStatement = connection.prepareStatement(InsertQuery, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, committeeEntity.getCommitteeName().getArabicName());
            preparedStatement.setString(2, committeeEntity.getCommitteeName().getEnglishName());
            preparedStatement.setString(3, String.valueOf(committeeEntity.getCommitteeType()));
            preparedStatement.setString(4, committeeEntity.getTasks());

            return preparedStatement;
        },keyHolder);*/

        MapSqlParameterSource namedParams = new MapSqlParameterSource();

        namedParams.addValue("1", committeeEntity.getCommitteeName().getArabicName());
        namedParams.addValue("2", committeeEntity.getCommitteeName().getEnglishName());
        namedParams.addValue("3", String.valueOf(committeeEntity.getCommitteeType()));
        namedParams.addValue("4", committeeEntity.getTasks());

        this.namedParameterJdbcTemplate.update(InsertQuery, namedParams, keyHolder, new String[]{"CC_SID"});

        Long newId = keyHolder.getKey().longValue();


        return newId;
    }
}


