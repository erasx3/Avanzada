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
public class Proyecto extends Servicio {
    private Float tiempoEstimado;

    public Proyecto() {
    }

    public Proyecto(Float tiempoEstimado, int codigo, String descripcion, Double subtotal) {
        super(codigo, descripcion, subtotal);
        this.tiempoEstimado = tiempoEstimado;
    }

    public Float getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(Float tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }
    
    
}
