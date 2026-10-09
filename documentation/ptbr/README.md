# AI Engineering Platform

Plataforma de engenharia de software assistida por IA. O sistema transforma requisitos estruturados em uma execução de geração rastreável, artefatos técnicos revisáveis, decisão humana e estimativa de uso.

## Objetivo

O projeto não executa código gerado automaticamente. Cada artefato é tratado como dado não confiável, recebe hash e status de validação, e só pode avançar após revisão humana.

## Fluxo do MVP

1. Criar um projeto em `POST /api/projects`.
2. Iniciar uma geração em `POST /api/projects/{id}/generations`.
3. O provider fake cria README, arquitetura, contrato de API e schema SQL.
4. Consultar a geração em `GET /api/generations/{id}`.
5. Aprovar ou solicitar alterações em `POST /api/generations/{id}/review`.
6. Consultar tokens e custo pela resposta da geração e pela camada de persistência.

## Arquitetura

- Backend: Java 21, Spring Boot, Spring Web, Spring Data JPA e Spring Security.
- Persistência local: H2 em memória.
- Persistência de ambiente: PostgreSQL com Flyway.
- Frontend: React, TypeScript e Vite.
- Provider: geração fake determinística para desenvolvimento e testes.
- Segurança: HTTP Basic no MVP, com credenciais fornecidas por variáveis de ambiente.

O fluxo principal é:

`EngineeringProject -> GenerationRun -> GeneratedArtifact -> ReviewDecision + UsageEstimate`

## Executar localmente

Requisitos: Java 21, Maven, Node.js e npm.

```powershell
$env:FORGEFLOW_ADMIN_USERNAME = "admin"
$env:FORGEFLOW_ADMIN_PASSWORD = "admin-local-123"
mvn spring-boot:run
```

Em outro terminal:

```powershell
Set-Location frontend
npm install
npm run dev
```

Backend: `http://localhost:8080`  
Frontend: `http://localhost:5174`  
OpenAPI: `http://localhost:8080/swagger-ui.html`  
Health: `http://localhost:8080/actuator/health`

## Testes e qualidade

```powershell
mvn --batch-mode test
Set-Location frontend
npm run build
```

## Segurança e limitações

- Nunca inclua senhas, chaves de provedores ou dados reais no repositório.
- Artefatos gerados não devem ser executados pelo processo da API.
- A validação atual é básica e determinística; um worker isolado ainda é necessário para produção.
- O provider fake deve ser substituído por um adaptador LLM explícito e auditável.
- Antes de publicar em produção, configure gestão de segredos, PostgreSQL, observabilidade e autorização granular.

Veja o contrato detalhado em [api.md](./api.md).
