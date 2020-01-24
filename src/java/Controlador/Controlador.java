/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Buys;
import Modelo.Clients;
import Modelo.Products;
import ModeloDAO.BuysDAO;
import ModeloDAO.ClientsDAO;
import ModeloDAO.ProductsDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Locale;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author jorgecorzo
 */
@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {

    String listar="views/myClients.jsp";
    String listProd="views/myProducts.jsp";
    String listBuy="views/myBuys.jsp";
    String filBuy="views/filterBuys.jsp";
    String add="views/addClients.jsp";
    String addProduct = "views/addProduct.jsp";
    String edit="views/edit.jsp";
    Clients c=new Clients();
    Products p=new Products();
    Buys b=new Buys();
    ClientsDAO dao=new ClientsDAO();
    ProductsDAO daoP = new ProductsDAO();
    BuysDAO daob = new BuysDAO();
    DateFormat mydate = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        
    int id;
    String prueba, myprod, myclient;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceso="";
        String action=request.getParameter("accion");
        if(action.equalsIgnoreCase("listar")){
            acceso=listar;            
        }else if(action.equalsIgnoreCase("addClient")){
            acceso=add;
        }else if(action.equalsIgnoreCase("addProduct")){
            acceso=addProduct;
        }else if(action.equalsIgnoreCase("Agregar")){
            String name=request.getParameter("txtName");
            String dni=request.getParameter("txtDni");
            String age=request.getParameter("txtAge");
            c.setNameClient_(name);
            c.setDniClient_(Long.parseLong(dni));
            c.setAgeClient_(Integer.parseInt(age));
            dao.add(c);
            acceso=listar;
        }else if(action.equalsIgnoreCase("eliminar")){
            id=Integer.parseInt(request.getParameter("idClient_"));
            c.setIdClient_(id);
            dao.delete(id);
            acceso=listar;
        }else if(action.equalsIgnoreCase("listProducts")){
            acceso=listProd;
        }else if(action.equalsIgnoreCase("Agregar_")){
            String name=request.getParameter("txtName");
            String price=request.getParameter("txtPrice");
            p.setNameProd_(name);
            p.setPriceProd_(Long.parseLong(price));
            daoP.add_(p);
            acceso=listProd;
        }else if(action.equalsIgnoreCase("eliminar_")){
            id=Integer.parseInt(request.getParameter("nameProd_"));
            p.setNameProd_(myprod);
            daoP.delete(id);
            acceso=listProd;
        }else if(action.equalsIgnoreCase("comprar")){
            myclient=request.getParameter("idClient_");
            acceso=listProd;
        }else if(action.equalsIgnoreCase("realizar_")){
            myprod=request.getParameter("nameProd_");
            p.setNameProd_(myprod);
            LocalDate myObj = LocalDate.now(); // Create a date object
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String formattedDate = myObj.format(myFormatObj);
            daob.addB(myprod, myclient, formattedDate);
            acceso=listBuy;
        }else if(action.equalsIgnoreCase("Filtrar")){
            String f1=request.getParameter("txtIni");
            String f2=request.getParameter("txtFin");
            daob.list(f1,f2);
            acceso=filBuy;
        }else if(action.equalsIgnoreCase("go_")){
            acceso=listBuy;
        }
        RequestDispatcher vista=request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
