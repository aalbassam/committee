package sa.gov.sfd.committee.infrastructure;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeNo;
import sa.gov.sfd.committee.core.member.*;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.List;

@Repository
public class MemberRepositoryImp implements MemberRepository {

    private final JdbcTemplate jdbcTemplate;

    public MemberRepositoryImp(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public MemberEntity addMemberToFormedCommittee(MemberEntity memberEntity, FormedCommitteeNo formedCommitteeNo) {

        final String InsertQuery = "INSERT INTO BASSAM_COMMITTEE_MEMBERS (CCM_SID, CCM_MEMBER_NID, CCM_FORMATION_NO, CCM_ROLE_ID, CCM_DECISION_DATE_AH, " +
                "CCM_DECISION_DATE_AD, CCM_END_JOIN_DATE_AH, CCM_END_JOIN_DATE_AD, " +
                "CCM_STATUS) VALUES (CCM_SID_SEQ.NEXTVAL,?,?,?,?,?,?,?,?,'A')";

        jdbcTemplate.update(connection -> {
            PreparedStatement preparedStatement = connection.prepareStatement(InsertQuery);

            preparedStatement.setLong(1, memberEntity.getEmployeeEntity().getEmployeeNID().getId());

            preparedStatement.setLong(2, formedCommitteeNo.getNo());
            preparedStatement.setInt(3, memberEntity.getMemberRoleEntity().getMemberRoleID().getId());

            Date dateDecisionAD = Date.valueOf(memberEntity.getMemberDecisionDate().getDecisionDateAD());
            preparedStatement.setString(4, memberEntity.getMemberDecisionDate().getDecisionDateAH());
            preparedStatement.setDate(5, dateDecisionAD);

            Date dateEndAD = Date.valueOf(memberEntity.getMemberEndJoinDate().getJoinDateAD());

            preparedStatement.setString(6, memberEntity.getMemberEndJoinDate().getJoinDateAH());
            preparedStatement.setDate(7, dateEndAD);

            return preparedStatement;
        });

        return memberEntity;

    }

    @Override
    public List<MemberEntity> addMemberListToFormedCommittee(List<MemberEntity> memberEntities) {
        return null;
    }
}
