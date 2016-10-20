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
public class TipoTecnologia implements Serializable {
    
    @Id
    private int codigoTipo;
    @Basic
    private String nombre;
    @Basic
    private String descripcion;

    public TipoTecnologia() {
    }

    public TipoTecnologia(int codigo, String nombre, String descripcion) {
        this.codigoTipo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigoTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCodigo(int codigo) {
        this.codigoTipo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public boolean isTipoTecnologia(int codigo){
        boolean aux = false;
        if(this.codigoTipo == codigo){
            aux = true;
        }
        return aux;
    }
    
}
