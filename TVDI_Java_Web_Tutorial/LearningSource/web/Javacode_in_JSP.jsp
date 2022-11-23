<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!
    String getContent() {
        return "Hello world";
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>            
            <% String localVariable = getContent();%>
            <%
                out.println(localVariable);
            %>
            <%= localVariable%>
        </h1>
    </body>
</html>
