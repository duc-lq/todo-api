# Todo List API - Demo
This is a simple REST API built with Spring Boot (Spring Web) and containerized with Docker

## How to run locally?
### Option 1: Build from Source
1. Clone repo: gh repo clone duc-lq/todo-api
2. Build Docker image: docker build -t todo-api .
3. Run container: docker run -p 8080:8080 todo-api
4. Test (use Postman with the collection in src/main/resources/):
- GET - http://localhost:8080/todos
- POST - http://localhost:8080/todos with body {"task":"Clone repo"}
- POST - http://localhost:8080/todos with body {"task":"Build docker image"}
- POST - http://localhost:8080/todos with body {"task":"Run container"}
- POST - http://localhost:8080/todos with body {"task":"Test API"}
- DELETE - http://localhost:8080/todos/{id} - for example: http://localhost:8080/todos/3 

### Option 2: Pull from Docker Hub
1. Pull the image: docker pull duclq/todo-api:latest
2. Run container: docker run -p 8080:8080 duclq/todo-api:latest
3. Test (same as above)

# CI/CD
This project is set up with automated CI/CD pipelines to build and deploy the Docker image to Docker Hub. Two methods are implemented:
## 1. GitHub Actions
- Tool: GitHub Actions
- Config: Check ".github/workflows/ci-cd.yml" in source folder for more information
- Steps:
  - Builds with Java 17
  - Packages the app
  - Push to Docker Hub

## 2. Jenkins
- Tool: Jenkins (pipeline runs on Windows)
- Config: Check "Jenkins" file
- Steps:
  - Checks out code from 'main' branch
  - Builds with Maven and Java 17
  - Builds and pushes to Docker Hub
