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
    private Double precioVenta;
    @Basic
    private Double precioLista;
    @Basic
    private Double DescuentoMayorista;
    @Basic
    private int cantidadMinima;
    @Basic
    private int cantidad;

    public Articulo() {
    }

    public Articulo(int codigo, String nombre, String descripcion, Double precioVenta, int cantidad) {
        super(codigo, descripcion);
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
    }

    public Articulo(String nombre, Double precioVenta, Double precioLista, Double DescuentoMayorista, int cantidadMinima, int cantidad) {
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.precioLista = precioLista;
        this.DescuentoMayorista = DescuentoMayorista;
        this.cantidadMinima = cantidadMinima;
        this.cantidad = cantidad;
    }

    public Articulo(String nombre, Double precioVenta, Double precioLista, Double DescuentoMayorista, int cantidadMinima, int cantidad, int codigo, String descripcion) {
        super(codigo, descripcion);
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.precioLista = precioLista;
        this.DescuentoMayorista = DescuentoMayorista;
        this.cantidadMinima = cantidadMinima;
        this.cantidad = cantidad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioVenta(Double precio) {
        this.precioVenta = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public Double getPrecioLista() {
        return precioLista;
    }

    public void setPrecioLista(Double precioLista) {
        this.precioLista = precioLista;
    }

    public Double getDescuentoMayorista() {
        return DescuentoMayorista;
    }

    public void setDescuentoMayorista(Double DescuentoMayorista) {
        this.DescuentoMayorista = DescuentoMayorista;
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }

    public void setCantidadMinima(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }
    
    public boolean isArticulo(int codigo) {
        boolean aux = false;
        if (super.getCodigo() == codigo) {
            aux = true;
        }
        return aux;
    }
    
    public boolean isArticulo(String descripcion){
        boolean aux = false;
        if (super.getDescripcion().equals(descripcion)) {
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

    public Double calcularTotal(int cantidad){
        Double aux=this.precioVenta*cantidad;
        if(cantidad>=this.cantidadMinima){
            aux=(this.precioVenta-(this.precioVenta*(this.DescuentoMayorista/100)))*cantidad;
        }
        return aux;
    }    
    public boolean comprobarStock(int cantidad) {
        boolean aux = false;
        if (this.getCantidad() >= cantidad) {
            aux = true;
        }
        return aux;
    }

    public String isConsumible(){
        return "Articulo";
    }
    
    @Override
    public String toString() {
        return this.nombre;
    }

}
