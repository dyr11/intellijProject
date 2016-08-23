<%--
  Created by IntelliJ IDEA.
  User: dyr
  Date: 2016/8/4
  Time: 21:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>params learn</title>
</head>
<body>
<jsp:forward page="index.jsp">
    <jsp:param name="email" value="123@qq.com"/>
</jsp:forward>
</body>
</html>
