<%-- 
    Document   : index
    Created on : 24-ene-2020, 3:02:46
    Author     : jorgecorzo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Mi Servicio Web</title>
    </head>
    <body>
        <br>
        <br>
        <div class="container">
            <a class="btn btn-success btn-lg" href="Controlador?accion=listar">Ver Clientes</a>
            <a class="btn btn-success btn-lg" href="Controlador?accion=listProducts">Ver Productos</a>
            <a class="btn btn-success btn-lg" href="Controlador?accion=go_">Compras</a>
        </div>
    </body>
</html>
