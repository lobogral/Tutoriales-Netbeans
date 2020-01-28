<%-- 
    Document   : form2
    Created on : 2/10/2018, 12:26:02 PM
    Author     : Camilo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <title>Recibiendo el formulario</title>
    </head>
    <body>
        <h1>Recibiendo el formulario</h1>
        <p>Tu IP: <%=request.getRemoteAddr()%></p>
        <p>Tu nombre es: <%=request.getParameter("nom")%></p>
        <p>Lo que viene de java es: <%=request.getAttribute("productom")%></p>
    </body>
</html>
