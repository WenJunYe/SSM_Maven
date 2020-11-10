<%--
  Created by IntelliJ IDEA.
  User: 26321
  Date: 2020/11/9
  Time: 20:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
    <h3>查询所有用户1</h3>
    <!--遍历-->
    <c:forEach items="${list}" var="user">
        ${user.name}
    </c:forEach>
</body>
</html>
