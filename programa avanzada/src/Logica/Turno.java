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
public class Turno {
   private int codigo;
   private String descripcion;
   private Float hora;
   private Date fecha;

    public Turno() {
    }

    public Turno(int codigo, String descripcion, Float hora, Date fecha) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.hora = hora;
        this.fecha = fecha;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Float getHora() {
        return hora;
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

    public void setHora(Float hora) {
        this.hora = hora;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

  
   
   
}
