# Keycloak-Spring Application

This is a sample README for a Dockerized Keycloak-Spring application.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Usage](#usage)
    - [Build the Docker Image](#build-the-docker-image)
    - [Run the Docker Container](#run-the-docker-container)
    - [Docker Compose](#docker-compose)

## Prerequisites

Before you begin, ensure you have met the following requirements:

- **Docker:** Make sure you have Docker installed. You can download and install it
  from [Docker's official website](https://www.docker.com/get-started).

## Getting Started

To get started with this application, follow these steps:

1. Clone this repository:

   ```shell
   git clone https://github.com/your-username/keycloak-spring.git
    ```
   Navigate to the project directory:
      ```shell
    cd keycloak-spring
   ```

## Usage

### Build the Docker Image

To build the Docker image for the Keycloak-Spring application, use the following command:

```shell
docker build -t keycloak-spring:latest .
```

### Run the Docker Container

To run the Keycloak-Spring application as a Docker container, use the following command:

```shell
docker run -p 8080:8080 keycloak-spring:latest
```

This will start the application on port 8080.

### Docker Compose

Alternatively, you can use Docker Compose to simplify running the application and its dependencies. Docker Compose is
configured using the docker-compose.yml file provided in this repository.

Start Services with Docker Compose
To start the application and its dependencies using Docker Compose, run the following command:

```shell
docker-compose up -d
```

This will start the application and any associated services defined in the docker-compose.yml file.

Stop Services with Docker Compose
To stop the services started with Docker Compose, use the following command:

```shell
docker-compose down
```