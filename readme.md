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

Make sure you have Java 21+ and Maven installed.

`bash`
./mvnw spring-boot:run

## Running with Docker

First, you'll need to build the Docker image. Make sure you have Docker installed and running.

1.  **Build the Docker image:**
    Navigate to the root directory of the project (where the `Dockerfile` is located) and run the following command:  
    `docker build -t [your-username]/[the-image-name]:[the-version]`
2.  **Run the Docker image:**
    This command will run a container detached.  
    Note that the [container-port] must be the same as the informed in Dockerfile EXPOSE field.  
    `docker run -p [docker-host-port]:[container-port] --name [container-name] -d [your-dockerhub-user-name]/[image-name]:[version]`  

    <br>Example: `docker run -p 8080:3000 --name spring-sec-poc-api-container -d goncodev/spring-security-poc-api:1.0`

    