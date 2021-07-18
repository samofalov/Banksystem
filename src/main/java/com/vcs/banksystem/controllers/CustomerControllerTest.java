package com.vcs.banksystem.controllers;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import com.vcs.banksystem.model.Customer;

@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
class CustomerControllerTest {

	@Autowired
	CustomerController customerController;
	
	@LocalServerPort
	private int port;
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
	void contextLoadsSuccessfullyForCustomerController() {
		// 1. Preparation
		// 2. Execution
		// 3. Assertion
		
		assertThat(customerController).isNotNull();
	}
	
	@Test
	void customerListIsRetrievedSuccessfully() {
		// 1. Preparation
		
		
		// 2. Execution
		// List<Customer> customers = customerController.getCustomerList();
		String customers = restTemplate.getForObject("http://localhost:" + port + "/getList/", String.class);
		
		System.out.println(customers);
		
		// 3. Assertion
		assertThat(customers.length() > 0);
		
	}

}
