/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.eclipse.persistence.internal.jpa.rs.metadata.model.Link;

/**
 *
 * @author eras
 */
@Entity
public class Encabezado implements Serializable {

    @Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
    private int codigo;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fecha;
    @Basic
    private Double total;

    //Relaciones
    @ManyToOne
    private TipoComprobante unTipoComprobante;
    @OneToMany
    @JoinColumn(name = "EncabezadoFK", referencedColumnName = "codigo")
    private List<Detalle> unosDetalles = new LinkedList<Detalle>();
    @ManyToOne
    private PersoneriaJuridica unaPersoneriaJuridica;

    public Encabezado() {
    }

    public Encabezado(int codigo, Calendar fecha, TipoComprobante unTipoComprobante, List<Detalle> unosDetalles, PersoneriaJuridica unaPersoneriaJuridica, Double total) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.unTipoComprobante = unTipoComprobante;
        this.unosDetalles.addAll(unosDetalles);
        this.unaPersoneriaJuridica = unaPersoneriaJuridica;
        this.total = total;
    }

    public int getCodigo() {
        return codigo;
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

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public TipoComprobante getUnTipoComprobante() {
        return unTipoComprobante;
    }

    public void setUnTipoComprobante(TipoComprobante unTipoComprobante) {
        this.unTipoComprobante = unTipoComprobante;
    }

    public List<Detalle> getUnosDetalles() {
        return unosDetalles;
    }

    public void setUnosDetalles(List<Detalle> unosDetalles) {
        this.unosDetalles = unosDetalles;
    }

    public PersoneriaJuridica getUnaPersoneriaJuridica() {
        return unaPersoneriaJuridica;
    }

    public void setUnaPersoneriaJuridica(PersoneriaJuridica unaPersoneriaJuridica) {
        this.unaPersoneriaJuridica = unaPersoneriaJuridica;
    }

    public boolean isEncabezado(int codigo) {
        boolean aux = false;
        if (this.codigo == codigo) {
            aux = true;
        }
        return aux;
    }

}
