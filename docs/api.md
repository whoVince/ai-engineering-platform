# AI Engineering Platform

AI-assisted software engineering platform that turns structured requirements into reviewed project specifications, architecture proposals, source artifacts, API contracts, database schemas, and technical documentation. Generated artifacts are untrusted and are validated in isolation before approval.


## OpenAPI

- Title: AI Engineering Platform API
- Version: 0.1.0
- Environments: development
- Entities: 5
- Modules: 4
- Fields: 29
- Relationships: 0

## Security

- JWT enabled: yes
- OAuth2 enabled: no
- Read scope: read
- Write scope: read
- Public paths: /auth/**, /swagger-ui/**, /swagger-ui.html, /v3/api-docs/**, /actuator/health


## Servidores


- `http://localhost:8080`: Local development


## Catalogo de Endpoints


### EngineeringProject

- Modulo: Project Management
- Base path: `/engineeringproject`
- Listar: Listar EngineeringProject
- Buscar: Buscar EngineeringProject por id
- Criar: Criar EngineeringProject
- Atualizar: <built-in method update of dict object at 0x000002094C9CF540>
- Atualizar parcialmente: Atualizar parcialmente EngineeringProject
- Excluir: Excluir EngineeringProject


### GenerationRun

- Modulo: Generation
- Base path: `/generationrun`
- Listar: Listar GenerationRun
- Buscar: Buscar GenerationRun por id
- Criar: Criar GenerationRun
- Atualizar: <built-in method update of dict object at 0x000002094C9CDFC0>
- Atualizar parcialmente: Atualizar parcialmente GenerationRun
- Excluir: Excluir GenerationRun


### GeneratedArtifact

- Modulo: Artifact Review
- Base path: `/generatedartifact`
- Listar: Listar GeneratedArtifact
- Buscar: Buscar GeneratedArtifact por id
- Criar: Criar GeneratedArtifact
- Atualizar: <built-in method update of dict object at 0x000002094C9CEC80>
- Atualizar parcialmente: Atualizar parcialmente GeneratedArtifact
- Excluir: Excluir GeneratedArtifact


### ReviewDecision

- Modulo: Artifact Review
- Base path: `/reviewdecision`
- Listar: Listar ReviewDecision
- Buscar: Buscar ReviewDecision por id
- Criar: Criar ReviewDecision
- Atualizar: <built-in method update of dict object at 0x000002094C9CF700>
- Atualizar parcialmente: Atualizar parcialmente ReviewDecision
- Excluir: Excluir ReviewDecision


### UsageEstimate

- Modulo: Cost & Observability
- Base path: `/usageestimate`
- Listar: Listar UsageEstimate
- Buscar: Buscar UsageEstimate por id
- Criar: Criar UsageEstimate
- Atualizar: <built-in method update of dict object at 0x000002094C9CFBC0>
- Atualizar parcialmente: Atualizar parcialmente UsageEstimate
- Excluir: Excluir UsageEstimate



## Endpoints por entidade


### EngineeringProject

- Modulo: Project Management
- Descricao: A portfolio project definition and its lifecycle.
- Contexto de negocio: Nao informado
- Objetivo: Nao informado
- Tags: Project Management

#### Campos


- `id` (UUID): Sem descricao | Exemplo: "123e4567-e89b-12d3-a456-426614174000" | Obrigatorio: sim | Validacoes: @NotNull(message = "Campo obrigatorio")

- `name` (String): Sem descricao | Exemplo: "valor-exemplo" | Obrigatorio: sim | Validacoes: @NotNull(message = "Campo obrigatorio"), @Size(min = 3, max = 120)

- `description` (Text): Sem descricao | Exemplo: "texto de exemplo" | Obrigatorio: sim | Validacoes: @NotNull(message = "Campo obrigatorio")

- `status` (String): Sem descricao | Exemplo: "valor-exemplo" | Obrigatorio: sim | Validacoes: @NotNull(message = "Campo obrigatorio")

- `createdAt` (Instant): Sem descricao | Exemplo: "2026-08-05T14:30:00Z" | Obrigatorio: sim | Validacoes: @NotNull(message = "Campo obrigatorio")


#### Relacionamentos


- Nenhum relacionamento documentado.


#### Operacoes

- `GET /engineeringproject`: Listar EngineeringProject
- `GET /engineeringproject/{id}`: Buscar EngineeringProject por id
- `POST /engineeringproject`: Criar EngineeringProject
- `PUT /engineeringproject/{id}`:
- `PATCH /engineeringproject/{id}`: Atualizar parcialmente EngineeringProject
- `DELETE /engineeringproject/{id}`: Excluir EngineeringProject

#### Regras de negocio


- Nenhuma regra adicional informada.


#### Casos de uso



- Create a project from structured requirements

- Review project history

- Archive a project



#### Exemplos de utilizacao


- Nenhum exemplo adicional informado.


### GenerationRun

- Modulo: Generation
- Descricao: An immutable execution of the generation workflow.
- Contexto de negocio: Nao informado
- Objetivo: Nao informado
- Tags: Generation

#### Campos


- `id` (UUID): Sem descricao | Exemplo: "123e4567-e89b-12d3-a456-426614174000" | Obrigatorio: sim | Validacoes: @NotNull(message = "Campo obrigatorio")

- `projectId` (UUID): Sem descricao | Exemplo: "123e4567-e89b-12d3-a456-426614174000" | Obrigatorio: sim | Validacoes: @NotNull(message = "Campo obrigatorio")

- `requirementsSnapshot` (Text): Sem descricao | Exemplo: "texto de exemplo" | Obrigatorio: sim | Validacoes: @NotNull(message = "Campo obrigatorio")

- `status` (String): Sem descricao | Exemplo: "valor-exemplo" | Obrigatorio: sim | Validacoes: @NotNull(message = "Campo obrigatorio")

- `startedAt` (Instant): Sem descricao | Exemplo: "2026-08-05T14:30:00Z" | Obrigatorio: nao

- `completedAt` (Instant): Sem descricao | Exemplo: "2026-08-05T14:30:00Z" | Obrigatorio: nao


#### Relacionamentos


- Nenhum relacionamento documentado.


#### Operacoes

- `GET /generationrun`: Listar GenerationRun
- `GET /generationrun/{id}`: Buscar GenerationRun por id
- `POST /generationrun`: Criar GenerationRun
- `PUT /generationrun/{id}`:
- `PATCH /generationrun/{id}`: Atualizar parcialmente GenerationRun
- `DELETE /generationrun/{id}`: Excluir GenerationRun

#### Regras de negocio


- Nenhuma regra adicional informada.


#### Casos de uso



- Start an isolated generation

- Retry a failed generation

- Inspect generation diagnostics



#### Exemplos de utilizacao


- Nenhum exemplo adicional informado.


### GeneratedArtifact

- Modulo: Artifact Review
- Descricao: A source file, contract, schema, or documentation artifact from a generation run.
- Contexto de negocio: Nao informado
- Objetivo: Nao informado
- Tags: Artifact Review

#### Campos


- `id` (UUID): Sem descricao | Exemplo: "123e4567-e89b-12d3-a456-426614174000" | Obrigatorio: sim | Validacoes: @NotNull(message = "Campo obrigatorio")

- `generationRunId` (UUID): Sem descricao | Exemplo: "123e4567-e89b-12d3-a456-426614174000" | Obrigatorio: sim | Validacoes: @NotNull(message = "Campo obrigatorio")

- `path` (String): Sem descricao | Exemplo: "valor-exemplo" | Obrigatorio: sim | Validacoes: @NotNull(message = "Campo obrigatorio")

- `kind` (String): Sem descricao | Exemplo: "valor-exemplo" | Obrigatorio: sim | Validacoes: @NotNull(message = "Campo obrigatorio")

- `contentHash` (String): Sem descricao | Exemplo: "valor-exemplo" | Obrigatorio: sim | Validacoes: @NotNull(message = "Campo obrigatorio")

- `validationStatus` (String): Sem descricao | Exemplo: "valor-exemplo" | Obrigatorio: sim | Validacoes: @NotNull(message = "Campo obrigatorio")


#### Relacionamentos


- Nenhum relacionamento documentado.


#### Operacoes

- `GET /generatedartifact`: Listar GeneratedArtifact
- `GET /generatedartifact/{id}`: Buscar GeneratedArtifact por id
- `POST /generatedartifact`: Criar GeneratedArtifact
- `PUT /generatedartifact/{id}`:
- `PATCH /generatedartifact/{id}`: Atualizar parcialmente GeneratedArtifact
- `DELETE /generatedartifact/{id}`: Excluir GeneratedArtifact

#### Regras de negocio


- Nenhuma regra adicional informada.


#### Casos de uso



- Browse generated files

- Compare artifact versions

- Download approved artifacts



#### Exemplos de utilizacao


- Nenhum exemplo adicional informado.


### ReviewDecision

- Modulo: Artifact Review
- Descricao: Human approval decision required before generated artifacts are accepted.
- Contexto de negocio: Nao informado
- Objetivo: Nao informado
- Tags: Artifact Review

#### Campos


- `id` (UUID): Sem descricao | Exemplo: "123e4567-e89b-12d3-a456-426614174000" | Obrigatorio: sim | Validacoes: @NotNull(message = "Campo obrigatorio")

- `generationRunId` (UUID): Sem descricao | Exemplo: "123e4567-e89b-12d3-a456-426614174000" | Obrigatorio: sim | Validacoes: @NotNull(message = "Campo obrigatorio")

- `reviewer` (String): Sem descricao | Exemplo: "valor-exemplo" | Obrigatorio: sim | Validacoes: @NotNull(message = "Campo obrigatorio")

- `decision` (String): Sem descricao | Exemplo: "valor-exemplo" | Obrigatorio: sim | Validacoes: @NotNull(message = "Campo obrigatorio")

- `comment` (Text): Sem descricao | Exemplo: "texto de exemplo" | Obrigatorio: nao

- `decidedAt` (Instant): Sem descricao | Exemplo: "2026-08-05T14:30:00Z" | Obrigatorio: nao


#### Relacionamentos


- Nenhum relacionamento documentado.


#### Operacoes

- `GET /reviewdecision`: Listar ReviewDecision
- `GET /reviewdecision/{id}`: Buscar ReviewDecision por id
- `POST /reviewdecision`: Criar ReviewDecision
- `PUT /reviewdecision/{id}`:
- `PATCH /reviewdecision/{id}`: Atualizar parcialmente ReviewDecision
- `DELETE /reviewdecision/{id}`: Excluir ReviewDecision

#### Regras de negocio


- Nenhuma regra adicional informada.


#### Casos de uso



- Approve a generation

- Request changes

- Reject untrusted artifacts



#### Exemplos de utilizacao


- Nenhum exemplo adicional informado.


### UsageEstimate

- Modulo: Cost & Observability
- Descricao: Estimated token usage and operating cost for a generation run.
- Contexto de negocio: Nao informado
- Objetivo: Nao informado
- Tags: Cost & Observability

#### Campos


- `id` (UUID): Sem descricao | Exemplo: "123e4567-e89b-12d3-a456-426614174000" | Obrigatorio: sim | Validacoes: @NotNull(message = "Campo obrigatorio")

- `generationRunId` (UUID): Sem descricao | Exemplo: "123e4567-e89b-12d3-a456-426614174000" | Obrigatorio: sim | Validacoes: @NotNull(message = "Campo obrigatorio")

- `inputTokens` (Long): Sem descricao | Exemplo: 1 | Obrigatorio: sim | Validacoes: @NotNull(message = "Campo obrigatorio")

- `outputTokens` (Long): Sem descricao | Exemplo: 1 | Obrigatorio: sim | Validacoes: @NotNull(message = "Campo obrigatorio")

- `estimatedCost` (BigDecimal): Sem descricao | Exemplo: 99.9 | Obrigatorio: sim | Validacoes: @NotNull(message = "Campo obrigatorio")

- `currency` (String): Sem descricao | Exemplo: "valor-exemplo" | Obrigatorio: sim | Validacoes: @NotNull(message = "Campo obrigatorio")


#### Relacionamentos


- Nenhum relacionamento documentado.


#### Operacoes

- `GET /usageestimate`: Listar UsageEstimate
- `GET /usageestimate/{id}`: Buscar UsageEstimate por id
- `POST /usageestimate`: Criar UsageEstimate
- `PUT /usageestimate/{id}`:
- `PATCH /usageestimate/{id}`: Atualizar parcialmente UsageEstimate
- `DELETE /usageestimate/{id}`: Excluir UsageEstimate

#### Regras de negocio


- Nenhuma regra adicional informada.


#### Casos de uso



- Estimate generation cost

- Track usage by project

- Export cost report



#### Exemplos de utilizacao


- Nenhum exemplo adicional informado.

