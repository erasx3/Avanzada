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
public abstract class Servicio {
    private int codigo;
    private String descripcion;
    private Double subtotal;

    public Servicio() {
    }

    public Servicio(int codigo, String descripcion, Double subtotal) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.subtotal = subtotal;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }
    
    
}
