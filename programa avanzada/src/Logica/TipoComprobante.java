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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
/**
 *
 * @author eras
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class TipoComprobante implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int codigo;
    @Basic
    private String descripcion;

    public TipoComprobante() {
    }

    public TipoComprobante(int codigo, String descripcion) {
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
    
    public boolean isComprobante(int codigo){
        return true;
    }
    
    public boolean isTipoComprobante(String descripcion){
        boolean aux = false;
        if (this.getDescripcion().equals(descripcion)) {
            aux = true;
        }
        return aux;
    }
}
