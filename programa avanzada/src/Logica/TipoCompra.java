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
 * @author eras
 */
@Entity
public class TipoCompra extends TipoComprobante implements Serializable {

    public TipoCompra() {
    }

    public TipoCompra(int codigo, String descripcion) {
        super(codigo, descripcion);
    }
    
    public boolean isTipoCompra(int codigo){
        boolean aux = false;
        if(super.getCodigo() == codigo){
            aux = true;
        }
        return aux;
    }
}
