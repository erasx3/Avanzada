/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Date;

/**
 *
 * @author eras
 */
public class Encabezado {
    private int codigo;
    private String descripcion;
    private Date fecha;
    private Double total;

    public Encabezado() {
    }

    public Encabezado(int codigo, String descripcion, Date fecha, Double total) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.total = total;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Double getTotal() {
        return total;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
    
}
