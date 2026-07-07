<%@ page language="java" contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>User Login</title>

<link rel="stylesheet"
href="${pageContext.request.contextPath}/css/style.css">

</head>

<body>

<div class="container">

<div class="card">

<h1>User Login</h1>

<p class="subtitle">
Login to continue
</p>

<%
String error = (String)request.getAttribute("error");
String success = (String)request.getAttribute("success");

if(success != null){
%>

<div class="success-message">
    <%=success%>
</div>

<%
}

if(error != null){
%>

<div class="error-message">
    <%=error%>
</div>

<%
}
%>

<form action="${pageContext.request.contextPath}/login" method="post">

<label>Username</label>

<input
type="text"
name="username"
placeholder="Enter Username"
required>

<label>Password</label>

<input
type="password"
name="password"
placeholder="Enter Password"
required>

<button
id="loginBtn"
type="submit">

Login

</button>

</form>

<div class="link-group">

<a href="${pageContext.request.contextPath}/forgotPassword">
Forgot Password?
</a>

<br><br>

<p>
Don't have an account?
</p>

<a href="${pageContext.request.contextPath}/register">
Create New Account
</a>

</div>

</div>

</div>

</body>

</html>