package com.alka061.csm.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alka061.csm.spring.dao.CustomerDAO;
import com.alka061.csm.spring.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//inject DAO into customer controller
	@Autowired
	private CustomerDAO customerDAO;
	
	@RequestMapping("/list")
	public String listCustomers(Model model) {
		
		//get customers from the DAO
		List<Customer> customers = customerDAO.getcustomers();
		// add the customers to the model
		model.addAttribute("customers", customers);
		
		return "list-customers";
	}

}
