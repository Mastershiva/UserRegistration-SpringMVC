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

<%
String error = (String)request.getAttribute("error");

if(error != null){
%>

<div class="error-message">
    <%=error%>
</div>

<%
}
%>

<form action="${pageContext.request.contextPath}/register" method="post">

<label>Full Name</label>

<input
type="text"
name="name"
required>

<label>Username</label>

<input
type="text"
id="username"
name="username"
required>

<div id="usernameCard" class="username-card"></div>

<label>Password</label>

<input
type="password"
id="password"
name="password"
required>

<label>Confirm Password</label>

<input
type="password"
id="confirmPassword"
required>

<div id="passwordMessage"
class="username-card"
style="display:none;">
</div>

<label>Email</label>

<input
type="email"
name="email"
required>

<label>Phone Number</label>

<input
type="text"
name="phone"
required>

<label>City</label>

<input
type="text"
name="city"
required>

<label>Age</label>

<input
type="number"
name="age"
required>

<label>Gender</label>

<div class="radio">

<input
type="radio"
name="gender"
value="Male"
required>

Male

&nbsp;&nbsp;

<input
type="radio"
name="gender"
value="Female">

Female

</div>

<label>Address</label>

<textarea
name="address"
rows="4">
</textarea>

<button
type="submit"
id="registerBtn">

Register

</button>

</form>

<div class="link-group">

<p>
Already have an account?
</p>

<a href="${pageContext.request.contextPath}/login">

Login

</a>

</div>

</div>

</div>

<script src="${pageContext.request.contextPath}/js/script.js"></script>

</body>

</html>