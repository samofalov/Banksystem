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
	
	@RequestMapping("/viewAll")
	public String addNewCustomer(Model model) {

		model.addAttribute("customers", service.getAllCustomers());
		
		return "AllCustomers";
	}

    @GetMapping("/addCustomer")
    public String addBookView(Model model) {
        model.addAttribute("customer", new Customer());
        return "AddCustomer";
    }

    @PostMapping("/addCustomer")
    public RedirectView addBook(@ModelAttribute("customer") Customer customer, RedirectAttributes redirectAttributes) {
        
        service.addCustomer(customer);
        // redirectAttributes.addFlashAttribute("savedCustomer", savedCustomer);
        // redirectAttributes.addFlashAttribute("addCustomerSuccess", true);
        
        final RedirectView redirectView = new RedirectView("/viewAll", true);
        
        return redirectView;
    } 
}
