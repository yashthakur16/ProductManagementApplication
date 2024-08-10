
# Product Management Application

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Project Structure](#project-structure)
- [Technologies Used](#technologies-used)
- [Contributing](#contributing)
- [Acknowledgments](#acknowledgments)

## Introduction

The **Product Management Application** is a Spring Boot web application designed to manage product data. It provides a RESTful API for performing CRUD operations on products, allowing for easy management and integration with other systems.

## Features

- **CRUD Operations**: Create, read, update, and delete products.
- **RESTful API**: Interact with the application via HTTP requests.
- **Database Integration**: Persistent storage of product data.

## Installation

### Prerequisites

Before you begin, ensure you have the following installed on your machine:

- **Java 17** or higher
- **Maven 3.8** or higher
- **MySQL** (or another supported database)

### Steps

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yashthakur16/ProductManagementApplication.git
   ```
2. **Navigate to the Project Directory**
   ```bash
   cd ProductManagementApplication
   ```
3. **Install Dependencies**
   ```bash
   mvn clean install
   ```
4. **Configure the Database**
   - Update the `application.properties` file with your database connection details.

## Usage

### Running the Application

Start the Spring Boot application using Maven:

```bash
mvn spring-boot:run
```

The application will be accessible at `http://localhost:8080`.

### API Endpoints

The following API endpoints are available:

- **GET /api/products**: Retrieve all products.
- **GET /api/products/{id}**: Retrieve a specific product by ID.
- **POST /api/products**: Create a new product.
- **PUT /api/products/{id}**: Update an existing product by ID.
- **DELETE /api/products/{id}**: Delete a product by ID.

### Example Request

To create a new product, send a POST request to `/api/products` with the product details in the request body:

```json
{
 
        "name": "Sample",
        "type": "Mobile",
        "place": "table",
        "warranty": 2022
}
```

## Project Structure

- **`src/main/java/com/yash/WebProductManagement/Product.java`**: Represents the product entity.
- **`src/main/java/com/yash/WebProductManagement/ProductController.java`**: Handles incoming HTTP requests for products.
- **`src/main/java/com/yash/WebProductManagement/ProductService.java`**: Contains business logic for product operations.
- **`src/main/java/com/yash/WebProductManagement/productDB.java`**: Manages database interactions.
- **`src/main/java/com/yash/WebProductManagement/WebProductManagementApplication.java`**: The main class that runs the Spring Boot application.

## Technologies Used

- **Java 17**
- **Spring Boot**
- **Maven**
- **MySQL** (or another relational database)
- **REST API**

## Contributing

Contributions are welcome! To contribute:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes.
4. Commit your changes (`git commit -m 'Add some feature'`).
5. Push to the branch (`git push origin feature-branch`).
6. Open a pull request.


## Acknowledgments

- Thanks to the Spring Boot and open-source community for their valuable tools and libraries.
