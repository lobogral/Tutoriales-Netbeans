<%-- 
    Document   : Vista
    Created on : 3/10/2018, 11:40:44 AM
    Author     : Camilo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hola mision</h1>
        <h1>Esta es una forma al estilo jquery: ${productom}</h1>
        <h1>Tengo otra forma mas al estilo de java: <%= request.getAttribute("productom") %></h1>
    </body>
</html>
