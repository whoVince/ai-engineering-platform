package com.example.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Schema(name = "EngineeringProjectResponseDto", description = "A portfolio project definition and its lifecycle.")
public class EngineeringProjectResponseDto {

    @Schema(name = "id", example = "123e4567-e89b-12d3-a456-426614174000", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    @Schema(name = "name", example = "valor-exemplo", requiredMode = Schema.RequiredMode.REQUIRED, minLength = 3, maxLength = 120)
    private String name;

    @Schema(name = "description", example = "texto de exemplo", requiredMode = Schema.RequiredMode.REQUIRED)
    private String description;

    @Schema(name = "status", example = "valor-exemplo", requiredMode = Schema.RequiredMode.REQUIRED, allowableValues = {"DRAFT", "IN_REVIEW", "APPROVED", "ARCHIVED"})
    private String status;

    @Schema(name = "createdAt", example = "2026-08-05T14:30:00Z", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_ONLY)
    private Instant createdAt;

}
