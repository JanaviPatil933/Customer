package com.customer.app.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.app.Customer;
import com.customer.app.repository.CustomerRepository;

@Service

public class CustomerServiceImpl implements CustomerService {
	
	
	@Autowired
	public CustomerRepository customerRepository;
	
	
	public CustomerServiceImpl() {
		
		
		
	}
	
	
	
	
	//List<Customer> customerList;
 

	 

	@Override
	public Customer createCustomer(Customer customer) {
		// customerList.add(customer);
		
		 customerRepository.save(customer);
		 return customer;
	}
	
	
	

	@Override
	public List<Customer> getCustomer() {
		 
		return customerRepository.findAll();
	}

	
	
 

 
	@Override
	public Customer getCustomer(Long customerId) {
	 
	 
	 
	 //Customer c = null;
	 //for (Customer customer:customerList) {
		// if (customer.getcustomerId()== id) {
			// c=customer;
		//	 break;
	//	 }
	// }
	 
		return customerRepository. findById(customerId).get();
	}
	 

	
	
	@Override
	public Customer updateCustomer(Customer customer) {
		
//		customerList.forEach(e ->{
	//		if (e.getcustomerId() == customerId.getcustomerId()) {
		//		e.setCustomerName(customerId.getCustomerName());
			//	e.setDateOfBirth( customerId.getDateOfBirth());
				//e.setGender(customerId.getGender());
			//	e.setPhoneNumber(customerId.getPhoneNumber());
			//}
		//});
		 customerRepository.save(customer);
		return customer;
	}



	@SuppressWarnings("deprecation")
	@Override
	public void deleteCustomer(Long customerId) {
//		customerList =this.customerList.stream().filter(e -> e.getcustomerId()!=customerId).collect( Collectors.toList());
         Customer Entity = customerRepository.getOne(customerId);
         customerRepository.delete(Entity);

	}




	@Override
	public Optional<Customer> getBycustomerId(long customerId) {
		 return customerRepository.findById( customerId);
	
	}



 
	 



 
	 
	

}
