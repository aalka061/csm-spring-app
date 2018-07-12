package com.alka061.csm.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alka061.csm.spring.dao.CustomerDAO;
import com.alka061.csm.spring.entity.Customer;
import com.alka061.csm.spring.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//inject DAO into customer controller
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/list")
	public String listCustomers(Model model) {
		
		//get customers from the service
		List<Customer> customers = customerService.getCustomers();
		// add the customers to the model
		model.addAttribute("customers", customers);
		
		return "list-customers";
	}

}
