package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "usage_estimate")
public class UsageEstimate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long generationRunId;
    private Long inputTokens;
    private Long outputTokens;
    private BigDecimal estimatedCost;
    private String currency;

    public UsageEstimate() {
    }

    public UsageEstimate(Long generationRunId, Long inputTokens, Long outputTokens, BigDecimal estimatedCost, String currency) {
        this.generationRunId = generationRunId;
        this.inputTokens = inputTokens;
        this.outputTokens = outputTokens;
        this.estimatedCost = estimatedCost;
        this.currency = currency;
    }

    public Long getId() { return id; }
    public Long getGenerationRunId() { return generationRunId; }
    public Long getInputTokens() { return inputTokens; }
    public Long getOutputTokens() { return outputTokens; }
    public BigDecimal getEstimatedCost() { return estimatedCost; }
    public String getCurrency() { return currency; }
}
