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
public class Cliente extends Persona {
    private String dni;
    private String cuit;

    public Cliente() {
    }

    public Cliente(String dni, String cuit, int codigo, String nombre, String direccion, String telefono, String email) {
        super(codigo, nombre, direccion, telefono, email);
        this.dni = dni;
        this.cuit = cuit;
    }

    public String getDni() {
        return dni;
    }

    public String getCuit() {
        return cuit;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }
    
    
}
