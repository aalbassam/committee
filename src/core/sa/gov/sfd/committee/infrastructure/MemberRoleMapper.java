package sa.gov.sfd.committee.infrastructure;

import sa.gov.sfd.committee.core.committee.*;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class MemberRoleMapper implements RowMapper<MemberRole> {


    @Override
    public MemberRole mapRow(ResultSet resultSet, int i) throws SQLException {

        return new MemberRole(new MemberRoleID(resultSet.getInt("CMR_ROLE_ID")),
                new MemberRoleName(resultSet.getString("CMR_ROLE_AR_NAME"), resultSet.getString("CMR_ROLE_EN_NAME")));


    }
}
