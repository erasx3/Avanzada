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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


/**
 *
 * @author eras
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Detalle implements Serializable  {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int codigo;
    @Basic
    private Double subtotal;

    public Detalle() {
    }

    public Detalle(int codigo, Double subtotal) {
        this.codigo = codigo;
        this.subtotal=subtotal;
    }

    public int getCodigo() {
        return codigo;
    }

   

    public Double getSubtotal() {
        return subtotal;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

   

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }
    
    
}
