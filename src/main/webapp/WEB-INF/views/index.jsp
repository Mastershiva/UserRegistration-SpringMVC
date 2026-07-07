<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>User Registration</title>

<link rel="stylesheet"
href="${pageContext.request.contextPath}/css/style.css">

</head>

<body>

<div class="container">

<div class="card">

<h1>User Registration</h1>

<p class="subtitle">
Welcome! Please fill your details.
</p>

<form action="register" method="post">

<label>Full Name</label>

<input type="text"
name="name"
required>

<label>Email</label>

<input type="email"
name="email"
required>

<label>Phone Number</label>

<input type="text"
name="phone"
required>

<label>City</label>

<input type="text"
name="city"
required>

<label>Age</label>

<input type="number"
name="age"
required>

<label>Gender</label>

<div class="radio">

<input type="radio"
name="gender"
value="Male">

Male

<input type="radio"
name="gender"
value="Female">

Female

</div>

<label>Address</label>

<textarea
name="address"
rows="4"></textarea>

<button type="submit">

Register

</button>

</form>

</div>

</div>

<script src="${pageContext.request.contextPath}/js/script.js"></script>

</body>

</html>