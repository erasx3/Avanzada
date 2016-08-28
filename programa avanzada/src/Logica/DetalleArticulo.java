/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author eras
 */
public class DetalleArticulo extends Detalle {
    private short cantidad;

    public DetalleArticulo() {
    }

    public DetalleArticulo(short cantidad, int codigo, double subTotal) {
        super(codigo, subTotal);
        this.cantidad = cantidad;
    }

    public short getCantidad() {
        return cantidad;
    }

    public void setCantidad(short cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
}
