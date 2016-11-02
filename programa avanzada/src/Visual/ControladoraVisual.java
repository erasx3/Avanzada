/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import Logica.Actividad;
import Logica.ActividadAdministrativa;
import Logica.ActividadProyecto;
import Logica.ActividadTecnica;
import Logica.Articulo;
import Logica.Cliente;
import Logica.Concepto;
import Logica.Detalle;
import Logica.Empleado;
import Logica.Empresa;
import Logica.Equipo;
import Logica.InterfaceConsumible;
import Logica.ManoDeObra;
import Logica.OrdenTrabajo;
import Logica.PersoneriaJuridica;
import Logica.Proveedor;
import Logica.Servicio;
import Logica.Tecnologia;
import Logica.TipoCompra;
import Logica.TipoComprobante;
import Logica.TipoEstado;
import Logica.TipoLiquidacion;
import Logica.TipoTecnologia;
import Logica.TipoVenta;
import Logica.Turno;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.Date;
import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author eras
 */
public class ControladoraVisual {
    
    //Relaciones
    
     //Controladora Logica
    private Empresa unaEmpresa;

    public ControladoraVisual() {
        this.unaEmpresa = new Empresa();
        this.unaEmpresa.ConexionConBD();
    }
    
    
    
    //Metodo Main
    
    
    //Metodo de conexion con la Logica
     public Cliente buscarCliente(long dni) {
        return this.unaEmpresa.buscarCliente(dni);
    }

    public void crearCliente(String nombre, String apellido, String direccion, long telefono, String email, long dni, String cuil) throws Exception {
        this.unaEmpresa.crearCliente(nombre, apellido, direccion, telefono, email, dni, cuil);
    }
    
    public void modificarCliente(int codigo,String nombre,String apellido,String direccion,long telefono,String email,long dni,String cuil) throws Exception{
        this.unaEmpresa.modificarCliente(codigo, nombre, apellido, direccion, telefono, email, dni, cuil);
    }

    public void borrarCliente(int codigo) throws Exception{
        this.unaEmpresa.borrarCliente(codigo);
    }
    
    public boolean buscarTurnoDisponible(Date fecha, Float hora) {
        return this.unaEmpresa.buscarTurnoDisponible(fecha, hora);
    }

    public void GenerarTurno(Cliente unCliente, int codigo, String descripcion, Date fecha, Float hora) {
        this.unaEmpresa.GenerarTurno(unCliente, codigo, descripcion, fecha, hora);
    }

    public Turno buscarTurno(int codigo) {
        return this.unaEmpresa.buscarTurno(codigo);
    }

    public Equipo buscarEquipo(int codigo) {
        return this.unaEmpresa.buscarEquipo(codigo);
    }

    public void crearEquipo(int codigo, String descripcion) {
        this.unaEmpresa.crearEquipo(codigo, descripcion);
    }

    public TipoEstado buscarTipoEstado(int codigo) {
        return this.unaEmpresa.buscarTipoEstado(codigo);
    }

    public void crearTipoEstado(int codigo, String nombre) {
        this.unaEmpresa.crearTipoEstado(codigo, nombre);
    }

    public void generarEstadoEquipo(int codigo, String descripcion, Equipo unEquipo, TipoEstado unTipoEstado, OrdenTrabajo unaOrdenTrabajo) {
        this.unaEmpresa.generarEstadoEquipo(codigo, descripcion, unEquipo, unTipoEstado, unaOrdenTrabajo);
    }

    public void generarServicioTecnico(int codigo, String descripcion) {
        this.unaEmpresa.generarServicioTecnico(codigo, descripcion);
    }

    public void generarServicioTercero(int codigo, String descripcion, Double monto, int ganancia) {
        this.unaEmpresa.generarServicioTercero(codigo, descripcion, monto, ganancia);
    }

    public void generarOrdenTrabajo(int codigo, String descripcion, Turno unTurno, Equipo unEquipo, Servicio unServicio) {
        this.unaEmpresa.generarOrdenTrabajo(codigo, descripcion, unTurno, unEquipo, unServicio);
    }

    public OrdenTrabajo buscarOrdenTrabajo(int codigo) {
        return this.unaEmpresa.buscarOrdenTrabajo(codigo);
    }

    public void agregarServicio(OrdenTrabajo unaOrdenTrabajo, Servicio unServicio) {
        this.unaEmpresa.agregarServicio(unaOrdenTrabajo, unServicio);
    }

    public Empleado buscarEmpleado(int codigo) {
        return this.unaEmpresa.buscarEmpleado(codigo);
    }

    public void crearEmpleado(String nombre, String apellido, String direccion, long telefono, String email, long dni, String cuil) throws Exception {
        this.unaEmpresa.crearEmpleado(nombre, apellido, direccion, telefono, email, dni, cuil);
    }
    
    public void modificarEmpleado(int codigo,String nombre,String apellido,String direccion, long telefono,String email,long dni,String cuil) throws Exception{
        this.unaEmpresa.modificarEmpleado(codigo, nombre, apellido, direccion, telefono, email, dni, cuil);
    }
    
    public void borrarEmpleado(int codigo) throws Exception{
        this.unaEmpresa.borrarEmpleado(codigo);
    }

    public Servicio buscarServicio(int codigo) {
        return this.unaEmpresa.buscarServicio(codigo);
    }

    public Actividad buscarActividad(int codigo) {
        return this.unaEmpresa.buscarActividad(codigo);
    }

    public void crearActividadAdministrativa(String descripcion, Double precioHora) throws Exception {
        this.unaEmpresa.crearActividadAdministrativa(descripcion, precioHora);
    }
    
    public void modificarActividadAdministrativa(int codigo, String descripcion, Double precioHora) throws Exception{
        this.unaEmpresa.modificarActividadAdministrativa(codigo, descripcion, precioHora);
    }
    
    public void borrarActAdministrativa(int codigo) throws NonexistentEntityException, Exception{
        this.unaEmpresa.borrarActAdministrativa(codigo);
    }

    public void crearActividadTecnica(String descripcion, Double precioFijo) throws Exception {
        this.unaEmpresa.crearActividadTecnica(descripcion, precioFijo);
    }
    
    public void modificarActividadTecnica(int codigo, String descripcion, Double precioFijo) throws Exception{
        this.unaEmpresa.modificarActividadTecnica(codigo, descripcion, precioFijo);
    }
    
    public void borrarActividadTecnica(int codigo) throws Exception{
        this.unaEmpresa.borrarActividadTecnica(codigo);
    }

    public void crearActividadProyecto(String descripcion, Double porcentaje) throws Exception {
        this.unaEmpresa.crearActividadProyecto(descripcion, porcentaje);
    }
    
    public void modificarActividadProyecto(int codigo,String descripcion,Double porcentaje) throws Exception{
        this.unaEmpresa.modificarActividadProyecto(codigo, descripcion, porcentaje);
    }
    
    public void borrarActividadProyecto(int codigo) throws NonexistentEntityException, Exception{
        this.unaEmpresa.borrarActividadProyecto(codigo);
    }
    
    public void generarManoDeObra(int codigo, long horasTrabajadas, Date fecha, Empleado unEmpleado, Servicio unServicio, Actividad unaActividad){
        this.unaEmpresa.generarManoDeObra(codigo, horasTrabajadas, fecha, unEmpleado, unServicio, unaActividad);
    }
    
    public TipoVenta buscarTipoVenta(int codigo){
        return this.unaEmpresa.buscarTipoVenta(codigo);
    }
    
    public List<Servicio> buscarServicioOrdenTrabajo(Cliente unCliente){
        return this.unaEmpresa.buscarServicioOrdenTrabajo(unCliente);
    }
    
    public void generarDetalleCompraVenta(int codigo, String descripcion, int cantidad, InterfaceConsumible unConsumible){
        this.unaEmpresa.generarDetalleCompraVenta(codigo, descripcion, cantidad, unConsumible);
    }
    
    public void generarEncabezado(int codigo, String descripcion, Date fecha, List<Detalle> unosDetalles, PersoneriaJuridica unaPersoneriaJuridica, TipoComprobante unTipoComprobante){
        this.unaEmpresa.generarEncabezado(codigo, descripcion, fecha, unosDetalles, unaPersoneriaJuridica, unTipoComprobante);
    }
    
    public Articulo buscarArticulo(int codigo){
        return this.unaEmpresa.buscarArticulo(codigo);
    }
    
    public void sumarArticulo(int cantidad, Articulo unArticulo){
        this.unaEmpresa.sumarArticulo(cantidad, unArticulo);
    }
    
    public void descontarArticulo(int cantidad, Articulo unArticulo){
        this.unaEmpresa.descontarArticulo(cantidad, unArticulo);
    }
    
    public boolean comprobarStock(Articulo unArticulo, int cantidad){
        return this.unaEmpresa.comprobarStock(unArticulo, cantidad);
    }
    
    public Proveedor buscarProveedor(int codigo){
        return this.unaEmpresa.buscarProveedor(codigo);
    }

    public void crearProveedor(String nombre, String direccion, long telefono, String email, String cuit) throws Exception{
        this.unaEmpresa.crearProveedor(nombre, direccion, telefono, email, cuit);
    }
    
    public void modificarProveedor(int codigo,String nombre,String direccion,long telefono,String email,String cuit) throws Exception{
        this.unaEmpresa.modificarProveedor(codigo, nombre, direccion, telefono, email, cuit);
    }
    
    public void borrarProveedor(int codigo) throws Exception{
        this.unaEmpresa.borrarProveedor(codigo);
    }
    
    public TipoCompra buscarTipoCompra(int codigo){
        return this.unaEmpresa.buscarTipoCompra(codigo);
    }
    
    public TipoLiquidacion buscarTipoLiquidacion(int codigo){
        return this.unaEmpresa.buscarTipoLiquidacion(codigo);
    }
    
    public List<ManoDeObra> buscarManoDeObra(Empleado unEmpleado, Date fechaInicio, Date fechaFin){
        return this.unaEmpresa.buscarManoDeObra(unEmpleado, fechaInicio, fechaFin);
    }
    
    public void generarDetalleLiquidacion(int codigo, String descripcion, ManoDeObra unaManoDeObra){
        this.unaEmpresa.generarDetalleLiquidacion(codigo, descripcion, unaManoDeObra);
    }
    
    public List<OrdenTrabajo> buscarOrdenTrabajo(Equipo unEquipo){
        return this.unaEmpresa.buscarOrdenTrabajo(unEquipo);
    }
    
    public void agregarOrden (OrdenTrabajo unaOrdenTrabajo, Turno unTurno){
        this.unaEmpresa.agregarOrden(unaOrdenTrabajo, unTurno);
    }
    
    public void generarConcepto(String descripcion, Double monto) throws Exception{
        this.unaEmpresa.generarConcepto(descripcion, monto);
    }
    
    public void modificarConcepto(int codigo,String descripcion,Double monto) throws Exception{
        this.unaEmpresa.modificarConcepto(codigo, descripcion, monto);
    }
    
    public void borrarConcepto(int codigo) throws Exception{
        this.unaEmpresa.borrarConcepto(codigo);
    }
    
    public Tecnologia buscarTecnologia(int codigo){
        return this.unaEmpresa.buscarTecnologia(codigo);
    }
    
    public TipoTecnologia buscarTipoTecnologia(int codigo){
        return this.unaEmpresa.buscarTipoTecnologia(codigo);
    }
    
    public void crearTipoTecnologia(String nombre,String descripcion) throws Exception{
        this.unaEmpresa.crearTipoTecnologia(nombre, descripcion);
    }
    
    public void modificarTipoTecnoligia(int codigo,String nombre,String descripcion) throws Exception{
        this.unaEmpresa.modificarTipoTecnoligia(codigo, nombre, descripcion);
    }
    
    public void borrarTipoTecnologia(int codigo) throws Exception{
        this.unaEmpresa.borrarTipoTecnologia(codigo);
    }
    
    public void crearTecnologia(String descripcion,TipoTecnologia unTipoTecnologia) throws Exception{
        this.unaEmpresa.crearTecnologia(descripcion, unTipoTecnologia);
    }
    
    public void modificarTecnologia(int codigo,String descripcion,TipoTecnologia unTipoTecnologia) throws Exception{
        this.unaEmpresa.modificarTecnologia(codigo, descripcion, unTipoTecnologia);
    }
    
    public void borrarTecnologia(int codigo) throws Exception{
        this.unaEmpresa.borrarTecnologia(codigo);
    }
    
    public void generarProyecto(Float tiempoEstimado, List<Concepto> unosConceptos, List<Tecnologia> unasTecnologias, int codigo, String descripcion){
        this.unaEmpresa.generarProyecto(tiempoEstimado, unosConceptos, unasTecnologias, codigo, descripcion);
    }
    
    public void crearTipoVenta(int codiog,String descripcion){
        this.unaEmpresa.crearTipoVenta(codiog, descripcion);
    }
    
    public void crearTipoCompra(int codiog,String descripcion){
        this.unaEmpresa.crearTipoCompra(codiog, descripcion);
    }
    
    public void crearTipoLiquidacion(int codiog,String descripcion){
        this.unaEmpresa.crearTipoLiquidacion(codiog, descripcion);
    }
    
    public void crearArticulo(String nombre,String descripcion,Double precio,int cantidad) throws Exception{
        this.unaEmpresa.crearArticulo(nombre, descripcion, precio, cantidad);
    }
    
    public void modificarArticulo(int codigo,String nombre,String descripcion,Double precio, int cantidad) throws Exception{
        this.unaEmpresa.modificarArticulo(codigo, nombre, descripcion, precio, cantidad);
    }
    
    public void borrarArticulo(int codigo) throws NonexistentEntityException{
        this.unaEmpresa.borrarArticulo(codigo);
    }

    public List<TipoTecnologia> traerTiposDeTecnologias() 
    {
        return this.unaEmpresa.traerTiposDeTecnologias();
    }
    
    public List <Tecnologia> traerTecnologias() 
    {
        return this.unaEmpresa.traerTecnologias();
    }
    
    public List <ActividadAdministrativa> traerActAdministrativa()
    {
        return this.unaEmpresa.traerActAdministrativa();
    }
    
    public List <ActividadProyecto> traerActProyecto()
    {
        return this.unaEmpresa.traerActProyecto();
    } 

    public List<Articulo> traerArticulo() {
        return this.unaEmpresa.traerArticulo();
    }
    
    public List<ActividadTecnica> traerActTecnica(){
        return this.unaEmpresa.traerActTecnica();
    }

    public List<Cliente> traerCliente() {
        return this.unaEmpresa.traerCliente();
    }

    public List<Proveedor> traerProveedor() {
        return this.unaEmpresa.traerProveedor();
    }

    public List<Empleado> traerEmpleado() {
        return this.unaEmpresa.traerEmpleado();
    }
    
    public List<Concepto> traerConcepto(){
        return this.unaEmpresa.traerConcepto();
    }
}
