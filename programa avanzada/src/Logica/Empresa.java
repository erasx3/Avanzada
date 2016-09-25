/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Date;
import java.util.LinkedList;
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
    
    public void buscarCliente (long dni){
    }
    
    
    public void crearCliente(int codigo, String nombre, String apellido, String direccion, long telefono, String email, long dni, String cuil){ 
    }
    
    public void buscarTurnoDisponible (Date fecha, Float hora){
    }
    
    public void GenerarTurno(Cliente unCliente, int codigo, String descripcion, Date fecha, Float hora){
    }
    
    public Turno buscarTurno (int codigo){
        Turno miTurno = new Turno();
        return miTurno;
    }
    
    public Equipo buscarEquipo(int codigo){
        Equipo miEquipo = new Equipo();
        return miEquipo;
    }
    
    public void crearEquipo(int codigo, String descripcion){
    }
    
    public void buscarTipoEstado(int codigo){  
    }
    
    public void crearTipoEstado(int codigo, String nombre){
    }
    
    public void generarEstadoEquipo(int codigo, String descripcion, Equipo unEquipo, TipoEstado unTipoEstado){ 
    }
    
    public void generarServicioTenico(int codigo, String descripcion){
        
    }
    
    public void generarServicioTercero(int codigo, String descripcion, Double monto, int ganancia){
        
    }
    
    public void generarOrdenTrabajo(int codigo, String descripcion, Turno unTurno, Equipo unEquipo, Servicio unServicio){
        
    }
    
    public void buscarOrdenTrabajo(int codigo){
        
    }
    
    public void agregarServicio(OrdenTrabajo unaOrdenTrabajo, Servicio unServicio){
        
    }
    
    public void buscarEmpleado(int codigo){
        
    }
    
    public void crearEmpleado(int codigo, String nombre, String apellido, String direccion, long telefono, String email, long dni, String cuil){
        
    }
    
    public void buscarServicio(int codigo){
        
    }
    
    public void buscarActividad(int codigo){
        
    }
    
    public void crearActividadAdministrativa(int codigo, String descripcion, Double PrecioHora){
        
    }
    
    public void crearActividadTenica(int codigo, String descripcion, Double PrecioFijo){
        
    }
    
    public void crearActividadProyecto(int codigo, String descripcion, int Porcentaje){
        
    }
    
    public void generarManoDeObra(int codigo, long horasTrabajadas, Date fecha, Empleado unEmpleado, Servicio unServicio, Actividad unaActividad){
        
    }
    
    public void buscarTipoVenta(int codigo){
        
    }
    
    public List<Servicio> buscarServicioOrdenTrabajo(Cliente unCliente){
        List misServicios = new LinkedList();
        return misServicios;
    }
    
    public void generarDetalleCompraVenta(int codigo, String descripcion, int cantidad, InterfaceConsumible unConsumible){
        
    }

    
    
            
}
