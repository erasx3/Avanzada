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

/**
 *
 * @author pepex3
 */
@Entity
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int codigo;
    @Basic
    private String nombre;
    @Basic
    private String contrasenia;

    public Usuario() {
    }

    public Usuario(int codigo, String nombre, String contrasenia) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    public boolean isIngresoValido(String usuario,String contrasenia){
        boolean aux=false;
        if(this.nombre.equals(nombre) && this.contrasenia.equals(contrasenia)){
            aux=true;
        }
        return aux;
    }
}
