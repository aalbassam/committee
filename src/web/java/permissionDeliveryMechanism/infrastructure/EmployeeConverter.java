package permissionDeliveryMechanism.infrastructure;

import permissionDeliveryMechanism.view.EmployeeDTO;
import sa.gov.sfd.permission.core.EmployeeEntity;

public class EmployeeConverter {

    public static EmployeeDTO convertEmployeeVO(EmployeeEntity employeeEntity){
        EmployeeDTO employeeDTO = new EmployeeDTO(
            employeeEntity.getEmpNid().getId(),
            employeeEntity.getEmpName().getArabicName(),
            employeeEntity.getEmpName().getEnglishName(),
            employeeEntity.getEmpName().getSamAccount()
        );
        return employeeDTO;
    }

}