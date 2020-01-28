<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
        <div class="row">
        <h1>Ingrese sus datos</h1>
        <form:form method="POST" commandName="persona">
            
            <form:errors path="*" element="div" cssClass="alert alert-danger"></form:errors>
            
            <p>
                <form:label path="nombre">Nombre</form:label>
                <form:input path="nombre" cssClass="form-control"/>
                <form:errors path="nombre" />
            </p>
            <p>
                <form:label path="correo">E-mail</form:label>
                <form:input path="correo" cssClass="form-control"/>
            </p>
            <p>
                <form:label path="edad">Edad</form:label>
                <form:input path="edad" cssClass="form-control"/>
            </p>
            <p>
                <form:label path="pais">Pais</form:label>
                <form:select path="pais" cssClass="form-control">
                    <form:option value="0">Seleccione...</form:option>
                    <form:options items="${paisLista}"/>
                </form:select>
            </p>
            <hr />
            <form:button type="submit" class="form-control">Enviar</form:button>
        </form:form>
        </div>
        </div>
    </body>
</html>
