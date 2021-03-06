/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporte;

import Logica.Empresa;
import Logica.Encabezado;
import com.itextpdf.text.DocumentException;
import java.io.FileOutputStream;
import java.util.List;

/**
 *
 * @author Pepe
 */
public class ControladoraReporte {
    
    private Empresa unaEmpresa;
    
    public ControladoraReporte(Empresa unaEmpresa){
        this.unaEmpresa=unaEmpresa;
    }
    
    public void generarReporteVenta(Encabezado unEncabezado, FileOutputStream archivo) throws DocumentException{
        ReporteVenta unReporteVenta=new ReporteVenta(unaEmpresa);
        unReporteVenta.generarReporteVenta(unEncabezado, archivo);
    }
    
     public void generarReporteBalanceVentas(List<Encabezado> unosEncabezados, FileOutputStream archivo) throws DocumentException{
         ReporteBalanceVentas unBalanceVentas=new ReporteBalanceVentas(unaEmpresa);
         unBalanceVentas.generarReporteBalanceVentas(unosEncabezados, archivo);
     }
}
