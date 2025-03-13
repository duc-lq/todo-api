# Todo List API - Demo
This is a simple REST API built with Spring Boot (Spring Web) and containerized with Docker

## How to run this?
1. Clone repo: gh repo clone duc-lq/todo-api
2. Build Docker image: docker build -t todo-api .
3. Run container: docker run -p 8080:8080 todo-api
4. Test (you can use Postman collection to import collection back to your Postman for testing):
- GET - http://localhost:8080/todos
- POST - http://localhost:8080/todos with body {"task":"Clone repo"}
- POST - http://localhost:8080/todos with body {"task":"Build docker image"}
- POST - http://localhost:8080/todos with body {"task":"Run container"}
- POST - http://localhost:8080/todos with body {"task":"Test API"}
- DELETE - http://localhost:8080/todos/{id} - for example: http://localhost:8080/todos/3 