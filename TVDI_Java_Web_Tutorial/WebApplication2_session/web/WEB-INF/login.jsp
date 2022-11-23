<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>登入畫面</title>
    </head>
    <body>
        <c:choose>
        <c:when test="${user != null}">
            <h1>
            歡迎光臨${user}，您已經登入<br>
            </h1>
            <a href="index.jsp">回首頁</a>
        </c:when>
        <c:otherwise>    
        <h1>What's your name!</h1>
        <form action="ApplicationController">
            <p>
                Username:
            <input type="text" name="user" required />
            </p>
            <input type="hidden" name="operation" value="Login" />
            <input type="submit"/>
        </form>
        </c:otherwise>
        </c:choose>
    </body>
</html>
