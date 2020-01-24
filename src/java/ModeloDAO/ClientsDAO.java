/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD;
import Modelo.Clients;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorgecorzo
 */
public class ClientsDAO implements CRUD{

    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Clients p=new Clients();
    
    @Override
    public List listar() {
        ArrayList<Clients>list=new ArrayList<>();
        String sql="select * from clients";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Clients cli=new Clients();
                cli.setIdClient_(rs.getInt("idClient_"));
                cli.setNameClient_(rs.getString("nameClient_"));
                cli.setDniClient_(rs.getLong("dniClient_"));
                cli.setAgeClient_(rs.getInt("ageClient_"));
                list.add(cli);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Clients list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Clients cli) {
        String sql="insert into clients values(idClient_.nextval,'"+cli.getNameClient_()+"','"+cli.getDniClient_()+"','"+cli.getAgeClient_()+"')";
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
        //String sql="execute pa_client_delete('"+id+"')";
        String sql="delete from clients where idClient_="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
    
}
