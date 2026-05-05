# BugTrackingSystem
🐞 Bug Tracking System (Java + MySQL)

📌 Project Overview

This project is a Bug Tracking System developed using Java and MySQL.
It helps teams to report, track, and manage software bugs efficiently.

The system allows users to:

- Add new bugs
- View all bugs
- Update bug status
- Assign bugs to developers
- Store data permanently using a database

---

🚀 Features

- 🔐 User Login System (Admin / Developer)
- ➕ Add Bug with title, priority, and assignment
- 📋 View all reported bugs
- 🔄 Update bug status (Open / In Progress / Closed)
- 💾 MySQL Database integration
- 🧠 Clean OOP-based structure

---

🛠️ Tech Stack

- Language: Java
- Database: MySQL
- Concepts Used:
  - Object-Oriented Programming (OOP)
  - JDBC (Java Database Connectivity)
  - File Handling (initial version)

---

🏗️ Project Structure

BugTrackingSystem/
│
├── model/
│   └── Bug.java
│
├── service/
│   └── BugService.java
│
├── auth/
│   └── LoginSystem.java
│
├── util/
│   └── DBConnection.java
│
└── Main.java

---

⚙️ Setup Instructions

1️⃣ Clone the Repository

git clone https://github.com/your-username/bug-tracking-system.git
cd bug-tracking-system

2️⃣ Setup MySQL Database

Run the following SQL:

CREATE DATABASE bugtracker;

USE bugtracker;

CREATE TABLE bugs (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(100),
    priority VARCHAR(20),
    status VARCHAR(20),
    assigned_to VARCHAR(50)
);

3️⃣ Configure Database Connection

Update your MySQL username and password in:

DBConnection.java

---

4️⃣ Add MySQL Connector

Download and add MySQL Connector JAR to your project.

---

5️⃣ Run the Project

Compile and run:

javac Main.java
java Main

---

🧪 Sample Output

1.Add Bug
2.View Bugs
3.Update Status
4.Exit

Enter choice: 1
Title: Login Error
Priority: High
Assign To: Dev1

Bug added!

---

📈 Future Improvements

- GUI using Java Swing or JavaFX
- Web version using Spring Boot
- Email notifications
- Bug filtering & search
- Role-based access control

---

🎯 Learning Outcomes

- Understanding of real-world software systems
- Hands-on experience with Java + MySQL
- Strong foundation in backend development

---

👨‍💻 Author

Your Name

---

⭐ Conclusion

This project simulates a real-world bug tracking system similar to industry tools and helps in understanding how software teams manage issues efficiently.

---