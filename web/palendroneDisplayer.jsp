<%-- 
    Document   : palendroneDisplayer
    Created on : 06 Mar 2024, 3:51:21 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Outcome</title>
    </head>
    <body>
        <h1>OUTCOME</h1>
        <%
            String name = (String) request.getAttribute("name");
            String reversed = (String) request.getAttribute("reversed");
            String outCome = (String)request.getAttribute("outCome");
            Integer count = (Integer)request.getAttribute("count");
        %>
        <table>
            <tr>
                <td>The entered word</td>
                <td>
                    <b><%=name%></b>
                </td>
            </tr>
            <tr>
                <td>The reverse form of the entered word.</td>
                <td>
                    <b><%=reversed%></b>
                </td>
            </tr>
        </table>
                <p><b><%=outCome%></b></p>
                
                <p>Please click <a href="start.html">here</a> to check another palindromes or <a href="end.jsp">here</a> to end .</p>
    </body>
</html>
