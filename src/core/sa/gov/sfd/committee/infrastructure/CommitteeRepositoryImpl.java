package sa.gov.sfd.committee.infrastructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CommitteeRepositoryImpl {


    @Autowired
    JdbcTemplate jdbcTemplate;


    @Override
    public List<CommitteeEntity> getAllCommittees() {

        return jdbcTemplate.query("SELECT * FROM CC_COMMITTEES", new CommitteeMapper());
    }
}
