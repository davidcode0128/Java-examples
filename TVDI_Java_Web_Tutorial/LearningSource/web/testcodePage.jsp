<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LoginServlet</title>
</head>
<body>
<script type="text/javascript">
<%--對輸入的賬號資訊進行判斷，賬號密碼不能為空且必須輸入驗證碼--%>
    function validate() {
   
   
        if(login.username1.value===""){
   
   
            alert("賬號不能為空");
            return;
        }
        if(login.passwd.value===""){
   
   
            alert("密碼不能為空");
            return;
        }
        if(login.code.value===""){
   
   
            alert("請輸入驗證碼");
            return;
        }
        login.submit();
    }
    function refresh() {
   
   
        login.imgValidate.src="testcode.jsp?id="+Math.random();
    }
</script>
<form name="login" action="/LoginCl" method="post">
    使用者名稱:<input type="text" name="username1"><br>
    密碼：<input type="password" name="passwd"><br>
    <input type="checkbox" name="keep" >兩週內免登陸<br>
    驗證碼：<input type="text" name="code" size=10>
    <%--點選圖片可進行驗證碼重新整理--%>
    <img name="imgValidate" src = "testcode.jsp" onclick="refresh()" ><br>
   <%--注意此處的button和submit的區別--%>
   <input type="button" value="登入"  onclick="validate()">
    <%
        String username = null;
        String password = null;
        Cookie[] cookies = request.getCookies();
        for (int i = 0; i < cookies.length; i++) {
   
   
            if ("username".equals(cookies[i].getName())) {
   
   
                username = cookies[i].getValue();
            } else if ("password".equals(cookies[i].getName())) {
   
   
                password = cookies[i].getValue();
            }
        }
        if (username != null && password != null) {
   
   
            response.sendRedirect("welcome.jsp?uname=" + username + "&password=" + password);
        }
    %>
</form>
  <form action="register.jsp" method="post">
    <input  type="submit" value="註冊">
</form>
</body>
</html>
