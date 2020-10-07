package sa.gov.sfd.committee.core.employee;

public class EmployeeNID {

    private final Long id;

    public EmployeeNID(Long employeeNID) {
        if (String.valueOf(employeeNID).length() != 10) {
            throw new IllegalArgumentException("This is not an employee nation ID! ");
        }

        this.id = employeeNID;
    }

    public Long getId() {
        return id;
    }
}
