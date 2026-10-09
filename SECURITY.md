# Security Policy

## Scope

AI Engineering Platform is an educational portfolio project. It must not be connected to production systems or supplied with production credentials.

## Reporting a vulnerability

Please do not open a public issue for a suspected vulnerability. Contact the repository owner privately with:

- affected component and version;
- reproducible steps;
- security impact;
- suggested mitigation, if known.

## Design principles

- Generated artifacts are untrusted input.
- Secrets are supplied through environment configuration.
- Validation workers must be isolated and least-privileged.
- Authentication and authorization are required before public deployment.

