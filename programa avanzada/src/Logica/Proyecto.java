/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.List;

/**
 *
 * @author eras
 */
public class Proyecto extends Servicio {
    private Float tiempoEstimado;
    
    //Relaciones
    private List<Concepto> unosConceptos;
    private List<Tecnologia> unasTecnologias;
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
