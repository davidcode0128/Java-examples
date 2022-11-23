<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
<style>
                
    .news_marquee {
        animation : slide 15s linear infinite ;
        color:black;
    }

    @keyframes slide {
        0% {
        transform: translatex(0%)
        }
    
        100% {
        transform: translatex(100%)
        }
    }
</style>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");          // 設定編碼防止中文出現亂碼
String info = request.getParameter("content");  // 獲取表單內容
// 表單提交到本身頁面必須進行null判斷
info = (info == null)? "" : info;               // 判斷內容是否為空
%>

<div class="news_marquee">
    <%=info%>
</div>
<%-- 表單提交到本身頁面 --%>
<form action="bulletboard.jsp" method="POST">
<label for="conteny">請輸入公告資訊：</label>
<input type="text" id="conteny" name="content" />
<input type="submit" value="釋出" />
<input type="reset" value="重置" />
</form>
</body>
</html>