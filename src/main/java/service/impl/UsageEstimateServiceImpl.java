package com.example.service.impl;

import com.example.repository.UsageEstimateRepository;
import com.example.service.UsageEstimateService;
import org.springframework.stereotype.Service;

@Service
public class UsageEstimateServiceImpl implements UsageEstimateService {
    private final UsageEstimateRepository repository;

    public UsageEstimateServiceImpl(UsageEstimateRepository repository) {
        this.repository = repository;
    }
}
