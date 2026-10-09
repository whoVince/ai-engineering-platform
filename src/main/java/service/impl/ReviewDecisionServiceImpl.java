package com.example.service.impl;

import com.example.repository.ReviewDecisionRepository;
import com.example.service.ReviewDecisionService;
import org.springframework.stereotype.Service;

@Service
public class ReviewDecisionServiceImpl implements ReviewDecisionService {
    private final ReviewDecisionRepository repository;

    public ReviewDecisionServiceImpl(ReviewDecisionRepository repository) {
        this.repository = repository;
    }
}
