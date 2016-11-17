/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.Calendar;
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
    private List<Encabezado> unosEncabezadosVentaArticulo = new LinkedList();
    @OneToMany
    private List<Encabezado> unosEncabezadosVentaServicio = new LinkedList();
    @OneToMany
    private List<Encabezado> unosEncabezadosCompra = new LinkedList();
    @OneToMany
    private List<Encabezado> unosEncabezadosLiquidacion = new LinkedList();
    @OneToMany
    private List<PersoneriaJuridica> unasPersoneriaJuridicas = new LinkedList();
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
    private List<TipoComprobante> unosTiposComprobantes = new LinkedList();
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
        Cliente aux = null;
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
        int codigo = generarCodigoPersoneria();
        Cliente unCliente = new Cliente(codigo, apellido, dni, cuil, nombre, direccion, telefono, email);
        this.unosClientes.add(unCliente);
        this.unasPersoneriaJuridicas.add(unCliente);
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
        this.unosClientes.remove(unCliente);
        this.unasPersoneriaJuridicas.remove(unCliente);
        Persistencia.eliminarCliente(codigo);
    }

    public boolean buscarTurnoDisponible(Date fecha, Float hora) {
        boolean disponibilidad = true;
        Turno aux = null;
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
        Turno aux = null;
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
        Equipo aux = null;
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
        TipoEstado aux = null;
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

    public void generarServicioTecnico(String descripcion, Double subtotal, List unosDetallesCompraVenta) throws Exception {
        int codigo = generarCodigoServicio();
        Tecnico unTecnico = new Tecnico(codigo, descripcion, subtotal, unosDetallesCompraVenta);
        unosTecnicos.add(unTecnico);
        unosServicios.add(unTecnico);
        Persistencia.crearTecnico(unTecnico);
    }
    
    public void borrarServicioTecnico(int codigo) throws Exception{
        Tecnico unTecnico=buscarServicioTecnico(codigo);
        this.unosTecnicos.remove(unTecnico);
        this.unosServicios.remove(unTecnico);
        Persistencia.eliminarTecnico(codigo);
    }

    public void generarServicioTercero(String descripcion, Double monto, int ganancia,Double subtotal) throws Exception {
        int codigo=generarCodigoServicio();
        Tercero unTercero = new Tercero(codigo, descripcion, monto, ganancia,subtotal);
        this.unosTerceros.add(unTercero);
        this.unosServicios.add(unTercero);
        Persistencia.crearTercero(unTercero);

    }
    
    public void borrarServicioTercero(int codigo) throws Exception{
        Tercero unTercero = buscarServicioTercero(codigo);
        this.unosTerceros.remove(unTercero);
        this.unosServicios.remove(unTercero);
        Persistencia.eliminarTercero(codigo);
    }

    public void generarOrdenTrabajo(int codigo, String descripcion, Turno unTurno, Equipo unEquipo, Servicio unServicio) {
        OrdenTrabajo unaOrdenTrabajo = new OrdenTrabajo(codigo, descripcion, unTurno, unServicio, unEquipo);
        unasOrdenesTrabajos.add(unaOrdenTrabajo);

    }

    public OrdenTrabajo buscarOrdenTrabajo(int codigo) {
        OrdenTrabajo aux = null;
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
        Empleado aux = null;
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
        int codigo = generarCodigoPersoneria();
        Empleado unEmpleado = new Empleado(apellido, dni, cuil, codigo, nombre, direccion, telefono, email);
        unosEmpleados.add(unEmpleado);
        unasPersoneriaJuridicas.add(unEmpleado);
        Persistencia.crearEmpleado(unEmpleado);
    }

    public void modificarEmpleado(int codigo, String nombre, String apellido, String direccion, long telefono, String email, long dni, String cuil) throws Exception {
        Empleado unEmpleado = buscarEmpleado(codigo);
        unEmpleado.setNombre(nombre);
        unEmpleado.setApellido(apellido);
        unEmpleado.setDireccion(direccion);
        unEmpleado.setTelefono(telefono);
        unEmpleado.setEmail(email);
        unEmpleado.setDni(dni);
        unEmpleado.setCuil(cuil);
        Persistencia.modificarEmpleado(unEmpleado);
    }

    public void borrarEmpleado(int codigo) throws Exception {
        Empleado unEmpleado = buscarEmpleado(codigo);
        this.unosEmpleados.remove(unEmpleado);
        this.unasPersoneriaJuridicas.remove(unEmpleado);
        Persistencia.eliminarEmpleado(codigo);
    }

    public Actividad buscarActividad(String descripcion) {
        Actividad aux = null;
        Iterator itr = unasActividades.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (Actividad) itr.next();
            if (aux.isActividad(descripcion)) {
                band = 1;
            }
        }
        return aux;
    }
    
    
    public Articulo buscarArticulo(String descripcion) {
        Articulo aux = null;
        Iterator itr = unosArticulos.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (Articulo) itr.next();
            if (aux.isArticulo(descripcion)) {
                band = 1;
            }

        }
        return aux;
    }
    
    
    public Empleado buscarEmpleado(Long dni) {
        Empleado aux = null;
        Iterator itr = unosEmpleados.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (Empleado) itr.next();
            if (aux.isEmpleado(dni)) {
                band = 1;
            }

        }
        return aux;
    }
    
    
    public Equipo buscarEquipo(String descripcion) {
        Equipo aux = null;
        Iterator itr = unosEquipos.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (Equipo) itr.next();
            if (aux.isEquipo(descripcion)) {
                band = 1;
            }

        }
        return aux;
    }
    
    
    public Proveedor buscarProveedor(String cuit) {
        Proveedor aux = null;
        Iterator itr = unosProveedores.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (Proveedor) itr.next();
            if (aux.isProveedor(cuit)) {
                band = 1;
            }

        }
        return aux;
    }
    
    
    public Tecnologia buscarTecnologia(String descripcion) {
        Tecnologia aux = null;
        Iterator itr = unasTecnologias.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (Tecnologia) itr.next();
            if (aux.isTecnologia(descripcion)) {
                band = 1;
            }

        }
        return aux;
    }
    
    
    
    public TipoTecnologia buscarTipoTecnologia(String nombre) {
        TipoTecnologia aux = null;
        Iterator itr = unosTiposTecnologias.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (TipoTecnologia) itr.next();
            if (aux.isTipoTecnologia(nombre)) {
                band = 1;
            }
        }
        return aux;
    }
    
    
    public TipoComprobante buscarTipoComprobante(String descripcion) {
        TipoComprobante aux = null;
        Iterator itr = unosTiposComprobantes.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (TipoComprobante) itr.next();
            if (aux.isTipoComprobante(descripcion)) {
                band = 1;
            }
        }
        return aux;
    }
    
    
    
    public TipoEstado buscarTipoEstado(String nombre) {
        TipoEstado aux = null;
        Iterator itr = unosTiposEstados.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (TipoEstado) itr.next();
            if (aux.isTipoEstado(nombre)) {
                band = 1;
            }

        }
        return aux;
    }
    
    
    
    public OrdenTrabajo buscarOrdenTrabajo(String descripcion) {
        OrdenTrabajo aux = null;
        Iterator itr = unasOrdenesTrabajos.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (OrdenTrabajo) itr.next();
            if (aux.isOrdenTrabajo(descripcion)) {
                band = 1;
            }

        }
        return aux;

    }
    
    
    
    public Turno buscarTurno(String descripcion) {
        Turno aux = null;
        Iterator itr = unosTurnos.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (Turno) itr.next();
            if (aux.isTurno(descripcion)) {
                band = 1;
            }

        }
        return aux;
    }
    
    
    public Concepto buscarConcepto(String descripcion) {
        Concepto aux = null;
        Iterator itr = unosConceptos.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (Concepto) itr.next();
            if (aux.isConcepto(descripcion)) {
                band = 1;
            }

        }
        return aux;
    }
    
    public Servicio buscarServicio(int codigo) {
        Servicio aux = null;
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
        Actividad aux = null;
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
        ActividadAdministrativa aux = null;
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
        ActividadProyecto aux = null;
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
        ActividadTecnica aux = null;
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
        int codigo = generarCodigoAct();
        ActividadAdministrativa unaActividadAdministrativa = new ActividadAdministrativa(precioHora, codigo, descripcion);
        this.unasActividades.add(unaActividadAdministrativa);
        this.unasActAdministrativas.add(unaActividadAdministrativa);
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
        this.unasActividades.remove(unaActAdministrativa);
        this.unasActAdministrativas.remove(unaActAdministrativa);
        Persistencia.eliminarActividadAdministrativa(codigo);
    }

    public void crearActividadTecnica(String descripcion, Double precioFijo) throws Exception {
        int codigo = generarCodigoAct();
        ActividadTecnica unaActividadTecnica = new ActividadTecnica(precioFijo, codigo, descripcion);
        this.unasActividades.add(unaActividadTecnica);
        this.unasActTecnicas.add(unaActividadTecnica);
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
        this.unasActividades.remove(unaActTecnica);
        this.unasActTecnicas.remove(unaActTecnica);
        Persistencia.eliminarActividadTecnica(codigo);
    }

    public void crearActividadProyecto(String descripcion, Double porcentaje) throws Exception {
        int codigo = generarCodigoAct();
        ActividadProyecto unaActividadProyecto = new ActividadProyecto(codigo, descripcion, porcentaje);
        this.unasActividades.add(unaActividadProyecto);
        this.unasActProyecto.add(unaActividadProyecto);
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
        this.unasActividades.remove(unaActividadProyecto);
        this.unasActProyecto.remove(unaActividadProyecto);
        Persistencia.eliminarActividadProyecto(codigo);
    }

    public void generarManoDeObra(int codigo, long horasTrabajadas, Date fecha, Empleado unEmpleado, Servicio unServicio, Actividad unaActividad) {
        ManoDeObra unaManoDeObra = new ManoDeObra(codigo, horasTrabajadas, fecha, unaActividad, unServicio, unEmpleado);
        this.unasManosDeObras.add(unaManoDeObra);
    }

    public TipoVenta buscarTipoVenta(int codigo) {
        TipoVenta aux = null;
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
        Turno aux = null;
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

    public int generarDetalleCompraVenta(int cantidad, Consumible unConsumible, Double subtotal) throws Exception {
        int codigo = generarCodigoDetallerCompraVenta();
        DetalleCompraVenta unDetalleCompraVenta = new DetalleCompraVenta(cantidad, codigo, unConsumible, subtotal);
        unosDetallesCompraVenta.add(unDetalleCompraVenta);
        unosDetalles.add(unDetalleCompraVenta);
        Persistencia.crearDetalleCompraVenta(unDetalleCompraVenta);
        return codigo;
    }

    public void borrarDetalleCompraVenta(int codigo) throws Exception {
        DetalleCompraVenta unDetalleCompraVenta = buscarDetalleCompraVenta(codigo);
        unosDetallesCompraVenta.remove(unDetalleCompraVenta);
        unosDetalles.remove(unDetalleCompraVenta);
        Persistencia.eliminarDetalleCompraVenta(codigo);
    }

    public int generarEncabezado(Calendar fecha, PersoneriaJuridica unaPersoneriaJuridica, TipoComprobante unTipoComprobante, List<Detalle> unosDetalles, Double total) throws Exception {
        int codigo = generarCodigoEncabezado();
        Encabezado unEncabezado = new Encabezado(codigo, fecha, unTipoComprobante, unosDetalles, unaPersoneriaJuridica, total);
        this.unosEncabezados.add(unEncabezado);
        Persistencia.crearEncabezado(unEncabezado);
        return codigo;
    }
    
    public void borrarEncabezado(int codigo) throws Exception{
        Encabezado unEncabezado=buscarEncabezado(codigo);
        this.unosEncabezados.remove(unEncabezado);
        Persistencia.eliminarEncabezado(codigo);
    }

    public Articulo buscarArticulo(int codigo) {
        Articulo aux = null;
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

    public void sumarArticulo(int cantidad, int codigo) throws Exception {
        Articulo unArticulo = buscarArticulo(codigo);
        unArticulo.sumarArticulo(cantidad);
        Persistencia.modificarArticulo(unArticulo);
    }

    public void descontarArticulo(int cantidad, int codigo) throws Exception {
        Articulo unArticulo = buscarArticulo(codigo);
        unArticulo.descontarArticulo(cantidad);
        Persistencia.modificarArticulo(unArticulo);
    }
    
    public Double calcularTotal(int codigo,int cantidad){
        Articulo unArticulo= buscarArticulo(codigo);
        return unArticulo.calcularTotal(cantidad);
    }

    public boolean comprobarStock(int codigo, int cantidad) {
        Articulo unArticulo = buscarArticulo(codigo);
        return unArticulo.comprobarStock(cantidad);

    }
    
    public Encabezado buscarEncabezado(int codigo) {
        Encabezado aux = null;
        Iterator itr = unosEncabezados.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (Encabezado) itr.next();
            if (aux.isEncabezado(codigo)) {
                band = 1;
            }

        }
        return aux;
    }
    
    public Proveedor buscarProveedor(int codigo) {
        Proveedor aux = null;
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
    
    public void agregarVentaArticulo(Encabezado unEncabezado){
        this.unosEncabezadosVentaArticulo.add(unEncabezado);
    }
    
    public void agregarVentaServicio(Encabezado unEncabezado){
        this.unosEncabezadosVentaServicio.add(unEncabezado);
    }
    
    public void agregarCompra(Encabezado unEncabezado){
        this.unosEncabezadosCompra.add(unEncabezado);
    }
    
    public void agregarLiquidacion(Encabezado unEncabezado){
        this.unosEncabezadosLiquidacion.add(unEncabezado);
    }

    public void crearProveedor(String nombre, String direccion, long telefono, String email, String cuit) throws Exception {
        int codigo = generarCodigoPersoneria();
        Proveedor unProveedor = new Proveedor(cuit, codigo, nombre, direccion, telefono, email);
        this.unosProveedores.add(unProveedor);
        this.unasPersoneriaJuridicas.add(unProveedor);
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
        this.unasPersoneriaJuridicas.remove(unProveedor);
        Persistencia.eliminarProveedor(codigo);
    }

    public TipoCompra buscarTipoCompra(int codigo) {
        TipoCompra aux = null;
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
        TipoLiquidacion aux = null;
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
        ManoDeObra aux = null;
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

    public void generarDetalleLiquidacion(ManoDeObra unaManoDeObra, Double subtotal) {
        int codigo = generarCodigoDetallerCompraVenta();
        DetalleLiquidacion unDetalleLiquidacion = new DetalleLiquidacion(codigo, unaManoDeObra, subtotal);
        unosDetallesLiquidacion.add(unDetalleLiquidacion);
        unosDetalles.add(unDetalleLiquidacion);
    }

    public List<OrdenTrabajo> buscarOrdenTrabajo(Equipo unEquipo) {
        OrdenTrabajo aux = null;
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
        int codigo = generarCodigoConcepto();
        Concepto unConcepto = new Concepto(codigo, descripcion, monto);
        unosConceptos.add(unConcepto);
        Persistencia.crearConcepto(unConcepto);
    }

    public void modificarConcepto(int codigo, String descripcion, Double monto) throws Exception {
        Concepto unConcepto = buscarConcepto(codigo);
        unConcepto.setDescripcion(descripcion);
        unConcepto.setMonto(monto);
        Persistencia.modificarConcepto(unConcepto);
    }

    public void borrarConcepto(int codigo) throws Exception {
        Concepto unConcepto = buscarConcepto(codigo);
        this.unosConceptos.remove(unConcepto);
        Persistencia.eliminarConcepto(codigo);
    }

    public Tecnologia buscarTecnologia(int codigo) {
        Tecnologia aux = null;
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

    public DetalleCompraVenta buscarDetalleCompraVenta(int codigo) {
        DetalleCompraVenta aux = null;
        Iterator itr = unosDetallesCompraVenta.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (DetalleCompraVenta) itr.next();
            if (aux.isDetalleCompraVenta(codigo)) {
                band = 1;
            }

        }
        return aux;
    }

    public TipoTecnologia buscarTipoTecnologia(int codigo) {
        TipoTecnologia aux = null;
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

    public void generarProyecto(Float tiempoEstimado, List<Concepto> unosConceptos, List<Tecnologia> unasTecnologias, String descripcion) throws Exception {
        int codigo = generarCodigoServicio();
        Proyecto unProyecto = new Proyecto(tiempoEstimado, unosConceptos, unasTecnologias, codigo, descripcion);
        this.unosProyectos.add(unProyecto);
        this.unosServicios.add(unProyecto);
        Persistencia.crearProyecto(unProyecto);
    }

    public void crearTipoVenta(String descripcion) throws Exception {
        int codigo = generarCodigoTipoComprobante();
        TipoVenta unTipoVenta = new TipoVenta(codigo, descripcion);
        this.unosTiposVentas.add(unTipoVenta);
        this.unosTiposComprobantes.add(unTipoVenta);
        Persistencia.crearTipoVenta(unTipoVenta);
    }

    public void modificarTipooVenta(int codigo, String descripcion) throws Exception {
        TipoVenta unTipoVenta = buscarTipoVenta(codigo);
        unTipoVenta.setDescripcion(descripcion);
        Persistencia.modificarTipoVenta(unTipoVenta);
    }

    public void borrarTipoVenta(int codigo) throws Exception {
        TipoVenta unTipoVenta = buscarTipoVenta(codigo);
        this.unosTiposVentas.remove(unTipoVenta);
        this.unosTiposComprobantes.remove(unTipoVenta);
        Persistencia.eliminarTipoVenta(codigo);
    }

    public void crearTipoCompra(String descripcion) throws Exception {
        int codigo = generarCodigoTipoComprobante();
        TipoCompra unTipoCompra = new TipoCompra(codigo, descripcion);
        this.unosTiposCompras.add(unTipoCompra);
        this.unosTiposComprobantes.add(unTipoCompra);
        Persistencia.crearTipoCompra(unTipoCompra);
    }

    public void modificarTipoCompra(int codigo, String descripcion) throws Exception {
        TipoCompra unTipoCompra = buscarTipoCompra(codigo);
        unTipoCompra.setDescripcion(descripcion);
        Persistencia.modificarTipoCompra(unTipoCompra);
    }

    public void borrarTipoCompra(int codigo) throws Exception {
        TipoCompra unTipoCompra = buscarTipoCompra(codigo);
        this.unosTiposCompras.remove(unTipoCompra);
        this.unosTiposComprobantes.remove(unTipoCompra);
        Persistencia.eliminarTipoCompra(codigo);
    }

    public void crearTipoLiquidacion(String descripcion) throws Exception {
        int codigo = generarCodigoTipoComprobante();
        TipoLiquidacion unTipoLiquidacion = new TipoLiquidacion(codigo, descripcion);
        unosTiposLiquidaciones.add(unTipoLiquidacion);
        unosTiposComprobantes.add(unTipoLiquidacion);
        Persistencia.crearTipoLiquidacion(unTipoLiquidacion);
    }

    public void modificarTipoLiquidacion(int codigo, String descripcion) throws Exception {
        TipoLiquidacion unTipoLiquidacion = buscarTipoLiquidacion(codigo);
        unTipoLiquidacion.setDescripcion(descripcion);
        Persistencia.modificarTipoLiquidacion(unTipoLiquidacion);
    }

    public void borrarTipoLiquidacion(int codigo) throws Exception {
        TipoLiquidacion unTipoLiquidacion = buscarTipoLiquidacion(codigo);
        unosTiposLiquidaciones.remove(unTipoLiquidacion);
        unosTiposComprobantes.remove(unTipoLiquidacion);
        Persistencia.eliminarTipoLiquidacion(codigo);
    }

    public void crearArticulo(String nombre, String descripcion,Double precioLista,Double descuentoMayorista,Double precioVenta, int cantidad,int cantidadMinima) throws Exception {
        int codigo = generarCodigoArticulo();
        Articulo unArticulo = new Articulo(nombre, precioVenta, precioLista, descuentoMayorista, cantidadMinima, cantidad, codigo, descripcion);
        unosArticulos.add(unArticulo);
        Persistencia.crearArticulo(unArticulo);
    }

    public void modificarArticulo(String nombre, String descripcion,Double precioLista,Double descuentoMayorista,Double precioVenta, int cantidad,int cantidadMinima) throws Exception {
        Articulo unArticulo = buscarArticulo(codigo);
        unArticulo.setNombre(nombre);
        unArticulo.setDescripcion(descripcion);
        unArticulo.setPrecioLista(precioLista);
        unArticulo.setPrecioVenta(precioVenta);
        unArticulo.setDescuentoMayorista(descuentoMayorista);
        unArticulo.setCantidad(cantidad);
        unArticulo.setCantidadMinima(cantidadMinima);
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
        this.unosConceptos = Persistencia.traerConceptos();
        this.unosTiposVentas = Persistencia.traerTiposVentas();
        this.unosTiposCompras = Persistencia.traerTiposCompras();
        this.unosTiposLiquidaciones = Persistencia.traerTiposLiquidaciones();
        this.unosClientes = Persistencia.traerClientes();
        this.unosDetallesCompraVenta = Persistencia.traerDetallesCompraVenta();
        this.unosEncabezados = Persistencia.traerEncabezados();
        this.unosDetalles.addAll(this.unosDetallesCompraVenta);
        this.unosTecnicos = Persistencia.traerTecnicos();
        this.unosTerceros=Persistencia.traerTerceros();
        this.unosProyectos=Persistencia.traerProyectos();
        this.unosServicios.addAll(this.unosTecnicos);
        this.unosServicios.addAll(this.unosTerceros);
        this.unosServicios.addAll(this.unosProyectos);
        this.unosTiposComprobantes.addAll(this.unosTiposCompras);
        this.unosTiposComprobantes.addAll(this.unosTiposVentas);
        this.unosTiposComprobantes.addAll(this.unosTiposLiquidaciones);
        this.unasActividades.addAll(this.unasActAdministrativas);
        this.unasActividades.addAll(this.unasActTecnicas);
        this.unasActividades.addAll(this.unasActProyecto);
    }

    public List<TipoTecnologia> traerTiposDeTecnologias() {
        return this.unosTiposTecnologias;
    }

    public List<Empleado> traerEmpleado() {
        return this.unosEmpleados;
    }

    private int generarCodigoPersoneria() {
        Iterator<PersoneriaJuridica> itPersoneria = this.unasPersoneriaJuridicas.iterator();
        PersoneriaJuridica unaPers;
        int codigo = 4000;
        while (itPersoneria.hasNext()) {
            unaPers = itPersoneria.next();
            if (unaPers.getCodigo() > codigo) {
                codigo = unaPers.getCodigo();
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

    private int generarCodigoAct() {
        Iterator<Actividad> itLista = this.unasActividades.iterator();
        Actividad unaAct;
        int codigo = 50000;
        while (itLista.hasNext()) {
            unaAct = itLista.next();
            if (unaAct.getCodigo() > codigo) {
                codigo = unaAct.getCodigo();
            }
        }
        return codigo + 1;
    }

    public List<ActividadProyecto> traerActProyecto() {
        return this.unasActProyecto;
    }

    public List<Articulo> traerArticulo() {
        return this.unosArticulos;
    }

    private int generarCodigoArticulo() {
        Iterator<Articulo> itLista = this.unosArticulos.iterator();
        Articulo unTipo;
        int codigoTipo = 40000;
        while (itLista.hasNext()) {
            unTipo = itLista.next();
            if (unTipo.getCodigo() > codigoTipo) {
                codigoTipo = unTipo.getCodigo();
            }
        }
        return codigoTipo + 1;
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

    public List<Concepto> traerConcepto() {
        return this.unosConceptos;
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
        Concepto aux = null;
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
    
    public Tecnico buscarServicioTecnico(int codigo){
        Tecnico aux = null;
        Iterator itr = unosTecnicos.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (Tecnico) itr.next();
            if (aux.isServicio(codigo)) {
                band = 1;
            }

        }
        return aux;
    }
    
    public Tercero buscarServicioTercero(int codigo) {
        Tercero aux = null;
        Iterator itr = unosTerceros.iterator();
        int band = 0;
        while (itr.hasNext() && band == 0) {
            aux = (Tercero) itr.next();
            if (aux.isServicio(codigo)) {
                band = 1;
            }

        }
        return aux;
    }

    public List<TipoVenta> traerTipoVenta() {
        return this.unosTiposVentas;
    }

    private int generarCodigoTipoComprobante() {
        Iterator<TipoComprobante> itLista = this.unosTiposComprobantes.iterator();
        TipoComprobante unaTipoComprobante;
        int codigoTipo = 6000;
        while (itLista.hasNext()) {
            unaTipoComprobante = itLista.next();
            if (unaTipoComprobante.getCodigo() > codigoTipo) {
                codigoTipo = unaTipoComprobante.getCodigo();
            }
        }
        return codigoTipo + 1;
    }

    public List<TipoCompra> traerTipoCompra() {
        return this.unosTiposCompras;
    }


    public List<TipoLiquidacion> traerLiquidacion() {
        return this.unosTiposLiquidaciones;
    }

    private int generarCodigoDetallerCompraVenta() {
        Iterator<Detalle> itLista = this.unosDetalles.iterator();
        Detalle unDetalle;
        int codigoTipo = 20000;
        while (itLista.hasNext()) {
            unDetalle = itLista.next();
            if (unDetalle.getCodigo() > codigoTipo) {
                codigoTipo = unDetalle.getCodigo();
            }
        }
        return codigoTipo + 1;
    }

    private int generarCodigoEncabezado() {
        Iterator<Encabezado> itLista = this.unosEncabezados.iterator();
        Encabezado unEncabezado;
        int codigoTipo = 1000;
        while (itLista.hasNext()) {
            unEncabezado = itLista.next();
            if (unEncabezado.getCodigo() > codigoTipo) {
                codigoTipo = unEncabezado.getCodigo();
            }
        }
        return codigoTipo + 1;
    }

    private int generarCodigoServicio() {
        Iterator<Servicio> itLista = this.unosServicios.iterator();
        Servicio unServicio;
        int codigoTipo = 2000;
        while (itLista.hasNext()) {
            unServicio = itLista.next();
            if (unServicio.getCodigo() > codigoTipo) {
                codigoTipo = unServicio.getCodigo();
            }
        }
        return codigoTipo + 1;
    }

    public List<Tecnico> traerServicioTecnico() {
        return this.unosTecnicos;
    }

    public List<Encabezado> traerEncabezado() {
        return this.unosEncabezados;
    }

    public List<Tercero> traerServicioTercero() {
        return this.unosTerceros;
    }

    public List<Encabezado> traerEncabezadoVentaArticulo() {
        return this.unosEncabezadosVentaArticulo;
    }

    public List<Encabezado> traerEncabezadoVentaServicio() {
        return this.unosEncabezadosVentaServicio;
    }

    public List<Encabezado> traerEncabezadoCompra() {
        return this.unosEncabezadosCompra;
    }

}
