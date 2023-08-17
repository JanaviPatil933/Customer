package com.customer.app;

 

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
 
 

@Table( name = "document")


public class Document {
	
 
	
	 @Id
	 
	 
	 
	 @Column(name = "document_id")
	 private long documentId;
	 
	 @Column (name ="document_type")
	 private String documentType;
	 
	 @Column (name = " date_of_issue")
	 private String dateOfIssue;
	 
	 @Column (name ="date_of_expiry")
	 private String dateOfExpiry;
	 
	 @Column (name = "issueing_authority")
	 private String issueingAuthority;
	 
	 
	 // Many to one mapping is used by joining customer_id column
	 
	 
	  @ManyToOne
	  @JoinColumn(name= "customer_id" , nullable=false)
	  
	  private Customer customer;
	  
	 
	      public Document() {
		      super();
	    }
	
	

	  public Document( long documentId, String documentType, String dateOfIssue, String dateOfExpiry,
			String issueingAuthority) {
		super();
		//this.customerId = customerId;
		this.documentId = documentId;
		this.documentType = documentType;
		this.dateOfIssue = dateOfIssue;
		this.dateOfExpiry = dateOfExpiry;
		this.issueingAuthority = issueingAuthority;
	}

	  
   // public long getCustomerId() {
   // 	return customerId;
   // }
    
	  
	public long getDocumentId() {
		return documentId;
	}

	public void setDocumentId(long documentId) {
		this.documentId = documentId;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(String dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public String getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public String getIssueingAuthority() {
		return issueingAuthority;
	}

	public void setIssueingAuthority(String issueingAuthority) {
		this.issueingAuthority = issueingAuthority;
	}



	@Override
	public String toString() {
		return "Document [ documentId=" + documentId + ", documentType=" + documentType
				+ ", dateOfIssue=" + dateOfIssue + ", dateOfExpiry=" + dateOfExpiry + ", issueingAuthority="
				+ issueingAuthority + ", customer=" + customer + "]";
	}



	 

	 
	 


}
