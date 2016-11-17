/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Persistencia.ActividadAdministrativaJpaController;
import Persistencia.ActividadProyectoJpaController;
import Persistencia.ActividadTecnicaJpaController;
import Persistencia.ArticuloJpaController;
import Persistencia.ClienteJpaController;
import Persistencia.ConceptoJpaController;
import Persistencia.DetalleCompraVentaJpaController;
import Persistencia.DetalleLiquidacionJpaController;
import Persistencia.EmpleadoJpaController;
import Persistencia.EmpresaJpaController;
import Persistencia.EncabezadoJpaController;
import Persistencia.EquipoJpaController;
import Persistencia.EstadoJpaController;
import Persistencia.ManoDeObraJpaController;
//import Persistencia.OrdenTrabajoJpaController;
import Persistencia.ProveedorJpaController;
import Persistencia.ProyectoJpaController;
import Persistencia.TecnicoJpaController;
import Persistencia.TecnologiaJpaController;
import Persistencia.TerceroJpaController;
import Persistencia.TipoCompraJpaController;
import Persistencia.TipoComprobanteJpaController;
import Persistencia.TipoEstadoJpaController;
import Persistencia.TipoLiquidacionJpaController;
import Persistencia.TipoTecnologiaJpaController;
import Persistencia.TipoVentaJpaController;
import Persistencia.TurnoJpaController;
import Persistencia.UsuarioJpaController;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;

/**
 *
 * @author eras
 */
public class Persistencia {
    
    public static TecnologiaJpaController jpaTecnologia;
    public static TipoTecnologiaJpaController jpaTipoTecnologia;
    public static ActividadAdministrativaJpaController jpaActividadAdministrativa;
    public static ActividadProyectoJpaController jpaActividadProyecto;
    public static ActividadTecnicaJpaController jpaActividadTecnica;
    public static ArticuloJpaController jpaArticulo;
    public static ClienteJpaController jpaCliente;
    public static ConceptoJpaController jpaConcepto;
    public static DetalleCompraVentaJpaController jpaDetalleCompraVenta;
    public static DetalleLiquidacionJpaController jpaDetalleLiquidacion;
    public static EmpleadoJpaController jpaEmpleado;
    public static EmpresaJpaController jpaEmpresa;
    public static EncabezadoJpaController jpaEncabezado;
    public static EquipoJpaController jpaEquipo;
    public static EstadoJpaController jpaEstado;
    public static ManoDeObraJpaController jpaManoDeObra;
//    public static OrdenTrabajoJpaController jpaOrdenTrabajo;
    public static ProveedorJpaController jpaProveedor;
    public static ProyectoJpaController jpaProyecto;
    public static TecnicoJpaController jpaTecnico;
    public static TerceroJpaController jpaTercero;
    public static TipoCompraJpaController jpaTipoCompra;
    public static TipoComprobanteJpaController jpaTipoComprobante;
    public static TipoEstadoJpaController jpaTipoEstado;
    public static TipoLiquidacionJpaController jpaLiquidacion;
    public static TipoVentaJpaController jpaTipoVenta;
    public static TurnoJpaController jpaTurno;
    public static UsuarioJpaController jpaUsuario;

    
    
    
    
    static
    {
        jpaTecnologia = new TecnologiaJpaController();
        jpaTipoTecnologia = new TipoTecnologiaJpaController();
        jpaActividadAdministrativa = new ActividadAdministrativaJpaController();
        jpaActividadProyecto = new ActividadProyectoJpaController();
        jpaActividadTecnica = new ActividadTecnicaJpaController();
        jpaArticulo = new ArticuloJpaController();
        jpaCliente = new ClienteJpaController();
        jpaConcepto = new ConceptoJpaController();
        jpaDetalleCompraVenta = new DetalleCompraVentaJpaController();
        jpaDetalleLiquidacion = new DetalleLiquidacionJpaController();
        jpaEmpleado = new EmpleadoJpaController();
        jpaEmpresa = new EmpresaJpaController();
        jpaEncabezado = new EncabezadoJpaController();
        jpaEquipo = new EquipoJpaController();
        jpaEstado = new EstadoJpaController();
        jpaManoDeObra = new ManoDeObraJpaController();
//        jpaOrdenTrabajo = new OrdenTrabajoJpaController();
        jpaProveedor = new ProveedorJpaController();
        jpaProyecto = new ProyectoJpaController();
        jpaTecnico = new TecnicoJpaController();
        jpaTercero = new TerceroJpaController();
        jpaTipoCompra = new TipoCompraJpaController();
        jpaTipoComprobante = new TipoComprobanteJpaController();
        jpaTipoEstado = new TipoEstadoJpaController();
        jpaLiquidacion = new TipoLiquidacionJpaController();
        jpaTipoVenta = new TipoVentaJpaController();
        jpaTurno = new TurnoJpaController();
        jpaUsuario=new UsuarioJpaController();
        
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
    
    static List<Usuario> traerUsuario(){
        return jpaUsuario.findUsuarioEntities();
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

    static void crearActividadAdministrativa(ActividadAdministrativa unaActividadAdministrativa) throws Exception
    {
        jpaActividadAdministrativa.create(unaActividadAdministrativa);
    }
    
    static void modificarActividadAdministrativa(ActividadAdministrativa unaActividadAdministrativa) throws Exception
    {
        jpaActividadAdministrativa.edit(unaActividadAdministrativa);
    }
    
    static void eliminarActividadAdministrativa(int codigo) throws Exception
    {
        jpaActividadAdministrativa.destroy(codigo);
    }

    static List<ActividadAdministrativa> traerActividadesAdministrativas() {
        return jpaActividadAdministrativa.findActividadAdministrativaEntities();
    }
    
    static void crearActividadProyecto(ActividadProyecto unaActividadProyecto) throws Exception
    {
        jpaActividadProyecto.create(unaActividadProyecto);
    }
    
    static void modificarActividadProyecto(ActividadProyecto unaActividadProyecto) throws Exception
    {
        jpaActividadProyecto.edit(unaActividadProyecto);
    }
    
    static void eliminarActividadProyecto(int codigo) throws Exception
    {
        jpaActividadProyecto.destroy(codigo);
    }

    static List<ActividadProyecto> traerActividadesProyectos() {
        return jpaActividadProyecto.findActividadProyectoEntities();
    }
    
    
    static void crearActividadTecnica(ActividadTecnica unaActividadTecnica) throws Exception
    {
        jpaActividadTecnica.create(unaActividadTecnica);
    }
    
    static void modificarActividadTecnica(ActividadTecnica unaActividadTecnica) throws Exception
    {
        jpaActividadTecnica.edit(unaActividadTecnica);
    }
    
    static void eliminarActividadTecnica(int codigo) throws Exception
    {
        jpaActividadTecnica.destroy(codigo);
    }

    static List<ActividadTecnica> traerActividadesTecnicas() {
        return jpaActividadTecnica.findActividadTecnicaEntities();
    }
    
    static void crearArticulo(Articulo unArticulo) throws Exception
    {
        jpaArticulo.create(unArticulo);
    }
    
    static void modificarArticulo(Articulo unArticulo) throws Exception
    {
        jpaArticulo.edit(unArticulo);
    }
    
    static void eliminarArticulo(int codigo) throws NonexistentEntityException{
        jpaArticulo.destroy(codigo);
    }
    

    static List<Articulo> traerArticulos() {
        return jpaArticulo.findArticuloEntities();
    }
    
    
    static void crearCliente(Cliente unCliente) throws Exception
    {
        jpaCliente.create(unCliente);
    }
    
    static void modificarCliente(Cliente unCliente) throws Exception
    {
        jpaCliente.edit(unCliente);
    }
    
    static void eliminarCliente(int codigo) throws Exception
    {
        jpaCliente.destroy(codigo);
    }

    static List<Cliente> traerClientes() {
        return jpaCliente.findClienteEntities();
    }
    
    
    static void crearConcepto(Concepto unConcepto) throws Exception
    {
        jpaConcepto.create(unConcepto);
    }
    
    static void modificarConcepto(Concepto unConcepto) throws Exception
    {
        jpaConcepto.edit(unConcepto);
    }
    
    static void eliminarConcepto(int codigo) throws Exception
    {
        jpaConcepto.destroy(codigo);
    }

    static List<Concepto> traerConceptos() {
        return jpaConcepto.findConceptoEntities();
    }
    
    
    static void crearDetalleCompraVenta(DetalleCompraVenta unDetalleCompraVenta) throws Exception
    {
        jpaDetalleCompraVenta.create(unDetalleCompraVenta);
    }
    
    static void modificarDetalleCompraVenta(DetalleCompraVenta unDetalleCompraVenta) throws Exception
    {
        jpaDetalleCompraVenta.edit(unDetalleCompraVenta);
    }
    
    static void eliminarDetalleCompraVenta(int codigo) throws Exception
    {
        jpaDetalleCompraVenta.destroy(codigo);
    }

    static List<DetalleCompraVenta> traerDetallesCompraVenta() {
        return jpaDetalleCompraVenta.findDetalleCompraVentaEntities();
    }
    
    
    static void crearDetalleLiquidacion(DetalleLiquidacion unDetalleLiquidacion) throws Exception
    {
        jpaDetalleLiquidacion.create(unDetalleLiquidacion);
    }
    
    static void modificarDetalleLiquidacion(DetalleLiquidacion unDetalleLiquidacion) throws Exception
    {
        jpaDetalleLiquidacion.edit(unDetalleLiquidacion);
    }
    
    static void eliminarDetalleLiquidacion(int codigo) throws Exception
    {
        jpaDetalleLiquidacion.destroy(codigo);
    }

    static List<DetalleLiquidacion> traerDetallesLiquidacion() {
        return jpaDetalleLiquidacion.findDetalleLiquidacionEntities();
    }
    
    
    static void crearEmpleado(Empleado unEmpleado) throws Exception
    {
        jpaEmpleado.create(unEmpleado);
    }
    
    static void modificarEmpleado(Empleado unEmpleado) throws Exception
    {
        jpaEmpleado.edit(unEmpleado);
    }
    
    static void eliminarEmpleado(int codigo) throws Exception
    {
        jpaEmpleado.destroy(codigo);
    }

    static List<Empleado> traerEmpleados() {
        return jpaEmpleado.findEmpleadoEntities();
    }
    
    
    static void crearEmpresa(Empresa unEmpresa) throws Exception
    {
        jpaEmpresa.create(unEmpresa);
    }
    
    static void modificarEmpresa(Empresa unEmpresa) throws Exception
    {
        jpaEmpresa.edit(unEmpresa);
    }
    
    static void eliminarEmpresa(int codigo) throws Exception
    {
        jpaEmpresa.destroy(codigo);
    }

    static List<Empresa> traerEmpresa() {
        return jpaEmpresa.findEmpresaEntities();
    }
    
    
    static void crearEncabezado(Encabezado unEncabezado) throws Exception
    {
        jpaEncabezado.create(unEncabezado);
    }
    
    static void modificarEncabezado(Encabezado unEncabezado) throws Exception
    {
        jpaEncabezado.edit(unEncabezado);
    }
    
    static void eliminarEncabezado(int codigo) throws Exception
    {
        jpaEncabezado.destroy(codigo);
    }

    static List<Encabezado> traerEncabezados() {
        return jpaEncabezado.findEncabezadoEntities();
    }
    
    
    static void crearEquipo(Equipo unEquipo) throws Exception
    {
        jpaEquipo.create(unEquipo);
    }
    
    static void modificarEquipo(Equipo unEquipo) throws Exception
    {
        jpaEquipo.edit(unEquipo);
    }
    
    static void eliminarEquipo(int codigo) throws Exception
    {
        jpaEquipo.destroy(codigo);
    }

    static List<Equipo> traerEquipos() {
        return jpaEquipo.findEquipoEntities();
    }
    
    
    static void crearEstado(Estado unEstado) throws Exception
    {
        jpaEstado.create(unEstado);
    }
    
    static void modificarEstado(Estado unEstado) throws Exception
    {
        jpaEstado.edit(unEstado);
    }
    
    static void eliminarEstado(int codigo) throws Exception
    {
        jpaEstado.destroy(codigo);
    }

    static List<Estado> traerEstados() {
        return jpaEstado.findEstadoEntities();
    }
    
    static void crearManoDeObra(ManoDeObra unManoDeObra) throws Exception
    {
        jpaManoDeObra.create(unManoDeObra);
    }
    
    static void modificarManoDeObra(ManoDeObra unManoDeObra) throws Exception
    {
        jpaManoDeObra.edit(unManoDeObra);
    }
    
    static void eliminarManoDeObra(int codigo) throws Exception
    {
        jpaManoDeObra.destroy(codigo);
    }

    static List<ManoDeObra> traerManosDeObras() {
        return jpaManoDeObra.findManoDeObraEntities();
    }
    
    
//    static void crearOrdenTrabajo(OrdenTrabajo unOrdenTrabajo) throws Exception
//    {
//        jpaOrdenTrabajo.create(unOrdenTrabajo);
//    }
//    
//    static void modificarOrdenTrabajo(OrdenTrabajo unOrdenTrabajo) throws Exception
//    {
//        jpaOrdenTrabajo.edit(unOrdenTrabajo);
//    }
//    
//    static void eliminarOrdenTrabajo(int codigo) throws Exception
//    {
//        jpaOrdenTrabajo.destroy(codigo);
//    }
//
//    static List<OrdenTrabajo> traerOrdenesTrabajos() {
//        return jpaOrdenTrabajo.findOrdenTrabajoEntities();
//    }
    
    
    static void crearProveedor(Proveedor unProveedor) throws Exception
    {
        jpaProveedor.create(unProveedor);
    }
    
    static void modificarProveedor(Proveedor unProveedor) throws Exception
    {
        jpaProveedor.edit(unProveedor);
    }
    
    static void eliminarProveedor(int codigo) throws Exception
    {
        jpaProveedor.destroy(codigo);
    }

    static List<Proveedor> traerProveedores() {
        return jpaProveedor.findProveedorEntities();
    }
    
    
    static void crearProyecto(Proyecto unProyecto) throws Exception
    {
        jpaProyecto.create(unProyecto);
    }
    
    static void modificarProyecto(Proyecto unProyecto) throws Exception
    {
        jpaProyecto.edit(unProyecto);
    }
    
    static void eliminarProyecto(int codigo) throws Exception
    {
        jpaProyecto.destroy(codigo);
    }

    static List<Proyecto> traerProyectos() {
        return jpaProyecto.findProyectoEntities();
    }
    
    
    static void crearTecnico(Tecnico unTecnico) throws Exception
    {
        jpaTecnico.create(unTecnico);
    }
    
    static void modificarTecnico(Tecnico unTecnico) throws Exception
    {
        jpaTecnico.edit(unTecnico);
    }
    
    static void eliminarTecnico(int codigo) throws Exception
    {
        jpaTecnico.destroy(codigo);
    }

    static List<Tecnico> traerTecnicos() {
        return jpaTecnico.findTecnicoEntities();
    }
    
    
    static void crearTercero(Tercero unTercero) throws Exception
    {
        jpaTercero.create(unTercero);
    }
    
    static void modificarTercero(Tercero unTecnico) throws Exception
    {
        jpaTercero.edit(unTecnico);
    }
    
    static void eliminarTercero(int codigo) throws Exception
    {
        jpaTercero.destroy(codigo);
    }

    static List<Tercero> traerTerceros() {
        return jpaTercero.findTerceroEntities();
    }
    
    
    static void crearTipoCompra(TipoCompra unTipoCompra) throws Exception
    {
        jpaTipoCompra.create(unTipoCompra);
    }
    
    static void modificarTipoCompra(TipoCompra unTipoCompra) throws Exception
    {
        jpaTipoCompra.edit(unTipoCompra);
    }
    
    static void eliminarTipoCompra(int codigo) throws Exception
    {
        jpaTipoCompra.destroy(codigo);
    }

    static List<TipoCompra> traerTiposCompras() {
        return jpaTipoCompra.findTipoCompraEntities();
    }
    
    
    static void crearTipoEstado(TipoEstado unTipoEstado) throws Exception
    {
        jpaTipoEstado.create(unTipoEstado);
    }
    
    static void modificarTipoEstado(TipoEstado unTipoEstado) throws Exception
    {
        jpaTipoEstado.edit(unTipoEstado);
    }
    
    static void eliminarTipoEstado(int codigo) throws Exception
    {
        jpaTipoEstado.destroy(codigo);
    }

    static List<TipoEstado> traerTiposEstados() {
        return jpaTipoEstado.findTipoEstadoEntities();
    }
    
    
    static void crearTipoLiquidacion(TipoLiquidacion unTipoLiquidacion) throws Exception
    {
        jpaLiquidacion.create(unTipoLiquidacion);
    }
    
    static void modificarTipoLiquidacion(TipoLiquidacion unTipoLiquidacion) throws Exception
    {
        jpaLiquidacion.edit(unTipoLiquidacion);
    }
    
    static void eliminarTipoLiquidacion(int codigo) throws Exception
    {
        jpaLiquidacion.destroy(codigo);
    }

    static List<TipoLiquidacion> traerTiposLiquidaciones() {
        return jpaLiquidacion.findTipoLiquidacionEntities();
    }
    
    
    static void crearTipoVenta(TipoVenta unTipoVenta) throws Exception
    {
        jpaTipoVenta.create(unTipoVenta);
    }
    
    static void modificarTipoVenta(TipoVenta unTipoVenta) throws Exception
    {
        jpaTipoVenta.edit(unTipoVenta);
    }
    
    static void eliminarTipoVenta(int codigo) throws Exception
    {
        jpaTipoVenta.destroy(codigo);
    }

    static List<TipoVenta> traerTiposVentas() {
        return jpaTipoVenta.findTipoVentaEntities();
    }
    
    
    static void crearTurno(Turno unTurno) throws Exception
    {
        jpaTurno.create(unTurno);
    }
    
    static void modificarTurno(Turno unTurno) throws Exception
    {
        jpaTurno.edit(unTurno);
    }
    
    static void eliminarTurno(int codigo) throws Exception
    {
        jpaTurno.destroy(codigo);
    }

    static List<Turno> traerTurnos() {
        return jpaTurno.findTurnoEntities();
    }
    
}
