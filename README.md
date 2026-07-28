# 🚀 Secure Task Management API

A secure RESTful Task Management API built with **Spring Boot**, **Spring Security**, **JWT Authentication**, and **Swagger/OpenAPI**. The project demonstrates secure authentication, task management, and clean backend architecture.

🌐 **Live Demo:** https://taskmanagement-i92t.onrender.com

📂 **Repository:** https://github.com/Gargipal12/taskmanagement

---

## ✨ Features

- 🔐 JWT Authentication & Authorization
- 👤 User Registration & Login
- 📋 Task CRUD Operations
- 🔍 Filter Tasks by Status
- 📖 Swagger/OpenAPI Documentation
- 🔒 BCrypt Password Encryption
- 🐳 Docker Support
- ☁️ Deployed on Render

---

## 🛠️ Tech Stack

- Java 21
- Spring Boot
- Spring Security
- JWT
- Spring Data JPA
- Hibernate
- H2 Database
- Swagger (Springdoc OpenAPI)
- Maven
- Docker
- Render

---

## 🏗️ Architecture

```text
Client
   │
   ▼
Spring Security
   │
   ▼
JWT Filter
   │
   ▼
Controller
   │
   ▼
Service
   │
   ▼
Repository
   │
   ▼
H2 Database
```

---

## 📌 API Endpoints

### Authentication

| Method | Endpoint |
|---------|----------|
| POST | `/auth/register` |
| POST | `/auth/login` |

### Tasks

| Method | Endpoint |
|---------|----------|
| GET | `/api/tasks` |
| GET | `/api/tasks/{id}` |
| POST | `/api/tasks` |
| PUT | `/api/tasks/{id}` |
| DELETE | `/api/tasks/{id}` |
| GET | `/api/tasks/status/{status}` |

---

## ▶️ Run Locally

```bash
git clone https://github.com/Gargipal12/taskmanagement.git
cd taskmanagement
./mvnw spring-boot:run
```

Swagger UI:

```
http://localhost:8081/swagger-ui/index.html
```

---

## 📷 Screenshots

> Add these after pushing the project.

- Swagger Home
- User Login
- JWT Authorization
- Create Task

---

## 🚀 Next Improvements

- PostgreSQL
- User-specific Tasks
- Role-Based Access Control
- Refresh Tokens
- Pagination & Sorting

---

## 👩‍💻 Author

**Gargi Pal**

Backend Developer | Java | Spring Boot | Spring Security
