/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.Clients;
import java.util.List;

/**
 *
 * @author jorgecorzo
 */
public interface CRUD {
    public List listar();
    public Clients list(int id);
    public boolean add(Clients cli);
    public boolean delete(int id);
}
