package com.springdatajpa.demo.repository;

import com.springdatajpa.demo.entity.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long> {

}
