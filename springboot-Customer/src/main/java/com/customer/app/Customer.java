package com.customer.app;

 
 

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

 
 @Entity
 @Table (name = "customer")
 
 
    public class Customer {
	 
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	 
	private Long customerId;
	
	@Column (name ="customer_name")
	private String customerName;
	
	@Column (name ="date_of_birth")
	private String dateOfBirth;
    
	@Column (name="gender")
	private String gender;
	
	@Column (unique= true)
	private String phoneNumber;
	
	
	@OneToMany(mappedBy ="customer" , cascade = CascadeType.ALL)
	 private List<Document> documentList = new ArrayList<>();
   
	 
	public Customer() {
		
	}
	
	

	public Customer(Long customerId, String customerName, String dateOfBirth, String gender, String phoneNumber) {
		super();
		
		this.customerId = customerId;
		this.customerName = customerName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		 
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	 

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", dateOfBirth=" + dateOfBirth
				+ ", gender=" + gender + ", phoneNumber=" + phoneNumber + "]";
	}

	 
}
