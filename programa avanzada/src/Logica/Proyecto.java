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
    private List<Tecnologia> unosTecnologias;
    private List<OrdenTrabajo> unasOrdenesTrabajos;

    public Proyecto() {
    }

    public Proyecto(Float tiempoEstimado, int codigo, String descripcion) {
        super(codigo, descripcion);
        this.tiempoEstimado = tiempoEstimado;
    }

    public Float getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(Float tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }
    
    
}
