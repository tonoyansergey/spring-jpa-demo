package com.springdatajpa.demo.repository;

import com.springdatajpa.demo.entity.Review;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Review, Long> {

}
