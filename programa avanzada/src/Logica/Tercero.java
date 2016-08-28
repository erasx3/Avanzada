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
public class Tercero extends Servicio{
    private float monto;
    private float porcentajeGanancia;

    public Tercero() {
    }

    public Tercero(float monto, float porcentajeGanancia, int codigo, String descripcion, double subTotal) {
        super(codigo, descripcion, subTotal);
        this.monto = monto;
        this.porcentajeGanancia = porcentajeGanancia;
    }

    public float getMonto() {
        return monto;
    }

    public float getPorcentajeGanancia() {
        return porcentajeGanancia;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public void setPorcentajeGanancia(float porcentajeGanancia) {
        this.porcentajeGanancia = porcentajeGanancia;
    }
    
    
    
}
