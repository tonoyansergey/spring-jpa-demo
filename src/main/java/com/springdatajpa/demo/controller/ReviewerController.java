package com.springdatajpa.demo.controller;

import com.springdatajpa.demo.entity.Reviewer;
import com.springdatajpa.demo.service.ReviewerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reviewer")
public class ReviewerController {

    private final ReviewerService reviewerService;

    @GetMapping
    public Iterable<Reviewer> all() {
        return reviewerService.getAll();
    }

    @PostMapping
    public Reviewer create(@RequestBody final Reviewer reviewer) {
        return reviewerService.save(reviewer);
    }
}
