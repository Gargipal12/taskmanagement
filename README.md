# Task Management Backend Service

A production-ready RESTful backend API for task lifecycle management built with Spring Boot, following clean layered architecture and stateless REST conventions.

## Live Deployment

Base URL:
https://taskmanagement-production-739e.up.railway.app

Example Endpoint:
https://taskmanagement-production-739e.up.railway.app/api/tasks

## Tech Stack
| Technology | Purpose |
|-----------|---------|
| Java 21 | Core language |
| Spring Boot 3.x | Backend framework |
| Spring Data JPA | Database ORM |
| Hibernate | JPA implementation |
| H2 Database | In-memory testing |
| MySQL | future Production database support |
| Maven | Build tool |

## API Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/tasks | Get all tasks |
| GET | /api/tasks/{id} | Get task by ID |
| POST | /api/tasks | Create new task |
| PUT | /api/tasks/{id} | Update task |
| DELETE | /api/tasks/{id} | Delete task |
| GET | /api/tasks/status/{status} | Filter tasks by status |

## Architecture
Controller - Service - Repository - Database

- Controller — Handles incoming HTTP requests and returns responses
- Service — Contains business logic and orchestrates operations
- Repository — Manages all database interactions via Spring Data JPA

## Task Model
- id — Auto-generated unique identifier
- title — Task name (required)
- description — Task details
- status — PENDING / IN_PROGRESS / COMPLETED
- dueDate — Task deadline

## Database Configuration
- H2 — In-memory database used for testing, auto-configured with no setup required
- MySQL — Persistent production database, data retained across restarts

## Running the Project
1. Clone the repository
2. Open in IntelliJ IDEA
3. Run TaskmanagerApplication.java
4. API available at http://localhost:8081/api/tasks

## Testing
All endpoints tested via Postman with full CRUD operations verified including create, read, update, delete and status-based filtering.
