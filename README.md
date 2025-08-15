# Employee Management System (JDBC + Switch Case + CRUD)

## Project Overview
The **Employee Management System** is a console-based Java application that manages employee records using **JDBC** for database operations.  
It provides a **menu-driven interface** using a **switch case** for performing **CRUD** operations, including:
- Adding a new employee
- Viewing all employees
- Viewing a single employee by ID
- Updating employee details
- Deleting an employee

This project demonstrates **JDBC connectivity**, **SQL queries**, **input validation**, and a **modular switch-case design** for real-world database applications.

---

## Features
- **Add Employee** → Insert a new record into the database.
- **View All Employees** → Fetch and display all records.
- **View Employee by ID** → Search and display a single record by employee ID.
- **Update Employee** → Modify existing employee details.
- **Delete Employee** → Remove an employee record from the database.
- **Input Validation** → Prevent crashes on invalid input.
- **Loop-based Menu** → Keeps running until the user exits.

---

##  Technologies Used
- **Java** (Core Java, JDBC)
- **MySQL** (Database)
- **JDBC Driver** (`mysql-connector-j.jar`)
- **Switch Case** for menu control
- **Exception Handling** for invalid input

---


---

## Database Setup
Run the following SQL commands in MySQL:
```sql
CREATE DATABASE EmployeeDB;
USE EmployeeDB;

CREATE TABLE employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    department VARCHAR(50),
    salary DOUBLE
);

## How to Run the Project

1.Install Requirements

Java JDK (17 or above recommended)

MySQL Database

MySQL JDBC Driver (I used : mysql-connector-j-9.2.0.jar)

2. Clone the Repository
git clone  https://github.com/yourUserName/EmployeeManagementSystem.git

3. Add JDBC Driver to Classpath

In Eclipse: Right Click Project → Build Path → Configure Build Path → Add External JARs

4. Configure Database Connection
    Update DBConnection.java:
    String url = "jdbc:mysql://localhost:3306/yourDBName";
    String user = "root";
    String password = "your_password";

5. Run the Application
    Open Main.java
    Run the program → Select options from the menu.

## OUTPUT 
!(images/img1.png)
!(images/img2.png)


    
