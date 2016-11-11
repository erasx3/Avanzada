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
import javax.persistence.Table;

/**
 *
 * @author eras
 */
@Entity
public class DetalleCompraVenta extends Detalle{
    
    @Basic
    private int cantidad;
    
    //Relaciones
    @ManyToOne
    private Consumible unConsumible;

    public DetalleCompraVenta(int cantidad, int codigo, Consumible unConsumible,Double subtotal) {
        super(codigo, subtotal);
        this.cantidad = cantidad;
        this.unConsumible=unConsumible;
    }

    public DetalleCompraVenta() {
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Consumible getUnConsumible() {
        return unConsumible;
    }

    public void setUnConsumible(Consumible unConsumible) {
        this.unConsumible = unConsumible;
    }
    
    public boolean isDetalleCompraVenta(int codigo){
        boolean aux = false;
        if(super.getCodigo()== codigo){
            aux=true;
        }
        return aux;
    }
    
}
