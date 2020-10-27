package sa.gov.sfd.committee.infrastructure;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeNo;
import sa.gov.sfd.committee.core.member.MemberEntity;
import sa.gov.sfd.committee.core.member.MemberRepository;

import java.util.List;

@Repository
public class MemberRepositoryImp implements MemberRepository {

    private final JdbcTemplate jdbcTemplate;

    public MemberRepositoryImp(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public MemberEntity addMemberToFormedCommittee(MemberEntity memberEntity, FormedCommitteeNo formedCommitteeNo) {
        return null;
    }

    @Override
    public List<MemberEntity> addMemberListToFormedCommittee(List<MemberEntity> memberEntities) {
        return null;
    }
}
