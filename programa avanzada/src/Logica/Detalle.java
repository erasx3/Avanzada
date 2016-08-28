/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Facu
 */
public class Detalle {
    private int codigo;
    private double subTotal;

    public Detalle() {
    }

    public Detalle(int codigo, double subTotal) {
        this.codigo = codigo;
        this.subTotal = subTotal;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
    
    
    
}
