package com.customer.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.app.Customer;
import com.customer.app.Document;
import com.customer.app.services.CustomerService;
import com.customer.app.services.DocumentService;

 
@RestController
@RequestMapping


public class CustomerRestController {
	
	@Autowired
    private CustomerService customerService;
	
    @Autowired 
    private DocumentService documentService;
	 
	 
//Create customer
	@PostMapping(path ="/customer")
	
	public ResponseEntity<HttpStatus> createCustomer(@RequestBody Customer customer) {
		this.customerService.createCustomer(customer);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	
// Customer List
	@GetMapping(path = "/customer")
	public List<Customer> getAllCustomer(){
		return this.customerService.getCustomer();
	}
	

    @GetMapping("/customer/{customerId}")
    public ResponseEntity<Customer> getBycustomerId(@PathVariable long customerId) {

        Optional<Customer> customer = customerService.getBycustomerId(customerId);
         
            return new ResponseEntity<>(customer.get(), HttpStatus.OK);
       
    }
	
/* Get the customer  by Id
     @GetMapping(path = "/customer/{customerId}")
     
     public ResponseEntity<HttpStatus> getCustomer(@PathVariable String customerId) {
    	try {
    		 
    		 this.customerService.getCustomer(Long.parseLong(customerId));
    		 return new ResponseEntity<>(HttpStatus.CONTINUE);
    		 
    	 }
    	 
    	 catch(Exception e) {
    		 return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    	 }
     }*/
	
//Update customer details by Id
	 @PutMapping(path = "/customer/{customerId}")
	 
	 public ResponseEntity <HttpStatus> updateCustomer(@RequestBody Customer customer) {
		 try{
			 this.customerService.updateCustomer(customer);
			 return new ResponseEntity<>(HttpStatus.OK);
		 }
		 catch(Exception e) {
			 return new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
		 }
	 }
	 
	
	//Delete the customer by Id
     @DeleteMapping(path = "/customer/{customerId}")
         
   public ResponseEntity<HttpStatus> deleteCustomer(@PathVariable String customerId){
    	  
    	 try {
    		 this.customerService.deleteCustomer(Long.parseLong(customerId));
    		 return new ResponseEntity<>(HttpStatus.OK);
    	 }
    	  catch (Exception e) {
    		  return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    	  }
     }
     
	 
     @PostMapping(path ="/customer/{customerId}/document")

     public ResponseEntity<HttpStatus> createDocument(@RequestBody  Document document) {
	          this.documentService.createDocument(document);
	           return new ResponseEntity<>(HttpStatus.CREATED);
        }


        @GetMapping(path = "/customer/{customerId}/documents")
        
	        public List<Document> getAllDocument(){
 	        return this.documentService.getDocument();
		 
	}
	
	 
}
