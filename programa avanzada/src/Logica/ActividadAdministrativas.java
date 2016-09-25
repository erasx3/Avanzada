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
public class ActividadAdministrativas extends Actividad {
    
    private Double precioHora;

    public ActividadAdministrativas() {
        super();
    }

    public ActividadAdministrativas(Double precioHora, int codigo, String descripcion) {
        super(codigo, descripcion);
        this.precioHora = precioHora;
    }

    public Double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(Double precioHora) {
        this.precioHora = precioHora;
    }
    
    
    
}
