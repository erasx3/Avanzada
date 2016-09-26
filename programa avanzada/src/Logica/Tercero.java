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
public class Tercero extends Servicio {
    private Double monto;
    private int ganancia;

    public Tercero() {
    }

    public Tercero(int codigo, String descripcion, Double monto, int ganancia) {
        super(codigo, descripcion);
        this.monto = monto;
        this.ganancia = ganancia;
    }

    public Double getMonto() {
        return monto;
    }

    public int getGanancia() {
        return ganancia;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public void setGanancia(int ganancia) {
        this.ganancia = ganancia;
    }
    
    
}
