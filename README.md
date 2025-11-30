🏨 Hotel Reservation System (Java + MySQL)

A desktop-based Hotel Reservation System built using Java and MySQL.
This project allows hotel staff to manage room bookings, customers, billing, and room availability in an efficient and user-friendly way.

📌 Features

✔ Room Management (Add, Edit, Delete)

✔ Customer Management

✔ Room Booking / Reservation

✔ Check-In & Check-Out

✔ Billing & Invoice Generation

✔ View Available Rooms

✔ MySQL Database Integration

✔ Login System (optional)

🛠️ Technologies Used

Java (Swing / JavaFX or Console)

MySQL Database

JDBC (Java Database Connectivity)

XAMPP / WAMP / MySQL Server

🗄️ Database Structure

Main tables:

rooms

customers

reservations

room_types

payments

users

You can import the SQL file (hotel.sql) to MySQL.

🚀 How to Run the Project
1. Install Requirements

Java JDK (8+)

MySQL Server or XAMPP

MySQL Connector/J (JDBC Driver)

2. Import the Database

Open phpMyAdmin or MySQL CLI

Create database:

CREATE DATABASE hotel_db;


Import the SQL file:

hotel_db.sql

3. Configure Database Connection

In your Java code update:

String url = "jdbc:mysql://localhost:3306/hotel_db";
String user = "root";
String password = "root";


(Modify depending on your MySQL username/password.)

4. Run the Project

Compile and run:

javac Main.java  
java Main


Or run directly from IntelliJ / NetBeans / Eclipse.

📷 Screenshots (Optional)

Insert screenshots here:

/screenshots/home.png  
/screenshots/reservation.png  
/screenshots/billing.png  

📚 Project Modules

Login Module

Dashboard

Room Module

Customer Module

Booking/Reservation

Billing

Reports

👨‍💻 Author

Your Name Piyush sain

Email Piyushsain12345@gmail.com

GitHub Link https://github.com/Piyushsain12345/CodeAlpha_Hotel-Reservation-System

📄 License

This project is for educational purposes only.
(You can choose MIT License if required.)
