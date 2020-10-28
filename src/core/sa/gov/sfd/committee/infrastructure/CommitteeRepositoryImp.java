package sa.gov.sfd.committee.infrastructure;

import sa.gov.sfd.committee.core.committee.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.List;

@Repository
public class CommitteeRepositoryImp implements CommitteeRepository {

    private final JdbcTemplate jdbcTemplate;

    public CommitteeRepositoryImp(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<CommitteeEntity> findAllCommittees() {
        final String q1 = "SELECT CC_SID, CC_AR_NAME, CC_EN_NAME, CC_TYPE, CC_TASKS  FROM BASSAM_COMMITTEES WHERE CC_ROW_STATUS != 'D'";
        return this.jdbcTemplate.query(q1, new CommitteeMapper());
    }

    @Override
    public int updateCommittee(CommitteeEntity committeeEntity) {

        return 0;
    }

    @Override
    public CommitteeEntity addCommittee(CommitteeEntity committeeEntity) {

        final String InsertQuery = "INSERT INTO BASSAM_COMMITTEES (CC_SID, CC_AR_NAME, CC_EN_NAME, CC_TYPE, CC_TASKS, " +
                "CC_ROW_STATUS) VALUES (CCM_SID_SEQ.NEXTVAL,?,?,?,?,'A')";

        jdbcTemplate.update(connection -> {
            PreparedStatement preparedStatement = connection.prepareStatement(InsertQuery);
            preparedStatement.setString(1, committeeEntity.getCommitteeName().getArName());
            preparedStatement.setString(2, committeeEntity.getCommitteeName().getEnName());
            preparedStatement.setString(3, String.valueOf(committeeEntity.getCommitteeType()));
            preparedStatement.setString(4, committeeEntity.getTasks());

            return preparedStatement;
        });

        return committeeEntity;
    }

}


