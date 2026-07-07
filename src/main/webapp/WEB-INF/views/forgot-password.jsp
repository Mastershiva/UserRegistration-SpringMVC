<%@ page language="java" contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>Forgot Password</title>

<link rel="stylesheet"
href="${pageContext.request.contextPath}/css/style.css">

</head>

<body>

<div class="container">

<div class="card">

<h1>Reset Password</h1>

<p class="subtitle">
Reset your password using your username.
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

<form action="${pageContext.request.contextPath}/forgotPassword"
method="post">

<label>Username</label>

<input
type="text"
name="username"
placeholder="Enter Username"
required>

<label>New Password</label>

<input
type="password"
name="newPassword"
placeholder="Enter New Password"
required>

<button type="submit">

Reset Password

</button>

</form>

<div class="link-group">

<a href="${pageContext.request.contextPath}/login">

Back to Login

</a>

</div>

</div>

</div>

</body>

</html>