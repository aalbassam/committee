package sa.gov.sfd.committeeApproval.infrastructure;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import sa.gov.sfd.committeeApproval.core.ApprovalPath;
import sa.gov.sfd.committeeApproval.core.ApprovalRepository;
import sa.gov.sfd.committeeApproval.core.ApproverTeamEntity;
import sa.gov.sfd.committeeApproval.core.ApprovalTransactionEntity;
import sa.gov.sfd.committee.core.employee.EmployeeNID;
import sa.gov.sfd.committeeApproval.core.WorkflowNumber;


import java.sql.PreparedStatement;
import java.util.Collections;
import java.util.List;

public class ApprovalRepositoryImpl implements ApprovalRepository {

    private final JdbcTemplate jdbcTemplate;
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;


    public ApprovalRepositoryImpl(JdbcTemplate jdbcTemplate, NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    public Long applyNewApproval(ApprovalTransactionEntity approvalTransactionEntity) {

        final String insertQuery = "INSERT INTO C_APPROVAL_TRANSACTION(ID, WORKFLOW_NUMBER, STEP, USER_NID, REQUEST_ID, NOTE, REQUEST_TITLE, TYPE)" +
                " VALUES (L_APPROVAL_TRANSACTION_SEQ.NEXTVAL,:1,:2,:3,:4,:5,:6,:7)";

        KeyHolder keyHolder = new GeneratedKeyHolder();

        MapSqlParameterSource namedParams = new MapSqlParameterSource();

        namedParams.addValue("1", approvalTransactionEntity.getWorkflow().getWorkflowNumber().getId());
        namedParams.addValue("2", approvalTransactionEntity.getStep());
        namedParams.addValue("3", approvalTransactionEntity.getUserNID().getId());
        namedParams.addValue("4", approvalTransactionEntity.getRequestID());
        namedParams.addValue("5", approvalTransactionEntity.getNote());
        namedParams.addValue("6", approvalTransactionEntity.getRequestTitle());
        namedParams.addValue("7", approvalTransactionEntity.getType());

        this.namedParameterJdbcTemplate.update(insertQuery, namedParams, keyHolder, new String[]{"ID"});

        return keyHolder.getKey().longValue();

    }


    @Override
    public List<ApprovalTransactionEntity> loadApprovalPendingByApproverNID(EmployeeNID employeeNID) {
        return jdbcTemplate.query("" +
                        "select L_APPROVAL_TRANSACTION.id, L_APPROVAL_TRANSACTION.workflow_number, L_APPROVAL_TRANSACTION.step, L_APPROVAL_TRANSACTION.user_nid,\n" +
                        "       L_APPROVAL_TRANSACTION.request_id, L_APPROVAL_TRANSACTION.action, L_APPROVAL_TRANSACTION.note, L_APPROVAL_TRANSACTION.request_title,\n" +
                        "       L_APPROVAL_TRANSACTION.request_type, L_APPROVAL_TRANSACTION.type\n" +
                        "from C_APPROVAL_TRANSACTION\n" +
                        "where L_APPROVAL_TRANSACTION.ACTION IS NULL\n" +
                        "AND EXISTS(\n" +
                        "SELECT  L_WORKFLOW.ID , L_WORKFLOW.WORKFLOW_NUMBER , L_WORKFLOW.STEP , L_WORKFLOW.TYPE ,L_WORKFLOW.TEAM_ID ,L_WORKFLOW.ACTION\n" +
                        "FROM C_WORKFLOW\n" +
                        "WHERE L_WORKFLOW.STEP = L_APPROVAL_TRANSACTION.STEP\n" +
                        "AND L_WORKFLOW.WORKFLOW_NUMBER = L_APPROVAL_TRANSACTION.WORKFLOW_NUMBER\n" +
                        "AND L_WORKFLOW.TEAM_ID IN (SELECT DISTINCT L_EMP_TEAM.TEAM_ID FROM L_EMP_TEAM WHERE L_EMP_TEAM.EMPLOYEE_NID = ?))",
                new Object[]{employeeNID.getId()}, new ApprovalTransactionMapper());
    }


    @Override
    public List<ApprovalPath> approvalPathForEmployee(List<Long> EmployeesNID) {
        String inSql = String.join(",", Collections.nCopies(EmployeesNID.size(), "?"));

        return jdbcTemplate.query(
                String.format("SELECT WORKFLOW_NUMBER \n" +
                        "FROM C_APPROVAL_PATH  \n" +
                        "WHERE EMPLOYEE_NID IN (%s) \n" +
                        "GROUP BY WORKFLOW_NUMBER", inSql),
                EmployeesNID.toArray(), new ApprovalPathMapper());
    }

    @Override
    public int approvalPathForEmployee(EmployeeNID EmployeesNID) {

        String selectQuery = "SELECT WORKFLOW_NUMBER FROM C_APPROVAL_PATH WHERE EMPLOYEE_NID = ?";

        return jdbcTemplate.queryForObject(selectQuery, new Object[]{EmployeesNID.getId()}, Integer.class);
    }


    @Override
    // Tested
    public ApproverTeamEntity getRolesListByEmpNID(EmployeeNID employeeNID, WorkflowNumber workflowNumber, int step, String workflowType) {
        return jdbcTemplate.queryForObject("" +
                        "SELECT  L_APPROVER_TEAM.APPROVAL_TEAM_ID , L_APPROVER_TEAM.TEAM_ID, L_APPROVER_TEAM.TEAM_NAME , L_APPROVER_TEAM.APPROVAL_ROLE ,\n" +
                        "       L_APPROVER_TEAM.DECLINED_ROLE , L_APPROVER_TEAM.VIEW_ROLE ,  L_APPROVER_TEAM.CONFIRMED_ROLE ,L_APPROVER_TEAM.ISSUED_NEW_CONFORMATION ,L_EMP_TEAM.EMPLOYEE_NID\n" +
                        "FROM C_APPROVER_TEAM , C_EMP_TEAM , C_WORKFLOW\n" +
                        "WHERE EMPLOYEE_NID = ?\n" +
                        "AND L_WORKFLOW.WORKFLOW_NUMBER =?\n" +
                        "AND L_WORKFLOW.STEP = ?\n" +
                        "AND L_WORKFLOW.TYPE = ?\n" +
                        "AND L_APPROVER_TEAM.TEAM_ID = L_WORKFLOW.TEAM_ID",
                new Object[]{employeeNID.getId(), workflowNumber.getId(), step, workflowType}, new ApproverTeamMapper());
    }


    @Override
    // Tested
    public int declineRequest(ApprovalTransactionEntity approvalTransactionEntity) {
        final String UPDATE_APPROVAL_TRANSACTION_SQL = "" +
                "UPDATE C_APPROVAL_TRANSACTION " +
                "SET ACTION = 'Declined', USER_NID = ?, NOTE= ?\n" +
                "WHERE WORKFLOW_NUMBER =? " +
                "AND STEP = ? " +
                "AND TYPE = ? " +
                "and REQUEST_ID = ?";
        return jdbcTemplate.update(connection -> {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_APPROVAL_TRANSACTION_SQL);
            preparedStatement.setLong(1, approvalTransactionEntity.getUserNID().getId());
            preparedStatement.setString(2, approvalTransactionEntity.getNote());
            preparedStatement.setInt(3, approvalTransactionEntity.getWorkflow().getWorkflowNumber().getId());
            preparedStatement.setInt(4, approvalTransactionEntity.getStep());
            preparedStatement.setString(5, approvalTransactionEntity.getType());
            preparedStatement.setString(6, approvalTransactionEntity.getRequestID());


            return preparedStatement;
        });
    }


    @Override
    // Tested
    public int approveRequest(ApprovalTransactionEntity approvalTransactionEntity) {
        final String UPDATE_APPROVAL_TRANSACTION_SQL = "UPDATE C_APPROVAL_TRANSACTION SET L_APPROVAL_TRANSACTION.ACTION = (SELECT L_WORKFLOW.ACTION \n" +
                "FROM C_WORKFLOW \n" +
                "WHERE l_WORKFLOW.WORKFLOW_NUMBER = ? \n" +
                "AND l_WORKFLOW.STEP = ? AND l_WORKFLOW.TYPE =?), L_APPROVAL_TRANSACTION.NOTE=? \n" +
                "WHERE L_APPROVAL_TRANSACTION.WORKFLOW_NUMBER = ? \n" +
                "AND L_APPROVAL_TRANSACTION.STEP = ? \n" +
                "AND L_APPROVAL_TRANSACTION.TYPE = ? \n" +
                "AND L_APPROVAL_TRANSACTION.REQUEST_ID = ?";

        return jdbcTemplate.update(connection -> {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_APPROVAL_TRANSACTION_SQL);
            preparedStatement.setInt(1, approvalTransactionEntity.getWorkflow().getWorkflowNumber().getId());
            preparedStatement.setInt(2, approvalTransactionEntity.getStep());
            preparedStatement.setString(3, approvalTransactionEntity.getType());
            preparedStatement.setString(4, approvalTransactionEntity.getNote());
            preparedStatement.setInt(5, approvalTransactionEntity.getWorkflow().getWorkflowNumber().getId());
            preparedStatement.setInt(6, approvalTransactionEntity.getStep());
            preparedStatement.setString(7, approvalTransactionEntity.getType());
            preparedStatement.setString(8, approvalTransactionEntity.getRequestID());

            return preparedStatement;
        });


    }

    @Override
    public ApprovalTransactionEntity getLastRecordInTransaction(EmployeeNID employeeNID) {
        return jdbcTemplate.queryForObject("" +
                        "Select *\n" +
                        "from (select L_APPROVAL_TRANSACTION.id,\n" +
                        "             L_APPROVAL_TRANSACTION.workflow_number,\n" +
                        "             L_APPROVAL_TRANSACTION.step,\n" +
                        "             L_APPROVAL_TRANSACTION.user_nid,\n" +
                        "             L_APPROVAL_TRANSACTION.request_id,\n" +
                        "             L_APPROVAL_TRANSACTION.action,\n" +
                        "             L_APPROVAL_TRANSACTION.note,\n" +
                        "             L_APPROVAL_TRANSACTION.request_title,\n" +
                        "             L_APPROVAL_TRANSACTION.request_type,\n" +
                        "             L_APPROVAL_TRANSACTION.type\n" +
                        "      from C_APPROVAL_TRANSACTION\n" +
                        "      where L_APPROVAL_TRANSACTION.ACTION IS not NULL\n" +
                        "        AND EXISTS(\n" +
                        "              SELECT L_WORKFLOW.ID,\n" +
                        "                     L_WORKFLOW.WORKFLOW_NUMBER,\n" +
                        "                     L_WORKFLOW.STEP,\n" +
                        "                     L_WORKFLOW.TYPE,\n" +
                        "                     L_WORKFLOW.TEAM_ID,\n" +
                        "                     L_WORKFLOW.ACTION\n" +
                        "              FROM C_WORKFLOW\n" +
                        "              WHERE L_WORKFLOW.STEP = L_APPROVAL_TRANSACTION.STEP\n" +
                        "                AND L_WORKFLOW.WORKFLOW_NUMBER = L_APPROVAL_TRANSACTION.WORKFLOW_NUMBER\n" +
                        "                AND L_WORKFLOW.TEAM_ID IN\n" +
                        "                    (SELECT DISTINCT L_EMP_TEAM.TEAM_ID FROM C_EMP_TEAM WHERE L_EMP_TEAM.EMPLOYEE_NID = ?))\n" +
                        "          order by L_APPROVAL_TRANSACTION.ID desc\n" +
                        ")\n" +
                        "where ROWNUM = 1",
                new Object[]{employeeNID.getId()}, new ApprovalTransactionMapper());
    }


}
