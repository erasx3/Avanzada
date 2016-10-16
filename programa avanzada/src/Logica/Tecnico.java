/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author eras
 */
@Entity
public class Tecnico extends Servicio {
    
    //Relaciones
    @OneToMany
    private List<Articulo> unosArticulos;

    public Tecnico() {
    }

    public Tecnico(int codigo, String descripcion) {
        super(codigo, descripcion);
    }
    
       
    
}
