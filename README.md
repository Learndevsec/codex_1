# Basic Spring Boot Project

This is a very simple Spring Boot project with two endpoints.

## Requirements
- Java 17+
- Maven 3.9+

## Run
```bash
mvn spring-boot:run
```

## Test
```bash
mvn test
```

## Endpoints
- `GET /api/hello` → `Hello from basic Spring Boot project!`
- `POST /api/hello` with raw body (e.g. `Codex`) → `Hello, Codex!`

Example:
```bash
curl -X POST http://localhost:8080/api/hello -H "Content-Type: text/plain" -d "Codex"
```
