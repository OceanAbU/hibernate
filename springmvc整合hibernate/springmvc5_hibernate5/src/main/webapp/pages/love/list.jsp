<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: qiudaozhang
  Date: 2019/9/19
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${ctx}/love/to/add">添加爱人</a>
<br>
    <table>
        <thead>
            <tr>
                <th>编号</th>
                <th>姓名</th>
                <th>操作</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${loves}" var="obj">
                <tr>
                    <td><a href="${ctx}/love/dogs?id=${obj.id}">${obj.id}</a></td>
                    <td>${obj.name}</td>
                    <td><a href="${ctx}/love/del?id=${obj.id}">删除</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
