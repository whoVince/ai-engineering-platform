package com.example.service.impl;

import com.example.repository.GenerationRunRepository;
import com.example.service.GenerationRunService;
import org.springframework.stereotype.Service;

@Service
public class GenerationRunServiceImpl implements GenerationRunService {
    private final GenerationRunRepository repository;

    public GenerationRunServiceImpl(GenerationRunRepository repository) {
        this.repository = repository;
    }
}
