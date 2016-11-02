/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
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
public class Empresa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;
    @Basic
    private String nombre;
    @Basic
    private String direccion;

    //Relaciones
    @OneToMany
    private List<Encabezado> unosEncabezados = new LinkedList();
    @OneToMany
    private List<Cliente> unosClientes = new LinkedList();
    @OneToMany
    private List<Proveedor> unosProveedores = new LinkedList();
    @OneToMany
    private List<Empleado> unosEmpleados = new LinkedList();
    @OneToMany
    private List<Actividad> unasActividades = new LinkedList();
    @OneToMany
    private List<ActividadAdministrativa> unasActAdministrativas = new LinkedList();
    @OneToMany
    private List<ActividadProyecto> unasActProyecto = new LinkedList();
    @OneToMany
    private List<ActividadTecnica> unasActTecnicas = new LinkedList();
    @OneToMany
    private List<TipoLiquidacion> unosTiposLiquidaciones = new LinkedList();
    @OneToMany
    private List<TipoCompra> unosTiposCompras = new LinkedList();
    @OneToMany
    private List<TipoVenta> unosTiposVentas = new LinkedList();
    @OneToMany
    private List<Articulo> unosArticulos = new LinkedList();
    @OneToMany
    private List<Tecnico> unosTecnicos = new LinkedList();
    @OneToMany
    private List<Tercero> unosTerceros = new LinkedList();
    @OneToMany
    private List<Proyecto> unosProyectos = new LinkedList();
    @OneToMany
    private List<Turno> unosTurnos = new LinkedList();
    @OneToMany
    private List<OrdenTrabajo> unasOrdenesTrabajos = new LinkedList();
    @OneToMany
    private List<Equipo> unosEquipos = new LinkedList();
    @OneToMany
    private List<TipoEstado> unosTiposEstados = new LinkedList();
    @OneToMany
    private List<Concepto> unosConceptos = new LinkedList();
    @OneToMany
    private List<Tecnologia> unasTecnologias = new LinkedList();
    @OneToMany
    private List<TipoTecnologia> unosTiposTecnologias = new LinkedList();
    @OneToMany
    private List<Detalle> unosDetalles = new LinkedList();
    @OneToMany
    private List<DetalleCompraVenta> unosDetallesCompraVenta = new LinkedList();
    @OneToMany
    private List<DetalleLiquidacion> unosDetallesLiquidacion = new LinkedList();
    @OneToMany
    private List<Estado> unosEstados = new LinkedList();
    @OneToMany
    private List<Servicio> unosServicios = new LinkedList();
    @OneToMany
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

    public Cliente buscarClient(int codigo) {
        Cliente aux = null;
        Iterator itr = unosClientes.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (Cliente) itr.next();
            if (aux.isCliente(codigo)) {
                band = 1;
            }
        }
        return aux;
    }

    public Cliente buscarCliente(long dni) {
        Cliente aux = new Cliente();
        Iterator itr = unosClientes.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (Cliente) itr.next();
            if (aux.isCliente(dni)) {
                band = 1;
            }

        }
        return aux;
    }

    public void crearCliente(String nombre, String apellido, String direccion, long telefono, String email, long dni, String cuil) throws Exception {
        int codigo = generarCliente();
        Cliente unCliente = new Cliente(codigo, apellido, dni, cuil, nombre, direccion, telefono, email);
        unosClientes.add(unCliente);
        Persistencia.crearCliente(unCliente);
    }

    public void modificarCliente(int codigo, String nombre, String apellido, String direccion, long telefono, String email, long dni, String cuil) throws Exception {
        Cliente unCliente = buscarCliente(codigo);
        unCliente.setNombre(nombre);
        unCliente.setApellido(apellido);
        unCliente.setDireccion(direccion);
        unCliente.setEmail(email);
        unCliente.setTelefono(telefono);
        unCliente.setDni(dni);
        unCliente.setCuil(cuil);
        Persistencia.modificarCliente(unCliente);
    }

    public void borrarCliente(int codigo) throws Exception {
        Cliente unCliente = buscarClient(codigo);
        unosClientes.remove(unCliente);
        Persistencia.eliminarCliente(codigo);
    }

    public boolean buscarTurnoDisponible(Date fecha, Float hora) {
        boolean disponibilidad = true;
        Turno aux = new Turno();
        Iterator itr = unosTurnos.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (Turno) itr.next();
            if (aux.disponibilidad(fecha, hora)) {
                band = 1;
                disponibilidad = false;
            }

        }
        return disponibilidad;
    }

    public void GenerarTurno(Cliente unCliente, int codigo, String descripcion, Date fecha, Float hora) {
        Turno unturno = new Turno(unCliente, codigo, descripcion, hora, fecha);
        unosTurnos.add(unturno);
    }

    public Turno buscarTurno(int codigo) {
        Turno aux = new Turno();
        Iterator itr = unosTurnos.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (Turno) itr.next();
            if (aux.isTurno(codigo)) {
                band = 1;
            }

        }
        return aux;
    }

    public Equipo buscarEquipo(int codigo) {
        Equipo aux = new Equipo();
        Iterator itr = unosEquipos.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (Equipo) itr.next();
            if (aux.isEquipo(codigo)) {
                band = 1;
            }

        }
        return aux;
    }

    public void crearEquipo(int codigo, String descripcion) {
        Equipo unEquipo = new Equipo(codigo, descripcion);
        unosEquipos.add(unEquipo);
    }

    public TipoEstado buscarTipoEstado(int codigo) {
        TipoEstado aux = new TipoEstado();
        Iterator itr = unosTiposEstados.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (TipoEstado) itr.next();
            if (aux.isTipoEstado(codigo)) {
                band = 1;
            }

        }
        return aux;
    }

    public void crearTipoEstado(int codigo, String nombre) {
        TipoEstado unTipoEstado = new TipoEstado(codigo, nombre);
        unosTiposEstados.add(unTipoEstado);
    }

    public void generarEstadoEquipo(int codigo, String descripcion, Equipo unEquipo, TipoEstado unTipoEstado, OrdenTrabajo unaOrdenTrabajo) {
        Estado unEstado = new Estado(codigo, descripcion, unEquipo, unTipoEstado, unaOrdenTrabajo);
        unosEstados.add(unEstado);
    }

    public void generarServicioTecnico(int codigo, String descripcion) {
        Tecnico unTecnico = new Tecnico(codigo, descripcion);
        unosTecnicos.add(unTecnico);
        unosServicios.add(unTecnico);

    }

    public void generarServicioTercero(int codigo, String descripcion, Double monto, int ganancia) {
        Tercero unTercero = new Tercero(codigo, descripcion, monto, ganancia);
        unosTerceros.add(unTercero);
        unosServicios.add(unTercero);

    }

    public void generarOrdenTrabajo(int codigo, String descripcion, Turno unTurno, Equipo unEquipo, Servicio unServicio) {
        OrdenTrabajo unaOrdenTrabajo = new OrdenTrabajo(codigo, descripcion, unTurno, unServicio, unEquipo);
        unasOrdenesTrabajos.add(unaOrdenTrabajo);

    }

    public OrdenTrabajo buscarOrdenTrabajo(int codigo) {
        OrdenTrabajo aux = new OrdenTrabajo();
        Iterator itr = unasOrdenesTrabajos.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (OrdenTrabajo) itr.next();
            if (aux.isOrdenTrabajo(codigo)) {
                band = 1;
            }

        }
        return aux;

    }

    public void agregarServicio(OrdenTrabajo unaOrdenTrabajo, Servicio unServicio) {
        unaOrdenTrabajo.agregarServicio(unServicio);
    }

    public Empleado buscarEmpleado(int codigo) {
        Empleado aux = new Empleado();
        Iterator itr = unosEmpleados.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (Empleado) itr.next();
            if (aux.isEmpleado(codigo)) {
                band = 1;
            }

        }
        return aux;
    }

    public void crearEmpleado(String nombre, String apellido, String direccion, long telefono, String email, long dni, String cuil) throws Exception {
        int codigo=generarCodigoEmpleado();
        Empleado unEmpleado = new Empleado(apellido, dni, cuil, codigo, nombre, direccion, telefono, email);
        unosEmpleados.add(unEmpleado);
        Persistencia.crearEmpleado(unEmpleado);
    }

    public void modificarEmpleado(int codigo,String nombre,String apellido,String direccion, long telefono,String email,long dni,String cuil) throws Exception{
        Empleado unEmpleado=buscarEmpleado(codigo);
        unEmpleado.setNombre(nombre);
        unEmpleado.setApellido(apellido);
        unEmpleado.setDireccion(direccion);
        unEmpleado.setTelefono(telefono);
        unEmpleado.setEmail(email);
        unEmpleado.setDni(dni);
        unEmpleado.setCuil(cuil);
        Persistencia.modificarEmpleado(unEmpleado);
    }
    
    public void borrarEmpleado(int codigo) throws Exception{
        Empleado unEmpleado=buscarEmpleado(codigo);
        this.unosEmpleados.remove(unEmpleado);
        Persistencia.eliminarEmpleado(codigo);
    }
    
    public Servicio buscarServicio(int codigo) {
        Servicio aux = new Servicio();
        Iterator itr = unosServicios.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (Servicio) itr.next();
            if (aux.isServicio(codigo)) {
                band = 1;
            }

        }
        return aux;

    }

    public Actividad buscarActividad(int codigo) {
        Actividad aux = new Actividad();
        Iterator itr = unasActividades.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (Actividad) itr.next();
            if (aux.isActividad(codigo)) {
                band = 1;
            }

        }
        return aux;

    }

    public ActividadAdministrativa buscarActAdministrativa(int codigo) {
        ActividadAdministrativa aux = new ActividadAdministrativa();
        Iterator itr = unasActAdministrativas.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (ActividadAdministrativa) itr.next();
            if (aux.isActividad(codigo)) {
                band = 1;
            }

        }
        return aux;
    }

    public ActividadProyecto buscarActividadProyecto(int codigo) {
        ActividadProyecto aux = new ActividadProyecto();
        Iterator itr = unasActProyecto.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (ActividadProyecto) itr.next();
            if (aux.isActividad(codigo)) {
                band = 1;
            }

        }
        return aux;
    }

    public ActividadTecnica buscarActTecnica(int codigo) {
        ActividadTecnica aux = new ActividadTecnica();
        Iterator itr = unasActTecnicas.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (ActividadTecnica) itr.next();
            if (aux.isActividad(codigo)) {
                band = 1;
            }

        }
        return aux;
    }

    public void crearActividadAdministrativa(String descripcion, Double precioHora) throws Exception {
        int codigo = generarCodigoActAdministrativa();
        ActividadAdministrativa unaActividadAdministrativa = new ActividadAdministrativa(precioHora, codigo, descripcion);
        unasActividades.add(unaActividadAdministrativa);
        unasActAdministrativas.add(unaActividadAdministrativa);
        Persistencia.crearActividadAdministrativa(unaActividadAdministrativa);
    }

    public void modificarActividadAdministrativa(int codigo, String descripcion, Double precioHora) throws Exception {
        ActividadAdministrativa unaActAdministrativa = buscarActAdministrativa(codigo);
        unaActAdministrativa.setDescripcion(descripcion);
        unaActAdministrativa.setPrecioHora(precioHora);
        Persistencia.modificarActividadAdministrativa(unaActAdministrativa);
    }

    public void borrarActAdministrativa(int codigo) throws NonexistentEntityException, Exception {
        ActividadAdministrativa unaActAdministrativa = buscarActAdministrativa(codigo);
        unasActividades.remove(unaActAdministrativa);
        unasActAdministrativas.remove(unaActAdministrativa);
        Persistencia.eliminarActividadAdministrativa(codigo);
    }

    public void crearActividadTecnica(String descripcion, Double precioFijo) throws Exception {
        int codigo = generarCodigoActTecnica();
        ActividadTecnica unaActividadTecnica = new ActividadTecnica(precioFijo, codigo, descripcion);
        unasActividades.add(unaActividadTecnica);
        unasActTecnicas.add(unaActividadTecnica);
        Persistencia.crearActividadTecnica(unaActividadTecnica);
    }

    public void modificarActividadTecnica(int codigo, String descripcion, Double precioFijo) throws Exception {
        ActividadTecnica unaActTecnica = buscarActTecnica(codigo);
        unaActTecnica.setDescripcion(descripcion);
        unaActTecnica.setPrecioFijo(precioFijo);
        Persistencia.modificarActividadTecnica(unaActTecnica);
    }

    public void borrarActividadTecnica(int codigo) throws NonexistentEntityException, Exception {
        ActividadTecnica unaActTecnica = buscarActTecnica(codigo);
        unasActividades.remove(unaActTecnica);
        unasActTecnicas.remove(unaActTecnica);
        Persistencia.eliminarActividadTecnica(codigo);
    }

    public void crearActividadProyecto(String descripcion, Double porcentaje) throws Exception {
        ActividadProyecto unaActividadProyecto = new ActividadProyecto(codigo, descripcion, porcentaje);
        unasActividades.add(unaActividadProyecto);
        unasActProyecto.add(unaActividadProyecto);
        Persistencia.crearActividadProyecto(unaActividadProyecto);
    }

    public void modificarActividadProyecto(int codigo, String descripcion, Double porcentaje) throws Exception {
        ActividadProyecto unaActividadProyecto = buscarActividadProyecto(codigo);
        unaActividadProyecto.setDescripcion(descripcion);
        unaActividadProyecto.setPorcentaje(porcentaje);
        Persistencia.modificarActividadProyecto(unaActividadProyecto);
    }

    public void borrarActividadProyecto(int codigo) throws Exception {
        ActividadProyecto unaActividadProyecto = buscarActividadProyecto(codigo);
        unasActividades.remove(unaActividadProyecto);
        unasActProyecto.remove(unaActividadProyecto);
        Persistencia.eliminarActividadProyecto(codigo);
    }

    public void generarManoDeObra(int codigo, long horasTrabajadas, Date fecha, Empleado unEmpleado, Servicio unServicio, Actividad unaActividad) {
        ManoDeObra unaManoDeObra = new ManoDeObra(codigo, horasTrabajadas, fecha, unaActividad, unServicio, unEmpleado);
        unasManosDeObras.add(unaManoDeObra);
    }

    public TipoVenta buscarTipoVenta(int codigo) {
        TipoVenta aux = new TipoVenta();
        Iterator itr = unosTiposVentas.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (TipoVenta) itr.next();
            if (aux.isTipoVenta(codigo)) {
                band = 1;
            }

        }
        return aux;
    }

    public List<Servicio> buscarServicioOrdenTrabajo(Cliente unCliente) {
        Turno aux = new Turno();
        List<Servicio> aux2 = new LinkedList();
        OrdenTrabajo aux3 = new OrdenTrabajo();
        Iterator itr = unosTurnos.iterator();
        while (itr.hasNext()) {
            aux = (Turno) itr.next();
            if (aux.isCliente(unCliente)) {
                aux3 = aux.getUnaOrdenTrabajo();
                aux2 = aux3.getUnosServicios();//preguntar si se puede ahcer asi
            }

        }
        return aux2;
    }

    public void generarDetalleCompraVenta(int codigo, String descripcion, int cantidad, InterfaceConsumible unConsumible) {
        DetalleCompraVenta unDetalleCompraVenta = new DetalleCompraVenta(cantidad, codigo, descripcion, unConsumible);
        unosDetallesCompraVenta.add(unDetalleCompraVenta);
        unosDetalles.add(unDetalleCompraVenta);
    }

    public void generarEncabezado(int codigo, String descripcion, Date fecha, List<Detalle> unosDetalles, PersoneriaJuridica unaPersoneriaJuridica, TipoComprobante unTipoComprobante) {
        Encabezado unEncabezado = new Encabezado(codigo, descripcion, fecha, unTipoComprobante, unosDetalles, unaPersoneriaJuridica);
        unosEncabezados.add(unEncabezado);
    }

    public Articulo buscarArticulo(int codigo) {
        Articulo aux = new Articulo();
        Iterator itr = unosArticulos.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (Articulo) itr.next();
            if (aux.isArticulo(codigo)) {
                band = 1;
            }

        }
        return aux;
    }

    public void sumarArticulo(int cantidad, Articulo unArticulo) {
        unArticulo.sumarArticulo(cantidad);
    }

    public void descontarArticulo(int cantidad, Articulo unArticulo) {
        unArticulo.descontarArticulo(cantidad);
    }

    public boolean comprobarStock(Articulo unArticulo, int cantidad) {

        return unArticulo.comprobarStock(cantidad);

    }

    public Proveedor buscarProveedor(int codigo) {
        Proveedor aux = new Proveedor();
        Iterator itr = unosProveedores.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (Proveedor) itr.next();
            if (aux.isProveedor(codigo)) {
                band = 1;
            }

        }
        return aux;
    }

    public void crearProveedor(String nombre, String direccion, long telefono, String email, String cuit) throws Exception {
        int codigo = generarProveedor();
        Proveedor unProveedor = new Proveedor(cuit, codigo, nombre, direccion, telefono, email);
        unosProveedores.add(unProveedor);
        Persistencia.crearProveedor(unProveedor);
    }

    public void modificarProveedor(int codigo, String nombre, String direccion, long telefono, String email, String cuit) throws Exception {
        Proveedor unProveedor = buscarProveedor(codigo);
        unProveedor.setNombre(nombre);
        unProveedor.setDireccion(direccion);
        unProveedor.setTelefono(telefono);
        unProveedor.setEmail(email);
        unProveedor.setCuit(cuit);
        Persistencia.modificarProveedor(unProveedor);
    }

    public void borrarProveedor(int codigo) throws Exception {
        Proveedor unProveedor = buscarProveedor(codigo);
        this.unosProveedores.remove(unProveedor);
        Persistencia.eliminarProveedor(codigo);
    }

    public TipoCompra buscarTipoCompra(int codigo) {
        TipoCompra aux = new TipoCompra();
        Iterator itr = unosTiposCompras.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (TipoCompra) itr.next();
            if (aux.isTipoCompra(codigo)) {
                band = 1;
            }

        }
        return aux;
    }

    public TipoLiquidacion buscarTipoLiquidacion(int codigo) {
        TipoLiquidacion aux = new TipoLiquidacion();
        Iterator itr = unosTiposLiquidaciones.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (TipoLiquidacion) itr.next();
            if (aux.isTipoLiquidacion(codigo)) {
                band = 1;
            }

        }
        return aux;
    }

    public List<ManoDeObra> buscarManoDeObra(Empleado unEmpleado, Date fechaInicio, Date fechaFin) {
        ManoDeObra aux = new ManoDeObra();
        List<ManoDeObra> aux2 = new LinkedList();
        Iterator itr = unasManosDeObras.iterator();
        while (itr.hasNext()) {
            aux = (ManoDeObra) itr.next();
            if (aux.isCliente(unEmpleado) && aux.isMayor(fechaInicio) && aux.isMenor(fechaFin)) {
                aux2.add(aux);
            }

        }
        return aux2;
    }

    public void generarDetalleLiquidacion(int codigo, String descripcion, ManoDeObra unaManoDeObra) {
        DetalleLiquidacion unDetalleLiquidacion = new DetalleLiquidacion(codigo, descripcion, unaManoDeObra);
        unosDetallesLiquidacion.add(unDetalleLiquidacion);
        unosDetalles.add(unDetalleLiquidacion);
    }

    public List<OrdenTrabajo> buscarOrdenTrabajo(Equipo unEquipo) {
        OrdenTrabajo aux = new OrdenTrabajo();
        List<OrdenTrabajo> aux2 = new LinkedList();
        Iterator itr = unasOrdenesTrabajos.iterator();
        while (itr.hasNext()) {
            aux = (OrdenTrabajo) itr.next();
            if (aux.isOrdenTrabajo(unEquipo)) {
                aux2.add(aux);
            }

        }
        return aux2;

    }

    public void agregarOrden(OrdenTrabajo unaOrdenTrabajo, Turno unTurno) {
        unTurno.agregarOrden(unaOrdenTrabajo);
    }

    public void generarConcepto(String descripcion, Double monto) throws Exception {
        int codigo=generarCodigoConcepto();
        Concepto unConcepto = new Concepto(codigo, descripcion, monto);
        unosConceptos.add(unConcepto);
        Persistencia.crearConcepto(unConcepto);
    }
    
    public void modificarConcepto(int codigo,String descripcion,Double monto) throws Exception{
        Concepto unConcepto=buscarConcepto(codigo);
        unConcepto.setDescripcion(descripcion);
        unConcepto.setMonto(monto);
        Persistencia.modificarConcepto(unConcepto);
    }
    
    public void borrarConcepto(int codigo) throws Exception{
        Concepto unConcepto=buscarConcepto(codigo);
        this.unosConceptos.remove(unConcepto);
        Persistencia.eliminarConcepto(codigo);
    }

    public Tecnologia buscarTecnologia(int codigo) {
        Tecnologia aux = new Tecnologia();
        Iterator itr = unasTecnologias.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (Tecnologia) itr.next();
            if (aux.isTecnologia(codigo)) {
                band = 1;
            }

        }
        return aux;
    }

    public TipoTecnologia buscarTipoTecnologia(int codigo) {
        TipoTecnologia aux = new TipoTecnologia();
        Iterator itr = unosTiposTecnologias.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (TipoTecnologia) itr.next();
            if (aux.isTipoTecnologia(codigo)) {
                band = 1;
            }

        }
        return aux;
    }

    public void crearTipoTecnologia(String nombre, String descripcion) throws Exception {
        int codigoTipo = generarCodigoTipoTecnologia();
        TipoTecnologia unTipoTecnologia = new TipoTecnologia(codigoTipo, nombre, descripcion);
        unosTiposTecnologias.add(unTipoTecnologia);
        Persistencia.crearTipoTecnologia(unTipoTecnologia);
    }

    public void modificarTipoTecnoligia(int codigo, String nombre, String descripcion) throws Exception {
        TipoTecnologia unTipoTecnologia = buscarTipoTecnologia(codigo);
        unTipoTecnologia.setNombre(nombre);
        unTipoTecnologia.setDescripcion(descripcion);
        Persistencia.modificarTipoTecnologia(unTipoTecnologia);
    }

    public void borrarTipoTecnologia(int codigo) throws Exception {
        TipoTecnologia unTipoTecnologia = buscarTipoTecnologia(codigo);
        unosTiposTecnologias.remove(unTipoTecnologia);
        Persistencia.eliminarTipoTecnologia(codigo);
    }

    public void crearTecnologia(String descripcion, TipoTecnologia unTipoTecnologia) throws Exception {
        int codigoTecnologia = generarCodigoTecnologia();
        Tecnologia unaTecnologia = new Tecnologia(codigoTecnologia, descripcion, unTipoTecnologia);
        unasTecnologias.add(unaTecnologia);
        Persistencia.crearTecnologia(unaTecnologia);
    }

    public void modificarTecnologia(int codigo, String descripcion, TipoTecnologia unTipoTecnologia) throws Exception {
        Tecnologia unaTecnologia = buscarTecnologia(codigo);
        unaTecnologia.setDescripcion(descripcion);
        unaTecnologia.setUnTipoTecnologia(unTipoTecnologia);
        Persistencia.modificarTecnologia(unaTecnologia);
    }

    public void borrarTecnologia(int codigo) throws Exception {
        Tecnologia unaTecnologia = buscarTecnologia(codigo);
        unasTecnologias.remove(unaTecnologia);
        Persistencia.eliminarTecnologia(codigo);
    }

    public void generarProyecto(Float tiempoEstimado, List<Concepto> unosConceptos, List<Tecnologia> unasTecnologias, int codigo, String descripcion) {
        Proyecto unProyecto = new Proyecto(tiempoEstimado, unosConceptos, unasTecnologias, codigo, descripcion);
        unosProyectos.add(unProyecto);
    }

    public void crearTipoVenta(int codiog, String descripcion) {
        TipoVenta unTipoVenta = new TipoVenta(codigo, descripcion);
        unosTiposVentas.add(unTipoVenta);
    }

    public void crearTipoCompra(int codiog, String descripcion) {
        TipoCompra unTipoCompra = new TipoCompra(codigo, descripcion);
        unosTiposCompras.add(unTipoCompra);
    }

    public void crearTipoLiquidacion(int codiog, String descripcion) {
        TipoLiquidacion unTipoLiquidacion = new TipoLiquidacion(codigo, descripcion);
        unosTiposLiquidaciones.add(unTipoLiquidacion);
    }

    public void crearArticulo(String nombre, String descripcion, Double precio, int cantidad) throws Exception {
        int codigo = generarCodigoArticulo();
        Articulo unArticulo = new Articulo(codigo, nombre, descripcion, precio, cantidad);
        unosArticulos.add(unArticulo);
        Persistencia.crearArticulo(unArticulo);
    }

    public void modificarArticulo(int codigo, String nombre, String descripcion, Double precio, int cantidad) throws Exception {
        Articulo unArticulo = buscarArticulo(codigo);
        unArticulo.setNombre(nombre);
        unArticulo.setDescripcion(descripcion);
        unArticulo.setPrecio(precio);
        unArticulo.setCantidad(cantidad);
        Persistencia.modificarArticulo(unArticulo);
    }

    public void borrarArticulo(int codigo) throws NonexistentEntityException {
        Articulo unArticulo = buscarArticulo(codigo);
        unosArticulos.remove(unArticulo);
        Persistencia.eliminarArticulo(codigo);
    }

    public void ConexionConBD() {
        this.unosTiposTecnologias = Persistencia.traerTiposTecnolgias();
        this.unasTecnologias = Persistencia.traerTecnolgias();
        this.unasActAdministrativas = Persistencia.traerActividadesAdministrativas();
        this.unasActProyecto = Persistencia.traerActividadesProyectos();
        this.unasActTecnicas = Persistencia.traerActividadesTecnicas();
        this.unosArticulos = Persistencia.traerArticulos();
        this.unosProveedores = Persistencia.traerProveedores();
        this.unosEmpleados = Persistencia.traerEmpleados();
        this.unosConceptos=Persistencia.traerConceptos();
        //this.unosClientes=Persistencia.traerClientes();
    }

    public List<TipoTecnologia> traerTiposDeTecnologias() {
        return this.unosTiposTecnologias;
    }
    
    public List<Empleado> traerEmpleado(){
        return this.unosEmpleados;
    }
    
    private int generarCodigoEmpleado() {
        Iterator<Empleado> itEmpleado = this.unosEmpleados.iterator();
        Empleado unEmp;
        int codigo = 0;
        while (itEmpleado.hasNext()) {
            unEmp = itEmpleado.next();
            if (unEmp.getCodigo() > codigo) {
                codigo = unEmp.getCodigo();
            }
        }
        return codigo + 1;
    }

    private int generarCodigoTipoTecnologia() {
        Iterator<TipoTecnologia> itLista = this.unosTiposTecnologias.iterator();
        TipoTecnologia unTipo;
        int codigoTipo = 0;
        while (itLista.hasNext()) {
            unTipo = itLista.next();
            if (unTipo.getCodigo() > codigoTipo) {
                codigoTipo = unTipo.getCodigo();
            }
        }
        return codigoTipo + 1;
    }

    private int generarCodigoTecnologia() {
        Iterator<Tecnologia> itLista = this.unasTecnologias.iterator();
        Tecnologia unaTecnologia;
        int codigoTipo = 0;
        while (itLista.hasNext()) {
            unaTecnologia = itLista.next();
            if (unaTecnologia.getCodigo() > codigoTipo) {
                codigoTipo = unaTecnologia.getCodigo();
            }
        }
        return codigoTipo + 1;
    }

    public List<Tecnologia> traerTecnologias() {
        return this.unasTecnologias;
    }

    public List<ActividadAdministrativa> traerActAdministrativa() {
        return this.unasActAdministrativas;
    }

    private int generarCodigoActAdministrativa() {
        Iterator<ActividadAdministrativa> itLista = this.unasActAdministrativas.iterator();
        ActividadAdministrativa unaActAdministrativa;
        int codigo = 0;
        while (itLista.hasNext()) {
            unaActAdministrativa = itLista.next();
            if (unaActAdministrativa.getCodigo() > codigo) {
                codigo = unaActAdministrativa.getCodigo();
            }
        }
        return codigo + 1;
    }

    public List<ActividadProyecto> traerActProyecto() {
        return this.unasActProyecto;
    }

    private int generarCodigoActProyecto() {
        Iterator<ActividadProyecto> itLista = this.unasActProyecto.iterator();
        ActividadProyecto unaActProyecto;
        int codigo = 0;
        while (itLista.hasNext()) {
            unaActProyecto = itLista.next();
            if (unaActProyecto.getCodigo() > codigo) {
                codigo = unaActProyecto.getCodigo();
            }
        }
        return codigo + 1;
    }

    public List<Articulo> traerArticulo() {
        return this.unosArticulos;
    }

    private int generarCodigoArticulo() {
        Iterator<Articulo> itLista = this.unosArticulos.iterator();
        Articulo unTipo;
        int codigoTipo = 0;
        while (itLista.hasNext()) {
            unTipo = itLista.next();
            if (unTipo.getCodigo() > codigoTipo) {
                codigoTipo = unTipo.getCodigo();
            }
        }
        return codigoTipo + 1;
    }

    private int generarCodigoActTecnica() {
        Iterator<ActividadTecnica> itLista = this.unasActTecnicas.iterator();
        ActividadTecnica unaActTecnica;
        int codigo = 0;
        while (itLista.hasNext()) {
            unaActTecnica = itLista.next();
            if (unaActTecnica.getCodigo() > codigo) {
                codigo = unaActTecnica.getCodigo();
            }
        }
        return codigo + 1;
    }

    public List<ActividadTecnica> traerActTecnica() {
        return this.unasActTecnicas;
    }

    public List<Cliente> traerCliente() {
        return this.unosClientes;
    }

    public List<Proveedor> traerProveedor() {
        return this.unosProveedores;
    }
    
    public List<Concepto> traerConcepto(){
        return this.unosConceptos;
    }

    private int generarCliente() {
        Iterator<Cliente> itCliente = this.unosClientes.iterator();
        Cliente unCliente;
        int codigo = 0;
        while (itCliente.hasNext()) {
            unCliente = itCliente.next();
            if (unCliente.getCodigo() > codigo) {
                codigo = unCliente.getCodigo();
            }
        }
        return codigo + 1;
    }

    private int generarProveedor() {
        Iterator<Proveedor> itProveedor = this.unosProveedores.iterator();
        Proveedor unProveedor;
        int codigo = 0;
        while (itProveedor.hasNext()) {
            unProveedor = itProveedor.next();
            if (unProveedor.getCodigo() > codigo) {
                codigo = unProveedor.getCodigo();
            }
        }
        return codigo + 1;
    }

    private int generarCodigoConcepto() {
        Iterator<Concepto> itConcepto = this.unosConceptos.iterator();
        Concepto unConcepto;
        int codigo = 0;
        while (itConcepto.hasNext()) {
            unConcepto = itConcepto.next();
            if (unConcepto.getCodigo() > codigo) {
                codigo = unConcepto.getCodigo();
            }
        }
        return codigo + 1;
    }

    public Concepto buscarConcepto(int codigo) {
        Concepto aux = new Concepto();
        Iterator itr = unosConceptos.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (Concepto) itr.next();
            if (aux.isConcepto(codigo)) {
                band = 1;
            }

        }
        return aux;
    }
}
