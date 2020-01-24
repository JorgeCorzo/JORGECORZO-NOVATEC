/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.Buys;
import Modelo.Products;
import java.sql.Date;
import java.text.DateFormat;
import java.util.List;

/**
 *
 * @author jorgecorzo
 */
public interface CRUD_B {
    public List listar();
    public List list(String fecha1, String fecha2);
    public boolean addB(String prod, String client, String date);
}
