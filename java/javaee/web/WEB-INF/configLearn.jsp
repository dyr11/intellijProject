<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: dyr
  Date: 2016/8/3
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>config learn</title>
</head>
<body>
<%
    config.getServletContext();
    config.getInitParameter("key");
    Enumeration<String> enumeration=config.getInitParameterNames();

%>
</body>
</html>
