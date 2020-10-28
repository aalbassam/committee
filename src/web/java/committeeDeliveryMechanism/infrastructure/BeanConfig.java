package committeeDeliveryMechanism.infrastructure;

import sa.gov.sfd.committee.actions.committee.*;

import sa.gov.sfd.committee.actions.employee.GetEmployeesList;
import sa.gov.sfd.committee.actions.formedCommittee.AddNewFormedCommittee;
import sa.gov.sfd.committee.actions.formedCommittee.GetAllFormedCommittees;
import sa.gov.sfd.committee.actions.formedCommittee.GetFormedCommitteeDetailByNO;
import sa.gov.sfd.committee.actions.member.AddMemberToFormedCommittee;
import sa.gov.sfd.committee.actions.member.GetAllMembersByFormationNO;
import sa.gov.sfd.committee.actions.memberRole.AddNewMemberRole;
import sa.gov.sfd.committee.actions.memberRole.GetAllMemberRoles;
import sa.gov.sfd.committee.core.committee.CommitteeEntity;
import sa.gov.sfd.committee.core.committee.CommitteeRepository;
import sa.gov.sfd.committee.core.committee.CommitteeService;

import sa.gov.sfd.committee.core.employee.EmployeeRepository;
import sa.gov.sfd.committee.core.employee.EmployeeService;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeRepository;
import sa.gov.sfd.committee.core.formedCommittee.FormedCommitteeService;
import sa.gov.sfd.committee.core.member.MemberRepository;
import sa.gov.sfd.committee.core.member.MemberService;
import sa.gov.sfd.committee.core.memberRole.MemberRoleRepository;
import sa.gov.sfd.committee.core.memberRole.MemberRoleService;
import sa.gov.sfd.committee.infrastructure.*;
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
        return new CommitteeRepositoryImp(jdbcTemplate());
    }

    @Bean
    public FormedCommitteeRepository formedCommitteeRepository() {
        return new FormedCommitteeRepositoryImp(jdbcTemplate());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemberRepositoryImp(jdbcTemplate());
    }

    @Bean
    public MemberRoleRepository memberRoleRepository() {
        return new MemberRoleRepositoryImp(jdbcTemplate());
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
    public FormedCommitteeService formedCommitteeService() {
        return new FormedCommitteeService(formedCommitteeRepository());
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRoleService memberRoleService() {
        return new MemberRoleService(memberRoleRepository());
    }

    @Bean
    public EmployeeService employeeService() {
        return new EmployeeService(employeeRepository());
    }


    //---------------ACTIONS---------------------
    @Bean
    public GetAllFormedCommittees getAllFormedCommittees() {
        return new GetAllFormedCommittees(formedCommitteeService());
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
    public GetFormedCommitteeDetailByNO getFormedCommitteeDetailByNO() {
        return new GetFormedCommitteeDetailByNO(formedCommitteeService());
    }

    @Bean
    public AddNewMemberRole addNewMemberRole() {
        return new AddNewMemberRole(memberRoleService());
    }

    @Bean
    public AddNewFormedCommittee addNewFormedCommittee() {
        return new AddNewFormedCommittee(formedCommitteeService());
    }

    @Bean
    public AddMemberToFormedCommittee addMemberToFormedCommittee() {
        return new AddMemberToFormedCommittee(memberService());
    }

    @Bean
    public GetAllMemberRoles getAllMemberRoles() {
        return new GetAllMemberRoles(memberRoleService());
    }

    @Bean
    public GetEmployeesList getEmployeesList() {
        return new GetEmployeesList(employeeService());
    }

    @Bean
    public AddNewCommittee addNewCommittee() {
        return new AddNewCommittee(committeeService());
    }

    @Bean
    public GetAllMembersByFormationNO getAllMembersByFormationNO() {
        return new GetAllMembersByFormationNO(memberService());
    }


}