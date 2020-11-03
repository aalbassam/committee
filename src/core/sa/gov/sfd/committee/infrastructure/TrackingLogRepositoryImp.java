package sa.gov.sfd.committee.infrastructure;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import sa.gov.sfd.committee.core.trackingLog.TrackingLogEntity;
import sa.gov.sfd.committee.core.trackingLog.TrackingLogRepository;

import java.sql.PreparedStatement;

@Repository
public class TrackingLogRepositoryImp implements TrackingLogRepository {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public TrackingLogRepositoryImp(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    public TrackingLogEntity addTrackingLog(TrackingLogEntity trackingLogEntity) {

        final String InsertQuery;
        InsertQuery = "INSERT INTO TRACKING_LOG (TL_SID,TL_TABLE_NAME, TL_ROW_ID, TL_METHOD_NAME,TL_ACTION_TYPE,TL_ACTION_BY,TL_ACTION_DATE) " +
                "VALUES (TL_SID_SEQ.NEXTVAL,:1,:2,:3,:4,:5,SYSDATE)";

        MapSqlParameterSource namedParams = new MapSqlParameterSource();

        namedParams.addValue("1", trackingLogEntity.getTableName());
        namedParams.addValue("2", trackingLogEntity.getRowId().getId());
        namedParams.addValue("3", trackingLogEntity.getMethodName());
        namedParams.addValue("4", trackingLogEntity.getActionType());
        namedParams.addValue("5", trackingLogEntity.getActionBy());

        this.namedParameterJdbcTemplate.update(InsertQuery, namedParams);

        return trackingLogEntity;

    }
}
