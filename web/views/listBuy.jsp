<%-- 
    Document   : listBuy
    Created on : 24-ene-2020, 9:29:39
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
            <h1>Clientes</h1>
            <a class="btn btn-success btn" href="Controlador?accion=addClient">Agregar Cliente</a>
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">CLIENTE</th>
                        <th class="text-center">PRODUCTO</th>
                        <th class="text-center">FECHA</th>
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
                        <td class="text-center">
                            <a class="btn btn-danger" href="Controlador?accion=eliminar">FILTRAR</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>
