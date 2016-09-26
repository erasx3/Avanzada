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
public class TipoLiquidacion extends TipoComprobante {

    public TipoLiquidacion() {
    }

    public TipoLiquidacion(int codigo, String descripcion) {
        super(codigo, descripcion);
    }
    
    public boolean isTipoLiquidacion(int codigo){
        boolean aux = false;
        if(super.getCodigo() == codigo){
            aux = true;
        }
        return aux;
    }
}
