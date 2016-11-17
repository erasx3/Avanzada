/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import Logica.Empleado;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Facu
 */
public class AltaEmpleadoInter extends javax.swing.JInternalFrame {

    private ControladoraVisual miControladoraVisual;
    private DefaultTableModel modeloEmpleado;

    public AltaEmpleadoInter(ControladoraVisual miControladoraVisual) {
        initComponents();
        this.txtCodigo.setVisible(false);
        this.miControladoraVisual = miControladoraVisual;
        this.modeloEmpleado = (DefaultTableModel) tblEmpleado.getModel();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtCuil = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        cmdAgregar = new javax.swing.JButton();
        cmdModificar = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleado = new javax.swing.JTable();
        txtCodigo = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Empleados");

        jLabel2.setText("DNI:");

        jLabel3.setText("CUIL:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Apellido:");

        jLabel6.setText("Direccion:");

        jLabel7.setText("Email:");

        jLabel8.setText("Telefono:");

        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });

        txtCuil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuilActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

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

        tblEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "DNI", "CUIL", "Nombre", "Apellido", "Direccion", "Email", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleado);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDni, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtCuil, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtCodigo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cmdAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdBorrar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCuil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmdAgregar)
                            .addComponent(cmdModificar)
                            .addComponent(cmdBorrar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtCuilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuilActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        try {
            this.miControladoraVisual.borrarEmpleado(Integer.parseInt(txtCodigo.getText()));
            refrescarVentana();
        } catch (Exception ex) {
            Logger.getLogger(AltaEmpleadoInter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void cmdAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAgregarActionPerformed
        try {
            Empleado unEmpleado = this.miControladoraVisual.buscarEmpleado(Long.parseLong(this.txtDni.getText()));
            if (unEmpleado == null) {
                this.miControladoraVisual.crearEmpleado(txtNombre.getText(), txtApellido.getText(), txtDireccion.getText(), Long.parseLong(txtTelefono.getText()), txtEmail.getText(), Long.parseLong(txtDni.getText()), txtCuil.getText());
                refrescarVentana();
            } else {
                Object msj = "Ya Existe";
                JOptionPane.showMessageDialog(null, msj, "ERROR: Existencia", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            Logger.getLogger(AltaEmpleadoInter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmdAgregarActionPerformed

    private void cmdModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdModificarActionPerformed
        try {
            this.miControladoraVisual.modificarEmpleado(Integer.parseInt(txtCodigo.getText()), txtNombre.getText(), txtApellido.getText(), txtDireccion.getText(), Long.parseLong(txtTelefono.getText()), txtEmail.getText(), Long.parseLong(txtDni.getText()), txtCuil.getText());
            refrescarVentana();
        } catch (Exception ex) {
            Logger.getLogger(AltaEmpleadoInter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmdModificarActionPerformed

    private void tblEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadoMouseClicked
        txtCodigo.setText(null);
        txtNombre.setText(null);
        txtApellido.setText(null);
        txtDireccion.setText(null);
        txtEmail.setText(null);
        txtTelefono.setText(null);
        txtDni.setText(null);
        txtCuil.setText(null);

        int fila = this.tblEmpleado.rowAtPoint(evt.getPoint());

        txtCodigo.setText(this.modeloEmpleado.getValueAt(fila, 0).toString());
        txtDni.setText(this.modeloEmpleado.getValueAt(fila, 1).toString());
        txtCuil.setText(this.modeloEmpleado.getValueAt(fila, 2).toString());
        txtNombre.setText(this.modeloEmpleado.getValueAt(fila, 3).toString());
        txtApellido.setText(this.modeloEmpleado.getValueAt(fila, 4).toString());
        txtDireccion.setText(this.modeloEmpleado.getValueAt(fila, 5).toString());
        txtEmail.setText(this.modeloEmpleado.getValueAt(fila, 6).toString());
        txtTelefono.setText(this.modeloEmpleado.getValueAt(fila, 7).toString());
    }//GEN-LAST:event_tblEmpleadoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAgregar;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdModificar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmpleado;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCuil;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void refrescarVentana() {
        txtCodigo.setText(null);
        txtCuil.setText(null);
        txtDni.setText(null);
        txtNombre.setText(null);
        txtApellido.setText(null);
        txtDireccion.setText(null);
        txtEmail.setText(null);
        txtTelefono.setText(null);
        modeloEmpleado.setRowCount(0);
        cargarTablaEmpleado();
    }

    private void cargarTablaEmpleado() {
        Iterator<Empleado> itEmpleado = this.miControladoraVisual.traerEmpleado().iterator();
        Empleado unEmpleado;
        while (itEmpleado.hasNext()) {
            unEmpleado = itEmpleado.next();
            modeloEmpleado.addRow(new Object[]{unEmpleado.getCodigo(), unEmpleado.getDni(), unEmpleado.getCuil(), unEmpleado.getNombre(), unEmpleado.getApellido(), unEmpleado.getDireccion(), unEmpleado.getEmail(), unEmpleado.getTelefono()});
        }
    }
}
