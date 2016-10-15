/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Date;
import java.util.List;

/**
 *
 * @author eras
 */
public class Encabezado {
    private int codigo;
    private String descripcion;
    private Date fecha;
    private Double total;
    
    //Relaciones
    private TipoComprobante unTipoComprobante;
    private List<Detalle> unosDetalles;
    private PersoneriaJuridica unaPersoneriaJuridica;
    

    public Encabezado() {
    }

    public Encabezado(int codigo, String descripcion, Date fecha, TipoComprobante unTipoComprobante, List<Detalle> unosDetalles, PersoneriaJuridica unaPersoneriaJuridica) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.unTipoComprobante = unTipoComprobante;
        this.unosDetalles.addAll(unosDetalles);
        this.unaPersoneriaJuridica = unaPersoneriaJuridica;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Double getTotal() {
        return total;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
    
}
