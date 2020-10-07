package committeeDeliveryMechanism.infrastructure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sa.gov.sfd.committee.actions.formedCommittee.GetDetailsOfFormedCommitteeByID_action;
import sa.gov.sfd.committee.infrastructure.CommitteeRepositoryImpl;



@Configuration
public class BeanConfig {
    
  
    //---------------REPOSITORIES---------------------
    
    @Bean
    public CommitteeRepository committeeRepository(){
        return new CommitteeRepositoryImpl();
    }



    //---------------SERVICES---------------------

    @Bean
    public CommitteeService committeeService(){
        return new CommitteeService(committeeRepository());
    }

    

    //---------------ACTIONS---------------------
    @Bean
    public GetDetailsOfFormedCommitteeByID_action getCommitteeDetails(){
        return new GetDetailsOfFormedCommitteeByID_action(committeeService());
    }
   
}