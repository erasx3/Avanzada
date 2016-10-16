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
import javax.persistence.OneToOne;

/**
 *
 * @author eras
 */
@Entity
public class DetalleLiquidacion extends Detalle {
    
    //Relaciones
    @OneToOne
    private ManoDeObra unaManoDeObra;
    

    public DetalleLiquidacion() {
    }

    public DetalleLiquidacion(int codigo, String descripcion,ManoDeObra unaManoDeObra) {
        super(codigo, descripcion);
        this.unaManoDeObra = unaManoDeObra;
    }

    public ManoDeObra getUnaManoDeObra() {
        return unaManoDeObra;
    }

    public void setUnaManoDeObra(ManoDeObra unaManoDeObra) {
        this.unaManoDeObra = unaManoDeObra;
    }
    
}
