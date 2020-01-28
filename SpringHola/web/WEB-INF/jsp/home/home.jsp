<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>JSP Page</title>
        <!--
        <link rel="stylesheet" href="${pageContext.request.contextPath}/public/css/estilos.css"/>
        -->
        <link rel="stylesheet" href="<c:url value= "/public/css/estilos.css" />"/>
        <script src="<c:url value= "/public/js/funciones.js" />"></script>
    </head>
    <body>
        <hr/>
        <img src="<c:url value= "/public/images/Imagen.png" />"/>
        <hr/>
        <a href="javascript:void(0);" onclick="saludo()">Haz click</a>
        <hr/>
        <h1 class="clase">Recuperacion de parametros</h1>
        <ul>
            <li>ID = <c:out value = "${id}" /></li>
            <li>ID2 = ${id2}</li>
        </ul>
        <hr/>
        <a href="<c:url value="/otro.htm"/>">Ir a otro</a>
    </body>
</html>
