# AI Engineering Platform

An AI-assisted software engineering platform that turns structured requirements into a traceable generation run, reviewable technical artifacts, a human decision, and a usage estimate.

## Purpose

The application never executes generated code automatically. Every artifact is treated as untrusted data, receives a hash and validation status, and can only move forward through a human review checkpoint.

## MVP workflow

1. Create a project with `POST /api/projects`.
2. Start a generation with `POST /api/projects/{id}/generations`.
3. The fake provider creates a README, architecture document, API contract, and SQL schema.
4. Retrieve a run with `GET /api/generations/{id}`.
5. Approve or request changes with `POST /api/generations/{id}/review`.
6. Use the generation response and persisted usage estimate to inspect tokens and cost.

## Architecture

- Backend: Java 21, Spring Boot, Spring Web, Spring Data JPA, and Spring Security.
- Local persistence: in-memory H2.
- Environment persistence: PostgreSQL with Flyway.
- Frontend: React, TypeScript, and Vite.
- Provider: deterministic fake generation provider for development and tests.
- Security: HTTP Basic for the MVP, with credentials supplied through environment variables.

The core flow is:

`EngineeringProject -> GenerationRun -> GeneratedArtifact -> ReviewDecision + UsageEstimate`

## Run locally

Requirements: Java 21, Maven, Node.js, and npm.

```powershell
$env:FORGEFLOW_ADMIN_USERNAME = "admin"
$env:FORGEFLOW_ADMIN_PASSWORD = "admin-local-123"
mvn spring-boot:run
```

In another terminal:

```powershell
Set-Location frontend
npm install
npm run dev
```

Backend: `http://localhost:8080`  
Frontend: `http://localhost:5174`  
OpenAPI: `http://localhost:8080/swagger-ui.html`  
Health: `http://localhost:8080/actuator/health`

## Tests and quality

```powershell
mvn --batch-mode test
Set-Location frontend
npm run build
```

## Security and limitations

- Never commit passwords, provider keys, or real data.
- Generated artifacts must not be executed by the API process.
- Current validation is basic and deterministic; production requires an isolated worker.
- The fake provider must be replaced by an explicit, auditable LLM adapter.
- Before production deployment, configure secret management, PostgreSQL, observability, and granular authorization.

See the detailed contract in [api.md](./api.md).
