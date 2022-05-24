package com.springdatajpa.demo.service;

import com.springdatajpa.demo.entity.Reviewer;

public interface ReviewerService {

    Iterable<Reviewer> getAll();

    Reviewer save(final Reviewer reviewer);
}
