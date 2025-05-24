# Week 6 & 7: Java Web Development with Servlets & Spring Boot

Welcome to the repository for **Week 6 and 7** of our Java Backend Development journey. These weeks focused on transitioning from Java core concepts to **web application development** using **Java Servlets** and **Spring Boot**, emphasizing RESTful architecture and layered application design.

---

## 📑 Table of Contents

- [Overview](#overview)
- [Topics Covered](#topics-covered)
  - [Day 1: Java Servlets & Custom Web Server](#day-1-java-servlets--custom-web-server)
  - [Day 2: Introduction to Spring Boot](#day-2-introduction-to-spring-boot)
  - [Day 3: Greeting API with Spring](#day-3-greeting-api-with-spring)
  - [Day 4: Maven-based Spring Boot Setup](#day-4-maven-based-spring-boot-setup)
  - [Day 5: Employee Payroll API](#day-5-employee-payroll-api)
  - [Day 6: Banking System API](#day-6-banking-system-api)
  - [Day 7: Address Book & Employee Management](#day-7-address-book--employee-management)
  - [Day 8: Spring Boot Project Deployment](#day-8-spring-boot-project-deployment)
- [Prerequisites](#prerequisites)
- [How to Use This Repository](#how-to-use-this-repository)
- [Next Steps](#next-steps)

---

## 📌 Overview

Weeks 6 and 7 were dedicated to building real-world backend applications using **Java Web Technologies**. We explored the basics of Servlets, built simple web servers, and moved on to **Spring Boot**, covering concepts like REST controllers, DTOs, services, and repositories. Emphasis was placed on understanding the MVC pattern, application configuration, and API development.

---

## 📚 Topics Covered

### Day 1: Java Servlets & Custom Web Server
- Created `FirstServletProject` and `LoginServletProject`
- Built a custom `SimpleJavaWebServer`
- Explored basic HTTP request/response handling

### Day 2: Introduction to Spring Boot
- Built minimal Spring Boot apps (`SpringDemo`, `helloapp`)
- Introduced annotations like `@RestController` and `@SpringBootApplication`

### Day 3: Greeting API with Spring
- Developed a `GreetingApp` with `GET` endpoints
- Understood the structure of Spring Boot apps using Maven

### Day 4: Maven-based Spring Boot Setup
- Practiced setting up Spring Boot apps manually
- Handled properties, dependencies, and environment setup

### Day 5: Employee Payroll API
- Built an `EmployeePayrollApp` with:
  - DTO classes
  - Service layer
  - CRUD REST APIs
- Integrated Spring validation and exception handling

### Day 6: Banking System API
- Created `BankingApplication1`
- Simulated account operations (deposit, withdraw, check balance)
- Emphasized clean code with controller-service-repository pattern

### Day 7: Address Book & Employee Management
- Created multiple apps (`AddressBookApp`, `EmployeePayrollApp1Application`, `addressBook3`, `employeepayrollapp`)
- Practiced REST API development for user and address management
- Handled model mapping and controller logic

### Day 8: Spring Boot Project Deployment
- Finalized `SpringAddressBook` app
- Compiled build artifacts
- Organized layered structure for production-readiness

---

## 🛠 Prerequisites

- Java 8 or later
- Maven (or an IDE with Maven integration)
- Spring Boot CLI (optional)
- Any IDE like IntelliJ IDEA, Eclipse, or VS Code
- Postman or browser for testing REST APIs

---

## How to Use This Repository

- Each **day** is organized into its own folder (`day1`, `day2`, ..., `day8`)
- Inside each folder, you’ll find:
  - Java source code under `src/`
  - `pom.xml` or build scripts for Maven
  - Configuration files (`application.properties`)
  - Project-specific README or instructions (if applicable)
- Clone the repo and open individual folders in your IDE
- Run Spring Boot apps using:
  ```bash
  mvn spring-boot:run
