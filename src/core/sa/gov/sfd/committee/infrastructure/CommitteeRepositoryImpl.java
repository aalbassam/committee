package sa.gov.sfd.committee.infrastructure;

import sa.gov.sfd.committee.core.committee.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Date;
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
        final String q1 = "SELECT CC_SID, CC_AR_NAME, CC_EN_NAME, CC_TYPE, CC_TASKS  FROM BASSAM_COMMITTEES";
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
        final String q1 = "SELECT SC_FORMATION_NO, SC_REWARD, SC_DECISION_NO, SC_DECISION_DATE_AH, SC_DECISION_DATE_AD, SC_FORMATION_END_DATE_AH, SC_FORMATION_END_DATE_AD  FROM BASSAM_FORMED_COMMITTEES";
        return this.jdbcTemplate.query(q1, new FormedCommitteeMapper());
    }

    @Override
    public FormedCommittee getFormedCommitteeById(FormedCommitteeNo formedCommitteeNo) {
        final String q1 = "SELECT SC_FORMATION_NO, SC_REWARD, SC_DECISION_NO, SC_DECISION_DATE_AH, SC_DECISION_DATE_AD, SC_FORMATION_END_DATE_AH, SC_FORMATION_END_DATE_AD  FROM BASSAM_FORMED_COMMITTEES WHERE SC_FORMATION_NO=" + formedCommitteeNo.getNo().toString();

        return jdbcTemplate.queryForObject(q1, new FormedCommitteeMapper());

    }

    @Override
    public FormedCommittee addFormedCommittee(CommitteeID committeeID, FormedCommittee formedCommittee) {

        final String InsertQuery = "INSERT INTO BASSAM_FORMED_COMMITTEES VALUES (SC_FORMATION_NO_SEQ.NEXTVAL,?,?,?,?,?,?,?,?,?)";

        jdbcTemplate.update(connection -> {
            PreparedStatement preparedStatement = connection.prepareStatement(InsertQuery);

            preparedStatement.setInt(1, committeeID.getId());
            preparedStatement.setBoolean(2, formedCommittee.isReward());
            preparedStatement.setString(3, formedCommittee.getDecisionNo());
            preparedStatement.setString(4, formedCommittee.getFormedCommitteeDecisionDate().getDecisionDateAH());

            Date dateDecisionAH = Date.valueOf(formedCommittee.getFormedCommitteeDecisionDate().getDecisionDateAD());
            preparedStatement.setDate(5, dateDecisionAH);

            preparedStatement.setString(6, formedCommittee.getFormedCommitteeEndDate().getEndDateAH());

            Date dateEndAH = Date.valueOf(formedCommittee.getFormedCommitteeDecisionDate().getDecisionDateAD());
            preparedStatement.setDate(7, dateEndAH);
            preparedStatement.setString(8, formedCommittee.getCreatedBy());
            preparedStatement.setString(9, formedCommittee.getCreatedDate());

            return preparedStatement;
        });

        return formedCommittee;
    }

    @Override
    public MemberRole addNewMemberRole(MemberRole memberRole) {

        final String InsertQuery = "INSERT INTO BASSAM_MEMBER_ROLES (CMR_ROLE_ID,CMR_ROLE_AR_NAME, CMR_ROLE_EN_NAME) VALUES (CMR_ROLE_ID_SEQ.NEXTVAL,?,?)";
        jdbcTemplate.update(connection -> {
            PreparedStatement preparedStatement = connection.prepareStatement(InsertQuery);
            preparedStatement.setString(1, memberRole.getMemberRoleName().getArName());
            preparedStatement.setString(2, memberRole.getMemberRoleName().getEnName());
            return preparedStatement;
        });

        return memberRole;
    }

    @Override
    public List<MemberRole> getAllMemberRoles() {
        final String q1 = "SELECT CMR_ROLE_ID, CMR_ROLE_AR_NAME, CMR_ROLE_EN_NAME  FROM BASSAM_MEMBER_ROLES";
        return this.jdbcTemplate.query(q1, new MemberRoleMapper());
    }
}


