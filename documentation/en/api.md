# MVP API

All business endpoints require HTTP Basic. The username and password are configured with `FORGEFLOW_ADMIN_USERNAME` and `FORGEFLOW_ADMIN_PASSWORD`.

## Create a project

`POST /api/projects`

```json
{
  "name": "My API",
  "description": "Example project"
}
```

## List projects

`GET /api/projects`

## Start a generation

`POST /api/projects/{projectId}/generations`

```json
{
  "requirements": "Create a documented API with human review"
}
```

The response contains the run, four generated artifacts, a SHA-256 hash, and validation status `PASSED`. Cost is estimated from input and output size.

## Retrieve a generation

`GET /api/generations/{runId}`

## Submit a review

`POST /api/generations/{runId}/review`

```json
{
  "reviewer": "whoVince",
  "decision": "APPROVED",
  "comment": "Artifacts reviewed"
}
```

Accepted decisions are `APPROVED` and `CHANGES_REQUESTED`.

## Response codes

- `200`: query or review completed.
- `201`: project or generation created.
- `400`: invalid JSON, missing required field, or invalid rule.
- `401`: missing or invalid authentication.
- `404`: project or generation not found.
