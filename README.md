# Document Verification System

##  Project Overview

The Document Verification System is a Java-based application designed to verify and store user documents efficiently.
It checks whether a document already exists in the database and prevents duplicate entries.

This project helps in maintaining unique records and ensures data consistency.

---

##  Problem Statement

In many systems, duplicate documents can be stored unintentionally, leading to redundancy and confusion.

This project provides a simple solution to:

* verify documents before storing
* avoid duplication
* maintain organized records

---

##  Features

* Add new document details
* Check for duplicate documents using ID
* Store verified documents in database
* Prevent duplicate entries
* Simple console-based interaction
* Uses MySQL for data storage

---

##  Technologies Used

* Java
* JDBC (Java Database Connectivity)
* MySQL
* OOP Concepts
* Exception Handling

---

##  Project Structure

```
src/
│── Main.java
│── database/
│   └── DBconnection.java
│── model/
│   └── document.java
│── service/
│   └── verificationService.java
```

---

##  How to Run

1. Make sure MySQL is running
2. Create database and table:

```sql
CREATE DATABASE doc_verify;

USE doc_verify;

CREATE TABLE documents (
    doc_id VARCHAR(50) PRIMARY KEY,
    name VARCHAR(100),
    type VARCHAR(50)
);
```

3. Add MySQL Connector JAR to project

4. Run the program:

```bash
java Main
```

---

##  Sample Input

```
Enter Document ID: 101  
Enter Name: Chandshi  
Enter Type: Aadhar  
```

---

##  Output

* If document already exists → Duplicate message
* If new → Document Verified & Stored

---

##  Learning Outcomes

* Working with JDBC and MySQL
* Database connectivity in Java
* Handling duplicate data using queries
* Structuring a real-world mini project

---

##  Final Note

This is a basic implementation of a document verification system.
It can be improved by adding a GUI, authentication, and advanced validation features.

---

