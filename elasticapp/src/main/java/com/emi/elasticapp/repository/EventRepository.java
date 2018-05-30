package com.emi.elasticapp.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.emi.elasticapp.model.Event;

public interface EventRepository extends ElasticsearchRepository<Event, String> {
 
	public Page<Event> findByName(String name,Pageable pageable);
}