package sa.gov.sfd.committee.infrastructure;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import sa.gov.sfd.committee.core.member.*;
import sa.gov.sfd.committee.core.shared.MasterId;

import java.util.List;

@Repository
public class MemberRepositoryImp implements MemberRepository {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public MemberRepositoryImp(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    public Long addMemberToFormedCommittee(MemberEntity memberEntity, MasterId formedCommitteeNo) {

        final String InsertQuery = "INSERT INTO COMMITTEE_MEMBERS (CCM_SID, CCM_MEMBER_NATIONAL_ID, CCM_FORMATION_NO, CCM_ROLE_ID, CCM_DECISION_DATE_AH, " +
                "CCM_DECISION_DATE_AD, CCM_END_JOIN_DATE_AH, CCM_END_JOIN_DATE_AD, " +
                "CCM_ROW_STATUS) VALUES (CCM_SID_SEQ.NEXTVAL,:1,:2,:3,:4,:5,:6,:7,'A')";


        KeyHolder keyHolder = new GeneratedKeyHolder();
        MapSqlParameterSource namedParams = new MapSqlParameterSource();

        namedParams.addValue("1", memberEntity.getEmployeeEntity().getEmployeeNID().getId());
        namedParams.addValue("2", formedCommitteeNo.getId());
        namedParams.addValue("3", memberEntity.getMemberRoleId().getId());
        namedParams.addValue("4", memberEntity.getMemberDecisionDate().getHijri());

        namedParams.addValue("5", memberEntity.getMemberDecisionDate().getGregorian());
        namedParams.addValue("6", memberEntity.getMemberEndJoinDate().getHijri());
        namedParams.addValue("7", memberEntity.getMemberEndJoinDate().getGregorian());

        this.namedParameterJdbcTemplate.update(InsertQuery, namedParams, keyHolder, new String[]{"CCM_SID"});


        return keyHolder.getKey().longValue();

            /*Date dateDecisionAD;
            dateDecisionAD = Date.valueOf(memberEntity.getMemberDecisionDate().getGregorian());
            preparedStatement.setDate(5, dateDecisionAD);

            Date dateEndAD;
            dateEndAD = Date.valueOf(memberEntity.getMemberEndJoinDate().getGregorian());
            preparedStatement.setDate(7, dateEndAD);*/

    }

    @Override
    public List<MemberEntity> addMemberListToFormedCommittee(List<MemberEntity> memberEntities) {
        return null;
    }

    @Override
    public List<MemberEntity> findAllMembersByFormationNo(MasterId formedCommitteeNo) {

        final String q = "SELECT  CCM_SID, CCM_MEMBER_NID, CCM_FORMATION_NO, CCM_ROLE_ID, CCM_DECISION_DATE_AH, CCM_DECISION_DATE_AD, CCM_END_JOIN_DATE_AH, CCM_END_JOIN_DATE_AD, CCM_ROW_STATUS FROM COMMITTEE_MEMBERS WHERE CCM_ROW_STATUS != 'D' AND CCM_FORMATION_NO =" + formedCommitteeNo.getId();

        return this.namedParameterJdbcTemplate.query(q, new MemberMapper());
    }
}
