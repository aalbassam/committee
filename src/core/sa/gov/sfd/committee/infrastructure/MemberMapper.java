package sa.gov.sfd.committee.infrastructure;

import org.springframework.jdbc.core.RowMapper;
import sa.gov.sfd.committee.core.employee.EmployeeEntity;
import sa.gov.sfd.committee.core.employee.EmployeeNID;
import sa.gov.sfd.committee.core.member.MemberEntity;
import sa.gov.sfd.committee.core.shared.BinaryDate;
import sa.gov.sfd.committee.core.shared.MasterId;
import sa.gov.sfd.committee.core.shared.RowStatus;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberMapper implements RowMapper<MemberEntity> {

    @Override
    public MemberEntity mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        return new MemberEntity(
                new MasterId(resultSet.getLong("CCM_SID")),
                new MasterId(resultSet.getLong("CCM_FORMATION_NO")),
                new EmployeeEntity(new EmployeeNID(resultSet.getLong("CCM_MEMBER_NID"))),
                new MasterId(resultSet.getLong("CCM_ROLE_ID")),
                new BinaryDate(resultSet.getString("CCM_DECISION_DATE_AH"), null), //resultSet.getDate("CCM_DECISION_DATE_AD").toLocalDate()
                new BinaryDate(resultSet.getString("CCM_END_JOIN_DATE_AH"), null), //resultSet.getDate("CCM_END_JOIN_DATE_AD").toLocalDate()
                new RowStatus());

    }
}
