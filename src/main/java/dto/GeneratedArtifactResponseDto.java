package com.example.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Schema(name = "GeneratedArtifactResponseDto", description = "A source file, contract, schema, or documentation artifact from a generation run.")
public class GeneratedArtifactResponseDto {

    @Schema(name = "id", example = "123e4567-e89b-12d3-a456-426614174000", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    @Schema(name = "generationRunId", example = "123e4567-e89b-12d3-a456-426614174000", requiredMode = Schema.RequiredMode.REQUIRED)
    private Long generationRunId;

    @Schema(name = "path", example = "valor-exemplo", requiredMode = Schema.RequiredMode.REQUIRED)
    private String path;

    @Schema(name = "kind", example = "valor-exemplo", requiredMode = Schema.RequiredMode.REQUIRED, allowableValues = {"SOURCE", "API_CONTRACT", "DATABASE_SCHEMA", "DOCUMENTATION"})
    private String kind;

    @Schema(name = "contentHash", example = "valor-exemplo", requiredMode = Schema.RequiredMode.REQUIRED)
    private String contentHash;

    @Schema(name = "validationStatus", example = "valor-exemplo", requiredMode = Schema.RequiredMode.REQUIRED, allowableValues = {"PENDING", "PASSED", "FAILED", "SKIPPED"})
    private String validationStatus;

}
