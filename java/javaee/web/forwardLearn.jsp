<%--
  Created by IntelliJ IDEA.
  User: dyr
  Date: 2016/8/4
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>forward learn</title>
</head>
<body>
<jsp:forward page="index.jsp"/>
<%--same as --%>
<%
    request.getRequestDispatcher("index.jsp").forward(request,response);
%>
</body>
</html>
