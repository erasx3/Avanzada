/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Date;

/**
 *
 * @author Facu
 */
public class ManoDeObra {
    
    private int codigo;
    private long horasTrabajadas;
    private Date fecha;
    
    //Relaciones
    private Actividad unaActividad;
    private Servicio unServicio;
    private Empleado unEmpleado;

    public ManoDeObra() {
    }

    public ManoDeObra(int codigo, long horasTrabajadas) {
        this.codigo = codigo;
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getCodigo() {
        return codigo;
    }

    public long getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setHorasTrabajadas(long horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
}
