/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
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
public class ActividadProyecto extends Actividad implements Serializable{
    
    @Basic
    private Double porcentaje;

    public ActividadProyecto() {
        super();
    }

    public ActividadProyecto(int codigo, String descripcion, Double porcentaje) {
        super(codigo, descripcion);
        this.porcentaje = porcentaje;
    }
    
    
    
}
