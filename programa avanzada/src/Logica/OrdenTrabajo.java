/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author eras
 */
@Entity
public class OrdenTrabajo implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int codigo;
    @Basic
    private String descripcion;
    
    //Relaciones
    @OneToOne
    private Turno unTurno;
    @OneToMany
    private List<Servicio> unosServicios;
    @OneToOne
    private Equipo unEquipo;
    
    
    public OrdenTrabajo() {
    }

    public OrdenTrabajo(int codigo, String descripcion, Turno unTurno, Servicio unServicio, Equipo unEquipo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.unTurno = unTurno;
        this.unosServicios.add(unServicio);
        this.unEquipo = unEquipo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setUnTurno(Turno unTurno) {
        this.unTurno = unTurno;
    }

    public void setUnosServicios(List<Servicio> unosServicios) {
        this.unosServicios = unosServicios;
    }

    public void setUnEquipo(Equipo unEquipo) {
        this.unEquipo = unEquipo;
    }

    public Turno getUnTurno() {
        return unTurno;
    }

    public List<Servicio> getUnosServicios() {
        return unosServicios;
    }

    public Equipo getUnEquipo() {
        return unEquipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCodgo(int codgo) {
        this.codigo = codgo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public boolean isOrdenTrabajo(int codigo){
        boolean aux = false;
        if(this.codigo == codigo){
            aux = true;
        }
        return aux;
    }
    
    public void agregarServicio(Servicio unServicio){
        this.unosServicios.add(unServicio);
    }
    
    
    public boolean isOrdenTrabajo(Equipo unEquipo){
        boolean aux = false;
        if(this.unEquipo.equals(unEquipo)){
            aux = true;
        }
        return aux;
    }

    public void add(OrdenTrabajo ordenTrabajo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void remove(OrdenTrabajo ordenTrabajo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
