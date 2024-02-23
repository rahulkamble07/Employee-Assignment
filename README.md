# Employee-Assignment
To execute this Spring boot CRUD operation, we will need to use Spring Boot, Data JPA, and H2 database, and test some test cases for Junit and Mackito.
                    
                          
                          DOCUMENTATION 

Introduction:
The CRUD Operation Assignment (project) is a web application developed using Spring Boot Data JPA and H2 Database. This project allows users to perform Create, Read, Update, and Delete operations on a database through HTTP methods such as GET, POST, PUT, and DELETE.

  Features:
- User Authentication: Users can access the CRUD functionalities.
- Create Operation: Users can add new records to the database using POST method.
- Read Operation: Users can retrieve all records from the database using GET method.
- Update Operation: Users can modify existing records in the database using PUT method.
- Delete Operation: Users can delete records from the database using DELETE method.

 Technologies Used:
- Spring Boot: Used for creating the RESTful web services.
- Spring Data JPA: Used for interacting with the database.
- H2 Database: Used as an in-memory database for storing data.
- Java: Used for backend development.

 Database Structure:
The H2 database used in this project(assignment) consists of a single table with fields for storing data. The table structure includes fields such as
id(id is auto generated)
first_name
last_name 
email
designation

Setup:
  To set up the project, follow these steps:
- Create a new Spring Boot project with Spring Data JPA dependencies.
- Configure the H2 database connection in the application.properties file.
- Create entity classes representing the database tables.
- Implement RESTful controllers for handling CRUD operations.
- Run the project and test the CRUD functionalities using tools like Postman.








Get All Employees
Endpoint - /employees
Request Method - GET
Request Payload - N/A
Response Structure - 
[
    {
        "id": 1,
        "first_name": "Mangesh",
        "last_name": "Karle",
        "email": "mk123@gmail.com",
        "designation": "dev",
        "present": false
    }
]

Create New Employee

Endpoint - /employees
Request Method - POST
Request Payload - 
{
    "first_name":"Mangesh",
    "last_name": "Karle",
    "email":"mk123@gmail.com",
    "designation": "dev"
}
Response Structure -  After result show :- (method is created )
{
    "id": 1,
    "first_name": "Mangesh",
    "last_name": "Karle",
    "email": "mk123@gmail.com",
    "designation": "dev",
    "present": false
}






Get New Employee By Id 
Endpoint - /employees/{id}
Request Method - GET 
Request Payload - 
}
    "first_name":"Rahul",
    "last_name": "Kamble",
    "email":"rahulk@gmail.com",
    "designation": "Java Developer"
}
Response Structure - After result show :- 

{
    "id": 1,
    "first_name": "Rahul",
    "last_name": "Kamble",
    "email": "rahulk@gmail.com",
    "designation": "Java Developer",
    "present": false
}
Update  Employee  
Endpoint - /employees/{id}
Request Method - PUT
Request Payload -
{ 
   "first_name":"Rushi",
    "last_name": "Patil",
    "email":"patilrushi123@gmail.com",
    "designation": "PHP Developer"
}

Response Structure - After result show :- 
{
    "id": 1,
    "first_name": "Rushi",
    "last_name": "Patil",
    "email": "patilrushi123@gmail.com",
    "designation": "PHP Developer",
    "present": false
}

Delete Employee By Id
Endpoint - /employees/{id}
Request Method - DELETE
Request Payload -  N/A
Response Structure -  msg will be show Employee Got Deleted 
(if user use delete method  the data will deleted  auto-maticaly by H2 database) 

In this project i use dependency like :- 

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>runtime</scope>
		</dependency>

Note :- I use some Junit Mockito test Cases  if i know 
Thank You 



