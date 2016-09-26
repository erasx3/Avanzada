/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Facu
 */
public class ActividadProyecto extends Actividad{
    
    private Double porcentaje;

    public ActividadProyecto() {
        super();
    }

    public ActividadProyecto(int codigo, String descripcion, Double porcentaje) {
        super(codigo, descripcion);
        this.porcentaje = porcentaje;
    }
    
    
    
}
