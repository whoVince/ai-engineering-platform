package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "generation_run")
public class GenerationRun {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long projectId;
    private String requirementsSnapshot;
    private String status;
    private Instant startedAt;
    private Instant completedAt;

    public GenerationRun() {
    }

    public GenerationRun(Long projectId, String requirementsSnapshot) {
        this.projectId = projectId;
        this.requirementsSnapshot = requirementsSnapshot;
        this.status = "RUNNING";
        this.startedAt = Instant.now();
    }

    public Long getId() { return id; }
    public Long getProjectId() { return projectId; }
    public String getRequirementsSnapshot() { return requirementsSnapshot; }
    public String getStatus() { return status; }
    public Instant getStartedAt() { return startedAt; }
    public Instant getCompletedAt() { return completedAt; }
    public void complete(String nextStatus) { this.status = nextStatus; this.completedAt = Instant.now(); }
}
