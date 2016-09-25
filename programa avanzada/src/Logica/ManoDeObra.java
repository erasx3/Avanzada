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
public class ManoDeObra {
    
    private int codigo;
    private int horasTrabajadas;
    
    //Relaciones
    private Actividad unaActividad;
    private Servicio unServicio;
    private Empleado unEmpleado;

    public ManoDeObra() {
    }

    public ManoDeObra(int codigo, int horasTrabajadas) {
        this.codigo = codigo;
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    
    
}
