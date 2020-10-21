package committeeDeliveryMechanism.infrastructure;

import sa.gov.sfd.committee.actions.committee.*;

import sa.gov.sfd.committee.actions.employee.GetEmployeesList;
import sa.gov.sfd.committee.core.committee.CommitteeRepository;
import sa.gov.sfd.committee.core.committee.CommitteeService;

import sa.gov.sfd.committee.core.employee.EmployeeRepository;
import sa.gov.sfd.committee.core.employee.EmployeeService;
import sa.gov.sfd.committee.infrastructure.CommitteeRepositoryImpl;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import sa.gov.sfd.committee.infrastructure.EmployeesRepositoryImp;


import javax.sql.DataSource;


@Configuration
public class BeanConfig {


    //----------------DB--------------------------
    @Bean
    JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }

    /*@Bean
    DataSource dataSource() {

        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.h2.Driver");
        dataSourceBuilder.url("jdbc:h2:mem:testdb");
        dataSourceBuilder.username("sa");
        dataSourceBuilder.password("password");
        return dataSourceBuilder.build();
    }*/

    @Bean
    DataSource dataSource() {

        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("oracle.jdbc.OracleDriver");
        dataSourceBuilder.url("jdbc:oracle:thin:@//scantest.sfd.gov.sa:1521/testdb");
        dataSourceBuilder.username("SFDGRP22");
        dataSourceBuilder.password("SFDGRP22");
        return dataSourceBuilder.build();
    }


    //---------------REPOSITORIES--------------------

    @Bean
    public CommitteeRepository committeeRepository() {
        return new CommitteeRepositoryImpl(jdbcTemplate());
    }

    @Bean
    public EmployeeRepository employeeRepository() {
        return new EmployeesRepositoryImp(jdbcTemplate());
    }


    //---------------SERVICES-------------------------
    @Bean
    public CommitteeService committeeService() {
        return new CommitteeService(committeeRepository());
    }

    @Bean
    public EmployeeService employeeService() {
        return new EmployeeService(employeeRepository());
    }


    //---------------ACTIONS---------------------
    @Bean
    public GetAllFormedCommittees getAllFormedCommittees() {
        return new GetAllFormedCommittees(committeeService());
    }

    @Bean
    public GetAllCommittees getAllCommittees() {
        return new GetAllCommittees(committeeService());
    }

    @Bean
    public UpdateCommittee updateCommittee() {
        return new UpdateCommittee(committeeService());
    }

    @Bean
    public GetFormedCommitteeDetailById getFormedCommitteeDetailById() {
        return new GetFormedCommitteeDetailById(committeeService());
    }

    @Bean
    public AddNewMemberRole addNewMemberRole() {
        return new AddNewMemberRole(committeeService());
    }

    @Bean
    public AddNewFormedCommittee addNewFormedCommittee() {
        return new AddNewFormedCommittee(committeeService());
    }

    @Bean
    public AddMemberToFormedCommittee addMemberToFormedCommittee() {
        return new AddMemberToFormedCommittee(committeeService());
    }

    @Bean
    public GetAllMemberRoles getAllMemberRoles() {
        return new GetAllMemberRoles(committeeService());
    }

    @Bean
    public GetEmployeesList getEmployeesList() {
        return new GetEmployeesList(employeeService());
    }

}