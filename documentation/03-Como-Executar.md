# 03. Como Executar - AI Engineering Platform

## PrÃ©-requisitos
- Java 21
- Maven
- Node.js
- Docker
- Git

## Passo a passo
1. Copie `.env.example` para `.env` e altere os valores locais.
2. Suba o PostgreSQL e a aplicaÃ§Ã£o com Docker Compose.
3. Execute o frontend em `frontend/`.
4. Valide os testes e o build.

## Comandos tÃ­picos
```bash
java -version
mvn --version
node --version
docker compose up --build
cd frontend && npm install && npm run dev
mvn --batch-mode test
```

