<%-- 
    Document   : simple
    Created on : 2022/6/15, 上午 09:32:38
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Color Lover!</h1>
        <p>Your favorite color is 
            <%= request.getParameter("favoriteColor")  %></p>
        Wow, mine is too.
    </body>
</html>
