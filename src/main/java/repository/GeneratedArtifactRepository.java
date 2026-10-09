package com.example.repository;

import com.example.entity.GeneratedArtifact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneratedArtifactRepository extends JpaRepository<GeneratedArtifact, Long> {
    java.util.List<GeneratedArtifact> findByGenerationRunIdOrderByPath(Long generationRunId);
}
