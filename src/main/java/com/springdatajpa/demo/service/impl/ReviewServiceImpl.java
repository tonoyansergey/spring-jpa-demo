package com.springdatajpa.demo.service.impl;

import com.springdatajpa.demo.entity.Review;
import com.springdatajpa.demo.repository.ReviewRepository;
import com.springdatajpa.demo.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;

    @Override
    public Iterable<Review> getAll() {
        return reviewRepository.findAll();
    }

    @Override
    public Review save(final Review review) {
        return reviewRepository.save(review);
    }
}
