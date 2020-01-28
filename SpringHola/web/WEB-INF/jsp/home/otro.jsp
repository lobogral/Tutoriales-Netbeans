<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <title>JSP Page</title>
          <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
          <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
          <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="content">
        <h1>Hola</h1>
        <table class="table table-bordered">
            <thead>
                <th>ID</th>
                <th>Nombre</th>
            </thead>
            <tbody>
                <tr>
                    <td>1</td>
                    <td>Ivan Ramirez</td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>Camilo Contreras</td>
                </tr>
            </tbody>
        </table>
        <hr/>
        <div class="thumbnail">
            <img src="<c:url value= "/public/images/Imagen.png" />"
        </div>
        <hr/>
        <div class="panel panel-default">
            <div class="panel-heading">Encabezado</div>
            <div class="panel-body">Ejemplo panel basico</div>
        </div>
        <hr/>
        <a href="<c:url value="/home.htm"/>">Ir a home</a>
        </div>
    </body>
</html>
