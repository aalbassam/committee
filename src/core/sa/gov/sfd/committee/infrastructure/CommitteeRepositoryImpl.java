package core.sa.gov.sfd.committee.infrastructure;

import core.sa.gov.sfd.committee.core.committee.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.List;

@Repository
public class CommitteeRepositoryImpl implements CommitteeRepository {

    private final JdbcTemplate jdbcTemplate;

    public CommitteeRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<CommitteeEntity> findAllCommittees() {
        final String q1 = "SELECT CC_SID, CC_AR_NAME, CC_EN_NAME, CC_TYPE, CC_TASKS  FROM COMMITTEES";
        return this.jdbcTemplate.query(q1, new CommitteeMapper());
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
        //SC_COMMITTEE_ID
        final String q1 = "SELECT SC_FORMATION_NO, SC_REWARD, SC_DECISION_NO, SC_DECISION_DATE_AH, SC_DECISION_DATE_AD, SC_FORMATION_END_DATE_AH, SC_FORMATION_END_DATE_AD  FROM FORMED_COMMITTEES";
        return this.jdbcTemplate.query(q1, new FormedCommitteeMapper());
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

        final String InsertQuery = "INSERT INTO MEMBER_ROLES (CMR_ROLE_ID,CMR_ROLE_AR_NAME, CMR_ROLE_EN_NAME) VALUES (CMR_ROLE_ID_SEQ.NEXTVAL,?,?)";
        jdbcTemplate.update(connection -> {
            PreparedStatement preparedStatement = connection.prepareStatement(InsertQuery);
            preparedStatement.setString(1, memberRole.getMemberRoleName().getArName());
            preparedStatement.setString(1, memberRole.getMemberRoleName().getEnName());
            return preparedStatement;
        });

        return memberRole;
    }

    @Override
    public List<MemberRole> getAllMemberRoles() {
        final String q1 = "SELECT CMR_ROLE_ID, CMR_ROLE_AR_NAME, CMR_ROLE_EN_NAME  FROM MEMBER_ROLES";
        return this.jdbcTemplate.query(q1, new MemberRoleMapper());
    }
}


