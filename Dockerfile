FROM gradle:8.3.0-jdk17 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build

FROM openjdk:17-jdk-slim-buster
COPY --from=build /home/gradle/src/build/libs/keycloak-spring-0.0.1-SNAPSHOT.jar /app.jar
COPY --from=ghcr.io/ufoscout/docker-compose-wait:latest /wait /wait
EXPOSE 8081

CMD /wait && java -jar /app.jar
