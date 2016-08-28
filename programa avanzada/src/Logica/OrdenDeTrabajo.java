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
public class OrdenDeTrabajo {
    private int codigo;
    private String descripcion;
    private double total;

    public OrdenDeTrabajo() {
    }

    public OrdenDeTrabajo(int codigo, String descripcion, double total) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.total = total;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getTotal() {
        return total;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
}
