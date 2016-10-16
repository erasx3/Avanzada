/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Facu
 */
@Entity
public class ManoDeObra implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int codigo;
    @Basic
    private long horasTrabajadas;
    @Basic
    private Date fecha;
    
    //Relaciones
    @OneToOne
    private Actividad unaActividad;
    @OneToOne
    private Servicio unServicio;
    @OneToOne
    private Empleado unEmpleado;

    public ManoDeObra() {
    }

    public ManoDeObra(int codigo, long horasTrabajadas) {
        this.codigo = codigo;
        this.horasTrabajadas = horasTrabajadas;
    }

    public ManoDeObra(int codigo, long horasTrabajadas, Date fecha, Actividad unaActividad, Servicio unServicio, Empleado unEmpleado) {
        this.codigo = codigo;
        this.horasTrabajadas = horasTrabajadas;
        this.fecha = fecha;
        this.unaActividad = unaActividad;
        this.unServicio = unServicio;
        this.unEmpleado = unEmpleado;
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
     public boolean isCliente(Empleado unEmpleado){
         boolean aux = false;
         if(this.unEmpleado.equals(unEmpleado)){
             aux = true;
         }
         return aux;
     }
    
     public boolean isMayor(Date fechaInicio){//pregunta si la fechaInicio es mayor o igual a la this.fecha 
         boolean aux = false;
         int aux2;
         aux2=this.fecha.compareTo(fechaInicio);
         if(aux2>=0){
             aux = true;
         }
         return aux;
     }
    
     public boolean isMenor(Date fechaFin){//pregunta si la fechaInicio es menor o igual a la this.fecha 
         boolean aux = false;
         int aux2;
         aux2=this.fecha.compareTo(fechaFin);
         if(aux2<=0){
             aux = true;
         }
         return aux;
     }
     
}
