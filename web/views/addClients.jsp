<%-- 
    Document   : add
    Created on : 24-ene-2020, 3:55:07
    Author     : jorgecorzo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
       <div class="container">
            <div class="col-lg-6">
                <h1>Agregar Clientes</h1>
                <form action="Controlador">
                    Nombre Cliente:<br>
                    <input class="form-control" type="text" name="txtName"><br>
                    DNI Cliente:<br>
                    <input class="form-control" type="text" name="txtDni"><br>
                    Edad: <br>
                    <input class="form-control" type="text" name="txtAge"><br>
                    <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
                    <a href="Controlador?accion=listar">Regresar</a>
                </form>
            </div>

        </div>
    </body>
</html>
