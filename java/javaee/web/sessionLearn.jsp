<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: dyr
  Date: 2016/8/1
  Time: 23:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>session learn</title>
</head>
<body>
<%
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy:MM:dd:hh:mm:ss");
    out.println(simpleDateFormat.format(new Date( session.getCreationTime())));
    out.println(session.getId());
    for(Enumeration<String> e=session.getAttributeNames();e.hasMoreElements();){
        out.println(e.nextElement());
    }
    session.setAttribute("key","value");
    session.setMaxInactiveInterval(10);
    session.invalidate();
%>
</body>
</html>
