package com.example.repository;

import com.example.entity.GenerationRun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenerationRunRepository extends JpaRepository<GenerationRun, Long> {
    java.util.List<GenerationRun> findByProjectIdOrderByStartedAtDesc(Long projectId);
}
