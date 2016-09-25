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
public class Concepto {
    
    private int codigo;
    private String descripcion;
    private double monto;

    public Concepto() {
    }

    public Concepto(int codigo, String descripcion, double monto) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.monto = monto;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
    
    
}
