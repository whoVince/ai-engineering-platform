package com.example.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Schema(name = "UsageEstimateResponseDto", description = "Estimated token usage and operating cost for a generation run.")
public class UsageEstimateResponseDto {

    @Schema(name = "id", example = "123e4567-e89b-12d3-a456-426614174000", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    @Schema(name = "generationRunId", example = "123e4567-e89b-12d3-a456-426614174000", requiredMode = Schema.RequiredMode.REQUIRED)
    private Long generationRunId;

    @Schema(name = "inputTokens", example = "1", requiredMode = Schema.RequiredMode.REQUIRED, minimum = "0")
    private Long inputTokens;

    @Schema(name = "outputTokens", example = "1", requiredMode = Schema.RequiredMode.REQUIRED, minimum = "0")
    private Long outputTokens;

    @Schema(name = "estimatedCost", example = "99.9", requiredMode = Schema.RequiredMode.REQUIRED, minimum = "0")
    private BigDecimal estimatedCost;

    @Schema(name = "currency", example = "valor-exemplo", defaultValue = "USD", requiredMode = Schema.RequiredMode.REQUIRED)
    private String currency;

}
