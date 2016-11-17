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
import javax.persistence.Table;
/**
 *
 * @author eras
 */
@Entity
public class TipoVenta extends TipoComprobante {

    public TipoVenta() {
    }

    public TipoVenta(int codigo, String descripcion) {
        super(codigo, descripcion);
    }
    
    public boolean isTipoVenta(int codigo){
        boolean aux = false;
        if(super.getCodigo() == codigo){
            aux = true;
        }
        return aux;
    }
    
    public String isTipo(){
        return "TipoVenta";
    }
    @Override
    public String toString() {
        return super.getCodigo()+"-"+super.getDescripcion();
    }
    
    
}
