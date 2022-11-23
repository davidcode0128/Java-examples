<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="Model.Account, Model.AccountDao" %>
<%
    AccountDao accountDao = new AccountDao();
    accountDao.getAccount().setAccount((String)request.getSession().getAttribute("login"));
    accountDao.showAccountInfo();
    Account ac = accountDao.getAccount();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Account Infomation</title>
</head>
<body>
<form method="post" action="EditAccount">
 <table style="border:3px #000000 solid;padding:5px;" rules="all" cellpadding='5'>
  <tr>
      <td>帳號</td><td>新密碼</td><td>確認新密碼</td><td>姓名</td><td>電話</td>
  </tr>
  <tr>
      <input type="hidden" name="uid" value="<%=ac.getUid() %>">
      <td><%=ac.getAccount() %><input type="hidden" name="account" value="<%=ac.getAccount()%>"></td>
      <td><input type="passWord" name="newPassWord" required></td>
      <td><input type="passWord" name="confirmNPW" required></td>
      <td><input type="text" name="name" value="<%=ac.getName()%>" required></td>
      <td><input type="text" name="phone" value="<%=ac.getPhone()%>" required></td>
  </tr>
  <tr>
      <td>地址</td>
      <td>信箱</td>
      <td>註冊時間</td><td>確認密碼</td><td></td>
  </tr>
  <tr>
      <td><input type="text" name="address" value="<%=ac.getAddress()%>" required></td>
      <td><input type="text" name="email" value="<%=ac.getEmail()%>" required></td>      
      <td><input type="passWord" name="confirmPW" required></td>
      <td><button type="submit" name="do" value="edit">修改</button></td>  <!-- 判斷動作內容 -->
  </tr>
 </table>
</form>
</body>
</html>