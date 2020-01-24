/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD_Prods;
import Modelo.Products;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorgecorzo
 */
public class ProductsDAO implements CRUD_Prods{

    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Products p = new Products();
    
    @Override
    public List listar() {
        ArrayList<Products>list=new ArrayList<>();
        String sql="select * from products";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Products prod=new Products();
                prod.setIdProd_(rs.getInt("idProd_"));
                prod.setNameProd_(rs.getString("nameProd_"));
                prod.setPriceProd_(rs.getLong("priceProd_"));
                list.add(prod);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Products list(int id, String fecha1, String fecha2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add_(Products prod) {
        String sql="insert into products values(idProd_.nextval ,'"+prod.getNameProd_()+"','"+prod.getPriceProd_()+"')";
        //String sql="execute pa_client_create(idProd_.nextval ,'"+prod.getNameProd_()+"','"+prod.getPriceProd_()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
    }

    @Override
    public boolean delete(int id) {
        String sql="delete from products where nameProd_="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
    
}
