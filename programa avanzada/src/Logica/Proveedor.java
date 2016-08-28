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
public class Proveedor {
    private int codigo;
    private String nombre;
    private String direccion;
    private long telefono;
    private String email;
    private String razonSocial;
    private String cuit;
    private String situacionTributaria;
    private double depositoAsosiado; //que mierda es esto

    public Proveedor() {
    }

    public Proveedor(int codigo, String nombre, String direccion, long telefono, String email, String razonSocial, String cuit, String situacionTributaria, double depositoAsosiado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.situacionTributaria = situacionTributaria;
        this.depositoAsosiado = depositoAsosiado;
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

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getCuit() {
        return cuit;
    }

    public String getSituacionTributaria() {
        return situacionTributaria;
    }

    public double getDepositoAsosiado() {
        return depositoAsosiado;
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

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public void setSituacionTributaria(String situacionTributaria) {
        this.situacionTributaria = situacionTributaria;
    }

    public void setDepositoAsosiado(double depositoAsosiado) {
        this.depositoAsosiado = depositoAsosiado;
    }
      
    
    
}
