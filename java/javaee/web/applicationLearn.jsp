<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: dyr
  Date: 2016/8/3
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>application learn</title>
</head>
<body>
<%
    application.setAttribute("key","value");
    Object value=application.getAttribute("key");
    Enumeration<String> names=application.getAttributeNames();
    while (names.hasMoreElements()){
        System.out.println(names.nextElement());
    }
    application.getServerInfo();
%>
</body>
</html>
