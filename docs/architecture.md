# CareerBridge Architecture

```text
Browser
  ↓
REST Controllers
  ↓
Service Layer
  ↓
Spring Data JPA Repositories
  ↓
MySQL
```

## Intelligence layer
The MVP uses explainable weighted skill-gap logic. Each target skill is compared with the user's skill set. Missing skills receive a gap score and are sorted to create the learning roadmap.

The design keeps AI optional. A future `AiRecommendationService` can extract skills from resumes, summarize job descriptions, generate interview questions, and evaluate free-text answers while the deterministic engine remains the fallback.

## Why this architecture
- Controllers handle HTTP only.
- Services contain business rules and are unit-testable.
- Repositories isolate persistence.
- MySQL stores normalized users, skills, roles, resources and interview history.
