<%-- 
    Document   : bmi_view
    Created on : 2022/6/28, 上午 11:41:00
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
        <jsp:useBean id = "bmi" class = "domain.Bmi" scope = "request"/>
        <jsp:setProperty name = "bmi" property = "*" />
    <%--    <jsp:setProperty  name = "bmi" property = "cm"/>
                   <jsp:setProperty name = "bmi" property = "kg"/> --%>
        
        cm:${bmi.cm} <br>
        kg:${bmi.kg} <br>
        bmi:${bmi.bmi}<br>
    </body>
</html>
