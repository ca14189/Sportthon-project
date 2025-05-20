# Use OpenJDK 21 (since your app was compiled with Java 21)
FROM openjdk:21-jdk-slim

# Set working directory
WORKDIR /app

# Copy the JAR file into the container
COPY target/*.jar app.jar

# Expose the application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
