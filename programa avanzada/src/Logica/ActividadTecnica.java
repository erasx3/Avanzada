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
public class ActividadTecnica extends Actividad {
    
    private double precioFijo;

    public ActividadTecnica(double precioFijo) {
        super();
    }

    public ActividadTecnica(double precioFijo, int codigo, String descripcion) {
        super(codigo, descripcion);
        this.precioFijo = precioFijo;
    }
    
    
}
