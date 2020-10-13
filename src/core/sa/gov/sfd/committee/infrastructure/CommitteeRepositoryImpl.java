package core.sa.gov.sfd.committee.infrastructure;

import core.sa.gov.sfd.committee.core.committee.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CommitteeRepositoryImpl implements CommitteeRepository {

    private final JdbcTemplate jdbcTemplate;

    public CommitteeRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<CommitteeEntity> findAllCommittees() {
        return null;
    }

    @Override
    public int updateCommittee(CommitteeEntity committeeEntity) {
        return 0;
    }

    @Override
    public Member addMemberToFormedCommittee(Member member, FormedCommitteeNo formedCommitteeNo) {
        return null;
    }

    @Override
    public List<Member> addMemberListToFormedCommittee(List<Member> members) {
        return null;
    }

    @Override
    public List<FormedCommittee> findAllFormedCommittees() {
        return null;
    }

    @Override
    public FormedCommittee getFormedCommitteeById(FormedCommitteeNo formedCommitteeNo) {
        return null;
    }

    @Override
    public FormedCommittee addFormedCommittee(CommitteeEntity committeeEntity, FormedCommittee formedCommittee) {
        return null;
    }

    @Override
    public MemberRole addNewMemberRole(MemberRole memberRole) {
        return null;
    }

    @Override
    public List<MemberRole> getAllMemberRoles() {
        return null;
    }
}


