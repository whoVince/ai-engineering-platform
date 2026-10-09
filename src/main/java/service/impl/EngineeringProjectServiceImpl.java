package com.example.service.impl;

import com.example.repository.EngineeringProjectRepository;
import com.example.service.EngineeringProjectService;
import org.springframework.stereotype.Service;

@Service
public class EngineeringProjectServiceImpl implements EngineeringProjectService {
    private final EngineeringProjectRepository repository;

    public EngineeringProjectServiceImpl(EngineeringProjectRepository repository) {
        this.repository = repository;
    }
}
