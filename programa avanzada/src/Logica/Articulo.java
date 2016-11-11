/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 *
 * @author Facu
 */
@Entity
public class Articulo extends Consumible implements Serializable {

    @Basic
    private String nombre;
    @Basic
    private Double precio;
    @Basic
    private int cantidad;

    public Articulo() {
    }

    public Articulo(int codigo, String nombre, String descripcion, Double precio, int cantidad) {
        super(codigo, descripcion);
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isArticulo(int codigo) {
        boolean aux = false;
        if (super.getCodigo() == codigo) {
            aux = true;
        }
        return aux;
    }

    public void sumarArticulo(int cantidad) {
        this.cantidad = this.cantidad + cantidad;
    }

    public void descontarArticulo(int cantidad) {
        this.cantidad = this.cantidad - cantidad;

    }

    public boolean comprobarStock(int cantidad) {
        boolean aux = false;
        if (this.getCantidad() >= cantidad) {
            aux = true;
        }
        return aux;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

}
