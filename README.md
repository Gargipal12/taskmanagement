# 📋 Task Management Backend Service

A production-ready RESTful backend API for task lifecycle management built with Spring Boot.

## 🚀 Tech Stack
| Technology | Purpose |
|-----------|---------|
| Java 21 | Core language |
| Spring Boot 3.x | Backend framework |
| Spring Data JPA | Database ORM |
| Hibernate | JPA implementation |
| H2 Database | In-memory testing |
| MySQL | Production database |
| Maven | Build tool |

## 📌 API Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/tasks | Get all tasks |
| GET | /api/tasks/{id} | Get task by ID |
| POST | /api/tasks | Create new task |
| PUT | /api/tasks/{id} | Update task |
| DELETE | /api/tasks/{id} | Delete task |
| GET | /api/tasks/status/{status} | Filter by status |

## 🏗️ Architecture
Controller → Service → Repository → Database

- **Controller** — Handles HTTP requests
- **Service** — Business logic
- **Repository** — Database operations via JPA

## 📊 Task Model
- `id` — Auto-generated unique ID
- `title` — Task name (required)
- `description` — Task details
- `status` — PENDING / IN_PROGRESS / COMPLETED
- `dueDate` — Deadline

## 🗄️ Database Setup
- **H2** — In-memory database for testing (auto-configured)
- **MySQL** — Production database

## ▶️ How To Run
1. Clone the repo
2. Open in IntelliJ IDEA
3. Run `TaskmanagerApplication.java`
4. API available at `http://localhost:8081/api/tasks`

## ✅ Tested With
All endpoints tested via Postman with full CRUD operations verified.
