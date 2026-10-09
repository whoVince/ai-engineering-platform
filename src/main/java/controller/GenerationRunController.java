package com.example.controller;

import com.example.dto.GenerationRunRequestDto;
import com.example.dto.GenerationRunResponseDto;
import com.example.service.GenerationRunService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/generationrun")
@Tag(name = "Generation", description = "An immutable execution of the generation workflow.")

@SecurityRequirement(name = "bearerAuth")


public class GenerationRunController {
    private final GenerationRunService service;

    public GenerationRunController(GenerationRunService service) {
        this.service = service;
    }

    @GetMapping

    @PreAuthorize("isAuthenticated()")

    @Operation(summary = "Listar GenerationRun", description = "An immutable execution of the generation workflow.  Objetivo: Listar.  Fluxo de negocio: Fluxo principal do dominio nao informado.  Permissoes: Requer autenticacao JWT.  Tags: Generation  Request: Filtros e ordenacao para GenerationRun.  Response: Colecao de GenerationRun.  Possiveis erros: 400 para dados invalidos; 404 quando o recurso nao existir; 409 para conflitos de regra de negocio.  Exemplos: request {\n  \'projectId\': \'123e4567-e89b-12d3-a456-426614174000\',\n  \'requirementsSnapshot\': \'texto de exemplo\',\n  \'status\': \'valor-exemplo\',\n  \'startedAt\': \'2026-08-05T14:30:00Z\',\n  \'completedAt\': \'2026-08-05T14:30:00Z\'\n} | response {\n  \'id\': \'123e4567-e89b-12d3-a456-426614174000\',\n  \'projectId\': \'123e4567-e89b-12d3-a456-426614174000\',\n  \'requirementsSnapshot\': \'texto de exemplo\',\n  \'status\': \'valor-exemplo\',\n  \'startedAt\': \'2026-08-05T14:30:00Z\',\n  \'completedAt\': \'2026-08-05T14:30:00Z\'\n}  Status HTTP: 200 OK  Observacoes: Documentacao gerada automaticamente a partir da modelagem do dominio.  Casos de uso: Start an isolated generation, Retry a failed generation, Inspect generation diagnostics  Regras de negocio: Sem regras adicionais informadas.")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Lista de GenerationRun retornada com sucesso.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GenerationRunResponseDto.class))),
        @ApiResponse(responseCode = "400", description = "Requisicao invalida"),
        @ApiResponse(responseCode = "401", description = "Nao autenticado")
    })
    public String list() {
        return "list GenerationRun";
    }

    @GetMapping("/{id}")

    @PreAuthorize("isAuthenticated()")

    @Operation(summary = "Buscar GenerationRun por id", description = "An immutable execution of the generation workflow.  Objetivo: Buscar.  Fluxo de negocio: Fluxo principal do dominio nao informado.  Permissoes: Requer autenticacao JWT.  Tags: Generation  Request: Identificador do recurso.  Response: Detalhes de GenerationRun.  Possiveis erros: 400 para dados invalidos; 404 quando o recurso nao existir; 409 para conflitos de regra de negocio.  Exemplos: request {\n  \'projectId\': \'123e4567-e89b-12d3-a456-426614174000\',\n  \'requirementsSnapshot\': \'texto de exemplo\',\n  \'status\': \'valor-exemplo\',\n  \'startedAt\': \'2026-08-05T14:30:00Z\',\n  \'completedAt\': \'2026-08-05T14:30:00Z\'\n} | response {\n  \'id\': \'123e4567-e89b-12d3-a456-426614174000\',\n  \'projectId\': \'123e4567-e89b-12d3-a456-426614174000\',\n  \'requirementsSnapshot\': \'texto de exemplo\',\n  \'status\': \'valor-exemplo\',\n  \'startedAt\': \'2026-08-05T14:30:00Z\',\n  \'completedAt\': \'2026-08-05T14:30:00Z\'\n}  Status HTTP: 200 OK  Observacoes: Documentacao gerada automaticamente a partir da modelagem do dominio.  Casos de uso: Start an isolated generation, Retry a failed generation, Inspect generation diagnostics  Regras de negocio: Sem regras adicionais informadas.")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "GenerationRun encontrado com sucesso.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GenerationRunResponseDto.class))),
        @ApiResponse(responseCode = "404", description = "Recurso nao encontrado")
    })
    public String findById(@PathVariable String id) {
        return "find GenerationRun by id";
    }

    @PostMapping

    @PreAuthorize("isAuthenticated()")

    @Operation(summary = "Criar GenerationRun", description = "An immutable execution of the generation workflow.  Objetivo: Criar.  Fluxo de negocio: Fluxo principal do dominio nao informado.  Permissoes: Requer autenticacao JWT.  Tags: Generation  Request: Payload de criacao de GenerationRun.  Response: GenerationRun criado.  Possiveis erros: 400 para dados invalidos; 404 quando o recurso nao existir; 409 para conflitos de regra de negocio.  Exemplos: request {\n  \'projectId\': \'123e4567-e89b-12d3-a456-426614174000\',\n  \'requirementsSnapshot\': \'texto de exemplo\',\n  \'status\': \'valor-exemplo\',\n  \'startedAt\': \'2026-08-05T14:30:00Z\',\n  \'completedAt\': \'2026-08-05T14:30:00Z\'\n} | response {\n  \'id\': \'123e4567-e89b-12d3-a456-426614174000\',\n  \'projectId\': \'123e4567-e89b-12d3-a456-426614174000\',\n  \'requirementsSnapshot\': \'texto de exemplo\',\n  \'status\': \'valor-exemplo\',\n  \'startedAt\': \'2026-08-05T14:30:00Z\',\n  \'completedAt\': \'2026-08-05T14:30:00Z\'\n}  Status HTTP: 201 Created  Observacoes: Documentacao gerada automaticamente a partir da modelagem do dominio.  Casos de uso: Start an isolated generation, Retry a failed generation, Inspect generation diagnostics  Regras de negocio: Sem regras adicionais informadas.")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "GenerationRun criado com sucesso.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GenerationRunResponseDto.class))),
        @ApiResponse(responseCode = "400", description = "Payload invalido"),
        @ApiResponse(responseCode = "409", description = "Conflito de regra de negocio")
    })
    public String create(@RequestBody @Valid GenerationRunRequestDto request) {
        return "create GenerationRun";
    }

    @PutMapping("/{id}")

    @PreAuthorize("isAuthenticated()")

    @Operation(summary = "", description = "")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "", description = "", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GenerationRunResponseDto.class))),
        @ApiResponse(responseCode = "400", description = "Payload invalido"),
        @ApiResponse(responseCode = "404", description = "Recurso nao encontrado")
    })
    public String update(@PathVariable String id, @RequestBody @Valid GenerationRunRequestDto request) {
        return "update GenerationRun";
    }

    @PatchMapping("/{id}")

    @PreAuthorize("isAuthenticated()")

    @Operation(summary = "Atualizar parcialmente GenerationRun", description = "An immutable execution of the generation workflow.  Objetivo: Atualizar parcialmente.  Fluxo de negocio: Fluxo principal do dominio nao informado.  Permissoes: Requer autenticacao JWT.  Tags: Generation  Request: Payload parcial para GenerationRun.  Response: GenerationRun atualizado parcialmente.  Possiveis erros: 400 para dados invalidos; 404 quando o recurso nao existir; 409 para conflitos de regra de negocio.  Exemplos: request {\n  \'projectId\': \'123e4567-e89b-12d3-a456-426614174000\',\n  \'requirementsSnapshot\': \'texto de exemplo\',\n  \'status\': \'valor-exemplo\',\n  \'startedAt\': \'2026-08-05T14:30:00Z\',\n  \'completedAt\': \'2026-08-05T14:30:00Z\'\n} | response {\n  \'id\': \'123e4567-e89b-12d3-a456-426614174000\',\n  \'projectId\': \'123e4567-e89b-12d3-a456-426614174000\',\n  \'requirementsSnapshot\': \'texto de exemplo\',\n  \'status\': \'valor-exemplo\',\n  \'startedAt\': \'2026-08-05T14:30:00Z\',\n  \'completedAt\': \'2026-08-05T14:30:00Z\'\n}  Status HTTP: 200 OK  Observacoes: Documentacao gerada automaticamente a partir da modelagem do dominio.  Casos de uso: Start an isolated generation, Retry a failed generation, Inspect generation diagnostics  Regras de negocio: Sem regras adicionais informadas.")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "GenerationRun atualizado parcialmente com sucesso.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GenerationRunResponseDto.class))),
        @ApiResponse(responseCode = "400", description = "Payload invalido"),
        @ApiResponse(responseCode = "404", description = "Recurso nao encontrado")
    })
    public String patch(@PathVariable String id, @RequestBody @Valid GenerationRunRequestDto request) {
        return "patch GenerationRun";
    }

    @DeleteMapping("/{id}")

    @PreAuthorize("isAuthenticated()")

    @Operation(summary = "Excluir GenerationRun", description = "An immutable execution of the generation workflow.  Objetivo: Excluir.  Fluxo de negocio: Fluxo principal do dominio nao informado.  Permissoes: Requer autenticacao JWT.  Tags: Generation  Request: Identificador do recurso a ser removido.  Response: Resposta sem conteudo.  Possiveis erros: 400 para dados invalidos; 404 quando o recurso nao existir; 409 para conflitos de regra de negocio.  Exemplos: request {\n  \'projectId\': \'123e4567-e89b-12d3-a456-426614174000\',\n  \'requirementsSnapshot\': \'texto de exemplo\',\n  \'status\': \'valor-exemplo\',\n  \'startedAt\': \'2026-08-05T14:30:00Z\',\n  \'completedAt\': \'2026-08-05T14:30:00Z\'\n} | response {\n  \'id\': \'123e4567-e89b-12d3-a456-426614174000\',\n  \'projectId\': \'123e4567-e89b-12d3-a456-426614174000\',\n  \'requirementsSnapshot\': \'texto de exemplo\',\n  \'status\': \'valor-exemplo\',\n  \'startedAt\': \'2026-08-05T14:30:00Z\',\n  \'completedAt\': \'2026-08-05T14:30:00Z\'\n}  Status HTTP: 204 No Content  Observacoes: Documentacao gerada automaticamente a partir da modelagem do dominio.  Casos de uso: Start an isolated generation, Retry a failed generation, Inspect generation diagnostics  Regras de negocio: Sem regras adicionais informadas.")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "204", description = "GenerationRun removido com sucesso."),
        @ApiResponse(responseCode = "404", description = "Recurso nao encontrado")
    })
    public String delete(@PathVariable String id) {
        return "delete GenerationRun";
    }
}
