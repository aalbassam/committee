package committeeDeliveryMechanism.infrastructure;

import core.sa.gov.sfd.committee.actions.committee.GetAllFormedCommittees_action;
import core.sa.gov.sfd.committee.core.committee.CommitteeService;
import core.sa.gov.sfd.committee.infrastructure.CommitteeRepositoryImpl;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;


@Configuration
public class BeanConfig {


    //----------------DB--------------------------
    @Bean
    JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }

    @Bean
    DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.h2.Driver");
        dataSourceBuilder.url("jdbc:h2:mem:testdb");
        dataSourceBuilder.username("sa");
        dataSourceBuilder.password("password");
        return dataSourceBuilder.build();
    }


    //---------------REPOSITORIES--------------------

    @Bean
    public CommitteeRepositoryImpl committeeRepository() {
        return new CommitteeRepositoryImpl(jdbcTemplate());
    }


    //---------------SERVICES-------------------------
    @Bean
    public CommitteeService committeeService() {
        return new CommitteeService(committeeRepository());
    }


    //---------------ACTIONS---------------------
    @Bean
    public GetAllFormedCommittees_action getAllFormedCommittees_action() {
        return new GetAllFormedCommittees_action(committeeService());
    }

}