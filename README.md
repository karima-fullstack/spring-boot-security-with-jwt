# Spring Security with JWT Authentication

## Overview

This project is a **Spring Boot** application implementing **JWT-based authentication** with **Spring Security**. It provides user authentication, authorization, and role-based access control using JSON Web Tokens (JWT). Additionally, the application sends **email confirmations** upon user registration.

## Features

- User authentication using **Spring Security & JWT**.
- Role-based access control (RBAC) for **admin and user roles**.
- Secure API endpoints with authentication and authorization.
- **JPA Auditing** enabled for tracking entity creation and modification timestamps.
- **Asynchronous processing** using `@EnableAsync`.
- **Email confirmation** upon user registration.

## Technologies Used

- **Spring Boot 3+**
- **Spring Security**
- **JWT (JSON Web Tokens)**
- **Spring Data JPA**
- **Spring Mail (JavaMailSender) for email confirmation**
- **H2 / PostgreSQL / MySQL (Configurable)**
- **Maven**

## Prerequisites

- **Java 17+**
- **Maven**
- **Postman** (For API testing)

## Installation & Running

### 1️⃣ Clone the Repository

```sh
    git clone https://github.com/karima-fullstack/spring-security-jwt.git
    cd spring-security-jwt
```

### 2️⃣ Build & Run the Application

```sh
    mvn clean install
    mvn spring-boot:run
```

### 3️⃣ API Endpoints

| Method | Endpoint                     | Description                                    |
| ------ | ---------------------------- | ---------------------------------------------- |
| POST   | `/api/auth/register`         | Register a new user (sends email confirmation) |
| POST   | `/api/auth/`autenticate      | Authenticate and get JWT token                 |
| GET    | `/api/auth/`activate-account | Activate user account                          |
|        |                              |                                                |

### 4️⃣ Testing Authentication

- Use **Postman** to test authentication.
- Obtain a JWT token by logging in.
- Add the token to the `Authorization` header (`Bearer <TOKEN>`) when accessing secured routes.

## Configuration

### Application Properties (`application.yml` or `application.properties`)

Modify database settings:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/mydb
spring.datasource.username=root
spring.datasource.password=yourpassword
```

Configure email settings:

```properties
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=your-email@gmail.com
spring.mail.password=your-email-password
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
```

## Security Implementation

1. **JWT Token Generation & Validation**
2. **Custom UserDetailsService for authentication**
3. **Spring Security Filters to intercept requests**
4. **Role-based access using @PreAuthorize**
5. **Email confirmation upon registration**

## Future Enhancements

- Refresh tokens for improved security.
- OAuth2 integration with Google and Facebook.
- Docker support for containerization.
- Resend email confirmation feature.

## Author

**Karima** 🚀
