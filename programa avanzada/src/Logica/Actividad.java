/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Facu
 */
public class Actividad {
    private int codigo;
    private String descripcion;
    private double precioCosto;
    private double prcioPorHora;

    public Actividad(){
    }
    
    public Actividad(int codigo, String descripcion, double precioCosto, double prcioPorHora) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCosto = precioCosto;
        this.prcioPorHora = prcioPorHora;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public double getPrcioPorHora() {
        return prcioPorHora;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public void setPrcioPorHora(double prcioPorHora) {
        this.prcioPorHora = prcioPorHora;
    }
    
    
    
    
}
