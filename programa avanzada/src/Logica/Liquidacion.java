/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Date;

/**
 *
 * @author Facu
 */
public class Liquidacion {// ver para extender como un encabezado de liquidacion
    private int codigo;
    private String descripcion;
    private Date fecha;

    public Liquidacion(){
    }
    
    public Liquidacion(int codigo, String descripcion, Date fecha) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fecha = fecha;
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

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
