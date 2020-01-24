<%-- 
    Document   : myProducts
    Created on : 24-ene-2020, 4:22:49
    Author     : jorgecorzo
--%>

<%@page import="ModeloDAO.ClientsDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Products"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.ProductsDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>Productos</h1>
            <a class="btn btn-success" href="Controlador?accion=addProduct">Agregar Producto</a>
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">NOMBRE</th>
                        <th class="text-center">PRECIO</th>
                    </tr>
                </thead>
                <%
                    ProductsDAO dao=new ProductsDAO();
                    List<Products>list=dao.listar();
                    Iterator<Products>iter=list.iterator();
                    Products cli=null;
                    while(iter.hasNext()){
                        cli=iter.next();
                    
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= cli.getNameProd_()%></td>
                        <td><%= cli.getPriceProd_()%></td>
                        <td class="text-center">
                            <a class="btn btn-danger" href="Controlador?accion=eliminar_&nameProd_=<%= cli.getIdProd_()%>">Eliminar</a>
                            <a class="btn btn-danger" href="Controlador?accion=realizar_&nameProd_=<%= cli.getNameProd_()%>">Comprar</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>
