<%-- 
    Document   : index
    Created on : 2/10/2018, 11:37:57 AM
    Author     : Camilo
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%! String datos; %>
<% datos = "Hola mundo desde mi Scriptlet"; %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <title>Primer ejemplo de JSP</title>
    </head>
    <body>
        <h1>Primer ejemplo de JSP</h1>
        <%-- Scriptlet de impresion--%>
        <p><%=datos%></p>
    </body>
</html>
