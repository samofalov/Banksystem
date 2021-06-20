package com.vcs.banksystem.repositories;
import org.springframework.data.repository.CrudRepository;

import com.vcs.banksystem.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	
}