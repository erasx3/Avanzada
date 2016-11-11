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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author eras
 */
@Entity
public class DetalleLiquidacion extends Detalle {
    
    //Relaciones
    @ManyToOne
    private ManoDeObra unaManoDeObra;
    

    public DetalleLiquidacion() {
    }

    public DetalleLiquidacion(int codigo, ManoDeObra unaManoDeObra,Double subtotal) {
        super(codigo, subtotal);
        this.unaManoDeObra = unaManoDeObra;
    }

    public ManoDeObra getUnaManoDeObra() {
        return unaManoDeObra;
    }

    public void setUnaManoDeObra(ManoDeObra unaManoDeObra) {
        this.unaManoDeObra = unaManoDeObra;
    }
    
}
