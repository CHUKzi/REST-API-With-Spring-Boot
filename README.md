# Pizza Creed Backend

<p align="center">
  <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="Java Logo" width="100" height="100">
</p>

This repository contains the backend implementation for Pizza Creed, a pizza bakery in Galle Fort. The backend is responsible for managing pizza products and providing REST API endpoints for the mobile app.

## Table of Contents

- [Objectives](#objectives)
- [Task](#task)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)
- [License](#license)

## Objectives

1. Understanding SOA and Microservices architecture.
2. Learning how to use EJB 3, Spring Framework, Spring MVC.
3. Learning how to create a REST API.
4. Understand MVC architecture.

## Task

Pizza Creed is a pizza bakery in Galle Fort. They don't run a pizza restaurant as usual pizza makers. Pizza Creed prepares pizza for orders only. They have several pizza products that may change from time to time according to the demand based on the season. But pizza has fixed regular sizes: Small, Regular, and Large.

Price varies based on the product and size.

Pizza Creed is planning to create a mobile app to place pizza orders. They have already selected a company to make the mobile app. You are chosen to create the Pizza Creed backend.

1. Create a REST web service to add, view, and delete pizza products.
   - Use the `POST /pizza` endpoint to add or edit a pizza product.
   - Use the `GET /pizza/all` endpoint to view all available pizza products.
   - Use the `GET /pizza/{id}` endpoint to view a specific pizza product by its ID.
   - Use the `DELETE /pizza/delete/{id}` endpoint to delete a pizza product by its ID.

## Technologies Used

- Java 17
- Spring Framework
- Spring MVC
- MySQL

## Installation

1. Clone this repository to your local machine.
2. Configure the MySQL database by running the provided SQL scripts.
3. Update the database connection details in the application configuration.
4. Build and deploy the application to a Java application server.

## Usage

1. Use the provided REST API endpoints to manage pizza products:
   - Use the `POST /pizza` endpoint to add or edit a pizza product.
   - Use the `GET /pizza/all` endpoint to view all available pizza products.
   - Use the `GET /pizza/{id}` endpoint to view a specific pizza product by its ID.
   - Use the `DELETE /pizza/delete/{id}` endpoint to delete a pizza product by its ID.

## API Endpoints

The following REST API endpoints are available for managing pizza products:

- `POST /pizza`: Add or edit a pizza product.
  - Use this endpoint to add a new pizza product or update an existing one.
  - Request body should contain the details of the pizza product to be added or edited.
  - If the pizza product already exists (based on its ID), it will be updated with the provided information. If it doesn't exist, a new pizza product will be created.
- `GET /pizza/all`: View all available pizza products.
- `GET /pizza/{id}`: View a specific pizza product by its ID.
- `DELETE /pizza/delete/{id}`: Delete a pizza product by its ID.

## Contributing

Contributions to this project are welcome. If you have any suggestions, bug reports, or feature requests, please submit them via the issue tracker. If you would like to contribute code, please follow the standard guidelines for pull requests.

## Developers

- [Harshika Madhushani](https://github.com/harshikamadhushani)
- [Royan Harsha](https://github.com/CHUKzi)

## License

This project is licensed under the [MIT License](LICENSE). You are free to use, modify, and distribute this code as per the terms of the license.

