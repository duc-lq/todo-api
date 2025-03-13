# Base image
FROM openjdk:21-jdk-slim

# Set working directory
WORKDIR /app

# Copy Maven files and build
COPY . .
RUN ./mvnw package -DskipTests

# Copy JAR file
COPY target/springanddocker-0.0.1-SNAPSHOT.jar app.jar

# Run application
ENTRYPOINT ["java", "-jar", "app.jar"]