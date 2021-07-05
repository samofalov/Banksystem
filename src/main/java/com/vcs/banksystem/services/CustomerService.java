package com.vcs.banksystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcs.banksystem.model.Customer;
import com.vcs.banksystem.repositories.CustomerRepository;

@Service
public class CustomerService {
	
	private CustomerRepository repository;
	
	@Autowired
	public CustomerService(CustomerRepository repository) {
		this.repository = repository;
		System.out.println("Repository was injected into CustomerService");
	}
	
	public List<Customer> getAllCustomers(){
		
		List<Customer> allCustomers = (List<Customer>) repository.findAll();	
		
		return allCustomers;
	}
	
	public Customer addNewCustomer(Customer customer) {
		
		// TODO: check for SQL exceptions
		Customer savedCustomerInstance = repository.save(customer);
		
		return savedCustomerInstance;
	}
	
}
