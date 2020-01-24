<%-- 
    Document   : myBuys
    Created on : 24-ene-2020, 9:37:07
    Author     : jorgecorzo
--%>

<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Buys"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.BuysDAO"%>
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
            <h1>Compras</h1>
            <form action="Controlador">
                    Fecha Inicial:<br>
                    <input class="form-control" type="text" name="txtIni" value="24-01-2020"><br>
                    Fecha Final:<br>
                    <input class="form-control" type="text" name="txtFin" value="29-01-2020"><br>
                    <input class="btn btn-primary" type="submit" name="accion" value="Filtrar">
                    <a href="Controlador?accion=listar">Regresar</a>
            </form>
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">CLIENTE</th>
                        <th class="text-center">PRODUCTO</th>
                        <th class="text-center">FECHA DE COMPRA</th>
                    </tr>
                </thead>
                <%
                    BuysDAO dao=new BuysDAO();
                    List<Buys>list=dao.listar();
                    Iterator<Buys>iter=list.iterator();
                    Buys cli=null;
                    while(iter.hasNext()){
                        cli=iter.next();
                    
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= cli.getId_clients()%></td>
                        <td class="text-center"><%= cli.getProduct_()%></td>
                        <td><%= cli.getDate_()%></td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>
