<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>register</title>
</head>
<body>
    <h1>歡迎您進行注冊</h1>
    <script language="JavaScript" type="text/javascript">
        function checkPassword() {
            if (register.password1.value.length < 6 || register.password1.value.length > 20) {
                alert("請注意密碼長度應該不超過20同時不小于6位");
                return;
            }

            else {
                values = register.password1.value;
                var flag = false;
                for (var i = 0; i < values.length; i++) {
                    if ((values.charAt(i) >= 'A' && values.charAt(i) <= 'Z') || (values.charAt(i) >= 'a' && values.charAt(i) <= 'z')) {
                        if ((values.charAt(i) >= 'A' && values.charAt(i) <= 'Z')) {
                            for (var k = 0; k < values.length; k++) {
                                if ((values.charAt(k) >= 'a' && values.charAt(k) <= 'z')) {
                                    flag = true;
                                    break;
                                }
                            }
                        }
                        else {
                            for (var k = 0; k < values.length; k++) {
                                if ((values.charAt(k) >= 'A' && values.charAt(k) <= 'Z')) {
                                    flag = true;
                                    break;
                                }
                            }
                        }
                    }
                    }
                    if (flag == false) {
                        alert("密碼必須同時包含大小寫字母");
                        return;
                    }
                var flag1=false;
                for (var k = 0; k < values.length; k++) {
                    if((values.charAt(k)>='0'&&values.charAt(k)<='9')){
                        flag1=true;
                    }
                }
                if(flag1==false){
                    alert("密碼中必須含有數字");
                    return;
                }
            }
            register.submit();
        }
    </script>
<form name="register" action="registerMessage.jsp" method="post">
    請輸入賬號：<input type="text" name="name"><br>
    請輸入密碼(要求：必須包含大小寫英文和數字無非法字符，長度大于6位小于20位):<input type="password" name="password1"><br>
    請選擇性別：<input name="sex" type="radio" value="男" checked>男
              <input name="sex" type="radio" value="女" >女<br>
    請選擇家鄉：<select name="home" >
    <option value="北京">北京</option>
    <option value="上海">上海</option>
    <option value="陜西">陜西</option>
     </select>
    <br>
    請選擇您的愛好：<input name="fav" type="checkbox" value="唱歌">唱歌
                  <input name="fav" type="checkbox" value="跳舞">跳舞
                  <input name="fav" type="checkbox" value="打球">打球
                  <input name="fav" type="checkbox" value="玩游戲">玩游戲<br>
    <input type="button" value="註冊" onclick="checkPassword()">
</form>
</body>
</html>