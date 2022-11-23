<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@page import="java.util.List"%>
<%@page import="model.book"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert title here</title>
    </head>
    <body>
        <table align="center" width="450" border="1">
            <tr>
                <td align="center" colspan="5">
                    <h2>所有圖書資訊</h2>
                </td>
            </tr>
            <tr align="center">
                <td><b>ID</b></td>
                <td><b>圖書名稱</b></td>
                <td><b>價格</b></td>
                <td><b>數量</b></td>
                <td><b>作者</b></td>
                <td><b>修改數量</b></td>
                <td><b>刪除</b></td>
            </tr>
            <%
                // 獲取圖書資訊集合
                List<book> list = (List<book>) request.getAttribute("list");
                if (list == null || list.size() < 1) {
                    out.print("沒有資料!");
                } else {
                    for (book book : list) {
            %>
            <tr align="center">
                <td><%=book.getId()%></td>
                <td><%=book.getName()%></td>
                <td><%=book.getPrice()%></td>
                <td><%=book.getBookCount()%></td>
                <td><%=book.getAuthor()%></td>
                <td>
                    <form action="UpdateServlet" method="post" onsubmit="return check(this);">
                        <input type="hidden" name="id" value="<%=book.getId()%>">
                        <input type="text" name="bookCount" size="3">
                        <input type="submit" value="修 改">
                    </form>
                </td>
                <td>
                    <a href="DeleteServlet?id=<%=book.getId()%>">刪除</a>
                </td>
            </tr>
            <%
                    }
                }
            %>
            <tr align="center">
            <a href="index.jsp">回首頁</a>
            </tr>
        </table>
    </body>
</html>