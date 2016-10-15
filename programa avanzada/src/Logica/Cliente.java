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
public class Cliente extends PersoneriaJuridica{
    private String apellido;
    private long dni;
    private String cuil;
    
    //Relaciones
    private List<Turno> unosTurnos;

    public Cliente() {
    }

    public Cliente(String apellido, long dni, String cuil, int codigo, String nombre, String direccion, long telefono, String email) {
        super(codigo, nombre, direccion, telefono, email);
        this.apellido = apellido;
        this.dni = dni;
        this.cuil = cuil;
    }


    public String getApellido() {
        return apellido;
    }

    public long getDni() {
        return dni;
    }

    public String getCuil() {
        return cuil;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public boolean isCliente(long dni){
        boolean aux = false;
        if(this.dni == dni){
            aux = true;
        }
        return aux;
    }
    
    
}
