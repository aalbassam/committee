package sa.gov.sfd.committee.infrastructure;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import sa.gov.sfd.committee.core.memberRole.MemberRoleEntity;
import sa.gov.sfd.committee.core.memberRole.MemberRoleRepository;

import java.util.List;

@Repository
public class MemberRoleRepositoryImp implements MemberRoleRepository {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public MemberRoleRepositoryImp(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    public List<MemberRoleEntity> getAllMemberRoles() {

        final String q = "SELECT CMR_ROLE_ID, CMR_ROLE_AR_NAME, CMR_ROLE_EN_NAME  FROM MEMBER_ROLES WHERE CMR_ROW_STATUS != 'D'";

        return this.namedParameterJdbcTemplate.query(q, new MemberRoleMapper());
    }

    @Override
    public Long addNewMemberRole(MemberRoleEntity memberRoleEntity) {

        final String InsertQuery;
        InsertQuery = "INSERT INTO MEMBER_ROLES (CMR_ROLE_ID,CMR_ROLE_AR_NAME, CMR_ROLE_EN_NAME, CMR_ROW_STATUS) VALUES (CMR_ROLE_ID_SEQ.NEXTVAL,:1,:2,'A')";

        KeyHolder keyHolder = new GeneratedKeyHolder();
        MapSqlParameterSource namedParams = new MapSqlParameterSource();

        namedParams.addValue("1", memberRoleEntity.getMemberRoleName().getArabicName());
        namedParams.addValue("2", memberRoleEntity.getMemberRoleName().getEnglishName());

        this.namedParameterJdbcTemplate.update(InsertQuery, namedParams, keyHolder, new String[]{"CMR_ROLE_ID"});


        return keyHolder.getKey().longValue();
    }

}