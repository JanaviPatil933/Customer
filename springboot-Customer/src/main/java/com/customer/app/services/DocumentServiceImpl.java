package com.customer.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.app.Document;
import com.customer.app.repository.DocumentRepository;


 @Service
public class DocumentServiceImpl implements DocumentService {
	
	
	
	
	@Autowired
	public DocumentRepository documentRepository;
	
	
	public DocumentServiceImpl() {
		
		
		
	}

	@Override
	public Document createDocument(Document document) {
		 documentRepository.save(document);
		return document;
	}


	@Override
	public List<Document> getDocument() {
		 
		return documentRepository.findAll();
	}

}
