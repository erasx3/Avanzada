/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author eras
 */
@Entity
public class Tecnico extends Servicio {

    //Relaciones
    @OneToMany
    private List<DetalleCompraVenta> unosDetalleCompraVentas=new LinkedList<DetalleCompraVenta>();


    public Tecnico() {
    }

    public Tecnico(int codigo, String descripcion, Double subtotal,List unosDetallesCompraVenta) {
        super(codigo, descripcion, subtotal);
        this.unosDetalleCompraVentas.addAll(unosDetallesCompraVenta);
    }

    public List<DetalleCompraVenta> getUnosDetalleCompraVentas() {
        return unosDetalleCompraVentas;
    }

    public void setUnosDetalleCompraVentas(List<DetalleCompraVenta> unosDetalleCompraVentas) {
        this.unosDetalleCompraVentas = unosDetalleCompraVentas;
    }

}
