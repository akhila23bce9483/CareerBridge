# CareerBridge 🚀

CareerBridge is an AI-assisted career intelligence platform for students and early-career developers. It compares a user's skills with target-role requirements, calculates skill gaps, creates a prioritized learning roadmap, recommends resources, and provides mock-interview readiness tracking.

## Core flow
Resume / skills → Skill extraction → Target role → Job requirements → Skill-gap analysis → Learning roadmap → Resources → Mock interview → Readiness score

## MVP
- Skill and target-role management
- Explainable skill-gap scoring
- Prioritized learning roadmap
- Resource recommendations
- Mock interview question bank
- Interview performance and readiness score
- REST API backend
- MySQL persistence

## Technology
Java 17, Spring Boot 3, Spring Data JPA, MySQL, Maven, REST APIs, HTML/CSS/JavaScript. The AI layer is intentionally optional: deterministic matching is the fallback so the product remains usable without an external AI provider.

## Run
1. Create MySQL database using `database/schema.sql`.
2. Set `DB_PASSWORD` and optionally `DB_URL` / `DB_USER`.
3. Run `mvn spring-boot:run`.
4. Open `http://localhost:8080`.

## Interview-ready concepts demonstrated
OOP, collections, REST, layered architecture, JPA relationships, SQL, normalization, validation, exception handling, sorting, weighted scoring, and clean separation between controller/service/repository layers.

## Future versions
Resume PDF parsing, live job-source ingestion, LLM-powered interview evaluation, JWT authentication, React frontend, Docker deployment, analytics, and production monitoring.
