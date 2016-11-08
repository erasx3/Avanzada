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
import javax.persistence.Table;

/**
 *
 * @author eras
 */
@Entity
public class Empleado extends PersoneriaJuridica implements Serializable{ 
    @Basic
    private String apellido;
    @Basic
    private long dni;
    @Basic
    private String cuil;

    public Empleado() {
    }

    public Empleado(String apellido, long dni, String cuil, int codigo, String nombre, String direccion, long telefono, String email) {
        super(codigo,nombre, direccion, telefono, email);
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

    public boolean isEmpleado(int codigo){
        boolean aux = false;
        if(super.getCodigo() == codigo){
            aux = true;
        }
        return aux;
    }
    
    
}
