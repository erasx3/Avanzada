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
public class OrdenTrabajo {
    private int codgo;
    private String descripcion;

    public OrdenTrabajo() {
    }

    public OrdenTrabajo(int codgo, String descripcion) {
        this.codgo = codgo;
        this.descripcion = descripcion;
    }

    public int getCodgo() {
        return codgo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCodgo(int codgo) {
        this.codgo = codgo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}