<%-- 
    Document   : Servlet1
    Created on : 2/10/2018, 05:32:24 PM
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
        <li> <a href="nosotros">Nosotros</a> </li>
        <li> <a href="mision">Mision</a> </li>
        <form action="alterno" method="post" name="form">
            <p>Nombre: <input type="text" name="nom" /> </p>
            <input type="submit" value="Enviar" title="Enviar"/>
        </form>
    </body>
</html>
