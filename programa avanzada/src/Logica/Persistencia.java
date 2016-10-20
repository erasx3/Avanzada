/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Persistencia.TecnologiaJpaController;
import Persistencia.TipoTecnologiaJpaController;
import java.util.List;

/**
 *
 * @author eras
 */
public class Persistencia {
    
    public static TecnologiaJpaController jpaTecnologia;
    public static TipoTecnologiaJpaController jpaTipoTecnologia;
    
    static
    {
        jpaTecnologia = new TecnologiaJpaController();
        jpaTipoTecnologia = new TipoTecnologiaJpaController();
    }
    
    static void crearTipoTecnologia(TipoTecnologia unTipoTecnologia) throws Exception
    {
        jpaTipoTecnologia.create(unTipoTecnologia);
    }
    
    static void modificarTipoTecnologia(TipoTecnologia unTipoTecnologia) throws Exception
    {
        jpaTipoTecnologia.edit(unTipoTecnologia);
    }
    
    static void eliminarTipoTecnologia(int codigoTipo) throws Exception
    {
        jpaTipoTecnologia.destroy(codigoTipo);
    }

    static List<TipoTecnologia> traerTiposTecnolgias() {
        return jpaTipoTecnologia.findTipoTecnologiaEntities();
    }
    
    static void crearTecnologia(Tecnologia unaTecnologia) throws Exception
    {
        jpaTecnologia.create(unaTecnologia);
    }
    
    static void modificarTecnologia(Tecnologia unaTecnologia) throws Exception
    {
        jpaTecnologia.edit(unaTecnologia);
    }
    
    static void eliminarTecnologia(int codigoTecnologia) throws Exception
    {
        jpaTecnologia.destroy(codigoTecnologia);
    }

    static List<Tecnologia> traerTecnolgias() {
        return jpaTecnologia.findTecnologiaEntities();
    }
    
}
