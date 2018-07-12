package com.alka061.csm.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alka061.csm.spring.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();
}
