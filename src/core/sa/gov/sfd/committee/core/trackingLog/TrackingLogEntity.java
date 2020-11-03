package sa.gov.sfd.committee.core.trackingLog;


import sa.gov.sfd.committee.core.shared.MasterId;

public class TrackingLogEntity {

    private String tableName;
    private MasterId rowId;
    private String methodName;
    private String actionType; // insert - update - delete
    private String actionBy;

    public TrackingLogEntity(String tableName, MasterId rowId, String methodName, String actionType, String actionBy) {

        this.tableName = tableName;
        this.rowId = rowId;
        this.methodName = methodName;
        this.actionType = actionType;
        this.actionBy = actionBy;

    }

    @Override
    public String toString() {
        return "TrackingLogEntity{" +
                "tableName='" + tableName + '\'' +
                ", rowId=" + rowId.getId() +
                ", methodName='" + methodName + '\'' +
                ", actionType='" + actionType + '\'' +
                ", actionBy='" + actionBy + '\'' +
                '}';
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public MasterId getRowId() {
        return rowId;
    }

    public void setRowId(MasterId rowId) {
        this.rowId = rowId;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getActionBy() {
        return actionBy;
    }

    public void setActionBy(String actionBy) {
        this.actionBy = actionBy;
    }
}
