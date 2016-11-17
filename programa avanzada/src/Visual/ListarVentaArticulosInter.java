/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import Logica.Cliente;
import Logica.Detalle;
import Logica.DetalleCompraVenta;
import Logica.Encabezado;
import Logica.TipoVenta;
import com.itextpdf.text.DocumentException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pepe
 */
public class ListarVentaArticulosInter extends javax.swing.JInternalFrame {

    private ControladoraVisual miControladoraVisual;
    private DefaultTableModel modeloEncabezado;
    private DefaultTableModel modeloDetalle;
    private int fila;

    /**
     * Creates new form ListarVentaArticulosInter
     */
    public ListarVentaArticulosInter(ControladoraVisual miControladoraVisual) {
        initComponents();
        this.miControladoraVisual = miControladoraVisual;
        this.modeloEncabezado = (DefaultTableModel) this.tblEncabezado.getModel();
        this.modeloDetalle = (DefaultTableModel) this.tblDetalle.getModel();
        refrescarVentana();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEncabezado = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDetalle = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cmdBorrarVenta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmdImprimir = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("Ventas de Articulos");

        tblEncabezado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Comprobante", "Cliente", "Fecha", "Total"
            }
        ));
        tblEncabezado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEncabezadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEncabezado);

        tblDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Articulo", "Cantidad", "Subtotal"
            }
        ));
        jScrollPane2.setViewportView(tblDetalle);

        jLabel1.setText("Detalles:");

        cmdBorrarVenta.setText("Borrar Venta");
        cmdBorrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarVentaActionPerformed(evt);
            }
        });

        jLabel2.setText("Encabezado:");

        cmdImprimir.setText("Imprimir Comprobante");
        cmdImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cmdImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdBorrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdBorrarVenta)
                    .addComponent(cmdImprimir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblEncabezadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEncabezadoMouseClicked
        int codigo;
        Encabezado unEncabezado;
        List<Detalle> unosDetalle;
        this.modeloDetalle.setRowCount(0);

        this.fila = this.tblEncabezado.rowAtPoint(evt.getPoint());

        codigo = Integer.parseInt(this.modeloEncabezado.getValueAt(this.fila, 0).toString());
        unEncabezado = this.miControladoraVisual.buscarEncabezado(codigo);
        unosDetalle = unEncabezado.getUnosDetalles();

        Iterator<Detalle> itDetalle = unosDetalle.iterator();
        DetalleCompraVenta unDetalleCompraVenta;
        while (itDetalle.hasNext()) {
            unDetalleCompraVenta = (DetalleCompraVenta) itDetalle.next();
            modeloDetalle.addRow(new Object[]{unDetalleCompraVenta.getCodigo(), unDetalleCompraVenta.getUnConsumible().getDescripcion(), unDetalleCompraVenta.getCantidad(), unDetalleCompraVenta.getSubtotal()});
        }
    }//GEN-LAST:event_tblEncabezadoMouseClicked

    private void cmdBorrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarVentaActionPerformed
        int codigo = Integer.parseInt(this.tblEncabezado.getValueAt(this.fila, 0).toString());
        try {
            this.miControladoraVisual.borrarEncabezado(codigo);
            refrescarVentana();
        } catch (Exception ex) {
            Logger.getLogger(ListarVentaArticulosInter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmdBorrarVentaActionPerformed

    private void cmdImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdImprimirActionPerformed
        int codigo = Integer.parseInt(this.tblEncabezado.getValueAt(this.fila, 0).toString());
        Encabezado unEncabezado = this.miControladoraVisual.buscarEncabezado(codigo);
        try {

            try {
                JFileChooser file = new JFileChooser();
                file.showSaveDialog(this);
                File guarda = file.getSelectedFile();         
                FileOutputStream archivo = new FileOutputStream(guarda);
                this.miControladoraVisual.generarReporteVenta(unEncabezado, archivo);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ListarVentaArticulosInter.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (DocumentException ex) {
            Logger.getLogger(ListarVentaArticulosInter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmdImprimirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrarVenta;
    private javax.swing.JButton cmdImprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDetalle;
    private javax.swing.JTable tblEncabezado;
    // End of variables declaration//GEN-END:variables

    private void refrescarVentana() {
        this.modeloDetalle.setRowCount(0);;
        this.modeloEncabezado.setRowCount(0);
        cargarTablaEncabezado();
    }

    private void cargarTablaEncabezado() {
        Iterator<Encabezado> itEncabezado = this.miControladoraVisual.traerEncabezadoVentaArticulo().iterator();
        Encabezado unEncabezado;
        Cliente unCliente;
        TipoVenta unTipoVenta;
        while (itEncabezado.hasNext()) {
            unEncabezado = itEncabezado.next();
            unCliente = (Cliente) unEncabezado.getUnaPersoneriaJuridica();
            unTipoVenta = (TipoVenta) unEncabezado.getUnTipoComprobante();
            modeloEncabezado.addRow(new Object[]{unEncabezado.getCodigo(), unTipoVenta.getDescripcion(), unCliente.getNombre() + " " + unCliente.getApellido(), unEncabezado.getFecha(), unEncabezado.getTotal()});
        }
    }
}
