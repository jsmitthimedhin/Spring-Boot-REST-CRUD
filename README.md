# Spring-Boot-REST-CRUD
This application allows users to create, read, update, and delete users in a MySQL database using HTTP methods, built using Spring Boot.
The main branch uses Hibernate to connect to the database and the second branch does it directly using JPA's Entity Manager object.

## Process
The application is built with Spring Boot and allowed me to learn how to initialize a Spring Boot application that implements Spring Web, MySQL connector, JPA, and DevTools. 

I also learned how to define the DataSource using Spring Boot's ".properties" file instead of defining it using annotations and hard-coded configurations (which is so much easier and less error-prone!). The rest is just creating the REST controller, DAO, Service class, and entity class, and mapping each class with Spring or Hibernate annotations, similar to other projects I've worked on.


## How to Run
1. Download and install Postman or any other program that allows you to perform HTTP requests to a web server.
2. Run the two SQL scripts; first one creates a user in SQL and grants the user permission for CRUD methods, second one creates and populates the database.
3. Run "CrudApplication" as a Java Application using with your JRE/JDK.
4. Use Postman to request a GET method from [your web server]/api/members
