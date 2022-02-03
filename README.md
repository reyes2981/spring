### Option1

[X] Persist at least **four models** eg: (`Book`, `Author`, `Genre`, `Publisher`) to a PostgreSQL database.
- Use Spring Profiles for environment settings.
- At least one API endpoint must perform full CRUD **create, read, update, and delete actions**.
- Other API endpoints can perform CRUD based on the business use-case.    
- Expose CRUD routes that were built using **REST conventions**.
- **Handle exceptions** gracefully.
- Send appropriate messages back to the client in the event that an exception occurs.
- Must have `Controller` and  `Service` separate.
- Document each end-point, such that

| Request Type | URL| Reqtest Body | 
|--|--|--|
| GET | /api/categories/ | None |

- Stick with the **KISS** (keep it simple, stupid) and **DRY** (don't repeat yourself) principles.
