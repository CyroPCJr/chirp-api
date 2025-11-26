# Chirp API

[![Build Status](https://img.shields.io/badge/build-passing-brightgreen)](https://github.com/CyroPCJr/chirp-api/actions)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Kotlin Version](https://img.shields.io/badge/Kotlin-2.2.21-blue.svg)](https://kotlinlang.org/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.0-brightgreen.svg)](https://spring.io/projects/spring-boot)

**Chirp API** é um projeto de backend para uma aplicação de chat, desenvolvido com **Spring Boot** e **Kotlin**. O projeto é estruturado em uma arquitetura multi-módulo, orientada a eventos, demonstrando uma abordagem moderna e escalável para o desenvolvimento de APIs.

## Features

- **Arquitetura Multi-módulo**: O projeto é dividido em módulos de `app`, `chat`, `user`, `notification` e `common`, promovendo a separação de responsabilidades e a manutenibilidade.
- **Orientado a Eventos**: Utiliza **RabbitMQ** para a comunicação assíncrona entre os módulos, permitindo um baixo acoplamento e maior escalabilidade.
- **Notificações Push**: Integração com **Firebase Admin SDK** para o envio de notificações push para os clientes.
- **Segurança**: Implementação de autenticação e autorização de endpoints.
- **Envio de E-mails**: Módulo dedicado para o envio de e-mails transacionais.
- **Cache**: Configuração de cache para otimização de performance.
- **Controle de Tráfego**: Utiliza **Redis** para controle de tráfego e limitação de taxa (rate limiting).

## Tecnologias

| Categoria | Tecnologia |
| :--- | :--- |
| **Framework** | Spring Boot 4.0.0 |
| **Linguagem** | Kotlin 2.2.21 |
| **Build Tool** | Gradle (Kotlin DSL) |
| **Mensageria** | RabbitMQ |
| **Notificações** | Firebase Admin SDK |
| **Banco de Dados** | (Não especificado, configurável via `application.yml`) |
| **Cache/Tráfego** | Redis |

## Arquitetura

O projeto é organizado em uma arquitetura multi-módulo, onde cada módulo possui uma responsabilidade específica:

- **`app`**: Módulo principal que integra todos os outros módulos e contém a classe de inicialização da aplicação.
- **`chat`**: Módulo responsável pelas funcionalidades de chat, como envio e recebimento de mensagens.
- **`user`**: Módulo para gerenciamento de usuários, autenticação e perfis.
- **`notification`**: Módulo para o envio de notificações push e e-mails.
- **`common`**: Módulo com código e utilitários compartilhados entre os outros módulos.
- **`build-logic`**: Lógica de build customizada para o Gradle.

## Pré-requisitos

- Java 21 ou superior
- Gradle 8.x
- RabbitMQ (para o ambiente de desenvolvimento)
- Redis (para o ambiente de desenvolvimento)
- Conta de serviço do Firebase (para as notificações push)

## Como Começar

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/CyroPCJr/chirp-api.git
   cd chirp-api
   ```

2. **Configure o ambiente:**
   - Renomeie o arquivo `application.yml.example` (se existir) para `application.yml` no módulo `app/src/main/resources`.
   - Preencha as configurações de banco de dados, RabbitMQ e Firebase no arquivo `application.yml`.

3. **Execute a aplicação:**
   ```bash
   ./gradlew bootRun
   ```

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.

1. Faça um fork do projeto
2. Crie uma nova branch (`git checkout -b feature/nova-feature`)
3. Faça o commit de suas alterações (`git commit -m 'Adiciona nova feature'`)
4. Faça o push para a branch (`git push origin feature/nova-feature`)
5. Abra um Pull Request

## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## Contato

Cyro P. C. Jr. - [https://github.com/CyroPCJr](https://github.com/CyroPCJr)
