/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.List;

/**
 *
 * @author eras
 */
public class Tecnico extends Servicio {
    
    //Relaciones
    private List<Articulo> unosArticulos;

    public Tecnico() {
    }

    public Tecnico(int codigo, String descripcion, Double subtotal) {
        super(codigo, descripcion, subtotal);
    }
    
       
    
}
