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
public class Empresa {
    private int codigo;
    private String nombre;
    private String direccion;
    
    //Relaciones
    private List<Encabezado> unosEncabezados;
    private List<Cliente> unosClientes;
    private List<Proveedor> unosProveedores;
    private List<Empleado> unosEmpleados;
    private List<Actividad> unasActividades;
    private List<TipoComprobante> unosTiposDeComprobantes;
    private List<Articulo> unosArticulos;
    private List<Tecnico> unosTecnicos;
    private List<Tercero> unosTerceros;
    private List<Proyecto> unosProyectos;
    private List<Turno> unosTurnos;
    private List<OrdenTrabajo> unasOrdenesTrabajos;
    private List<Equipo> unosEquipos;
    private List<TipoEstado> unosTiposEstados;
    private List<Concepto> unosServicios;
    private List<Tecnologia> unasTecnologias;
    private List<TipoTecnologia> unosTiposTecnologias;

    public Empresa() {
    }

    public Empresa(int codigo, String nombre, String direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
}
