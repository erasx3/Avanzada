/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Facu
 */
@Entity
public class ActividadAdministrativa extends Actividad {
    @Basic
    private Double precioHora;

    public ActividadAdministrativa() {
        super();
    }

    public ActividadAdministrativa(Double precioHora, int codigo, String descripcion) {
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
