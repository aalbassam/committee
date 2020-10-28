package committeeDeliveryMechanism.infrastructure;

import committeeDeliveryMechanism.view.EmployeeDTO;
import sa.gov.sfd.committee.core.employee.EmployeeEntity;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeConverter {

    public static List<EmployeeDTO> convertEmployeeList(List<EmployeeEntity> employeeEntities) {


        return employeeEntities.stream().map(x ->
                new EmployeeDTO(
                        x.getEmployeeNID().getId(),
                        x.getFullName(),
                        x.getDeptName()
                )).collect(Collectors.toList());
    }
}
