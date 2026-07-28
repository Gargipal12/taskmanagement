# 🚀 Secure Task Management API

A secure RESTful Task Management API built with **Java 21**, **Spring Boot**, **Spring Security**, and **JWT Authentication**. The application provides secure user authentication and task management through a clean layered architecture. It is documented with **Swagger/OpenAPI**, containerized using **Docker**, and deployed on **Render**.

## 🌐 Live Demo

**API:** https://taskmanagement-i92t.onrender.com

**GitHub:** https://github.com/Gargipal12/taskmanagement

> This is a backend application. APIs can be tested using **Swagger UI** or **Postman**.

---

## ✨ Features

- 🔐 JWT Authentication & Authorization
- 👤 Secure User Registration & Login
- 🔒 BCrypt Password Encryption
- 📋 Task CRUD Operations
- 🔍 Filter Tasks by Status
- 📖 Swagger/OpenAPI Documentation
- 🏗️ Layered Architecture (Controller → Service → Repository)
- 🐳 Docker Support
- ☁️ Deployed on Render

---

## 🛠️ Tech Stack

- Java 21
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
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
Client (Swagger/Postman)
        │
        ▼
Spring Security
        │
        ▼
JWT Authentication Filter
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

## 🔐 Authentication Flow

```text
User Login
     │
     ▼
JWT Generated
     │
     ▼
Client Sends JWT
     │
     ▼
JWT Authentication Filter
     │
     ▼
Spring Security
     │
     ▼
Protected APIs
```

---

## 📌 API Endpoints

### Authentication

| Method | Endpoint |
|--------|----------|
| POST | `/auth/register` |
| POST | `/auth/login` |

### Tasks

| Method | Endpoint |
|--------|----------|
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

Application:

```
http://localhost:8081
```

Swagger UI:

```
http://localhost:8081/swagger-ui/index.html
```

---

## 🧪 Testing

Manually verified via Swagger UI and Postman:
- User registration & login flows
- JWT-protected endpoint access
- Task CRUD operations
- Status-based filtering

Automated test suite (JUnit/Mockito): planned — see Next Improvements

---

## 👩‍💻 Author

**Gargi Pal**

Backend Developer | Java | Spring Boot | Spring Security | REST APIs
