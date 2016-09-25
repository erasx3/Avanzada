/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.List;

/**
 *
 * @author eras
 */
public class Equipo {
    private int codigo;
    private String descripcion;
    
    //Relaciones
    private List<Estado> unosEstados;

    public Equipo() {
    }

    public Equipo(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public boolean isEquipo(int codigo){
        return true;
    }
    
    public void agregarEstado(Estado unEstado){
    }
    
}
