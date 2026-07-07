<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.setHeader("Pragma", "no-cache");
response.setDateHeader("Expires", 0);

if(session.getAttribute("username") == null){
    response.sendRedirect(request.getContextPath() + "/login");
    return;
}
%>
<%@ page language="java" contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>User Dashboard</title>

<link rel="stylesheet"
href="${pageContext.request.contextPath}/css/style.css">

</head>

<body>

<div class="container">

<div class="card">

<h1>
Welcome, ${username} 👋
</h1>

<%
String success = (String)request.getAttribute("success");

if(success != null){
%>

<div class="success-message">
    <%=success%>
</div>

<%
}
%>

<p class="dashboard-message">
Login Successful ✔
</p>

<div class="dashboard-actions">

<a href="${pageContext.request.contextPath}/changePassword">
Change Password
</a>

<a href="${pageContext.request.contextPath}/logout">
Logout
</a>

</div>

<div class="footer">

Spring MVC User Registration Project

</div>

</div>

</div>

</body>

</html>