# API do MVP

Todos os endpoints de negócio exigem HTTP Basic. O usuário e a senha são definidos por `FORGEFLOW_ADMIN_USERNAME` e `FORGEFLOW_ADMIN_PASSWORD`.

## Criar projeto

`POST /api/projects`

```json
{
  "name": "Minha API",
  "description": "Projeto de exemplo"
}
```

## Listar projetos

`GET /api/projects`

## Iniciar geração

`POST /api/projects/{projectId}/generations`

```json
{
  "requirements": "Criar uma API documentada com revisão humana"
}
```

A resposta contém o run, quatro artefatos, hash SHA-256 e status `PASSED`. O custo é estimado a partir do tamanho de entrada e saída.

## Consultar geração

`GET /api/generations/{runId}`

## Registrar revisão

`POST /api/generations/{runId}/review`

```json
{
  "reviewer": "whoVince",
  "decision": "APPROVED",
  "comment": "Artefatos revisados"
}
```

Decisões aceitas: `APPROVED` e `CHANGES_REQUESTED`.

## Códigos de resposta

- `200`: consulta ou revisão concluída.
- `201`: projeto ou geração criada.
- `400`: JSON inválido, campo obrigatório ausente ou regra inválida.
- `401`: autenticação ausente ou inválida.
- `404`: projeto ou geração não encontrada.
