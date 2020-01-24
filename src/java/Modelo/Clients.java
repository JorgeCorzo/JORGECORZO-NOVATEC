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
public class Clients {
    int idClient_;
    String nameClient_;
    long dniClient_;
    int ageClient_;

    public Clients() {
    }

    public Clients(String nameClient_, long dniClient_, int ageClient_) {
        this.nameClient_ = nameClient_;
        this.dniClient_ = dniClient_;
        this.ageClient_ = ageClient_;
    }

    public int getIdClient_() {
        return idClient_;
    }

    public void setIdClient_(int idClient_) {
        this.idClient_ = idClient_;
    }

    public String getNameClient_() {
        return nameClient_;
    }

    public void setNameClient_(String nameClient_) {
        this.nameClient_ = nameClient_;
    }

    public long getDniClient_() {
        return dniClient_;
    }

    public void setDniClient_(long dniClient_) {
        this.dniClient_ = dniClient_;
    }

    public int getAgeClient_() {
        return ageClient_;
    }

    public void setAgeClient_(int ageClient_) {
        this.ageClient_ = ageClient_;
    }
}
