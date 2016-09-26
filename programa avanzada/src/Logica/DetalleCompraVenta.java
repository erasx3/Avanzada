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
public class DetalleCompraVenta extends Detalle{
    
    private int cantidad;
    
    //Relaciones
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
