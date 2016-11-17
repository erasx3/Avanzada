/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporte;

import Logica.Cliente;
import Logica.Detalle;
import Logica.DetalleCompraVenta;
import Logica.Empresa;
import Logica.Encabezado;
import Logica.TipoVenta;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author pepex3
 */
public class ReporteBalanceVentas {
    
    private Empresa unaEmpresa;

    public ReporteBalanceVentas(Empresa unaEmpresa) {
        this.unaEmpresa = unaEmpresa;
    }
    
    public void generarReporteBalanceVentas(List<Encabezado> unosEncabezados, FileOutputStream archivo) throws DocumentException {
        Double total = 0.00;
        Calendar fecha = new GregorianCalendar();
        Iterator<Encabezado> itEncabezado=unosEncabezados.iterator();
        Encabezado unEncabezado;
        DetalleCompraVenta unDetalleCompraVenta;
        DecimalFormat formato = new DecimalFormat("0.00");
        Document documento = new Document();
        PdfWriter.getInstance((com.itextpdf.text.Document) documento, archivo);
        documento.open();
        documento.add(new Paragraph("GuaraSoft S.A."));
        documento.add(new Paragraph("Balance de Ventas"));
        documento.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
        PdfPTable unaTabla = new PdfPTable(5);
        unaTabla.addCell("Codigo");
        unaTabla.addCell("Comprobante");
        unaTabla.addCell("Cliente");
        unaTabla.addCell("Fecha");
        unaTabla.addCell("Subtotal");
        while (itEncabezado.hasNext()) {
            unEncabezado=itEncabezado.next();
            unaTabla.addCell(String.valueOf(unEncabezado.getCodigo()));
            unaTabla.addCell(unEncabezado.getUnTipoComprobante().getDescripcion());
            unaTabla.addCell(unEncabezado.getUnaPersoneriaJuridica().getNombre());
            fecha=unEncabezado.getFecha();
            total = total + unEncabezado.getTotal();
            unaTabla.addCell(String.valueOf(fecha));
            unaTabla.addCell(String.valueOf(unEncabezado.getTotal()));
        }
        unaTabla.addCell("");
        unaTabla.addCell("");
        unaTabla.addCell("");
        unaTabla.addCell("TOTAL:");
        unaTabla.addCell("$" + formato.format(total));
        documento.add(unaTabla);
        documento.close();

    }
}
