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
    private Double monto;

    public Concepto() {
    }

    public Concepto(int codigo, String descripcion, Double monto) {
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

    public Double getMonto() {
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
    
    public void setMonto(Double monto) {
        this.monto = monto;
    }
    
    
}
