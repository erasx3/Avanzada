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
public class Empleado extends Persona{
    private String dni;
    private String cuil;

    public Empleado() {
    }

    public Empleado(String dni, int codigo, String nombre, String direccion, String telefono, String email) {
        super(codigo, nombre, direccion, telefono, email);
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public String getCuil() {
        return cuil;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }
    
    
}
