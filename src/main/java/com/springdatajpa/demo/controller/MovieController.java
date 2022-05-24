package com.springdatajpa.demo.controller;

import com.springdatajpa.demo.entity.Movie;
import com.springdatajpa.demo.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/movie")
public class MovieController {

    private final MovieService movieService;

    @GetMapping
    public Iterable<Movie> all() {
        return movieService.getAll();
    }

    @PostMapping
    public Movie save(@RequestBody final Movie movie) {
        return movieService.save(movie);
    }
}
