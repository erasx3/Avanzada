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
import javax.persistence.Id;

/**
 *
 * @author Facu
 */
@Entity
public class Articulo implements InterfaceConsumible, Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int codigo;
    @Basic
    private String nombre;
    @Basic
    private String descripcion;
    @Basic
    private Double precio;
    @Basic
    private int cantidad;

    public Articulo() {
    }

    public Articulo(int codigo, String nombre, String descripcion, Double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    public boolean isArticulo(int codigo){
        boolean aux = false;
        if(this.codigo == codigo){
            aux = true;
        }
        return aux;
    }
    
    public void sumarArticulo(int cantidad){
        this.cantidad = this.cantidad + cantidad;
    }
    
    public void descontarArticulo(int cantidad){
        this.cantidad = this.cantidad - cantidad;
    }
    
    public boolean comprobarStock(int cantidad){
        boolean aux = false;
        if(this.getCantidad() >= cantidad){
            aux = true;
        }
        return aux;
    }
}
