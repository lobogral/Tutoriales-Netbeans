<%-- 
    Document   : index
    Created on : 2/10/2018, 12:05:44 PM
    Author     : Camilo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <title>Trabajo con formularios</title>
    </head>
    <body>
        <h1>Ingrese sus datos</h1>
        <form action="form2.jsp" method="post" name="form">
            <p>Nombre: <input type="text" name="nom" /> </p>
            <p>E-mail: <input type="text" name="correo" /> </p>
            <p>Pais: 
                <select name="pais">
                    <option value="cl">Chile</option>
                    <option value="pe">Perú</option>
                    <option value="co">Colombia</option>
                    <option value="ve">Venezuela</option>
                    <option value="mx">Mexico</option>
                    <option value="ar">Argentina</option>
                </select>
            </p>
            <p>
                Sexo M: <input type="radio" name="sexo" value="m"/>
                Sexo F: <input type="radio" name="sexo" value="f"/>
            </p>
            <p>
                <hr />
                <input type="submit" value="Enviar" title="Enviar"/>
            </p>
        </form>
    </body>
</html>
