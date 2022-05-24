package com.springdatajpa.demo.repository;

import com.springdatajpa.demo.entity.Reviewer;
import org.springframework.data.repository.CrudRepository;

public interface ReviewerRepository extends CrudRepository<Reviewer, Long> {

}
