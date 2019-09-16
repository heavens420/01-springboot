<%--
  Created by IntelliJ IDEA.
  User: heavens
  Date: 2019/9/12
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>User表</title>
</head>
<body>
    <table border="1px" align="center" width="50%">
        <tr>
            <th>Id</th>
            <th>name</th>
            <th>age</th>
        </tr>
        <c:forEach items="${userlist}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.age}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
