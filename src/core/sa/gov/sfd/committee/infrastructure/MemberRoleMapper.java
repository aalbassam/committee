package sa.gov.sfd.committee.infrastructure;

import org.springframework.jdbc.core.RowMapper;
import sa.gov.sfd.committee.core.memberRole.MemberRoleEntity;
import sa.gov.sfd.committee.core.memberRole.MemberRoleID;
import sa.gov.sfd.committee.core.memberRole.MemberRoleName;

import java.sql.ResultSet;
import java.sql.SQLException;


public class MemberRoleMapper implements RowMapper<MemberRoleEntity> {


    @Override
    public MemberRoleEntity mapRow(ResultSet resultSet, int i) throws SQLException {

        return new MemberRoleEntity(new MemberRoleID(resultSet.getInt("CMR_ROLE_ID")),
                new MemberRoleName(resultSet.getString("CMR_ROLE_AR_NAME"), resultSet.getString("CMR_ROLE_EN_NAME")), ' ');


    }
}
