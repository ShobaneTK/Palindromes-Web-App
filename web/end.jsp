<%-- 
    Document   : end
    Created on : 06 Mar 2024, 4:44:50 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>End jsp</title>
    </head>
    <body>
        <h1>Our Summary</h1>
        
        <%
            Integer count = (Integer)request.getAttribute("count");
        %>
        <p>Number of words that were entered for checking : </p>
        <p>Number of words that were classified as palindromes: <b><%=count%></b></p>
        
    </body>
</html>
