# 🛒 Distributed E-Commerce Microservices

A scalable and event-driven **Distributed E-Commerce Microservices** application built using **Java, Spring Boot, Spring Cloud, Kafka, and distributed databases**.

The project follows a microservices architecture where different business functionalities are separated into independent services. Communication between services will be handled using **event-driven architecture**, with **Saga** and **Event Sourcing** patterns planned for maintaining consistency across distributed services.

---

## 📌 Project Overview

The goal of this project is to build a modern e-commerce backend infrastructure that is:

- Scalable
- Distributed
- Event-driven
- Fault-tolerant
- Independently deployable
- Secure

The system is divided into multiple microservices responsible for different parts of the e-commerce workflow.

### Planned Microservices

- 🛒 **Order Service**
- 📦 **Inventory Service**
- 💳 **Payment Service**
- 🔔 **Notification Service**
- 🏷️ **Product Service**

---

## 🏗️ Architecture

The project follows a **Microservices + Event-Driven Architecture**.

```text
                    ┌─────────────────────┐
                    │      Frontend       │
                    │    React / Next.js  │
                    └──────────┬──────────┘
                               │
                               ▼
                    ┌─────────────────────┐
                    │     API Gateway     │
                    └──────────┬──────────┘
                               │
          ┌────────────────────┼────────────────────┐
          │                    │                    │
          ▼                    ▼                    ▼
   ┌─────────────┐      ┌─────────────┐      ┌─────────────┐
   │ Order       │      │ Inventory   │      │ Product     │
   │ Service     │      │ Service     │      │ Service     │
   └──────┬──────┘      └─────────────┘      └─────────────┘
          │
          │ Events
          ▼
   ┌─────────────────┐
   │      Kafka      │
   └───────┬─────────┘
           │
      ┌────┴───────────────┐
      │                    │
      ▼                    ▼
┌─────────────┐      ┌─────────────┐
│ Payment     │      │ Notification│
│ Service     │      │ Service     │
└─────────────┘      └─────────────┘
```

---

## 🚀 Current Development Progress

### ✅ Completed

- [x] Project architecture planning
- [x] Spring Boot project setup
- [x] Order Entity
- [x] OrderItem Entity
- [x] Inventory Entity
- [x] Inventory Repository
- [x] Inventory Service
- [x] Inventory Controller
- [x] Payment Entity
- [x] Payment Repository
- [x] Payment Service
- [x] Payment Controller
- [x] Product Entity
- [x] Product Repository
- [x] Product Service
- [x] Product Controller
- [x] Notification Entity
- [x] Notification Repository
- [x] Notification Service
- [x] Notification Controller

### 🔄 Upcoming

- [ ] Kafka event communication
- [ ] Kafka producers and consumers
- [ ] Notification event handling
- [ ] Order processing workflow
- [ ] Inventory event handling
- [ ] Payment event handling
- [ ] API Gateway
- [ ] Service Discovery
- [ ] Saga Design Pattern
- [ ] Event Sourcing
- [ ] Resilience4j
- [ ] OAuth2 / JWT authentication
- [ ] Distributed database configuration
- [ ] Dockerization
- [ ] Kubernetes deployment
- [ ] Monitoring and logging

---

## 🧩 Entities

The backend currently contains the following core entities:

### Order

Represents customer orders and contains information related to the order lifecycle.

### OrderItem

Represents individual products/items associated with an order.

### Product

Represents products available in the e-commerce system.

### Inventory

Maintains product inventory and stock-related information.

### Payment

Handles payment-related information and payment status.

### Notification

Stores notification-related information for communicating important events to users.

---

## 🛠️ Tech Stack

### Backend

- Java 17+
- Spring Boot
- Spring Cloud
- Spring Data JPA
- Hibernate
- REST APIs

### Messaging

- Apache Kafka
- Event-Driven Architecture

### Databases

- PostgreSQL
- MongoDB

### Distributed Architecture

- API Gateway
- Service Discovery
- Saga Pattern
- Event Sourcing
- Resilience4j

### Security

- OAuth2
- JWT

### DevOps

- Docker
- Kubernetes
- Git
- GitHub

### Frontend

- React
- JavaScript
- REST API integration

---

## 📂 Project Structure

```text
Distributed-E-Commerce/
│
├── Backend/
│   ├── Distributed-ECommerce/
│   │   ├── src/
│   │   │   ├── main/
│   │   │   │   ├── java/
│   │   │   │   │   └── com/example/demo/
│   │   │   │   │       ├── controller/
│   │   │   │   │       ├── entity/
│   │   │   │   │       ├── repository/
│   │   │   │   │       └── service/
│   │   │   │   │
│   │   │   │   └── resources/
│   │   │   │       └── application.properties
│   │   │   │
│   │   │   └── test/
│   │   │
│   │   ├── pom.xml
│   │   ├── mvnw
│   │   └── mvnw.cmd
│   │
│   └── .gitignore
│
├── Frontend/
│   └── ...
│
├── .gitignore
└── README.md
```

---

## 🔄 Development Milestones

| Milestone | Status |
|---|---|
| Project Architecture | ✅ Completed |
| Order Entity | ✅ Completed |
| OrderItem Entity | ✅ Completed |
| Inventory Entity & Service | ✅ Completed |
| Payment Entity & Service | ✅ Completed |
| Product Entity & Service | ✅ Completed |
| Notification Entity & Service | ✅ Completed |
| Kafka Integration | 🔄 Upcoming |
| Event Communication | 🔄 Upcoming |
| API Gateway | 🔄 Upcoming |
| Service Discovery | 🔄 Upcoming |
| Saga Pattern | 🔄 Upcoming |
| Event Sourcing | 🔄 Upcoming |
| Resilience4j | 🔄 Upcoming |
| OAuth2 / JWT | 🔄 Upcoming |
| Docker | 🔄 Upcoming |
| Kubernetes | 🔄 Upcoming |

---

## 🎯 Project Goals

The main goals of this project are to understand and implement:

- Microservices architecture
- Event-driven communication
- Kafka-based messaging
- Distributed transactions
- Saga pattern
- Event sourcing
- Fault tolerance
- API Gateway
- Service discovery
- Authentication and authorization
- Containerization
- Kubernetes deployment

---

## 📈 Future Improvements

Future development will focus on:

1. Implementing Kafka-based asynchronous communication.
2. Connecting Order, Inventory, Payment, and Notification services through events.
3. Implementing the Saga pattern for distributed transaction management.
4. Adding Event Sourcing for important business events.
5. Implementing API Gateway and service discovery.
6. Adding Resilience4j for fault tolerance.
7. Implementing OAuth2/JWT security.
8. Dockerizing individual services.
9. Deploying the system using Kubernetes.
10. Adding monitoring, logging, and distributed tracing.

---

## 👨‍💻 Developer

**Swarup Chaudhari**

B.E. Artificial Intelligence & Data Science

Pune, Maharashtra, India

GitHub: [swarup-chaudhari](https://github.com/swarup-chaudhari)

---

## ⭐ Project Status

🚧 **Under Active Development**

The core entities and basic service layers have been implemented. The next major stage is integrating **Kafka and event-driven communication** between the microservices.
