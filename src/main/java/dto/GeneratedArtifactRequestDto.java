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

@Schema(name = "GeneratedArtifactRequestDto", description = "A source file, contract, schema, or documentation artifact from a generation run.")
public class GeneratedArtifactRequestDto {

    @Schema(name = "id", example = "123e4567-e89b-12d3-a456-426614174000", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_ONLY)

    @NotNull(message = "Campo obrigatorio")

    private Long id;

    @Schema(name = "generationRunId", example = "123e4567-e89b-12d3-a456-426614174000", requiredMode = Schema.RequiredMode.REQUIRED)

    @NotNull(message = "Campo obrigatorio")

    private Long generationRunId;

    @Schema(name = "path", example = "valor-exemplo", requiredMode = Schema.RequiredMode.REQUIRED)

    @NotNull(message = "Campo obrigatorio")

    private String path;

    @Schema(name = "kind", example = "valor-exemplo", requiredMode = Schema.RequiredMode.REQUIRED, allowableValues = {"SOURCE", "API_CONTRACT", "DATABASE_SCHEMA", "DOCUMENTATION"})

    @NotNull(message = "Campo obrigatorio")

    private String kind;

    @Schema(name = "contentHash", example = "valor-exemplo", requiredMode = Schema.RequiredMode.REQUIRED)

    @NotNull(message = "Campo obrigatorio")

    private String contentHash;

    @Schema(name = "validationStatus", example = "valor-exemplo", requiredMode = Schema.RequiredMode.REQUIRED, allowableValues = {"PENDING", "PASSED", "FAILED", "SKIPPED"})

    @NotNull(message = "Campo obrigatorio")

    private String validationStatus;

}
