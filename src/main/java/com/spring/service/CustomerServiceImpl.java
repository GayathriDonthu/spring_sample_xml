package com.spring.service;

import java.util.List;

import com.spring.model.Customer;
import com.spring.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl(){
		
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository){
		System.out.println("constructor Injection");
		this.customerRepository = customerRepository; 
	}
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("setter injection");
		this.customerRepository = customerRepository;
	}
	
}
