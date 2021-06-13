package com.vcs.banksystem.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.vcs.banksystem.model.Customer;

@Repository
public class CustomerRepository {

	private static List<Customer> customers;
	
	public CustomerRepository() {
		System.out.println("CustomerRepository object was created");
	}
	
	public List<Customer> getAllCustomers() {
		
		return generateExampleList();
	}
	
	// TODO: connect to the database instead of using generation
	public static List<Customer> generateExampleList(){
		
		if(customers == null) {
			customers = new ArrayList<Customer>();
			customers.add(new Customer(1, "Jack", 30));
			customers.add(new Customer(2, "John", 40));
			customers.add(new Customer(3, "Peter", 50));
		}
		
		return customers;
	}
}
