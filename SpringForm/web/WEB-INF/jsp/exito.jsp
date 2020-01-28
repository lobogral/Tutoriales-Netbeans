<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultado de formulario</h1>
        <u1>
            <li>Nombre: <c:out value="${nombre}" /></li>
            <li>Correo: <c:out value="${correo}" /></li>
            <li>Edad: <c:out value="${edad}" /></li>
            <li>Pais: <c:out value="${pais}" /></li>
            
        </u1>
    </body>
</html>
