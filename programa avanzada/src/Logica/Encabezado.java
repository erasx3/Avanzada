/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author eras
 */
@Entity
public class Encabezado implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int codigo;
    @Basic
    private String descripcion;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fecha;
    @Basic
    private Double total;
    
    //Relaciones
    @OneToOne
    private TipoComprobante unTipoComprobante;
    @OneToMany
    private List<Detalle> unosDetalles;
    @OneToOne
    private PersoneriaJuridica unaPersoneriaJuridica;
    

    public Encabezado() {
    }

    public Encabezado(int codigo, String descripcion, Calendar fecha, TipoComprobante unTipoComprobante, List<Detalle> unosDetalles, PersoneriaJuridica unaPersoneriaJuridica) {
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

    public Calendar getFecha() {
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

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
    
}
