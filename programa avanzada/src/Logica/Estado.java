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
import javax.persistence.OneToOne;
/**
 *
 * @author eras
 */
@Entity
public class Estado implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int codigo;
    @Basic
    private String descripcion;
    
    //Relaciones
    @OneToOne
    private TipoEstado unTipoEstado;
    @OneToOne
    private Equipo unEquipo;
    @OneToOne
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
