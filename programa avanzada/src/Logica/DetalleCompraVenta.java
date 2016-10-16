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
public class DetalleCompraVenta extends Detalle{
    
    @Basic
    private int cantidad;
    
    //Relaciones
    @OneToOne
    private InterfaceConsumible unConsumible;

    public DetalleCompraVenta(int cantidad, int codigo, String descripcion, InterfaceConsumible unConsumible) {
        super(codigo, descripcion);
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
    
    
}
