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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
/**
 *
 * @author Facu
 */
@Entity
public class Tecnologia implements Serializable {
    @Id
    private int codigo;
    @Basic
    private String descripcion;
    
    //Relaciones
    @ManyToOne
    @JoinColumn(name = "tipoTecnologia_FK", referencedColumnName = "codigoTipo")
    private TipoTecnologia unTipoTecnologia;

    public Tecnologia() {
    }

    public Tecnologia(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public Tecnologia(int codigo, String descripcion, TipoTecnologia unTipoTecnologia) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.unTipoTecnologia = unTipoTecnologia;
    }

    public TipoTecnologia getUnTipoTecnologia() {
        return this.unTipoTecnologia;
    }

    public void setUnTipoTecnologia(TipoTecnologia unTipoTecnologia) {
        this.unTipoTecnologia = unTipoTecnologia;
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
    
    public boolean isTecnologia(int codigo){
        boolean aux = false;
        if(this.codigo == codigo){
            aux = true;
        }
        return aux;
    }
    
    public boolean isTecnologia(String descripcion){
        boolean aux = false;
        if (this.getDescripcion().equals(descripcion)) {
            aux = true;
        }
        return aux;
    }

    @Override
    public String toString() {
        return "Tecnologia{" + "codigo=" + codigo + ", descripcion=" + descripcion + '}';
    }
    
    
    
}
