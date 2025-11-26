# Chirp API

[![Build Status](https://img.shields.io/badge/build-passing-brightgreen)](https://github.com/CyroPCJr/chirp-api/actions)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Kotlin Version](https://img.shields.io/badge/Kotlin-2.2.21-blue.svg)](https://kotlinlang.org/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.0-brightgreen.svg)](https://spring.io/projects/spring-boot)

**Chirp API** is a chat application backend project developed using **Spring Boot** and **Kotlin**. The project is structured with a multi-module, event-driven architecture, showcasing a modern and scalable approach to API development.

## Features

- **Multi-module Architecture**: The project is divided into `app`, `chat`, `user`, `notification`, and `common` modules, promoting separation of concerns and maintainability.
- **Event-Driven**: Utilizes **RabbitMQ** for asynchronous communication between modules, allowing for loose coupling and increased scalability.
- **Push Notifications**: Integration with **Firebase Admin SDK** for sending push notifications to clients.
- **Security**: Implementation of authentication and authorization for API endpoints.
- **Email Sending**: Dedicated module for sending transactional emails.
- **Caching**: Configuration for caching to optimize performance.
- **Traffic Control**: Uses **Redis** for traffic control and rate limiting.

## Technologies

| Category | Technology |
| :--- | :--- |
| **Framework** | Spring Boot 4.0.0 |
| **Language** | Kotlin 2.2.21 |
| **Build Tool** | Gradle (Kotlin DSL) |
| **Messaging** | RabbitMQ |
| **Notifications** | Firebase Admin SDK |
| **Database** | (Not specified, configurable via `application.yml`) |
| **Cache/Traffic** | Redis |

## Architecture

The project is organized into a multi-module architecture, where each module has a specific responsibility:

- **`app`**: The main module that integrates all other modules and contains the application's startup class.
- **`chat`**: Module responsible for chat functionalities, such as sending and receiving messages.
- **`user`**: Module for user management, authentication, and profiles.
- **`notification`**: Module for sending push notifications and emails.
- **`common`**: Module containing shared code and utilities used across other modules.
- **`build-logic`**: Custom build logic for Gradle.

## Prerequisites

- Java 21 or higher
- Gradle 8.x
- RabbitMQ (for the development environment)
- Redis (for the development environment)
- Firebase service account (for push notifications)

## Getting Started

1. **Clone the repository:**
   ```bash
   git clone https://github.com/CyroPCJr/chirp-api.git
   cd chirp-api
   ```

2. **Configure the environment:**
   - Rename the `application.yml.example` file (if it exists) to `application.yml` in the `app/src/main/resources` module.
   - Fill in the database, RabbitMQ, and Firebase configurations in the `application.yml` file.

3. **Run the application:**
   ```bash
   ./gradlew bootRun
   ```

## Contributing

Contributions are welcome! Feel free to open an issue or submit a pull request.

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/new-feature`)
3. Commit your changes (`git commit -m 'Add new feature'`)
4. Push to the branch (`git push origin feature/new-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

## Contact

Cyro P. C. Jr. - [https://github.com/CyroPCJr](https://github.com/CyroPCJr)
