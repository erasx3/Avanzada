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
public class TipoEmpleado {
    private int codigo;
    private String puesto;

    public TipoEmpleado(){
    }
    
    public TipoEmpleado(int codigo, String puesto) {
        this.codigo = codigo;
        this.puesto = puesto;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    
}
