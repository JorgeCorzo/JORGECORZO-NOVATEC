/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author jorgecorzo
 */
public class Products {
    int idProd_;
    String nameProd_;
    long priceProd_;

    public Products() {
    }

    public int getIdProd_() {
        return idProd_;
    }

    public void setIdProd_(int idProd_) {
        this.idProd_ = idProd_;
    }

    public String getNameProd_() {
        return nameProd_;
    }

    public void setNameProd_(String nameProd_) {
        this.nameProd_ = nameProd_;
    }

    public long getPriceProd_() {
        return priceProd_;
    }

    public void setPriceProd_(long priceProd_) {
        this.priceProd_ = priceProd_;
    }
    
}
