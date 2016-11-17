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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pepe
 */
public class ReporteVenta {

    private Empresa unaEmpresa;

    public ReporteVenta(Empresa unaEmpresa) {
        this.unaEmpresa = unaEmpresa;
    }

    public void generarReporteVenta(Encabezado unEncabezado, FileOutputStream archivo) throws DocumentException {
        Cliente unCliente = (Cliente) unEncabezado.getUnaPersoneriaJuridica();
        TipoVenta unTipoVenta = (TipoVenta) unEncabezado.getUnTipoComprobante();
        List<Detalle> unosDetalleCompraVenta = unEncabezado.getUnosDetalles();
        Iterator<Detalle> itDetalle = unosDetalleCompraVenta.iterator();
        DetalleCompraVenta unDetalleCompraVenta;
        DecimalFormat formato = new DecimalFormat("0.00");
        Document documento = new Document();
        PdfWriter.getInstance((com.itextpdf.text.Document) documento, archivo);
        documento.open();
        documento.add(new Paragraph("GuaraSoft S.A."));
        documento.add(new Paragraph("Comprobante de Compra: " + unEncabezado.getCodigo()));
        documento.add(new Paragraph("Tipo de Comprobante: " + unTipoVenta.getDescripcion()));
        documento.add(new Paragraph("Cliente: " + unCliente.getNombre() + " " + unCliente.getApellido()));
        documento.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
        PdfPTable unaTabla = new PdfPTable(4);
        unaTabla.addCell("Codigo");
        unaTabla.addCell("Articulo");
        unaTabla.addCell("Cantidad");
        unaTabla.addCell("Subtotal");
        while (itDetalle.hasNext()) {
            unDetalleCompraVenta = (DetalleCompraVenta) itDetalle.next();
            unaTabla.addCell(String.valueOf(unDetalleCompraVenta.getCodigo()));
            unaTabla.addCell(unDetalleCompraVenta.getUnConsumible().getDescripcion());
            unaTabla.addCell(String.valueOf(String.valueOf(unDetalleCompraVenta.getCantidad())));
            unaTabla.addCell(String.valueOf(unDetalleCompraVenta.getSubtotal()));
        }
        unaTabla.addCell("");
        unaTabla.addCell("");
        unaTabla.addCell("TOTAL:");
        unaTabla.addCell("$" + formato.format(unEncabezado.getTotal()));
        documento.add(unaTabla);
        documento.close();

    }
}
