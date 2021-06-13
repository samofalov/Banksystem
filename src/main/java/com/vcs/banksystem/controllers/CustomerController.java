package com.vcs.banksystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vcs.banksystem.model.Customer;
import com.vcs.banksystem.services.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@RequestMapping("/getList")
	public List<Customer> getCustomerList() {

		List<Customer> customers = service.getAllCustomers();

		return customers;
	}

}
