package main.service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import main.pojo.Customers;
import main.repository.CustomerRepository;

@Service("serviceClass")
public class ServiceClass {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	DataSource dataSource;

	@Autowired
	CustomerRepository customerRepo;

	public void getDatabaseRecords() {

		Customers customer = new Customers();
		customer.setCustName("ABC");
		customer.setCustAddress("AAAA");

		customerRepo.save(customer);

	}

}
