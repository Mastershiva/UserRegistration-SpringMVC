# User Registration System - Spring MVC

## 📌 Overview

A responsive User Registration web application developed using **Spring MVC** following the MVC architecture. The application allows users to register, validates duplicate usernames with **live AJAX validation**, and stores user details in a **MySQL** database using **JDBC**.

---

## 🚀 Features

- ✅ User Registration Form
- ✅ Responsive User Interface
- ✅ Spring MVC Architecture
- ✅ MySQL Database Integration
- ✅ JDBC Connectivity
- ✅ Form Validation
- ✅ Duplicate Username Validation
- ✅ Live Username Availability Check (AJAX)
- ✅ Case-Insensitive Username Validation
- ✅ Success Confirmation Page

---

## 🛠️ Technologies Used

- Java 8
- Spring MVC
- Maven
- JSP
- JDBC
- MySQL
- Apache Tomcat 9
- HTML5
- CSS3
- JavaScript (AJAX)
- Eclipse IDE
- Git & GitHub

---

## 📂 Project Structure

```text
src/
├── main/
│   ├── java/
│   │   ├── controller/
│   │   ├── dao/
│   │   ├── model/
│   │   └── util/
│   │
│   ├── resources/
│   │
│   └── webapp/
│       ├── css/
│       ├── js/
│       ├── WEB-INF/
│       │   └── views/
│       └── web.xml
```

---

## 💾 Database

**Database:** MySQL

**Table:** `users`

Sample Fields:

- id
- name
- username
- email
- phone
- city
- age
- gender
- address

---

## ▶️ How to Run

1. Clone the repository.

```bash
git clone https://github.com/Mastershiva/UserRegistration-SpringMVC.git
```

2. Import the project as a **Maven Project** in Eclipse.

3. Create a MySQL database.

4. Update the database credentials in:

```text
DBConnection.java
```

5. Configure **Apache Tomcat 9**.

6. Run the project.

7. Open your browser and navigate to:

```text
http://localhost:8080/UserRegistration/
```

---

## 🔮 Future Enhancements

- User Login
- View Registered Users
- Edit User Details
- Delete User
- Search Users
- Pagination
- Password Encryption
- Email Verification
- Bootstrap UI
- Spring Security Integration

---

## 👨‍💻 Author

**Shiva Narayanan**

GitHub: https://github.com/Mastershiva

---

## ⭐ If you found this project useful, consider giving it a Star!
