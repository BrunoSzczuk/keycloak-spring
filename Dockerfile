FROM gradle:8.3.0-jdk17 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build

FROM openjdk:17-jdk-slim-buster
COPY --from=build /home/gradle/src/build/libs/keycloak-spring-0.0.1-SNAPSHOT.jar /app.jar

EXPOSE 8081

CMD ["java", "-jar", "/app.jar"]
