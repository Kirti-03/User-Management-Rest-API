This project is a **Spring Boot-based User Management REST API** that allows users to be **created, retrieved, updated, and deleted (CRUD operations)** using **MySQL** as the database.
It is built with **Spring Boot, Spring Data JPA, and Spring Web**, ensuring efficient data handling and seamless API communication.  

The API enables **user registration** with fields like **name, email, and address**, and securely stores the data in a MySQL database.
It provides various endpoints for **fetching all users, retrieving a specific user by ID, updating user details, and deleting users**.
The application follows a layered architecture, including **controllers for API endpoints, services for business logic, and repositories for database interactions**.  

The **Spring Boot framework** simplifies development by handling dependency injection and configuration management.
**Spring Data JPA** ensures smooth database operations with minimal boilerplate code, while **MySQL** acts as a persistent data store.
The project also includes **Spring Boot DevTools** for real-time application updates during development.  

To run the project, **clone the repository, configure MySQL connection details in `application.properties`**, and execute the application using **Maven** or a Java IDE like **IntelliJ IDEA** or **Eclipse**.

### **How to Test the API on Postman**  

1. **Start the Application**: Ensure the Spring Boot application is running on `http://localhost:8080/`.  

2. **Use Postman to Send API Requests**:  

 - **Create a New User**  
     - **Method:** `POST`  
     - **URL:** `http://localhost:8080/Users`  
     - **Body (JSON, raw):**
   ![Image](https://github.com/user-attachments/assets/019fbc09-27ff-45b0-8df1-409c17b53084)

   - **Get User by ID**  
     - **Method:** `GET`  
     - **URL:** `http://localhost:8080/Users/id/{id}`
       ![Image](https://github.com/user-attachments/assets/9b7497ce-c44c-4ee0-a959-192058aad649)

   - **Update User Details**  
     - **Method:** `PUT`  
     - **URL:** `http://localhost:8080/Users/id/{id}`  
     - **Body (JSON, raw):**
      ![Image](https://github.com/user-attachments/assets/b8961d04-2064-4b6c-9b28-794232d1d62c)
         
   - **Delete a User**  
     - **Method:** `DELETE`  
     - **URL:** `http://localhost:8080/Users/id/{id}`
       ![Image](https://github.com/user-attachments/assets/7a282030-4b92-4fcd-943b-a9463fed6961) 

3. **Verify the Changes in MySQL Database**: Run SQL queries to check if the changes are reflected in the database.
   ![Image](https://github.com/user-attachments/assets/10476f5d-d235-4125-8a4b-02095f40251d)

This project is licensed under the MIT License – see the LICENSE file for details.
