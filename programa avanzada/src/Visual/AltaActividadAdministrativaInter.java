/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import Logica.Actividad;
import Logica.ActividadAdministrativa;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Facu
 */
public class AltaActividadAdministrativaInter extends javax.swing.JInternalFrame {

    private ControladoraVisual miControladoraVisual;
    private DefaultTableModel modeloActAdministrativa;

    public AltaActividadAdministrativaInter(ControladoraVisual miControladoraVisual) {
        initComponents();
        this.txtCodigo.setVisible(false);
        this.miControladoraVisual = miControladoraVisual;
        this.modeloActAdministrativa = (DefaultTableModel) this.tblActividadAdministrativa.getModel();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        txtPrecioPorHora = new javax.swing.JTextField();
        cmdAgregar = new javax.swing.JButton();
        cmdModificar = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblActividadAdministrativa = new javax.swing.JTable();
        txtCodigo = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Actividades Administrativas");

        jLabel2.setText("Descripcion:");

        jLabel3.setText("Precio Por Hora:");

        cmdAgregar.setText("Agregar");
        cmdAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAgregarActionPerformed(evt);
            }
        });

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

        tblActividadAdministrativa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Precio Por Hora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblActividadAdministrativa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblActividadAdministrativaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblActividadAdministrativa);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cmdAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(cmdModificar)
                        .addGap(18, 18, 18)
                        .addComponent(cmdBorrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtPrecioPorHora, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigo)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPrecioPorHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmdAgregar)
                            .addComponent(cmdModificar)
                            .addComponent(cmdBorrar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
            Actividad unaActividad = this.miControladoraVisual.buscarActividad(this.txtDescripcion.getText());
            if (unaActividad == null) {
                miControladoraVisual.crearActividadAdministrativa(txtDescripcion.getText(), Double.valueOf(txtPrecioPorHora.getText()));
                refrescarVentana();
            } else {
                Object msj = "Ya Existe";
                JOptionPane.showMessageDialog(null, msj, "ERROR: Existencia", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            Logger.getLogger(AltaActividadAdministrativaInter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmdAgregarActionPerformed

    private void cmdModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdModificarActionPerformed
        try {
            miControladoraVisual.modificarActividadAdministrativa(Integer.parseInt(txtCodigo.getText()), txtDescripcion.getText(), Double.valueOf(txtPrecioPorHora.getText()));
            refrescarVentana();
        } catch (Exception ex) {
            Logger.getLogger(AltaActividadAdministrativaInter.class.getName()).log(Level.SEVERE, null, ex);
        }
        refrescarVentana();
    }//GEN-LAST:event_cmdModificarActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        try {
            miControladoraVisual.borrarActAdministrativa(Integer.parseInt(txtCodigo.getText()));
            refrescarVentana();
        } catch (Exception ex) {
            Logger.getLogger(AltaActividadAdministrativaInter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void tblActividadAdministrativaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblActividadAdministrativaMouseClicked
        txtCodigo.setText(null);
        txtDescripcion.setText(null);
        txtPrecioPorHora.setText(null);

        int fila = this.tblActividadAdministrativa.rowAtPoint(evt.getPoint());

        this.txtCodigo.setText(this.modeloActAdministrativa.getValueAt(fila, 0).toString());
        this.txtDescripcion.setText(this.modeloActAdministrativa.getValueAt(fila, 1).toString());
        this.txtPrecioPorHora.setText(this.modeloActAdministrativa.getValueAt(fila, 2).toString());
    }//GEN-LAST:event_tblActividadAdministrativaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAgregar;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdModificar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblActividadAdministrativa;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtPrecioPorHora;
    // End of variables declaration//GEN-END:variables

    private void refrescarVentana() {
        txtCodigo.setText(null);
        txtDescripcion.setText(null);
        txtPrecioPorHora.setText(null);
        this.modeloActAdministrativa.setRowCount(0);
        cargarTablaActAdministrativa();
    }

    private void cargarTablaActAdministrativa() {
        Iterator<ActividadAdministrativa> itActAdministrativa = this.miControladoraVisual.traerActAdministrativa().iterator();
        ActividadAdministrativa unTipo;
        while (itActAdministrativa.hasNext()) {
            unTipo = itActAdministrativa.next();
            modeloActAdministrativa.addRow(new Object[]{unTipo.getCodigo(), unTipo.getDescripcion(), unTipo.getPrecioHora()});
        }
    }
}
