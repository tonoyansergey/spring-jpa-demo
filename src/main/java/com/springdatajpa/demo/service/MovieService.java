package com.springdatajpa.demo.service;

import com.springdatajpa.demo.entity.Movie;


public interface MovieService {

    Iterable<Movie> getAll();

    Movie save(final Movie movie);
}
