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
    private List<DetalleCompraVenta> unosDetallesCompraVenta = new LinkedList();
    private List<DetalleLiquidacion> unosDetallesLiquidacion = new LinkedList();
    private List<Estado> unosEstados = new LinkedList();
    private List<Servicio> unosServicios = new LinkedList();
    private List<ManoDeObra> unasManosDeObras = new LinkedList();
    

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
        Cliente unCliente = new Cliente(apellido,dni,cuil,codigo,nombre,direccion,telefono,email);
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
        Empleado unEmpleado = new Empleado(apellido,dni,cuil,codigo,nombre,direccion,telefono,email);
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
        ManoDeObra unaManoDeObra = new ManoDeObra(codigo,horasTrabajadas,fecha,unaActividad,unServicio,unEmpleado);
        unasManosDeObras.add(unaManoDeObra);
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
                aux2 = aux3.getUnosServicios();//preguntar si se puede ahcer asi
            }
           
        }
        return aux2;  
    }
    
    public void generarDetalleCompraVenta(int codigo, String descripcion, int cantidad, InterfaceConsumible unConsumible){
        DetalleCompraVenta unDetalleCompraVenta = new DetalleCompraVenta(cantidad, codigo, descripcion,unConsumible);
        unosDetallesCompraVenta.add(unDetalleCompraVenta);
        unosDetalles.add(unDetalleCompraVenta);
    }

    public void generarEncabezado(int codigo, String descripcion, Date fecha, List<Detalle> unosDetalles, PersoneriaJuridica unaPersoneriaJuridica, TipoComprobante unTipoComprobante){
        Encabezado unEncabezado = new Encabezado(codigo, descripcion,fecha,unTipoComprobante,unosDetalles,unaPersoneriaJuridica);
        unosEncabezados.add(unEncabezado);
    }
    
    public Articulo buscarArticulo(int codigo){
        Articulo aux = new Articulo();
        Iterator itr = unosArticulos.iterator();
        int band = 0;
        while(itr.hasNext() && band == 0){
            aux = (Articulo) itr.next();
            if(aux.isArticulo(codigo)){
                band = 1;
            }
           
        }
        return aux;
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
    
    public Proveedor buscarProveedor(int codigo){
        Proveedor aux = new Proveedor();
        Iterator itr = unosProveedores.iterator();
        int band = 0;
        while(itr.hasNext() && band == 0){
            aux = (Proveedor) itr.next();
            if(aux.isProveedor(codigo)){
                band = 1;
            }
           
        }
        return aux;    
    }
    
    public void crearProveedor(int codigo, String nombre, String direccion, long telefono, String email, String cuit){
        Proveedor unProveedor = new Proveedor(cuit,codigo,nombre,direccion,telefono,email);
        unosProveedores.add(unProveedor);
    }
    
    public TipoCompra buscarTipoCompra(int codigo){
        TipoCompra aux = new TipoCompra();
        Iterator itr = unosTiposCompras.iterator();
        int band = 0;
        while(itr.hasNext() && band == 0){
            aux = (TipoCompra) itr.next();
            if(aux.isTipoCompra(codigo)){
                band = 1;
            }
           
        }
        return aux;    
    }
    
    public TipoLiquidacion buscarTipoLiquidacion(int codigo){
        TipoLiquidacion aux = new TipoLiquidacion();
        Iterator itr = unosTiposLiquidaciones.iterator();
        int band = 0;
        while(itr.hasNext() && band == 0){
            aux = (TipoLiquidacion) itr.next();
            if(aux.isTipoLiquidacion(codigo)){
                band = 1;
            }
           
        }
        return aux;    
    }
    
    public List<ManoDeObra> buscarManoDeObra(Empleado unEmpleado, Date fechaInicio, Date fechaFin){
        ManoDeObra aux = new ManoDeObra();
        List<ManoDeObra> aux2 = new LinkedList();
        Iterator itr = unasManosDeObras.iterator();
        while(itr.hasNext()){
            aux = (ManoDeObra) itr.next();
            if(aux.isCliente(unEmpleado) && aux.isMayor(fechaInicio) && aux.isMenor(fechaFin)){
                aux2.add(aux);
            }
           
        }
        return aux2;
    }
    
    public void generarDetalleLiquidacion(int codigo, String descripcion, ManoDeObra unaManoDeObra){
        DetalleLiquidacion unDetalleLiquidacion = new DetalleLiquidacion(codigo, descripcion,unaManoDeObra);
        unosDetallesLiquidacion.add(unDetalleLiquidacion);
        unosDetalles.add(unDetalleLiquidacion);   
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
    
    public void generarConcepto(int codigo, String descripcion, Double monto){
        Concepto unConcepto = new Concepto(codigo,descripcion,monto);
        unosConceptos.add(unConcepto);
    }
    
    public Tecnologia buscarTecnologia(int codigo){
        Tecnologia aux = new Tecnologia();
        Iterator itr = unasTecnologias.iterator();
        int band = 0;
        while(itr.hasNext() && band == 0){
            aux = (Tecnologia) itr.next();
            if(aux.isTecnologia(codigo)){
                band = 1;
            }
           
        }
        return aux;
    }
    
    public TipoTecnologia buscarTipoTecnologia(int codigo){
        TipoTecnologia aux = new TipoTecnologia();
        Iterator itr = unosTiposTecnologias.iterator();
        int band = 0;
        while(itr.hasNext() && band == 0){
            aux = (TipoTecnologia) itr.next();
            if(aux.isTipoTecnologia(codigo)){
                band = 1;
            }
           
        }
        return aux;
    }
    
    public void crearTipoTecnologia(int codigo,String nombre,String descripcion){
        TipoTecnologia unosTipoTecnologia = new TipoTecnologia(codigo,nombre,descripcion);
        unosTiposTecnologias.add(unosTipoTecnologia);
    }
    
    public void crearTecnologia(int codigo,String descripcion,TipoTecnologia unTipoTecnologia){
        Tecnologia unaTecnologia = new Tecnologia(codigo,descripcion,unTipoTecnologia);
        unasTecnologias.add(unaTecnologia);
    }
    
    public void generarProyecto(Float tiempoEstimado, List<Concepto> unosConceptos, List<Tecnologia> unasTecnologias, int codigo, String descripcion){
        Proyecto unProyecto = new Proyecto(tiempoEstimado,unosConceptos,unasTecnologias,codigo,descripcion);
        unosProyectos.add(unProyecto);
    }
    
    public void crearTipoVenta(int codiog,String descripcion){
        TipoVenta unTipoVenta = new TipoVenta(codigo,descripcion);
        unosTiposVentas.add(unTipoVenta);
    }
    
    public void crearTipoCompra(int codiog,String descripcion){
        TipoCompra unTipoCompra = new TipoCompra(codigo,descripcion);
        unosTiposCompras.add(unTipoCompra);
    }
    
    public void crearTipoLiquidacion(int codiog,String descripcion){
        TipoLiquidacion unTipoLiquidacion = new TipoLiquidacion(codigo,descripcion);
        unosTiposLiquidaciones.add(unTipoLiquidacion);
    }
    
    public void crearArticulo(int codigo,String nombre,String descripcion,Double precio,int cantidad){
        Articulo unArticulo = new Articulo(codigo,nombre,descripcion,precio,cantidad);
        unosArticulos.add(unArticulo);
    }
}
