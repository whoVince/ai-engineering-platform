package com.example.repository;

import com.example.entity.UsageEstimate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsageEstimateRepository extends JpaRepository<UsageEstimate, Long> {
    java.util.Optional<UsageEstimate> findByGenerationRunId(Long generationRunId);
}
