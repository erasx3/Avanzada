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
public class Proyecto extends Servicio implements Serializable {
    @Basic
    private Float tiempoEstimado;
    
    //Relaciones
    @OneToMany
    private List<Concepto> unosConceptos;
    @OneToMany
    private List<Tecnologia> unasTecnologias;
    @OneToMany
    private List<OrdenTrabajo> unasOrdenesTrabajos;

    public Proyecto() {
    }

    public Proyecto(Float tiempoEstimado, int codigo, String descripcion) {
        super(codigo, descripcion);
        this.tiempoEstimado = tiempoEstimado;
    }

    public Proyecto(Float tiempoEstimado, List<Concepto> unosConceptos, List<Tecnologia> unasTecnologias, int codigo, String descripcion) {
        super(codigo, descripcion);
        this.tiempoEstimado = tiempoEstimado;
        this.unosConceptos.addAll(unosConceptos);
        this.unasTecnologias.addAll(unasTecnologias);
    }
    

    public Float getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(Float tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }
    
    
}
