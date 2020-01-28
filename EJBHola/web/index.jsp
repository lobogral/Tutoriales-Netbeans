<%-- 
    Document   : index
    Created on : 6/10/2018, 01:54:34 PM
    Author     : Camilo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo EJB</title>
    </head>
    <body>
        <h1>Hola desde EJB</h1>
        <jsp:useBean id="t" scope="request" class="Modelos.testModel" />
        <jsp:setProperty name="t" property="nombre" value="Hoz" />
        <jsp:getProperty name="t" property="nombre" />       
    </body>
</html>
