/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import Logica.TipoComprobante;
import Logica.TipoLiquidacion;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Facu
 */
public class AltaTipoLiquidacionInter extends javax.swing.JInternalFrame {

    private ControladoraVisual miControladoraVisual;
    private DefaultTableModel modeloLiquidacion;

    public AltaTipoLiquidacionInter(ControladoraVisual miControladoraVisual) {
        initComponents();
        txtCodigo.setVisible(false);
        this.miControladoraVisual = miControladoraVisual;
        this.modeloLiquidacion = (DefaultTableModel) this.tblLiquidacion.getModel();
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

        jPanel1 = new javax.swing.JPanel();
        txtDescripcion = new javax.swing.JTextField();
        cmdAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmdModificar = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLiquidacion = new javax.swing.JTable();
        txtCodigo = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Tipo de Liquidacion");

        cmdAgregar.setText("Agregar");
        cmdAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAgregarActionPerformed(evt);
            }
        });

        jLabel1.setText("Descripcion:");

        cmdModificar.setText("Modificar");
        cmdModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdModificarActionPerformed(evt);
            }
        });

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });

        tblLiquidacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblLiquidacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLiquidacionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLiquidacion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmdAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdBorrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigo)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmdModificar)
                            .addComponent(cmdBorrar)
                            .addComponent(cmdAgregar))))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAgregarActionPerformed
        try {
            TipoComprobante unTipoCompra = this.miControladoraVisual.buscarTipoComprobante(this.txtDescripcion.getText());
            if (unTipoCompra == null) {
                this.miControladoraVisual.crearTipoLiquidacion(txtDescripcion.getText());
                refrescarVentana();
            } else {
                Object msj = "Ya Existe";
                JOptionPane.showMessageDialog(null, msj, "ERROR: Existencia", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            Logger.getLogger(AltaTipoLiquidacionInter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmdAgregarActionPerformed

    private void cmdModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdModificarActionPerformed
        try {
            this.miControladoraVisual.modificarTipoLiquidacion(Integer.parseInt(txtCodigo.getText()), txtDescripcion.getText());
            refrescarVentana();
        } catch (Exception ex) {
            Logger.getLogger(AltaTipoLiquidacionInter.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_cmdModificarActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        try {
            this.miControladoraVisual.borrarTipoLiquidacion(Integer.parseInt(txtCodigo.getText()));
            refrescarVentana();
        } catch (Exception ex) {
            Logger.getLogger(AltaTipoLiquidacionInter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void tblLiquidacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLiquidacionMouseClicked
        txtCodigo.setText(null);
        txtDescripcion.setText(null);

        int fila = this.tblLiquidacion.rowAtPoint(evt.getPoint());

        txtCodigo.setText(this.modeloLiquidacion.getValueAt(fila, 0).toString());
        txtDescripcion.setText(this.modeloLiquidacion.getValueAt(fila, 1).toString());
    }//GEN-LAST:event_tblLiquidacionMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAgregar;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLiquidacion;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables

    private void refrescarVentana() {
        txtCodigo.setText(null);
        txtDescripcion.setText(null);
        modeloLiquidacion.setRowCount(0);
        cargarTablaCompra();
    }

    private void cargarTablaCompra() {
        Iterator<TipoLiquidacion> itTipoLiquidacion = this.miControladoraVisual.traerTipoLiquidacion().iterator();
        TipoLiquidacion unTipo;
        while (itTipoLiquidacion.hasNext()) {
            unTipo = itTipoLiquidacion.next();
            modeloLiquidacion.addRow(new Object[]{unTipo.getCodigo(), unTipo.getDescripcion()});
        }
    }
}
