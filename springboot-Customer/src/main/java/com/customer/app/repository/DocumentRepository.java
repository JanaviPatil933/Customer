package com.customer.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.app.Document;

public interface DocumentRepository extends JpaRepository<Document, Long> {

}
