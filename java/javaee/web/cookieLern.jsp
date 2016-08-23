<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.net.URLDecoder" %><%--
  Created by IntelliJ IDEA.
  User: dyr
  Date: 2016/8/3
  Time: 22:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>cookie learn</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    Cookie cookie=new Cookie("name","value");
    cookie.setMaxAge(10);//seconds
    cookie.getMaxAge();
    cookie.setValue("value");
    String value=cookie.getValue();
    response.addCookie(cookie);

   String s= URLEncoder.encode("string","utf-8");
    String s2= URLDecoder.decode(s,"utf-8");
    Cookie[] cookies=request.getCookies();
    for(Cookie c:cookies){
        c.setMaxAge(0);//clear cookie;
        response.addCookie(c);//send back to client
    }
%>
</body>
</html>
