FROM openjdk:17-jdk-slim-buster

COPY build/libs/keycloak-spring-0.0.1-SNAPSHOT.jar /app.jar

EXPOSE 8080

CMD ["java", "-jar", "/app.jar"]
