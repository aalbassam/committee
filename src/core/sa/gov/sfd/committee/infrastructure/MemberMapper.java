package sa.gov.sfd.committee.infrastructure;

import org.springframework.jdbc.core.RowMapper;
import sa.gov.sfd.committee.core.employee.EmployeeEntity;
import sa.gov.sfd.committee.core.employee.EmployeeNID;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeNo;
import sa.gov.sfd.committee.core.member.MemberDecisionDate;
import sa.gov.sfd.committee.core.member.MemberEndJoinDate;
import sa.gov.sfd.committee.core.member.MemberEntity;
import sa.gov.sfd.committee.core.member.MemberID;
import sa.gov.sfd.committee.core.memberRole.MemberRoleEntity;
import sa.gov.sfd.committee.core.memberRole.MemberRoleID;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberMapper implements RowMapper<MemberEntity> {

    @Override
    public MemberEntity mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        return new MemberEntity(
                new MemberID(resultSet.getInt("CCM_SID")),
                new FormedCommitteeNo(resultSet.getLong("CCM_FORMATION_NO")),
                new EmployeeEntity(new EmployeeNID(resultSet.getLong("CCM_MEMBER_NID"))),
                new MemberRoleEntity(new MemberRoleID(resultSet.getInt("CCM_ROLE_ID"))),
                new MemberDecisionDate(resultSet.getString("CCM_DECISION_DATE_AH"), null), //resultSet.getDate("CCM_DECISION_DATE_AD").toLocalDate()
                new MemberEndJoinDate(resultSet.getString("CCM_END_JOIN_DATE_AH"), null), //resultSet.getDate("CCM_END_JOIN_DATE_AD").toLocalDate()
                ' ');

    }
}
