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
public class Servicio implements InterfaceConsumible {
    private int codigo;
    private String descripcion;
    private Double subtotal;
    
    //Relaciones

    public Servicio() {
    }

    public Servicio(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }
    
    public boolean isServicio(int codigo){
        boolean aux = false;
        if(this.codigo == codigo){
            aux = true;
        }
        return aux;
    }
    
    public void calcularSubtotal(){
        
    }
    
}
