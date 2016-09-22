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
    private Double ganancia;

    public Tercero() {
    }

    public Tercero(Double monto, Double ganancia, int codigo, String descripcion, Double subtotal) {
        super(codigo, descripcion, subtotal);
        this.monto = monto;
        this.ganancia = ganancia;
    }

    public Double getMonto() {
        return monto;
    }

    public Double getGanancia() {
        return ganancia;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public void setGanancia(Double ganancia) {
        this.ganancia = ganancia;
    }
    
    
}
