package com.example.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Schema(name = "ReviewDecisionResponseDto", description = "Human approval decision required before generated artifacts are accepted.")
public class ReviewDecisionResponseDto {

    @Schema(name = "id", example = "123e4567-e89b-12d3-a456-426614174000", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    @Schema(name = "generationRunId", example = "123e4567-e89b-12d3-a456-426614174000", requiredMode = Schema.RequiredMode.REQUIRED)
    private Long generationRunId;

    @Schema(name = "reviewer", example = "valor-exemplo", requiredMode = Schema.RequiredMode.REQUIRED)
    private String reviewer;

    @Schema(name = "decision", example = "valor-exemplo", requiredMode = Schema.RequiredMode.REQUIRED, allowableValues = {"PENDING", "APPROVED", "CHANGES_REQUESTED", "REJECTED"})
    private String decision;

    @Schema(name = "comment", example = "texto de exemplo", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
    private String comment;

    @Schema(name = "decidedAt", example = "2026-08-05T14:30:00Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
    private Instant decidedAt;

}
