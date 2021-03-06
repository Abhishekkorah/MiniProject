package com.in28minutes.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.microservices.model.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{
	
	ExchangeValue findByFromAndTo(String from, String to);
}
