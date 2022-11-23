<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Account Center</title>
</head>
<body>
<p><%=(String)request.getSession().getAttribute("login") %> 您好!</p>
<form name="accountForm" method="post">
 <table>
     <tr>
  <td><button type="button" onclick="location.href='accountInfo.jsp'">會員資料</button></td>
  <td><button type="submit" name="do" value="logout" onclick="accountForm.action='loginOrLogout';accountForm.submit">登出</button></td>
     </tr>
 </table>
</form>
</body>
</html>