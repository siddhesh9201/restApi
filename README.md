My First API Using Spring Boot
This project is a basic REST API built using Spring Boot. It demonstrates the core principles of building a simple API that can handle HTTP requests like GET and POST. This API manages a simple collection of Course objects with basic functionalities to add, retrieve, and manage courses.

Features
Create a Course: Add a new course to the list.
Retrieve Course by ID: Get the details of a specific course by its unique ID.
Retrieve All Courses: Fetch all the available courses.
Technologies Used
Java
Spring Boot
Maven for project management
Spring Web for RESTful web services
Postman or curl (optional) for testing the API
Prerequisites
JDK 17 or later
Maven 3.6+
An IDE such as IntelliJ or Eclipse
Setup and Run the Project
Clone the repository:

bash

git clone https://github.com/your-username/my-first-api.git
Navigate to the project directory:

bash

cd my-first-api
Build the project using Maven:

bash

mvn clean install
Run the application:

bash

mvn spring-boot:run
The application will start on http://localhost:8080.

API Endpoints
1. Add a new Course
Method: POST
Endpoint: /api/courses
Body: JSON object containing course details
Example:
json

{
    "id": 1,
    "name": "Introduction to Spring Boot",
    "duration": "4 weeks"
}
2. Get a Course by ID
Method: GET
Endpoint: /api/courses/id/{id}
Description: Retrieve a course using its unique ID.
Example: GET /api/courses/id/1
3. Get All Courses
Method: GET
Endpoint: /api/courses
Description: Retrieve all the available courses.
How to Test
You can test the API using tools like Postman or using curl in the terminal.

Example:

bash

curl -X GET http://localhost:8080/api/courses
License
This project is licensed under the MIT License. Feel free to use, modify, and distribute it.

This README.md should help users understand the purpose, setup, and usage of your Spring Boot API project. You can customize it as needed for your specific project.
