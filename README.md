# Hotel Reservation System - Spring Boot

A RESTful web application for managing hotel reservations built with Spring Boot, JPA/Hibernate, and PostgreSQL.

## 📋 Overview

This is a simple hotel reservation management system that allows you to create, read, update, and delete hotel reservations. The application provides a REST API for managing guest reservations with features like room booking, guest information management, and reservation tracking.

## ✨ Features

- Create new hotel reservations
- View all reservations
- Search reservations by ID
- Search reservations by guest name
- Delete reservations
- RESTful API architecture
- PostgreSQL database integration
- Swagger/OpenAPI documentation

## 🛠️ Technology Stack

- **Java 21**
- **Spring Boot 4.0.1**
  - Spring Web MVC
  - Spring Data JPA
- **PostgreSQL** - Database
- **Lombok** - Reduce boilerplate code
- **Maven** - Build and dependency management
- **SpringDoc OpenAPI** - API documentation (Swagger UI)

## 📦 Prerequisites

Before running this application, make sure you have the following installed:

- Java 21 or higher
- Maven 3.6+
- PostgreSQL 12 or higher

## 🗄️ Database Setup

1. Install PostgreSQL if not already installed
2. Create a database named `hotel_db`:
   ```sql
   CREATE DATABASE hotel_db;
   ```
3. Update database credentials in `HotelReservationSystem/src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/hotel_db
   spring.datasource.username=your_postgres_username
   spring.datasource.password=your_postgres_password
   ```

## 🚀 Installation and Running

1. Clone the repository:
   ```bash
   git clone https://github.com/prvu7/Hotel-Reservation-SpringBoot.git
   cd Hotel-Reservation-SpringBoot/HotelReservationSystem
   ```

2. Build the project:
   ```bash
   mvn clean install
   ```

3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

   Or run the JAR file:
   ```bash
   java -jar target/HotelReservationSystem-0.0.1-SNAPSHOT.jar
   ```

4. The application will start on `http://localhost:8080`

## 📚 API Endpoints

### Base URL: `http://localhost:8080/api/reservations`

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/reservations` | Get all reservations |
| GET | `/api/reservations/{id}` | Get reservation by ID |
| GET | `/api/reservations/search?name={guestName}` | Search reservations by guest name |
| POST | `/api/reservations` | Create a new reservation |
| DELETE | `/api/reservations/{id}` | Delete a reservation |

### Sample Request Body (POST)

```json
{
  "guestName": "John Doe",
  "roomNumber": "101",
  "checkInDate": "2024-01-15",
  "pricePerNight": 150.00
}
```

## 📖 API Documentation

Once the application is running, you can access the Swagger UI documentation at:

```
http://localhost:8080/swagger-ui.html
```

This provides an interactive interface to test all available API endpoints.

## 📁 Project Structure

```
HotelReservationSystem/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── org/prvu/hotelreservationsystem/
│   │   │       ├── controller/         # REST controllers
│   │   │       ├── model/             # JPA entities
│   │   │       ├── repository/        # Data access layer
│   │   │       ├── service/           # Business logic
│   │   │       └── HotelReservationSystemApplication.java
│   │   └── resources/
│   │       └── application.properties # Configuration
│   └── test/                          # Test files
├── pom.xml                            # Maven dependencies
└── README.md
```

## 🔧 Configuration

Key configuration properties in `application.properties`:

- **Database Configuration**: PostgreSQL connection settings
- **JPA/Hibernate**: Auto DDL update, SQL logging
- **Swagger UI**: API documentation path

## 🤝 Contributing

Contributions are welcome! Feel free to submit issues and pull requests.

## 📝 License

This project is open source and available for educational purposes.