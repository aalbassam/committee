package sa.gov.sfd.committee.infrastructure;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import sa.gov.sfd.committee.core.memberRole.MemberRoleEntity;
import sa.gov.sfd.committee.core.memberRole.MemberRoleRepository;

import java.sql.PreparedStatement;
import java.util.List;

@Repository
public class MemberRoleRepositoryImp implements MemberRoleRepository {

    private final JdbcTemplate jdbcTemplate;

    public MemberRoleRepositoryImp(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<MemberRoleEntity> getAllMemberRoles() {

        final String q1 = "SELECT CMR_ROLE_ID, CMR_ROLE_AR_NAME, CMR_ROLE_EN_NAME  FROM BASSAM_MEMBER_ROLES WHERE CMR_ROW_STATUS != 'D'";

        return this.jdbcTemplate.query(q1, new MemberRoleMapper());
    }

    @Override
    public MemberRoleEntity addNewMemberRole(MemberRoleEntity memberRoleEntity) {

        final String InsertQuery = "INSERT INTO BASSAM_MEMBER_ROLES (CMR_ROLE_ID,CMR_ROLE_AR_NAME, CMR_ROLE_EN_NAME) VALUES (CMR_ROLE_ID_SEQ.NEXTVAL,?,?,'A')";

        jdbcTemplate.update(connection -> {
            PreparedStatement preparedStatement = connection.prepareStatement(InsertQuery);
            preparedStatement.setString(1, memberRoleEntity.getMemberRoleName().getArName());
            preparedStatement.setString(2, memberRoleEntity.getMemberRoleName().getEnName());
            return preparedStatement;
        });

        return memberRoleEntity;
    }

}
