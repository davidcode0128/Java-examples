<%-- 
    Document   : bmiView
    Created on : 2022/6/15, 下午 02:16:28
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
        
        <P>
            身高：${model.身高cm}cm <br>
            體重：${model.體重kg}kg<br>
            您的 bmi 值為：${model.bmi}<br>
            評語：${model.result}
        </P>
    </body>
</html>
