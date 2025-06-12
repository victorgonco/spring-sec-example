# Spring Security POC with HTTP Basic Auth

This project is a simple Proof of Concept (POC) demonstrating how to configure Spring Security using HTTP Basic Authentication with in-memory users and role-based access control.

## Features

- ✅ Spring Boot with Spring Security
- ✅ In-memory user authentication
- ✅ HTTP Basic Authentication
- ✅ Method-level security using `@Secured`
- ✅ REST endpoints protected by authentication
- ✅ Simple role-based access to endpoints

## Endpoints

| Method | Endpoint | Access Control       | Description                    |
|--------|----------|----------------------|--------------------------------|
| GET    | `/`      | Public (no auth)     | Returns success message        |
| POST   | `/`      | Authenticated users  | Requires login via Basic Auth |
| PUT    | `/`      | Authenticated users  | Requires login via Basic Auth |

## Users

Two users are defined in memory:

| Username   | Password | Role       |
|------------|----------|------------|
| `userPost` | `password` | `ROLE_POST` |
| `userPut`  | `password` | `ROLE_PUT`  |

> Note: Passwords are stored in plain text using `{noop}` encoding (for testing purposes only).

## Running the Application

Make sure you have Java 17+ and Maven installed.

```bash
./mvnw spring-boot:run
