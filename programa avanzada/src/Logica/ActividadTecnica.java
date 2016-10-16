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
public class ActividadTecnica extends Actividad {
    
    @Basic
    private Double precioFijo;

    public ActividadTecnica(Double precioFijo) {
        super();
    }

    public ActividadTecnica(Double precioFijo, int codigo, String descripcion) {
        super(codigo, descripcion);
        this.precioFijo = precioFijo;
    }
    
    
}
