/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

/**
 *
 * @author eras
 */
@Entity
public class Servicio extends Consumible{
   
    @Basic
    private Double subtotal;
    
    //Relaciones

    public Servicio() {
    }

    public Servicio(int codigo, String descripcion) {
        super(codigo, descripcion);
    }

    public Servicio(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Servicio(int codigo, String descripcion,Double subtotal ) {
        super(codigo, descripcion);
        this.subtotal = subtotal;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }
    
    
    public boolean isServicio(int codigo){
        boolean aux = false;
        if(super.getCodigo() == codigo){
            aux = true;
        }
        return aux;
    }
    
    public String isConsumible(){
        return "Servicio";
    }
    
    public void calcularSubtotal(){
        
    }
    
}
