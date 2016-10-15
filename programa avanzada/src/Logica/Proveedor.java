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
public class Proveedor extends PersoneriaJuridica{
    private String cuit;

    public Proveedor() {
    }

    public Proveedor(String cuit, int codigo, String nombre, String direccion, long telefono, String email) {
        super(codigo, nombre, direccion, telefono, email);
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
