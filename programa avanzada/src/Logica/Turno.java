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
public class Turno {
    private int codigo;
    private String descripcion;
    private String hora; // preguntar por formato para hora
    
     public Turno() {
    }
     
    public Turno(int codigo, String descripcion, String hora) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.hora = hora;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getHora() {
        return hora;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
   
    
    
    
}
