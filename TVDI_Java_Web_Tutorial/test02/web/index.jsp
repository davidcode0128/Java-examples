<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>新增圖書信息</title>     
    </head>
    <body>
         <script language="JavaScript" type="text/javascript">
            function check(form) {
                    if (name.value === "") {
                        alert("圖書名稱不能為空");
                        return false;
                    }
                    if (price.value === "") {
                        alert("圖書價格不能為空");
                        return false;
                    }
                    if (bookCount.value === "") {
                        alert("圖書數量不能為空");
                        return false;
                    }
                    if (author.value === "") {
                        alert("作者不能為空");
                        return false;
                    }            
            }
        </script>
        <form name="add" action="AddbookServlet" method="post" onsubmit="return check(this)"> 
            <table align="center" width="450">
                <tbody>
                    <tr>
                        <td align="center" colspan="2">
                            <h2>新增圖書信息</h2> 
                            <hr> 
                        </td> 
                    </tr> 
                    <tr>
                        <td align="right">圖書名稱：</td>
                        <td>
                            <input type="text" name="name" id="name">
                        </td>
                    </tr>
                    <tr>
                        <td align="right">價 格：</td> 
                        <td><input type="text" name="price" id="price">
                        </td>
                    </tr> 
                    <tr>
                        <td align="right">數 量：</td> 
                        <td>
                            <input type="text" name="bookCount" id="bookCount">
                        </td> 
                    </tr> 
                    <tr> 
                        <td align="right">作 者：</td>
                        <td>
                            <input type="text" name="author" id="author">
                        </td>
                    </tr>
                    <tr> 
                        <td align="center" colspan="2">
                            <input type="submit" value="新　增">
                        </td>
                    </tr>
                </tbody>
            </table>
        </form>
        <form action="FindServlet"  method="get" >
            <input type="submit" value="查看所有資料">
        </form>

    </body>
</html>