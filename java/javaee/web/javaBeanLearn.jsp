<%--
  Created by IntelliJ IDEA.
  User: dyr
  Date: 2016/8/3
  Time: 20:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>java bean learn</title>
    <meta charset="utf-8">
</head>
<body>
<%--<jsp:useBean id="bean" class="bean.Bean" scope="page" />--%>
<jsp:useBean id="user" class="bean.Bean" scope="page" />
<jsp:setProperty name="user" property="*"/> <%--和表单中的同名属性匹配、所有属性--%>
<jsp:setProperty name="user" property="varint"/> <%--和表单中的同名属性匹配、指定属性属性--%>
<jsp:setProperty name="user" property="varint" value="3"/> <%--手动指定属性属性--%>
<jsp:setProperty name="user" property="varint" param="3"/> <%--url属性赋值--%>

<jsp:getProperty name="user" property="varint" />


<%=user.getVarint()%>
<br>
<%=user.getVarstring()%>
</body>
</html>
