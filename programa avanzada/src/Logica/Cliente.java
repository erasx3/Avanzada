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
public class Cliente implements InterfacePersoneriaJuridica {
    private int codigo;
    private String nombre;
    private String apellido;
    private String direccion;
    private long telefono;
    private String email;
    private long dni;
    private String cuil;
    
    //Relaciones
    private List<Turno> unosTurnos;

    public Cliente() {
    }

    public Cliente(int codigo, String nombre, String apellido, String direccion, long telefono, String email, long dni, String cuil) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.dni = dni;
        this.cuil = cuil;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public long getDni() {
        return dni;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public boolean isCliente(long dni){
        return true;
    }
    
    
}
