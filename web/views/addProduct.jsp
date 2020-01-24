<%-- 
    Document   : addProduct
    Created on : 24-ene-2020, 4:22:35
    Author     : jorgecorzo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-6">
                <h1>Agregar Producto</h1>
                <form action="Controlador">
                    Nombre Producto:<br>
                    <input class="form-control" type="text" name="txtName"><br>
                    Precio Producto:<br>
                    <input class="form-control" type="text" name="txtPrice"><br>
                    <input class="btn btn-primary" type="submit" name="accion" value="Agregar_">
                    <a href="Controlador?accion=listProducts">Regresar</a>
                </form>
            </div>
        </div>
    </body>
</html>
