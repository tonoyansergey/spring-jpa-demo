package com.springdatajpa.demo.controller;

import com.springdatajpa.demo.entity.Review;
import com.springdatajpa.demo.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/review")
public class ReviewController {

    private final ReviewService reviewService;

    @GetMapping
    public Iterable<Review> all() {
        return reviewService.getAll();
    }

    @PostMapping
    public Review save(@RequestBody final Review review) {
        return reviewService.save(review);
    }
}
