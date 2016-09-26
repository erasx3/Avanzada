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
public class Tecnologia {
    
    private int codigo;
    private String descripcion;
    
    //Relaciones
    private TipoTecnologia unTipoTecnologia;

    public Tecnologia() {
    }

    public Tecnologia(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public Tecnologia(int codigo, String descripcion, TipoTecnologia unTipoTecnologia) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.unTipoTecnologia = unTipoTecnologia;
    }
    
    
    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public boolean isTecnologia(int codigo){
        boolean aux = false;
        if(this.codigo == codigo){
            aux = true;
        }
        return aux;
    }
    
}
