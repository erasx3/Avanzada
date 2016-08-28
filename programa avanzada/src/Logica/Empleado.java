/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Facu
 */
public class Empleado {
    private int codigo;
    private float dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private long telefono;

     public Empleado(){
     }
     
    public Empleado(int codigo, float dni, String nombre, String apellido, String direccion, long telefono) {
        this.codigo = codigo;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getCodigo() {
        return codigo;
    }

    public float getDni() {
        return dni;
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

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDni(float dni) {
        this.dni = dni;
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
    
    
    
           
    
}
