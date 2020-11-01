package sa.gov.sfd.committee.infrastructure;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import sa.gov.sfd.committee.core.member.*;
import sa.gov.sfd.committee.core.shared.MasterId;

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
    public MemberEntity addMemberToFormedCommittee(MemberEntity memberEntity, MasterId formedCommitteeNo) {

        final String InsertQuery = "INSERT INTO BASSAM_COMMITTEE_MEMBERS (CCM_SID, CCM_MEMBER_NID, CCM_FORMATION_NO, CCM_ROLE_ID, CCM_DECISION_DATE_AH, " +
                "CCM_DECISION_DATE_AD, CCM_END_JOIN_DATE_AH, CCM_END_JOIN_DATE_AD, " +
                "CCM_ROW_STATUS) VALUES (CCM_SID_SEQ.NEXTVAL,?,?,?,?,?,?,?,'A')";

        jdbcTemplate.update(connection -> {
            PreparedStatement preparedStatement = connection.prepareStatement(InsertQuery);

            preparedStatement.setLong(1, memberEntity.getEmployeeEntity().getEmployeeNID().getId());

            preparedStatement.setLong(2, formedCommitteeNo.getId());
            preparedStatement.setLong(3, memberEntity.getMemberRoleId().getId());

            Date dateDecisionAD;
            if (memberEntity.getMemberDecisionDate().getGregorian() == null)
                dateDecisionAD = null;
            else
                dateDecisionAD = Date.valueOf(memberEntity.getMemberDecisionDate().getGregorian());


            preparedStatement.setString(4, memberEntity.getMemberDecisionDate().getHijri());
            preparedStatement.setDate(5, dateDecisionAD);

            Date dateEndAD;
            if (memberEntity.getMemberEndJoinDate().getGregorian() == null)
                dateEndAD = null;
            else
                dateEndAD = Date.valueOf(memberEntity.getMemberEndJoinDate().getGregorian());

            preparedStatement.setString(6, memberEntity.getMemberEndJoinDate().getHijri());
            preparedStatement.setDate(7, dateEndAD);

            return preparedStatement;
        });

        return memberEntity;

    }

    @Override
    public List<MemberEntity> addMemberListToFormedCommittee(List<MemberEntity> memberEntities) {
        return null;
    }

    @Override
    public List<MemberEntity> findAllMembersByFormationNo(MasterId formedCommitteeNo) {

        final String q = "SELECT  CCM_SID, CCM_MEMBER_NID, CCM_FORMATION_NO, CCM_ROLE_ID, CCM_DECISION_DATE_AH, CCM_DECISION_DATE_AD, CCM_END_JOIN_DATE_AH, CCM_END_JOIN_DATE_AD, CCM_ROW_STATUS FROM BASSAM_COMMITTEE_MEMBERS WHERE CCM_ROW_STATUS != 'D' AND CCM_FORMATION_NO =" + formedCommitteeNo.getId();

        return this.jdbcTemplate.query(q, new MemberMapper());
    }
}
