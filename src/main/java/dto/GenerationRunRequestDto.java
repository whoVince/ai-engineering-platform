package com.example.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

@Schema(name = "GenerationRunRequestDto", description = "An immutable execution of the generation workflow.")
public class GenerationRunRequestDto {

    @Schema(name = "id", example = "123e4567-e89b-12d3-a456-426614174000", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_ONLY)

    @NotNull(message = "Campo obrigatorio")

    private Long id;

    @Schema(name = "projectId", example = "123e4567-e89b-12d3-a456-426614174000", requiredMode = Schema.RequiredMode.REQUIRED)

    @NotNull(message = "Campo obrigatorio")

    private Long projectId;

    @Schema(name = "requirementsSnapshot", example = "texto de exemplo", requiredMode = Schema.RequiredMode.REQUIRED)

    @NotNull(message = "Campo obrigatorio")

    private String requirementsSnapshot;

    @Schema(name = "status", example = "valor-exemplo", requiredMode = Schema.RequiredMode.REQUIRED, allowableValues = {"QUEUED", "RUNNING", "SUCCEEDED", "FAILED"})

    @NotNull(message = "Campo obrigatorio")

    private String status;

    @Schema(name = "startedAt", example = "2026-08-05T14:30:00Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)

    private Instant startedAt;

    @Schema(name = "completedAt", example = "2026-08-05T14:30:00Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)

    private Instant completedAt;

}
