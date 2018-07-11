<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/8
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>



    <c:forEach items="${requestScope.ls}" var="v">
        <tr>
            <td>${v.id}</td>
            <td>${v.name}</td>
            <td>${v.age}</td>
            <td>${cid}</td>
        </tr>

    </c:forEach>
    </table>
</body>
</html>
