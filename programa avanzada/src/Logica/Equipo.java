/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author eras
 */
@Entity
public class Equipo implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int codigo;
    @Basic
    private String descripcion;
    
    //Relaciones
    @OneToMany
    private List<Estado> unosEstados;

    public Equipo() {
    }

    public Equipo(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
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
    
    public boolean isEquipo(int codigo){
        boolean aux = false;
        if(this.codigo == codigo){
            aux = true;
        }
        return aux;
    }
    
    public boolean isEquipo(String descripcion){
        boolean aux = false;
        if (this.getDescripcion().equals(descripcion)) {
            aux = true;
        }
        return aux;
    }
    
    public void agregarEstado(Estado unEstado){
    }
    
}
