package com.springdatajpa.demo.service.impl;

import com.springdatajpa.demo.entity.Reviewer;
import com.springdatajpa.demo.repository.ReviewerRepository;
import com.springdatajpa.demo.service.ReviewerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReviewerServiceImpl implements ReviewerService {

    private final ReviewerRepository reviewerRepository;

    @Override
    public Iterable<Reviewer> getAll() {
        return reviewerRepository.findAll();
    }

    @Override
    public Reviewer save(final Reviewer reviewer) {
        return reviewerRepository.save(reviewer);
    }
}
