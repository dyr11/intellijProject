<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: dyr
  Date: 2016/8/1
  Time: 23:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>response learn</title>
</head>
<body>
<%
    response.setCharacterEncoding("utf-8");
    response.setContentType("text/html");
    PrintWriter printWriter=response.getWriter();
    printWriter.println("d");
    response.sendRedirect("url");
    request.getRequestDispatcher("url").forward(request,response);
%>
</body>
</html>
