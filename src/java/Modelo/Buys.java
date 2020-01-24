/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;
import java.text.DateFormat;

/**
 *
 * @author jorgecorzo
 */
public class Buys {
    int idProd_;
    String product_;
    String id_clients;
    String date_;

    public Buys() {
    }

    public Buys(String product_, String id_clients, String date_) {
        this.product_ = product_;
        this.id_clients = id_clients;
        this.date_ = date_;
    }

    public int getIdProd_() {
        return idProd_;
    }

    public void setIdProd_(int idProd_) {
        this.idProd_ = idProd_;
    }

    public String getProduct_() {
        return product_;
    }

    public void setProduct_(String product_) {
        this.product_ = product_;
    }

    public String getId_clients() {
        return id_clients;
    }

    public void setId_clients(String id_clients) {
        this.id_clients = id_clients;
    }

    public String getDate_() {
        return date_;
    }

    public void setDate_(String date_) {
        this.date_ = date_;
    }

    
}
