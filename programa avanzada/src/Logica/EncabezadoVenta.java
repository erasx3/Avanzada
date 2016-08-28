/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Date;

/**
 *
 * @author eras
 */
public class EncabezadoVenta extends Encabezado{

    public EncabezadoVenta() {
    }

    public EncabezadoVenta(int codigo, String descripcion, Date fecha, float total) {
        super(codigo, descripcion, fecha, total);
    }
    
    
    
}
