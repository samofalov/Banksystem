package com.vcs.banksystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.vcs.banksystem.model.Customer;
import com.vcs.banksystem.services.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@RequestMapping("/getList")
	public @ResponseBody List<Customer> getCustomerList() {

		List<Customer> customers = service.getAllCustomers();

		return customers;
	}
	
	@RequestMapping("/viewList")
	public String viewAllCustomers() {
		
		List<Customer> customers = service.getAllCustomers();
		// TODO: use list

		return "ViewAllCustomers";
	}
}
