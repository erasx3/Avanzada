/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import java.util.LinkedList;
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
    private List<Concepto> unosConceptos = new LinkedList<>();
    @OneToMany
    private List<Tecnologia> unasTecnologias = new LinkedList<>();
    @OneToMany
    private List<OrdenTrabajo> unasOrdenesTrabajos = new LinkedList<>();

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

    public List<Concepto> getUnosConceptos() {
        return unosConceptos;
    }

    public void setUnosConceptos(List<Concepto> unosConceptos) {
        this.unosConceptos = unosConceptos;
    }

    public List<Tecnologia> getUnasTecnologias() {
        return unasTecnologias;
    }

    public void setUnasTecnologias(List<Tecnologia> unasTecnologias) {
        this.unasTecnologias = unasTecnologias;
    }

    public List<OrdenTrabajo> getUnasOrdenesTrabajos() {
        return unasOrdenesTrabajos;
    }

    public void setUnasOrdenesTrabajos(List<OrdenTrabajo> unasOrdenesTrabajos) {
        this.unasOrdenesTrabajos = unasOrdenesTrabajos;
    }

    public Float getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(Float tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

}
