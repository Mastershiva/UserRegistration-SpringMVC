
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">

<title>Registration Successful</title>

<link rel="stylesheet"
href="${pageContext.request.contextPath}/css/style.css">

</head>

<body>

<div class="container">

<div class="card">

<h1 style="color:green;">
✔ Registration Successful
</h1>

<br>

<h2 style="text-align:center;">
Welcome ${name}
</h2>

<br>

<p style="text-align:center;font-size:18px;">
Your information has been stored successfully.
</p>

<br>

<div style="text-align:center;">

<a href="${pageContext.request.contextPath}/login">
    <button type="button">
        Go To Login
    </button>
</a>

</div>

</div>

</div>

</body>

</html>