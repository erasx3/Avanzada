/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import Logica.Tercero;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pepe
 */
public class ListarServicioTerceroInter extends javax.swing.JInternalFrame {

    private ControladoraVisual miControladoraVisual;
    private DefaultTableModel modeloServicio;
    private int fila;
    /**
     * Creates new form ListarServicioTerceroInter
     */
    public ListarServicioTerceroInter(ControladoraVisual miControladoraVisual) {
        initComponents();
        this.miControladoraVisual=miControladoraVisual;
        this.modeloServicio=(DefaultTableModel)this.tblServicioTercero.getModel();
        this.cmdBorrarServicio.setEnabled(false);
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
        tblServicioTercero = new javax.swing.JTable();
        cmdBorrarServicio = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("Servicios de Terceros");

        tblServicioTercero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Costo", "Ganancia", "Total"
            }
        ));
        tblServicioTercero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblServicioTerceroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblServicioTercero);
        if (tblServicioTercero.getColumnModel().getColumnCount() > 0) {
            tblServicioTercero.getColumnModel().getColumn(0).setResizable(false);
            tblServicioTercero.getColumnModel().getColumn(4).setResizable(false);
        }

        cmdBorrarServicio.setText("Borrrar Servicio");
        cmdBorrarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarServicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cmdBorrarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmdBorrarServicio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblServicioTerceroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblServicioTerceroMouseClicked
        this.fila = this.tblServicioTercero.rowAtPoint(evt.getPoint());
        this.cmdBorrarServicio.setEnabled(true);
    }//GEN-LAST:event_tblServicioTerceroMouseClicked

    private void cmdBorrarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarServicioActionPerformed
        try {
            this.miControladoraVisual.borrarServicioTercero(Integer.parseInt(this.modeloServicio.getValueAt(this.fila, 0).toString()));
            refrescarVentana();
            cmdBorrarServicio.setEnabled(false);
        } catch (Exception ex) {
            Logger.getLogger(ListarServicioTerceroInter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmdBorrarServicioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrarServicio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblServicioTercero;
    // End of variables declaration//GEN-END:variables

    private void refrescarVentana() {
        this.modeloServicio.setRowCount(0);
        cargarTablaServicio();
    }

    private void cargarTablaServicio() {
        Iterator<Tercero> itTercero = this.miControladoraVisual.traerServicioTercero().iterator();
        Tercero unTercero;
        while(itTercero.hasNext()){
            unTercero=itTercero.next();
            this.modeloServicio.addRow(new Object[]{unTercero.getCodigo(),unTercero.getDescripcion(),unTercero.getMonto(),"%"+unTercero.getGanancia(),unTercero.getSubtotal()});
        }
    }
}