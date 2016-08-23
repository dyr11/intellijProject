<%--
  Created by IntelliJ IDEA.
  User: dyr
  Date: 2016/7/31
  Time: 19:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>

<%!
    String str;

    int add(int a, int b) {
        return a + b;
    }
%>

<%
    out.println("-------------hello world!----------<br>");
    for(int i=1;i<=9;i++){
        for(int j=1;j<=i;j++){
            out.print(i+" x " +j+" = "+i*j+" ");
        }
        out.println("<br>");
    }
%>
out.getBufferSize():<%=out.getBufferSize()%>
out.getRemaining():<%=out.getRemaining()%>
out.isAutoFlush():<%=out.isAutoFlush()%>
<%--<%out.clear();%>--%>

</body>
</html>
