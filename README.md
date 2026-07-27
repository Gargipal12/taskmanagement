# 🔐 Secure Task Management Backend

A production-ready RESTful backend application built with **Spring Boot** featuring **JWT Authentication**, **Spring Security**, secure user registration & login, and complete task management APIs following a clean layered architecture.

---

## 🚀 Live Deployment

**Base URL**

https://taskmanagement-production-739e.up.railway.app

**Current Live Task API**

https://taskmanagement-production-739e.up.railway.app/api/tasks

> **Note:** The GitHub project includes JWT Authentication and Spring Security. Deploy the latest version to Railway to enable the authentication endpoints online.

---

# ✨ Features

- 🔐 JWT Authentication
- 👤 Secure User Registration
- 🔑 Secure User Login
- 🔒 Password Encryption using BCrypt
- ✅ Complete CRUD Operations for Tasks
- 📌 Task Status Filtering
- 🏗️ Layered Architecture (Controller → Service → Repository)
- 🗄️ Database Integration using Spring Data JPA & Hibernate
- 🧪 Tested using Postman

---

# 🛠️ Tech Stack

| Technology | Purpose |
|------------|---------|
| Java 21 | Core Programming Language |
| Spring Boot 3.x | Backend Framework |
| Spring Security | Authentication & Authorization |
| JWT (JSON Web Token) | Secure Authentication |
| Spring Data JPA | Database Access |
| Hibernate | ORM Framework |
| H2 Database | Development & Testing |
| MySQL | Production Database |
| Maven | Dependency Management |
| Postman | API Testing |

---

# 📂 Project Structure

```
src
├── controller
│   ├── AuthController
│   └── TaskController
│
├── dto
│   ├── RegisterRequest
│   ├── LoginRequest
│   └── AuthResponse
│
├── model
│   ├── User
│   ├── Task
│   └── TaskStatus
│
├── repository
│   ├── UserRepository
│   └── TaskRepository
│
├── security
│   ├── JwtService
│   ├── SecurityConfig
│   └── CustomUserDetailsService
│
├── service
│   ├── AuthService
│   └── TaskService
│
└── resources
```

---

# 🔐 Authentication APIs

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | `/auth/register` | Register a new user |
| POST | `/auth/login` | Authenticate user and generate JWT |

---

# 📋 Task APIs

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/api/tasks` | Get all tasks |
| GET | `/api/tasks/{id}` | Get task by ID |
| POST | `/api/tasks` | Create a new task |
| PUT | `/api/tasks/{id}` | Update an existing task |
| DELETE | `/api/tasks/{id}` | Delete a task |
| GET | `/api/tasks/status/{status}` | Filter tasks by status |

---

# 🔄 Authentication Flow

## User Registration

```
Client
   │
   ▼
POST /auth/register
   │
   ▼
Validate Request
   │
   ▼
Check Existing Email
   │
   ▼
Encrypt Password (BCrypt)
   │
   ▼
Save User
   │
   ▼
Generate JWT
   │
   ▼
Return Token
```

---

## User Login

```
Client
   │
   ▼
POST /auth/login
   │
   ▼
Verify Credentials
   │
   ▼
Generate JWT
   │
   ▼
Return Token
```

---

# 🏗️ Architecture

```
Client
   │
   ▼
Spring Security
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
Database
```

### Controller
Handles incoming HTTP requests and returns HTTP responses.

### Service
Contains business logic and coordinates application workflows.

### Repository
Performs database operations using Spring Data JPA.

### Security
Handles authentication, authorization, password encryption, and JWT generation.

---

# 📦 Database

### User

- id
- name
- email
- password (BCrypt Encrypted)

### Task

- id
- title
- description
- status
- dueDate

---

# ▶️ Running the Project

### Clone Repository

```bash
git clone <repository-url>
```

### Open in IntelliJ IDEA

Import as a Maven project.

### Run

Execute

```
TaskmanagerApplication.java
```

Application starts at

```
http://localhost:8081
```

---

# 🧪 Testing

The project has been tested using **Postman**.

### Authentication

- ✅ Register User
- ✅ Login User
- ✅ JWT Token Generation

### Task APIs

- ✅ Create Task
- ✅ Get All Tasks
- ✅ Get Task by ID
- ✅ Update Task
- ✅ Delete Task
- ✅ Filter Tasks by Status

---

# 📌 Future Enhancements

- Refresh Tokens
- Role-Based Authorization (Admin/User)
- Email Verification
- Docker Deployment
- Swagger / OpenAPI Documentation
- PostgreSQL Support
- Unit & Integration Testing

---

## 👩‍💻 Author

**Gargi Pal**

Backend Developer | Java | Spring Boot | Spring Security | REST APIs | JWT Authentication
