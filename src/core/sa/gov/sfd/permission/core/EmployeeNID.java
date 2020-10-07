package sa.gov.sfd.permission.core;

public class EmployeeNID {
    private final Long Id;

    public EmployeeNID(Long employeeNID) {
        if(String.valueOf(employeeNID).length()!=10) {
            throw new IllegalArgumentException("This is not employee nation id number");
        }

        this.Id = employeeNID;
    }

    public Long getId() {
        return Id;
    }
}