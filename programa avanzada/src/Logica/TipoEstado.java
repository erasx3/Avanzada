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
public class TipoEstado {
    private int codigo;
    private String nombre;

    public TipoEstado() {
    }

    public TipoEstado(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public boolean isTipoEstado(int codigo){
        boolean aux = false;
        if(this.codigo == codigo){
            aux = true;
        }
        return aux;
    }
    
}
