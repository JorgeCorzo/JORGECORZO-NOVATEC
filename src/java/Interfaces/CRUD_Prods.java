/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.Products;
import java.util.List;

/**
 *
 * @author jorgecorzo
 */
public interface CRUD_Prods {
    public List listar();
    public Products list(int id, String fecha1, String fecha2);
    public boolean add_(Products prod);
    public boolean delete(int id);
}
