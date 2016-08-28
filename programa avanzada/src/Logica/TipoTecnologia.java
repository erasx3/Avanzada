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
public class TipoTecnologia {
    private int codigo;
    private String nombre;
    private String decripcion;

    public TipoTecnologia() {
    }

    public TipoTecnologia(int codigo, String nombre, String decripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.decripcion = decripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDecripcion() {
        return decripcion;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
    }
    
    
    
}
