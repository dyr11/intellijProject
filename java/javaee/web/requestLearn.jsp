<%--
  Created by IntelliJ IDEA.
  User: dyr
  Date: 2016/8/1
  Time: 22:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>request learn</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");//
    String paramsValue=request.getParameter("paramsName");
    String[] paramsValues=request.getParameterValues("paramsName");//checkbox;
    request.setAttribute("key","value");
    request.getContextPath();
    request.getProtocol();


%>
</body>
</html>
