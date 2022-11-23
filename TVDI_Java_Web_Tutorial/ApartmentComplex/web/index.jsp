<%@ page language="java" contentType="text/html; charset=utf-8"	pageEncoding="utf-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/bootstrap.css" type="text/css" >
        <script type="text/javascript" src="js/jquery.js"></script>
        <title>首頁</title>
    </head>
    <body style="text-algin: center;">        
        <h2>歡迎使用XX社區管理系統</h2>
        <div class="row text-center" style="padding-top:30px; padding-bottom:30px; background-color: #CCC; margin-top:10px;">
            <form action="login" method="post">
                <div class="col-md-6 col-md-offset-3">
                    <div>
                        <label>帳號:</label> 
                        <input type="text" id="username" name="username" />
                    </div>
                    <div>
                        <label class="img-circle">密碼:</label> 
                        <!-- name 用於後臺獲取值，一般class修飾樣式，id在js中用 -->
                        <input class="input" id="password" name="password" type="password" />
                    </div>
                    <div style="margin:10px 0px;">
                        <input class="btn btn-primary" type="submit" value="登入" /> 
                        <input class="btn btn-group" id="reset" type="button" value="重置" />
                    </div>
                </div>
            </form>            
        </div>
        <script type="text/javascript" src="js/jquery.js"></script>
        <a href="login.html">登入</a>|
        <a href="logout">登出</a>|
        <a href="profile">個人資訊</a>
    </body>
</html>
