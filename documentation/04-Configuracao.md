# 04. ConfiguraÃ§Ã£o - AI Engineering Platform

## Perfis de execuÃ§Ã£o
- `local`: H2 em memÃ³ria para desenvolvimento sem Docker.
- `postgres`: PostgreSQL com Flyway para Docker e ambientes persistentes.

## VariÃ¡veis de ambiente
- `SPRING_PROFILES_ACTIVE`
- `SPRING_DATASOURCE_URL`
- `SPRING_DATASOURCE_USERNAME`
- `SPRING_DATASOURCE_PASSWORD`
- `FORGEFLOW_ADMIN_USERNAME`
- `FORGEFLOW_ADMIN_PASSWORD`

## SeguranÃ§a e observabilidade
- HTTP Basic para a v1, com credenciais fornecidas por variÃ¡veis de ambiente.
- Swagger/OpenAPI habilitado para documentaÃ§Ã£o da API.
- Actuator habilitado para health e informaÃ§Ãµes bÃ¡sicas.
- Docker Compose para ambientes padronizados.

