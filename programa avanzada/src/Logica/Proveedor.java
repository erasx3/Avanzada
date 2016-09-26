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
public class Proveedor implements InterfacePersoneriaJuridica{
    private int codigo;
    private String nombre;
    private String direccion;
    private long telefono;
    private String email;
    private String cuit;

    public Proveedor() {
    }

    public Proveedor(int codigo, String nombre, String direccion, long telefono, String email, String cuit) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.cuit = cuit;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
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

    public String getCuit() {
        return cuit;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public boolean isProveedor(int codigo){
        return true;
    }
    
    
}
