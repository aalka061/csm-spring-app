package com.alka061.csm.spring.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.alka061.csm.spring.entity.Customer;


@Repository
public class CustomerDAOImpl implements CustomerDAO {

	//need to inject hibernate session factory
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Transactional
	public List<Customer> getcustomers() {
		//get current hiberante session
		Session currentSession = sessionFactory.getCurrentSession();
		// create query
		List<Customer> customers = currentSession.createQuery("from Customer").list();
		
		
		return customers;
		
		// get list of customers from the query by excuting it
		
		// return list of customers that are retrieved
	}

}
