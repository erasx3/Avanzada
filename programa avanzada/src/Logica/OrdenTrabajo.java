/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author eras
 */
public class OrdenTrabajo {
    private int codigo;
    private String descripcion;
    
    //Relaciones
    private Turno unTurno;
    private List<Servicio> unosServicios;
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
    
    public List<Servicio> devolverServicios(){
        List misServicios = new LinkedList();
        return misServicios;
    }
    
    public boolean isOrdenTrabajo(Equipo unEquipo){
        boolean aux = false;
        if(this.unEquipo.equals(unEquipo)){
            aux = true;
        }
        return aux;
    }
}
