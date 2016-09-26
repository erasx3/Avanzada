/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

/**
 *
 * @author eras
 */
public class Empresa {
    private int codigo;
    private String nombre;
    private String direccion;
    
    //Relaciones
    private List<Encabezado> unosEncabezados = new LinkedList();
    private List<Cliente> unosClientes = new LinkedList();
    private List<Proveedor> unosProveedores = new LinkedList();
    private List<Empleado> unosEmpleados = new LinkedList();
    private List<Actividad> unasActividades = new LinkedList();
    private List<TipoLiquidacion> unosTiposLiquidaciones = new LinkedList();
    private List<TipoCompra> unosTiposCompras = new LinkedList();
    private List<TipoVenta> unosTiposVentas = new LinkedList();
    private List<Articulo> unosArticulos = new LinkedList();
    private List<Tecnico> unosTecnicos = new LinkedList();
    private List<Tercero> unosTerceros = new LinkedList();
    private List<Proyecto> unosProyectos = new LinkedList();
    private List<Turno> unosTurnos = new LinkedList();
    private List<OrdenTrabajo> unasOrdenesTrabajos = new LinkedList();
    private List<Equipo> unosEquipos = new LinkedList();
    private List<TipoEstado> unosTiposEstados = new LinkedList();
    private List<Concepto> unosConceptos = new LinkedList();
    private List<Tecnologia> unasTecnologias = new LinkedList();
    private List<TipoTecnologia> unosTiposTecnologias = new LinkedList();
    private List<Detalle> unosDetalles = new LinkedList();
    private List<Estado> unosEstados = new LinkedList();
    private List<Servicio> unosServicios = new LinkedList();
    

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
    
    public Cliente buscarCliente (long dni){
        Cliente aux = new Cliente();
        Iterator itr = unosClientes.iterator();
        int band = 0;
        while(itr.hasNext() && band == 0){
            aux = (Cliente) itr.next();
            if(aux.isCliente(dni)){
                band = 1;
            }
           
        }
        return aux;
    }
    
    
    public void crearCliente(int codigo, String nombre, String apellido, String direccion, long telefono, String email, long dni, String cuil){
        Cliente unCliente = new Cliente(codigo, nombre, apellido, direccion, telefono, email, dni, cuil);
        unosClientes.add(unCliente);
    }
    
    public boolean buscarTurnoDisponible (Date fecha, Float hora){
        boolean disponibilidad = true;
        Turno aux = new Turno();
        Iterator itr = unosTurnos.iterator();
        int band = 0;
        while(itr.hasNext() && band == 0){
            aux = (Turno) itr.next();
            if(aux.disponibilidad(fecha, hora)){
                band = 1;
                disponibilidad = false;
            }
           
        }
        return disponibilidad;
    }
    
    public void GenerarTurno(Cliente unCliente, int codigo, String descripcion, Date fecha, Float hora){
        Turno unturno = new Turno(unCliente, codigo, descripcion, hora, fecha);
        unosTurnos.add(unturno);
    }
    
    public Turno buscarTurno (int codigo){
        Turno aux = new Turno();
        Iterator itr = unosTurnos.iterator();
        int band = 0;
        while(itr.hasNext() && band == 0){
            aux = (Turno) itr.next();
            if(aux.isTurno(codigo)){
                band = 1;
            }
           
        }
        return aux;
    }
    
    public Equipo buscarEquipo(int codigo){
        Equipo aux = new Equipo();
        Iterator itr = unosEquipos.iterator();
        int band = 0;
        while(itr.hasNext() && band == 0){
            aux = (Equipo) itr.next();
            if(aux.isEquipo(codigo)){
                band = 1;
            }
           
        }
        return aux;
    }
    
    public void crearEquipo(int codigo, String descripcion){
        Equipo unEquipo = new Equipo(codigo, descripcion);
        unosEquipos.add(unEquipo);
    }
    
    public TipoEstado buscarTipoEstado(int codigo){  
        TipoEstado aux = new TipoEstado();
        Iterator itr = unosTiposEstados.iterator();
        int band = 0;
        while(itr.hasNext() && band == 0){
            aux = (TipoEstado) itr.next();
            if(aux.isTipoEstado(codigo)){
                band = 1;
            }
           
        }
        return aux;
    }
    
    public void crearTipoEstado(int codigo, String nombre){
        TipoEstado unTipoEstado = new TipoEstado(codigo, nombre);
        unosTiposEstados.add(unTipoEstado);
    }
    
    public void generarEstadoEquipo(int codigo, String descripcion, Equipo unEquipo, TipoEstado unTipoEstado, OrdenTrabajo unaOrdenTrabajo){ 
        Estado unEstado = new Estado(codigo, descripcion, unEquipo, unTipoEstado, unaOrdenTrabajo);
        unosEstados.add(unEstado);
    }
    
    public void generarServicioTecnico(int codigo, String descripcion){
        Tecnico unTecnico = new Tecnico(codigo, descripcion);
        unosTecnicos.add(unTecnico);
        unosServicios.add(unTecnico);
        
    }
    
    public void generarServicioTercero(int codigo, String descripcion, Double monto, int ganancia){
        Tercero unTercero = new Tercero(codigo, descripcion, monto, ganancia);
        unosTerceros.add(unTercero);
        unosServicios.add(unTercero);
        
    }
    
    public void generarOrdenTrabajo(int codigo, String descripcion, Turno unTurno, Equipo unEquipo, Servicio unServicio){
        OrdenTrabajo unaOrdenTrabajo = new OrdenTrabajo(codigo, descripcion, unTurno, unServicio, unEquipo);
        unasOrdenesTrabajos.add(unaOrdenTrabajo);
        
    }
    
    public OrdenTrabajo buscarOrdenTrabajo(int codigo){
        OrdenTrabajo aux = new OrdenTrabajo();
        Iterator itr = unasOrdenesTrabajos.iterator();
        int band = 0;
        while(itr.hasNext() && band == 0){
            aux = (OrdenTrabajo) itr.next();
            if(aux.isOrdenTrabajo(codigo)){
                band = 1;
            }
           
        }
        return aux;
        
    }
    
    public void agregarServicio(OrdenTrabajo unaOrdenTrabajo, Servicio unServicio){
        unaOrdenTrabajo.agregarServicio(unServicio);
    }
    
    public Empleado buscarEmpleado(int codigo){
        Empleado aux = new Empleado();
        Iterator itr = unosEmpleados.iterator();
        int band = 0;
        while(itr.hasNext() && band == 0){
            aux = (Empleado) itr.next();
            if(aux.isEmpleado(codigo)){
                band = 1;
            }
           
        }
        return aux;
    }
    
    public void crearEmpleado(int codigo, String nombre, String apellido, String direccion, long telefono, String email, long dni, String cuil){
        Empleado unEmpleado = new Empleado(codigo, nombre, apellido, direccion, telefono, email, dni, cuil);
        unosEmpleados.add(unEmpleado);
    }
    
    public Servicio buscarServicio(int codigo){
        Servicio aux = new Servicio();
        Iterator itr = unosServicios.iterator();
        int band = 0;
        while(itr.hasNext() && band == 0){
            aux = (Servicio) itr.next();
            if(aux.isServicio(codigo)){
                band = 1;
            }
           
        }
        return aux;
        
    }
    
    public Actividad buscarActividad(int codigo){
        Actividad aux = new Actividad();
        Iterator itr = unasActividades.iterator();
        int band = 0;
        while(itr.hasNext() && band == 0){
            aux = (Actividad) itr.next();
            if(aux.isActividad(codigo)){
                band = 1;
            }
           
        }
        return aux;
        
    }
    
    public void crearActividadAdministrativa(int codigo, String descripcion, Double precioHora){
        ActividadAdministrativa unaActividadAdministrativa = new ActividadAdministrativa(precioHora, codigo, descripcion);
        unasActividades.add(unaActividadAdministrativa);
    }
    
    public void crearActividadTecnica(int codigo, String descripcion, Double precioFijo){
        ActividadTecnica unaActividadTecnica = new ActividadTecnica(precioFijo, codigo, descripcion);
        unasActividades.add(unaActividadTecnica);
    }
    
    public void crearActividadProyecto(int codigo, String descripcion, Double porcentaje){
        ActividadProyecto unaActividadProyecto = new ActividadProyecto(codigo, descripcion, porcentaje);
        unasActividades.add(unaActividadProyecto);
    }
    
    public void generarManoDeObra(int codigo, long horasTrabajadas, Date fecha, Empleado unEmpleado, Servicio unServicio, Actividad unaActividad){
        
    }
    
    public TipoVenta buscarTipoVenta(int codigo){
        TipoVenta aux = new TipoVenta();
        Iterator itr = unosTiposVentas.iterator();
        int band = 0;
        while(itr.hasNext() && band == 0){
            aux = (TipoVenta) itr.next();
            if(aux.isTipoVenta(codigo)){
                band = 1;
            }
           
        }
        return aux;
    }
    
    public List<Servicio> buscarServicioOrdenTrabajo(Cliente unCliente){
        Turno aux = new Turno();
        List<Servicio> aux2 = new LinkedList();
        OrdenTrabajo aux3 = new OrdenTrabajo();
        Iterator itr = unosTurnos.iterator();
        while(itr.hasNext()){
            aux = (Turno) itr.next();
            if(aux.isCliente(unCliente)){
                aux3 = aux.getUnaOrdenTrabajo();
                aux2 = aux3.devolverServicios();
            }
           
        }
        return aux2;  
    }
    
    public void generarDetalleCompraVenta(int codigo, String descripcion, int cantidad, InterfaceConsumible unConsumible){
        
    }

    public void generarEncabezado(int codigo, String descripcion, Date fecha, List<Detalle> unosDetalles, InterfacePersoneriaJuridica unaPersoneriaJuridica, TipoComprobante unTipoComprobante){
        
    }
    
    public void buscarArticulo(int codigo){
        
    }
    
    public void sumarArticulo(int cantidad, Articulo unArticulo){
        unArticulo.sumarArticulo(cantidad);
    }
    
    public void descontarArticulo(int cantidad, Articulo unArticulo){
        unArticulo.descontarArticulo(cantidad);
    }
    
    public boolean comprobarStock(Articulo unArticulo, int cantidad){
        
        return unArticulo.comprobarStock(cantidad);

    }
    
    public void buscarProveedor(int codigo){
        
    }
    
    public void crearProveedor(int codigo, String nombre, String direccion, long telefono, String email, String cuit){
        
    }
    
    public void buscarTipoCompra(int codigo){
        
    }
    
    public void buscarTipoLiquidacion(int codigo){
        
    }
    
    public List<ManoDeObra> buscarManoDeObra(Empleado unEmpleado, Date fechaInicio, Date fechaFin){
        List misManosDeObras = new LinkedList();
        return misManosDeObras;
    }
    
    public void generarDetalleLiquidacion(int codigo, String descripcion, ManoDeObra unaManoDeObra){
        
    }
    
    public List<OrdenTrabajo> buscarOrdenTrabajo(Equipo unEquipo){
        OrdenTrabajo aux = new OrdenTrabajo();
        List<OrdenTrabajo> aux2 = new LinkedList();
        Iterator itr = unasOrdenesTrabajos.iterator();
        while(itr.hasNext()){
            aux = (OrdenTrabajo) itr.next();
            if(aux.isOrdenTrabajo(unEquipo)){
                aux2.add(aux);
            }
           
        }
        return aux2;  
        
    }
    
    
    public void agregarOrden (OrdenTrabajo unaOrdenTrabajo, Turno unTurno){
        unTurno.agregarOrden(unaOrdenTrabajo);
    }
}
