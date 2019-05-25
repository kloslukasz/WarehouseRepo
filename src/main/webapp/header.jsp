<%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 25.05.2019
  Time: 09:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>

<form action="${pageContext.request.contextPath}/login" method="post">
    <input type="hidden" name="action" value="logout">
    <input type="submit" value="Log out">
</form>