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

@Schema(name = "EngineeringProjectRequestDto", description = "A portfolio project definition and its lifecycle.")
public class EngineeringProjectRequestDto {

    @Schema(name = "id", example = "123e4567-e89b-12d3-a456-426614174000", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_ONLY)

    @NotNull(message = "Campo obrigatorio")

    private Long id;

    @Schema(name = "name", example = "valor-exemplo", requiredMode = Schema.RequiredMode.REQUIRED, minLength = 3, maxLength = 120)

    @NotNull(message = "Campo obrigatorio")

    @Size(min = 3, max = 120)

    private String name;

    @Schema(name = "description", example = "texto de exemplo", requiredMode = Schema.RequiredMode.REQUIRED)

    @NotNull(message = "Campo obrigatorio")

    private String description;

    @Schema(name = "status", example = "valor-exemplo", requiredMode = Schema.RequiredMode.REQUIRED, allowableValues = {"DRAFT", "IN_REVIEW", "APPROVED", "ARCHIVED"})

    @NotNull(message = "Campo obrigatorio")

    private String status;

    @Schema(name = "createdAt", example = "2026-08-05T14:30:00Z", requiredMode = Schema.RequiredMode.REQUIRED, accessMode = Schema.AccessMode.READ_ONLY)

    @NotNull(message = "Campo obrigatorio")

    private Instant createdAt;

}
