# Spring Boot Learning Project

This is a simple project to learn **Spring Boot**, **Spring Data JPA**, **Lombok**, and creating a basic **REST API**. The application works with a `Product` entity and demonstrates CRUD operations, including advanced querying using **Spring Data** methods and custom queries with `@Query`.

---

## Overview

This project was built as an introduction to:
- **Spring Data JPA**: For database operations, including built-in methods and custom queries.
- **Lombok**: To reduce boilerplate code (e.g., getters, setters).
- **REST API**: To expose endpoints for interacting with the `Product` entity.
- **H2 and MySQL Databases**: For working with both in-memory and persistent databases.

---

## Features

- Save new products to the database.
- Retrieve all products.
- Search for products by **name**, **price**, or **ID** using two methods:
    1. **Spring Data JPA repository methods** (e.g., `findByPriceLessThan(..)`).
    2. **Custom queries** using `@Query` with **HQL** (JPA QL).
- Use advanced filtering like finding products with a price greater than a certain value.
- Flexible database configuration to switch between **H2** (for testing) and **MySQL** (for production or persistent use).

---

## Technologies Used

- **Java 17**
- **Spring Boot 3**
- **H2 Database**
- **MySQL Database**
- **Spring Data JPA**
- **Lombok**
- **Maven**

---

## Project Setup

### Prerequisites
- **Java 17** or later
- **Maven**
- **MySQL Database** (optional, if not using H2)

### Steps to Run

#### 1. Clone the Repository
```bash
git clone <repository-url>
cd university
```
#### 2. Database Configuration
The application supports both H2 and MySQL databases. You can switch between them by updating the application.properties file.

H2 (In-Memory Database) (Default configuration in application.properties):
```
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
```
Access the H2 Console at: http://localhost:8080/h2-console

MySQL:
To use MySQL, update your application.properties file:
```
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
``` 
#### 3. Build the Project
```mvn clean install```
#### 4. Run the Application
```mvn spring-boot:run```
#### 5. Access the Application
**H2 Console:**  http://localhost:8080/h2-console <br>
**REST API:** Use Postman or cURL to interact with the API endpoints.

### Sample Endpoints
Here are the REST API endpoints provided in this project: <br>
GET /api/products        : Retrieve all products.    <br>
GET /api/products/id     : Search product by id       <br>

### Learning Objectives
- Understand **Spring Data JPA** repository methods.
- Write custom queries using **@Query** and **HQL (JPA QL)**.
- Use **Lombok** annotations to simplify entity creation.
- Expose **CRUD** operations via **REST APIs**.
- Work with both in-memory **(H2)** and persistent **(MySQL)** databases.


### Author
**Yassine Abbou** <br>
Software Engineering Student at ENIAD, Morocco <br>
yassine.abbou.23@ump.ac.ma <br>
+212 6 04409284