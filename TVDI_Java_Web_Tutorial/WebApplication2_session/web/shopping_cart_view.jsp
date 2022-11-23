<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>設計購物車結果畫面</title>
    </head>
    <body>
        <%
            // 要避免在 JSP 裡寫 JAVA , 因此使用 JSTL 代替
            // request.setCharacterEncoding("UTF-8");
        %>
        
        <fmt:requestEncoding value = "UTF-8" />
        <h1>${user}購物車</h1>
        <ul>
            <c:forEach var="item" items="${paramValues.fruit}">
                <li>
                    ${item}
                </li>
            </c:forEach>
        </ul>
        <a href="index.jsp">回首頁</a>
    </body>
</html>
