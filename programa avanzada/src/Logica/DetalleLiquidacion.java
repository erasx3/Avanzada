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
public class DetalleLiquidacion extends Detalle {
    
    //Relaciones
    private ManoDeObra unaManoDeObra;
    

    public DetalleLiquidacion() {
    }

    public DetalleLiquidacion(int codigo, String descripcion, Double subtotal) {
        super(codigo, descripcion, subtotal);
    }
    
}
