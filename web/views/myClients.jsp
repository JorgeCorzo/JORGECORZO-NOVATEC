<%@page import="ModeloDAO.ClientsDAO"%>
<%@page import="Modelo.Clients"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
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
                        <th class="text-center">ID</th>
                        <th class="text-center">NOMBRE</th>
                        <th class="text-center">DNI</th>
                        <th class="text-center">EDAD</th>
                    </tr>
                </thead>
                <%
                    ClientsDAO dao=new ClientsDAO();
                    List<Clients>list=dao.listar();
                    Iterator<Clients>iter=list.iterator();
                    Clients cli=null;
                    while(iter.hasNext()){
                        cli=iter.next();
                    
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= cli.getIdClient_()%></td>
                        <td class="text-center"><%= cli.getNameClient_()%></td>
                        <td><%= cli.getDniClient_()%></td>
                        <td><%= cli.getAgeClient_()%></td>
                        <td class="text-center">
                            <a class="btn btn-danger" href="Controlador?accion=eliminar&idClient_=<%= cli.getIdClient_()%>">Eliminar</a>
                            <a class="btn btn-danger" href="Controlador?accion=comprar&idClient_=<%= cli.getNameClient_()%>">Ir a Comprar</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>
