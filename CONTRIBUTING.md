# Contributing

1. Create a focused branch from `develop`.
2. Keep domain logic independent from infrastructure concerns.
3. Add or update tests with each behavior change.
4. Do not commit secrets, real personal data, generated `dist/` files, or local databases.
5. Update the relevant documentation and roadmap entry.
6. Run `mvn test` and `npm run build` before opening a pull request.

Pull requests should explain the trade-off behind the change and identify any deferred work.
