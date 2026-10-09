package com.example.service.impl;

import com.example.repository.GeneratedArtifactRepository;
import com.example.service.GeneratedArtifactService;
import org.springframework.stereotype.Service;

@Service
public class GeneratedArtifactServiceImpl implements GeneratedArtifactService {
    private final GeneratedArtifactRepository repository;

    public GeneratedArtifactServiceImpl(GeneratedArtifactRepository repository) {
        this.repository = repository;
    }
}
