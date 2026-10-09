package com.example.repository;

import com.example.entity.ReviewDecision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewDecisionRepository extends JpaRepository<ReviewDecision, Long> {
    java.util.Optional<ReviewDecision> findFirstByGenerationRunIdOrderByDecidedAtDesc(Long generationRunId);
}
