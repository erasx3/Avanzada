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
public class Proyecto extends Servicio{
    private float porcentajePorProductividad;
    private float tiempoEstimado; // ver tipo de dato
    private float horasTrabajadas;

    public Proyecto() {
    }

    public Proyecto(float porcentajePorProductividad, float tiempoEstimado, float horasTrabajadas, int codigo, String descripcion, double subTotal) {
        super(codigo, descripcion, subTotal);
        this.porcentajePorProductividad = porcentajePorProductividad;
        this.tiempoEstimado = tiempoEstimado;
        this.horasTrabajadas = horasTrabajadas;
    }

    public float getPorcentajePorProductividad() {
        return porcentajePorProductividad;
    }

    public float getTiempoEstimado() {
        return tiempoEstimado;
    }

    public float getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setPorcentajePorProductividad(float porcentajePorProductividad) {
        this.porcentajePorProductividad = porcentajePorProductividad;
    }

    public void setTiempoEstimado(float tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public void setHorasTrabajadas(float horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    
    
}
