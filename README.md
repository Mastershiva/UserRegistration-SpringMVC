# User Registration System - Spring MVC

A responsive **User Registration and Authentication** web application built using **Spring MVC** following the MVC architecture. The application provides user registration, login, authentication, password management, session handling, and live username availability validation using AJAX. User information is stored securely in a **MySQL** database using **JDBC**.

---

## 🚀 Features

### 👤 User Registration
- ✅ User Registration Form
- ✅ Responsive User Interface
- ✅ Form Validation
- ✅ Duplicate Username Validation
- ✅ Live Username Availability Check (AJAX)
- ✅ Case-Insensitive Username Validation
- ✅ Registration Success Page

### 🔐 Authentication
- ✅ User Login
- ✅ User Logout
- ✅ Session Management
- ✅ Protected Dashboard
- ✅ Prevent Unauthorized Dashboard Access

### 🔑 Password Management
- ✅ Forgot Password
- ✅ Change Password
- ✅ Old Password Verification
- ✅ Password Reset
- ✅ Success & Error Messages

### 🎨 User Experience
- ✅ Responsive Design
- ✅ Professional UI
- ✅ Clean Navigation
- ✅ Reusable CSS Styling

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
- JavaScript
- AJAX
- Eclipse IDE
- Git
- GitHub

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
│       │       ├── index.jsp
│       │       ├── login.jsp
│       │       ├── dashboard.jsp
│       │       ├── forgot-password.jsp
│       │       ├── change-password.jsp
│       │       └── success.jsp
│       └── web.xml
```

---

## 💾 Database

**Database:** MySQL

**Table:** `users`

### Columns

- id
- name
- username
- password
- email
- phone
- city
- age
- gender
- address

---

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone https://github.com/Mastershiva/UserRegistration-SpringMVC.git
```

### 2. Import into Eclipse

Import the project as an **Existing Maven Project**.

### 3. Create the Database

Create a MySQL database and the required `users` table.

### 4. Configure Database Connection

Update your database credentials in:

```text
src/main/java/com/shiva/util/DBConnection.java
```

### 5. Configure Apache Tomcat

Deploy the project on **Apache Tomcat 9**.

### 6. Run the Application

Open your browser and visit:

```text
http://localhost:8080/UserRegistration/
```
---

## 🔒 Authentication Flow

```text
User Registration
        │
        ▼
User Login
        │
        ▼
Dashboard
   ├──────── Change Password
   ├──────── Logout
   └──────── Session Management
        │
        ▼
Forgot Password (if required)
```

---

## 🔮 Future Enhancements

- 🔐 Password Encryption (BCrypt)
- 📧 Email Verification
- 📧 OTP-Based Password Reset
- 👤 User Profile Management
- ✏️ Edit Profile
- 🗑️ Delete Account
- 📷 Profile Picture Upload
- 👨‍💼 Admin Panel
- 📄 Pagination
- 🔍 Search & Filter
- 📊 Dashboard Analytics
- 🛡️ Spring Security Integration
- 📝 Audit Logging

---

## 👨‍💻 Author

**Shiva Narayanan**

GitHub: https://github.com/Mastershiva

---

## ⭐ Support

If you found this project helpful, consider giving it a **⭐ Star** on GitHub. It helps others discover the project and motivates future improvements.
