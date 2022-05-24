package com.springdatajpa.demo.service.impl;

import com.springdatajpa.demo.entity.Movie;
import com.springdatajpa.demo.repository.MovieRepository;
import com.springdatajpa.demo.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    @Override
    public Iterable<Movie> getAll() {
        return movieRepository.findAll();
    }

    @Override
    public Movie save(final Movie movie) {
        return movieRepository.save(movie);
    }
}
