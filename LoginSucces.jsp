<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/10/2022
  Time: 9:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!Doctype html PUBLIC "-" >
<html>
<head>
    <title>Login  Success Page</title>
</head>
<body>
    <h3>Hi <%= request.getAttribute("user") %>, Login Successful.</h3>
    <a href="login.html">Login Page</a>
</body>
</html>
