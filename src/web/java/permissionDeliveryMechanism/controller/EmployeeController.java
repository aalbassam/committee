package permissionDeliveryMechanism.controller;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import permissionDeliveryMechanism.infrastructure.EmployeeConverter;
import permissionDeliveryMechanism.view.EmployeeDTO;
import sa.gov.sfd.permission.actions.FindEmployee;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    
    @Autowired
    private FindEmployee findEmployee;

    // get user by national Id
    @GetMapping("/{id}")
    public EmployeeDTO getEmployeeByNationalId(@PathVariable("id") Long empNid){
        return (EmployeeConverter.convertEmployeeVO(findEmployee.find(empNid)));
    }
}