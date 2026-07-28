# 🔐 Secure Task Management Backend

A secure RESTful backend application built with **Spring Boot** featuring **JWT Authentication**, **Spring Security**, and complete task management APIs. The project follows a clean layered architecture and demonstrates authentication, authorization, and REST API development.

## 🚀 Live Demo

**Live API:** https://taskmanagement-i92t.onrender.com

**GitHub Repository:** https://github.com/Gargipal12/taskmanagement

> **Note:** This is a backend API. Test the endpoints using Postman or any REST client.

---

## ✨ Features

- JWT Authentication & Authorization
- Secure User Registration & Login
- BCrypt Password Encryption
- Task CRUD Operations
- Task Status Filtering
- RESTful API Design
- Layered Architecture (Controller → Service → Repository)
- Dockerized & Cloud Deployed on Render

---

## 🛠️ Tech Stack

- Java 21
- Spring Boot
- Spring Security
- JWT
- Spring Data JPA
- Hibernate
- H2 Database
- Maven
- Docker
- Render
- Postman

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

Application runs at:

```
http://localhost:8081
```

---

## 🧪 Testing

The application has been tested using Postman for:

- User Registration
- User Login
- JWT Authentication
- Task CRUD Operations
- Status-based Task Filtering

---

## 📈 Upcoming Improvements

- PostgreSQL Integration
- User-specific Task Management
- Swagger/OpenAPI Documentation
- Refresh Tokens
- Role-Based Authorization
- Unit & Integration Testing

---

## 👩‍💻 Author

**Gargi Pal**

Backend Developer | Java | Spring Boot | Spring Security | REST APIs
