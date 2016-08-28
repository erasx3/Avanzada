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
public class ControlTurno {
    private int codigo;
    private String horariosHabilitados;
    private String dia; // pasar a formato date

    public ControlTurno() {
    }

    public ControlTurno(int codigo, String horariosHabilitados, String dia) {
        this.codigo = codigo;
        this.horariosHabilitados = horariosHabilitados;
        this.dia = dia;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getHorariosHabilitados() {
        return horariosHabilitados;
    }

    public String getDia() {
        return dia;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setHorariosHabilitados(String horariosHabilitados) {
        this.horariosHabilitados = horariosHabilitados;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
    
    
    
}
