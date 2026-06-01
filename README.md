📌 Student CRUD Management System (Java + JDBC)
🚀 Project Overview

This is a simple Java console-based CRUD application built using JDBC (Java Database Connectivity).
It allows users to perform basic database operations like Create, Read, Update, and Delete (CRUD) on student records stored in MySQL database.

🛠️ Tech Stack
Java (Core Java)
JDBC (Java Database Connectivity)
MySQL Database
Eclipse IDE

📂 Project Structure
JDBCPROJECT/
│
├── src/
│   └── MyPackage/
│        ├── App.java          (Main Menu Application)
│        ├── DB.java          (Database Connection)
│        ├── Student.java     (Model Class)
│        └── StudentDAO.java  (CRUD Operations)
│
└── README.md

⚙️ Features
✔ Insert new student record
✔ View all student records
✔ Update student details
✔ Delete student record
✔ Menu-driven console interface

🗄️ Database Setup
1. Create Database
CREATE DATABASE minshu;

2. Use Database
USE minshu;

4. Create Table
CREATE TABLE student (
    sid INT PRIMARY KEY,
    sname VARCHAR(200),
    semail VARCHAR(200)
);

🔌 JDBC Configuration
Update your DB.java file:

String url = "jdbc:mysql://localhost:3306/minshu?useSSL=false&serverTimezone=UTC";
String user = "root";
String password = "your_password";

▶️ How to Run Project
Clone repository
git clone https://github.com/your-username/JDBCPROJECT.git
Import project in Eclipse
Add MySQL Connector JAR to Build Path
Run App.java
Use menu options

📸 Output Example
===== STUDENT CRUD APP =====
1. Insert Student
2. Read Students
3. Update Student
4. Delete Student
5. Exit
   
💡 Future Improvements
Add GUI using Java Swing / JavaFX
Add login system
Convert into Spring Boot REST API
Add validation and exception handling

👨‍💻 Author
Minshu Dubey
BCA Student | Java Developer (Learning Phase)
