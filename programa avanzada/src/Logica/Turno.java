/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Date;

/**
 * COMO HACER CRITERIO DE ORDENACION TURNOS DE CLASE DE EMPRESA, ORDENADOR POR CRITERIO DE EMPRESA
 * @author eras
 */
public class Turno {
   private int codigo;
   private String descripcion;
   private Float hora;
   private Date fecha;
   
   //Relaciones
   private Cliente unCliente;
   private OrdenTrabajo unaOrdenTrabajo;

    public Turno() {
    }

    public Turno(Cliente unCliente, int codigo, String descripcion, Float hora, Date fecha) {
        this.unCliente = unCliente;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.hora = hora;
        this.fecha = fecha;
    }

    public OrdenTrabajo getUnaOrdenTrabajo() {
        return unaOrdenTrabajo;
    }

    public void setUnaOrdenTrabajo(OrdenTrabajo unaOrdenTrabajo) {
        this.unaOrdenTrabajo = unaOrdenTrabajo;
    }
    
    

    public Cliente getUnCliente() {
        return unCliente;
    }

    public void setUnCliente(Cliente unCliente) {
        this.unCliente = unCliente;
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

    public boolean disponibilidad(Date fecha, Float hora){
        boolean aux = false;
        if(this.fecha == fecha && this.hora == hora){
            aux = true;
        }
        return aux;
    }
   
    public boolean isTurno(int codigo){
        boolean aux = false;
        if(this.codigo == codigo){
            aux = true;
        }
        return aux;
    }
    
    public boolean isCliente(Cliente unCliente){
        boolean aux = false;
        if(this.unCliente == unCliente){
            aux = true;
        }
        return aux;
    }
    
    public void agregarOrden(OrdenTrabajo unaOrdenTrabajo){
        this.unaOrdenTrabajo = unaOrdenTrabajo;
    }
}
