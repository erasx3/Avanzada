/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Facu
 */
@Entity
public class Concepto implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int codigo;
    @Basic
    private String descripcion;
    @Basic
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

    boolean isConcepto(int codigo) {
        boolean aux = false;
        if(this.getCodigo() == codigo){
            aux = true;
        }
        return aux;
    }
    
    public boolean isConcepto(String descripcion){
        boolean aux = false;
        if (this.getDescripcion().equals(descripcion)) {
            aux = true;
        }
        return aux;
    }
    
}
