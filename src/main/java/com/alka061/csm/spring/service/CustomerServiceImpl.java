package com.alka061.csm.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alka061.csm.spring.dao.CustomerDAO;
import com.alka061.csm.spring.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	//need to inject customerDAO
	@Autowired
	private CustomerDAO customerDAO;
	
	
	@Transactional
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customerDAO.getcustomers();
	}

}
