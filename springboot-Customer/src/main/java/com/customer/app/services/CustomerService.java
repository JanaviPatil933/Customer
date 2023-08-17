package com.customer.app.services;

 
import java.util.List;
import java.util.Optional;

import com.customer.app.Customer;

public interface CustomerService {

	 

	 
	
    public Customer createCustomer (Customer customer);
    
    public List<Customer> getCustomer();
    
	public Customer getCustomer(Long customerId);
	
	public Customer updateCustomer (Customer customer);

    public  void deleteCustomer(Long customerId);

	public Optional<Customer> getBycustomerId(long customerId);
	
	 }
	


