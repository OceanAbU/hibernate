<%--
  Created by IntelliJ IDEA.
  User: qiudaozhang
  Date: 2019/9/19
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${ctx}/love/add" method="post">
        姓名：<input type="text" name="name"> <br>
    <input type="submit" value="添加">
</form>
</body>
</html>
