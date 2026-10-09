package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "generated_artifact")
public class GeneratedArtifact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long generationRunId;
    private String path;
    private String kind;
    private String contentHash;
    private String validationStatus;
    private String content;

    public GeneratedArtifact() {
    }

    public GeneratedArtifact(Long generationRunId, String path, String kind, String contentHash, String content) {
        this.generationRunId = generationRunId;
        this.path = path;
        this.kind = kind;
        this.contentHash = contentHash;
        this.content = content;
        this.validationStatus = "PASSED";
    }

    public Long getId() { return id; }
    public Long getGenerationRunId() { return generationRunId; }
    public String getPath() { return path; }
    public String getKind() { return kind; }
    public String getContentHash() { return contentHash; }
    public String getValidationStatus() { return validationStatus; }
    public String getContent() { return content; }
}
