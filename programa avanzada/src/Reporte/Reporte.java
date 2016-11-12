/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reporte;

import Logica.Empleado;
import Logica.Persistencia;
import com.itextpdf.text.Document;
import java.util.List;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;

/**
 *
 * @author eras
 */
public class Reporte {
    
    public String generarReciboDeSueldoPDF(Empleado unEmpleado, List horasALiquidar) throws DocumentException, Exception {
        FileOutputStream archivo;
        Iterator<HorasTrabajadas> itHoras = horasALiquidar.iterator();
        HorasTrabajadas unaHora;
        String valorRetorno = "La Confección del recibo fue exitosa";
        String fechaIngreso, fechaEgreso;
        float horaTrabajada, totalAPagarHorasTrabajadas = 0, totalAPagar = 0;
        Calendar fechaDelDia = GregorianCalendar.getInstance();
        DecimalFormat formato = new DecimalFormat("0.00");
//        if (fechaDelDia.get(GregorianCalendar.DATE) >= 5 && fechaDelDia.get(GregorianCalendar.DATE) <= 10) {
        try {
            archivo = new FileOutputStream("C:\\Users\\garba1\\Desktop\\Recibos de Sueldo\\ReciboDeSueldo-" + unEmpleado.getNombre() + "-" + unEmpleado.getDniEmpleado() + "-" + this.obtenerMes(fechaDelDia) + "-" + fechaDelDia.get(GregorianCalendar.YEAR) + ".pdf");
            Document documento = new Document();
            PdfWriter.getInstance((com.itextpdf.text.Document) documento, archivo);
            documento.open();
            documento.add(new Paragraph("GuaraSoft SA\n"));
            documento.add(new Paragraph("Recibo de Sueldo mes: " + this.obtenerMes(fechaDelDia) + "\n"));
            documento.add(new Paragraph("Empleado: " + unEmpleado.getNombre() + "\n"));
            documento.add(new Paragraph("Dni: " + unEmpleado.getDniEmpleado() + "\n"));
            documento.add(new Paragraph("Tipo: " + unEmpleado.getUnTipo().getNombreTipo() + "\n"));
            documento.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
            PdfPTable unaTabla = new PdfPTable(5);
            unaTabla.addCell("Código");
            unaTabla.addCell("Fecha Ingreso");
            unaTabla.addCell("Fecha Egreso");
            unaTabla.addCell("Horas Trabajadas");
            unaTabla.addCell("Total a Pagar");
            while (itHoras.hasNext()) {
                unaHora = itHoras.next();
                fechaIngreso = unaHora.getFechaIngresoString();
                fechaEgreso = unaHora.getFechaEgresoString();
                horaTrabajada = unaHora.getHorasTrabajadas();
                totalAPagarHorasTrabajadas = this.calcularTotalAPagar(unEmpleado, horaTrabajada);
                unaTabla.addCell(String.valueOf(unaHora.getCodigo()));
                unaTabla.addCell(fechaIngreso);
                unaTabla.addCell(fechaEgreso);
                unaTabla.addCell(String.valueOf(horaTrabajada));
                unaTabla.addCell("$" + formato.format(totalAPagarHorasTrabajadas));
                unaHora.setHorasLiquidadas(1);
                totalAPagar = totalAPagar + totalAPagarHorasTrabajadas;
                unaHora.setHorasLiquidadas(1);
                Persistencia.modificarHoraTrabajada(unaHora);
            }
            unaTabla.addCell("");
            unaTabla.addCell("");
            unaTabla.addCell("");
            unaTabla.addCell("TOTAL:");
            unaTabla.addCell("$" + formato.format(totalAPagar));
            documento.add(unaTabla);
            documento.close();
        } catch (FileNotFoundException | DocumentException ex) {
            valorRetorno = "Ha Ocurrido un error, intentelo de nuevo, por favor.";
  //          }
            //      } else {
            //          valorRetorno = "Los recibos solo pueden confeccionarse entre los dias 5 y 10 de cada mes";
        }
        return valorRetorno;
    }
}
