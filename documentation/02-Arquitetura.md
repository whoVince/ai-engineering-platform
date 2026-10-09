# 02. Arquitetura - AI Engineering Platform

A arquitetura escolhida para esta geraÃ§Ã£o Ã© **Hexagonal + Clean Architecture**, combinada com princÃ­pios de Clean Architecture e DDD.

## Por que esta arquitetura
- Facilita manutenÃ§Ã£o e evoluÃ§Ã£o.
- Separa responsabilidades por camada.
- Reduz acoplamento e melhora testabilidade.

## Diagrama simplificado
```mermaid
flowchart TD
A[Cliente/UsuÃ¡rio] --> B[API/Frontend]
B --> C[Application Service]
C --> D[Domain]
C --> E[Infrastructure]
E --> F[Banco de Dados]
```

## Responsabilidades das camadas
- Domain: regras de negÃ³cio e entidades.
- Application: casos de uso e orquestraÃ§Ã£o.
- Infrastructure: integraÃ§Ã£o com banco, arquivos e serviÃ§os externos.
- Interface: controllers, endpoints e UI.

## ReferÃªncias oficiais
- Java: https://docs.oracle.com/en/java/
- Spring Boot: https://spring.io/projects/spring-boot
- React: https://react.dev/
- PostgreSQL: https://www.postgresql.org/docs/
- Hibernate: https://hibernate.org/orm/documentation/

