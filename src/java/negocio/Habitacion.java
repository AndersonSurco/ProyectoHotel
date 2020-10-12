/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author ander
 */
public class Habitacion {
    private String cod,tip,est;
    private double pre;

    public Habitacion() {
    }

    public Habitacion(String cod, String nom, String est, double pre) {
        this.cod = cod;
        this.tip = nom;
        this.est = est;
        this.pre = pre;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String nom) {
        this.tip = nom;
    }

    public String getEst() {
        return est;
    }

    public void setEst(String est) {
        this.est = est;
    }

    public double getPre() {
        return pre;
    }

    public void setPre(double pre) {
        this.pre = pre;
    }
    
    
}
