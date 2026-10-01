# 🛒 Distributed E-Commerce Microservices

A **scalable, event-driven distributed e-commerce backend** built using Java and Spring Boot. The project follows a **microservices architecture** where different business responsibilities are separated into independently deployable services.

The system is being developed incrementally, starting with the core domain entities and gradually integrating communication, event-driven processing, security, resilience, and distributed transaction management.

## 🚀 Project Overview

This project simulates the backend architecture of a modern e-commerce platform using multiple independent microservices.

### Planned Microservices

- 🛍️ **Order Service** – Handles orders and order items
- 📦 **Inventory Service** – Manages product stock and inventory operations
- 💳 **Payment Service** – Handles payment processing
- 🔔 **Notification Service** – Sends order/payment-related notifications

## 🏗️ Architecture

The project is designed around:

- Microservices Architecture
- Event-Driven Architecture
- Saga Design Pattern
- Event Sourcing
- Asynchronous communication using Apache Kafka
- API Gateway
- Service Discovery
- Distributed databases
- Fault tolerance and resilience

## 🛠️ Tech Stack

### Backend
- Java 17+
- Spring Boot
- Spring Cloud
- Spring Data JPA
- Hibernate

### Messaging
- Apache Kafka

### Databases
- PostgreSQL
- MongoDB

### Architecture & Infrastructure
- Spring Cloud Gateway
- Service Registry / Discovery
- Saga Pattern
- Event Sourcing
- Resilience4j
- OAuth2 / JWT

### DevOps
- Docker
- Kubernetes
- Git & GitHub

## 📌 Current Progress

The project is currently under active development.

### Completed
- [x] Project architecture planning
- [x] Order Entity
- [x] OrderItem Entity

### In Progress
- [ ] Inventory Entity
- [ ] Inventory Service
- [ ] Order Service
- [ ] Kafka event communication
- [ ] Payment Service
- [ ] Notification Service
- [ ] API Gateway
- [ ] Service Discovery
- [ ] Saga implementation
- [ ] Event Sourcing
- [ ] Resilience4j
- [ ] OAuth2 / JWT Security
- [ ] Dockerization
- [ ] Kubernetes deployment

## 🎯 Main Goals

- Build independently deployable microservices
- Implement asynchronous communication with Kafka
- Maintain consistency across distributed services
- Implement the Saga pattern for distributed transactions
- Handle service failures using Resilience4j
- Implement secure authentication and authorization
- Containerize services using Docker
- Deploy the application using Kubernetes

## 📂 Project Structure

```text
distributed-ecommerce-microservices/
│
├── order-service/
│
├── inventory-service/
│
├── payment-service/
│
├── notification-service/
│
├── api-gateway/
│
├── service-registry/
│
└── README.md
```

## 🔄 Planned Order Flow

```text
Customer
   ↓
API Gateway
   ↓
Order Service
   ↓
Kafka Event
   ↓
Inventory Service
   ↓
Payment Service
   ↓
Notification Service
```

The final implementation will use event-driven communication and the **Saga pattern** to coordinate operations across services without relying on distributed database transactions.

## 📈 Future Improvements

- Complete all microservices
- Implement Kafka producers and consumers
- Add distributed transaction handling
- Add centralized configuration
- Implement authentication and authorization
- Add monitoring and logging
- Add automated testing
- Dockerize all services
- Deploy the system using Kubernetes

## 👨‍💻 Status

🚧 **Work in Progress**

This project is being developed step-by-step to demonstrate practical knowledge of **Java, Spring Boot, Microservices, Kafka, distributed systems, and cloud-native application development**.
