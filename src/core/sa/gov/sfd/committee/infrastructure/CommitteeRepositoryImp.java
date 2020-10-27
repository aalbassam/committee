package sa.gov.sfd.committee.infrastructure;

import sa.gov.sfd.committee.core.committee.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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

}


