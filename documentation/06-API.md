# 06. API - AI Engineering Platform

## Estrutura esperada
- Controllers para entrada da API.
- Services para regras de negÃ³cio.
- Repositories para persistÃªncia.
- DTOs para transferÃªncia de dados.

## Recursos principais
- Entidades geradas: EngineeringProject, GenerationRun, GeneratedArtifact, ReviewDecision, UsageEstimate
- Endpoints CRUD e filtros por atributo.
- Tratamento de erros com respostas estruturadas.

## AutenticaÃ§Ã£o e documentaÃ§Ã£o
- JWT ou autenticaÃ§Ã£o equivalente.
- Swagger/OpenAPI com exemplos e descriÃ§Ãµes.

### EngineeringProject
- MÃ³dulo: Project Management
- DescriÃ§Ã£o: A portfolio project definition and its lifecycle.
- Contexto de negÃ³cio: NÃ£o informado.
- Objetivo: NÃ£o informado.
- Casos de uso: Create a project from structured requirements; Review project history; Archive a project
- Campo id: Sem descriÃ§Ã£o | Exemplo: N/A
- Campo name: Sem descriÃ§Ã£o | Exemplo: N/A
- Campo description: Sem descriÃ§Ã£o | Exemplo: N/A
- Campo status: Sem descriÃ§Ã£o | Exemplo: N/A
- Campo createdAt: Sem descriÃ§Ã£o | Exemplo: N/A

### GenerationRun
- MÃ³dulo: Generation
- DescriÃ§Ã£o: An immutable execution of the generation workflow.
- Contexto de negÃ³cio: NÃ£o informado.
- Objetivo: NÃ£o informado.
- Casos de uso: Start an isolated generation; Retry a failed generation; Inspect generation diagnostics
- Campo id: Sem descriÃ§Ã£o | Exemplo: N/A
- Campo projectId: Sem descriÃ§Ã£o | Exemplo: N/A
- Campo requirementsSnapshot: Sem descriÃ§Ã£o | Exemplo: N/A
- Campo status: Sem descriÃ§Ã£o | Exemplo: N/A
- Campo startedAt: Sem descriÃ§Ã£o | Exemplo: N/A
- Campo completedAt: Sem descriÃ§Ã£o | Exemplo: N/A

### GeneratedArtifact
- MÃ³dulo: Artifact Review
- DescriÃ§Ã£o: A source file, contract, schema, or documentation artifact from a generation run.
- Contexto de negÃ³cio: NÃ£o informado.
- Objetivo: NÃ£o informado.
- Casos de uso: Browse generated files; Compare artifact versions; Download approved artifacts
- Campo id: Sem descriÃ§Ã£o | Exemplo: N/A
- Campo generationRunId: Sem descriÃ§Ã£o | Exemplo: N/A
- Campo path: Sem descriÃ§Ã£o | Exemplo: N/A
- Campo kind: Sem descriÃ§Ã£o | Exemplo: N/A
- Campo contentHash: Sem descriÃ§Ã£o | Exemplo: N/A
- Campo validationStatus: Sem descriÃ§Ã£o | Exemplo: N/A

### ReviewDecision
- MÃ³dulo: Artifact Review
- DescriÃ§Ã£o: Human approval decision required before generated artifacts are accepted.
- Contexto de negÃ³cio: NÃ£o informado.
- Objetivo: NÃ£o informado.
- Casos de uso: Approve a generation; Request changes; Reject untrusted artifacts
- Campo id: Sem descriÃ§Ã£o | Exemplo: N/A
- Campo generationRunId: Sem descriÃ§Ã£o | Exemplo: N/A
- Campo reviewer: Sem descriÃ§Ã£o | Exemplo: N/A
- Campo decision: Sem descriÃ§Ã£o | Exemplo: N/A
- Campo comment: Sem descriÃ§Ã£o | Exemplo: N/A
- Campo decidedAt: Sem descriÃ§Ã£o | Exemplo: N/A

### UsageEstimate
- MÃ³dulo: Cost & Observability
- DescriÃ§Ã£o: Estimated token usage and operating cost for a generation run.
- Contexto de negÃ³cio: NÃ£o informado.
- Objetivo: NÃ£o informado.
- Casos de uso: Estimate generation cost; Track usage by project; Export cost report
- Campo id: Sem descriÃ§Ã£o | Exemplo: N/A
- Campo generationRunId: Sem descriÃ§Ã£o | Exemplo: N/A
- Campo inputTokens: Sem descriÃ§Ã£o | Exemplo: N/A
- Campo outputTokens: Sem descriÃ§Ã£o | Exemplo: N/A
- Campo estimatedCost: Sem descriÃ§Ã£o | Exemplo: N/A
- Campo currency: Sem descriÃ§Ã£o | Exemplo: N/A

