<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>首頁</title>
    </head>
    <body>
        <form action ="ApplicationController">
            <p>Please select an operation:
                <select name="operation">
                    <option>Login</option>
                    <option>Shopping</option>
                    <option>Logout</option>
                </select>
            </p>
            <p><input type="submit"/></p>
        </form>
    </body>
</html>