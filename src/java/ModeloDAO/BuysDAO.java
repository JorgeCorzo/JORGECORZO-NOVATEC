/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD_B;
import Modelo.Buys;
import Modelo.Clients;
import Modelo.Products;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorgecorzo
 */
public class BuysDAO implements CRUD_B{

    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Buys b=new Buys();
    
    @Override
    public List listar() {
        ArrayList<Buys>list=new ArrayList<>();
        String sql="select * from buy";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Buys cli=new Buys();
                cli.setProduct_(rs.getString("product_"));
                cli.setId_clients(rs.getString("id_clients"));
                cli.setDate_(rs.getString("date_"));
                list.add(cli);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public List list(String fecha1, String fecha2) {
        ArrayList<Buys>list=new ArrayList<>();
        String sql="select * from buy where date_ between '"+fecha1+"' and '"+fecha2+"'";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Buys cli=new Buys();
                cli.setProduct_(rs.getString("product_"));
                cli.setId_clients(rs.getString("id_clients"));
                cli.setDate_(rs.getString("date_"));
                list.add(cli);
            }
        } catch (Exception e) {
        }
        return list;
        /*String sql="select * from buy where date_ between '"+fecha1+"' and '"+fecha2+"'";
        System.out.print(sql);
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                b.setId_clients(rs.getString("id_clients"));
                b.setProduct_(rs.getString("product_"));
                b.setDate_(rs.getString("date_"));   
            }
        } catch (Exception e) {
        }
        return b;*/
    }

    @Override
    public boolean addB(String prod, String client, String date) {
        String sql="insert into buy values(idBuy_.nextval,'"+prod+"','"+client+"','"+date+"')";
        //String sql="execute pa_client_create(idProd_.nextval ,'"+prod.getNameProd_()+"','"+prod.getPriceProd_()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
    }
    
}
