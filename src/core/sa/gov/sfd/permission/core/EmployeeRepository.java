package sa.gov.sfd.permission.core;

public interface EmployeeRepository {
    public EmployeeEntity findEmployeeByNationalId(EmployeeNID empNid);
}