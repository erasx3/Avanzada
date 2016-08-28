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
public class Mayorista extends Cliente {
    private float descuento;
    private short cantidaMinima;
    
    public Mayorista(){
    }
    
    public Mayorista(float descuento, short cantidaMinima, int codigo, float dni, String nombre, String apellido, String direccion, long telefono) {
        super(codigo, dni, nombre, apellido, direccion, telefono);
        this.descuento = descuento;
        this.cantidaMinima = cantidaMinima;
    }

    public float getDescuento() {
        return descuento;
    }

    public short getCantidaMinima() {
        return cantidaMinima;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public void setCantidaMinima(short cantidaMinima) {
        this.cantidaMinima = cantidaMinima;
    }
    
    
    

    
}
