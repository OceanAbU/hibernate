<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: qiudaozhang
  Date: 2019/9/19
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>狗狗们</h2>
<table>
    <thead>
        <tr>
            <th>编号</th>
            <th>名称</th>
            <th>品种</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${love.dogs}" var="obj">
            <tr>
                <td>${obj.id}</td>
                <td>${obj.name}</td>
                <td>${obj.brand}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
