<%--
  Created by IntelliJ IDEA.
  User: dyr
  Date: 2016/8/4
  Time: 21:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>include learn</title>
</head>
<body>
<%@include file="index.jsp" %>
<jsp:include page="index.jsp" flush="true"/>
</body>
</html>
