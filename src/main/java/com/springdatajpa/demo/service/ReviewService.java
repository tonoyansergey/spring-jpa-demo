package com.springdatajpa.demo.service;

import com.springdatajpa.demo.entity.Review;

public interface ReviewService {

    Iterable<Review> getAll();

    Review save(final Review review);
}
