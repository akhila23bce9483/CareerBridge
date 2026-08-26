# CareerBridge API

## Skills
`GET /api/skills` — list skills
`POST /api/skills` — create a skill

## Roles
`GET /api/roles` — list target roles
`POST /api/roles` — create a role

## Users
`GET /api/users` — list users
`POST /api/users` — create a user

## Career analysis
`GET /api/career/analyze/{userId}/{roleId}`

Returns the target role, match percentage, ordered skill gaps, and a personalized roadmap.

Example:
```json
{
  "user": "Demo Student",
  "targetRole": "Java Backend Developer",
  "matchPercent": 55.6,
  "skillGaps": [],
  "roadmap": []
}
```
