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
public class Estado {
    private int codigo;
    private String descripcion;
    
    //Relaciones
    private TipoEstado unTipoEstado;
    private Equipo unEquipo;
    private OrdenTrabajo unaOrdenTrabajo;

    public Estado() {
    }

    public Estado(int codigo, String descripcion, Equipo unEquipo, TipoEstado unTipoEstado, OrdenTrabajo unaOrdenTrabajo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.unEquipo = unEquipo;
        this.unTipoEstado = unTipoEstado;
        this.unaOrdenTrabajo = unaOrdenTrabajo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
