<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>設計登出畫面</title>
    </head>
    <body> 
        <h1>   
            <c:if test="${user != null}">
                ${user}
                <br>
                <br>
                您已完成登出！
            </c:if>
            <c:if test="${user == null}">
                您尚未登入，無法執行此操作    
            </c:if>
        </h1>
        <br>
        <br>           
        <a href="index.jsp">回首頁</a>          
    </body>
</html>
