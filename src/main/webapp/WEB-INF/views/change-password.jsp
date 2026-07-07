<%@ page language="java" contentType="text/html;charset=UTF-8"%>

<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.setHeader("Pragma", "no-cache");
response.setDateHeader("Expires", 0);

if(session.getAttribute("username") == null){
    response.sendRedirect(request.getContextPath() + "/login");
    return;
}
%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Change Password</title>

<link rel="stylesheet"
href="${pageContext.request.contextPath}/css/style.css">

</head>

<body>

<div class="container">

<div class="card">

<h1>Change Password</h1>

<p class="subtitle">
Update your password securely.
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

<form action="${pageContext.request.contextPath}/changePassword"
method="post">

<label>Old Password</label>

<input
type="password"
name="oldPassword"
placeholder="Enter Old Password"
required>

<label>New Password</label>

<input
type="password"
name="newPassword"
placeholder="Enter New Password"
required>

<button type="submit">

Change Password

</button>

</form>

<div class="link-group">

<a href="${pageContext.request.contextPath}/dashboard">

Back to Dashboard

</a>

</div>

</div>

</div>

</body>

</html>