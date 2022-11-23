<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<form action="loginOrLogout" method="post">
 <table>
     <tr>
  <td>帳號:</td>
  <td><input type="text" name="account" placeholder="請輸入帳號"></td>
     </tr>
     <tr>
  <td>密碼:</td>
  <td><input type="password" name="passWord" placeholder="請輸入密碼"></td>
     </tr>
     <tr>
  <td></td>
  <td style="text-align:right;"><button type="button" onclick="location.href='register.jsp'">註冊</button>
                          <button type="submit" name="do" value="login">登入</button></td>
     </tr>
 </table>
</form>
</body>
</html>