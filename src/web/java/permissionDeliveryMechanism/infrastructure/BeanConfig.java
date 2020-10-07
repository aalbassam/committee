package permissionDeliveryMechanism.infrastructure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sa.gov.sfd.permission.actions.AddModule;
import sa.gov.sfd.permission.actions.FindAllModules;
import sa.gov.sfd.permission.actions.FindEmployee;
import sa.gov.sfd.permission.actions.FindModule;
import sa.gov.sfd.permission.actions.FindModulePermissions;
import sa.gov.sfd.permission.actions.GrantModulePermission;
import sa.gov.sfd.permission.actions.RemoveModulePermission;
import sa.gov.sfd.permission.actions.UpdateModule;
import sa.gov.sfd.permission.core.EmployeeRepository;
import sa.gov.sfd.permission.core.EmployeeService;
import sa.gov.sfd.permission.core.ModuleRepository;
import sa.gov.sfd.permission.core.ModuleService;
import sa.gov.sfd.permission.core.PermissionRepository;
import sa.gov.sfd.permission.core.PermissionService;
import sa.gov.sfd.permission.infrastructure.EmployeeRepositoryImpl;
import sa.gov.sfd.permission.infrastructure.ModuleRepositoryImpl;
import sa.gov.sfd.permission.infrastructure.PermissionRepositoryImpl;

@Configuration
public class BeanConfig {
    
    
    //---------------REPOSITORIES---------------------
    
    @Bean
    public ModuleRepository moduleRepository(){
        return new ModuleRepositoryImpl();
    }

    @Bean
    public PermissionRepository permissionRepository(){
        return new PermissionRepositoryImpl();
    }

    @Bean
    public EmployeeRepository employeeRepository(){
        return new EmployeeRepositoryImpl();
    }

    //---------------SERVICES---------------------

    @Bean
    public ModuleService moduleService(){
        return new ModuleService(moduleRepository());
    }

    @Bean
    public PermissionService permissionService(){
        return new PermissionService(permissionRepository());
    }

    @Bean EmployeeService employeeService(){
        return new EmployeeService(employeeRepository());
    }
    //---------------ACTIONS---------------------

    @Bean
    public FindModule findModule(){
        return new FindModule(moduleService());
    }

    @Bean
    public FindAllModules findAllModules(){
        return new FindAllModules(moduleService());
    }

    @Bean
    public AddModule addModule(){
        return new AddModule(moduleService());
    }

    @Bean
    public UpdateModule updateModule(){
        return new UpdateModule(moduleService());
    }

    @Bean
    public FindModulePermissions findModulePermission(){
        return new FindModulePermissions(permissionService());
    }

    @Bean
    public GrantModulePermission grantModulePermission(){
        return new GrantModulePermission(permissionService());
    }

    @Bean
    public RemoveModulePermission removeModulePermission(){
        return new RemoveModulePermission(permissionService());
    }


    @Bean FindEmployee findEmployee(){
        return new FindEmployee(employeeService());
    }
}