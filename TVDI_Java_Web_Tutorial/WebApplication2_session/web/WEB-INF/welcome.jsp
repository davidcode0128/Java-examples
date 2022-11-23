<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>設計歡迎畫面</title>
    </head>
    <body>
        <h1>
            <c:choose>
                <c:when test="${empty user}">
                    請輸入姓名再嘗試登入
                </c:when>
                <c:otherwise>
                    Welcome
                    ${user}
                    !
                </c:otherwise>
            </c:choose>

        </h1>
        <a href="index.jsp">回首頁</a>        
    </body>
</html>