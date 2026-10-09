package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "review_decision")
public class ReviewDecision {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long generationRunId;
    private String reviewer;
    private String decision;
    private String comment;
    private Instant decidedAt;

    public ReviewDecision() {
    }

    public ReviewDecision(Long generationRunId, String reviewer, String decision, String comment) {
        this.generationRunId = generationRunId;
        this.reviewer = reviewer;
        this.decision = decision;
        this.comment = comment;
        this.decidedAt = Instant.now();
    }

    public Long getId() { return id; }
    public Long getGenerationRunId() { return generationRunId; }
    public String getReviewer() { return reviewer; }
    public String getDecision() { return decision; }
    public String getComment() { return comment; }
    public Instant getDecidedAt() { return decidedAt; }
}
