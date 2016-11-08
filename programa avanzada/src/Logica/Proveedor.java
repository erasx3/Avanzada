/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author eras
 */
@Entity
public class Proveedor extends PersoneriaJuridica{
    @Basic
    private String cuit;

    public Proveedor() {
    }

    public Proveedor(String cuit, int codigo, String nombre, String direccion, long telefono, String email) {
        super(codigo,nombre, direccion, telefono, email);
        this.cuit = cuit;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public boolean isProveedor(int codigo){
        boolean aux = false;
        if(super.getCodigo() == codigo){
            aux = true;
        }
        return aux;
    }
    
    
}
