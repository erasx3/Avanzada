/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import Logica.Cliente;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pepe
 */
public class ClienteBusquedaServicioInter extends javax.swing.JInternalFrame {

    private ControladoraVisual miControladoraVisual;
    private DefaultTableModel modeloCliente;

    /**
     * Creates new form ClienteBusquedaServicioInter
     */
    public ClienteBusquedaServicioInter(ControladoraVisual miControladoraVisual) {
        initComponents();
        this.miControladoraVisual = miControladoraVisual;
        this.modeloCliente = (DefaultTableModel) this.tblCliente.getModel();
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
        tblCliente = new javax.swing.JTable();

        setClosable(true);
        setResizable(true);
        setTitle("Clientes");

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Dni", "CUIL", "Nombre", "Apellido", "Direccion", "Telefono", "Email"
            }
        ));
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        GenerarVentaServicioInter.txtCodigoCliente.setText(null);
        GenerarVentaServicioInter.lblNombreCliente.setText(null);

        int fila = this.tblCliente.rowAtPoint(evt.getPoint());

        GenerarVentaServicioInter.txtCodigoCliente.setText(this.modeloCliente.getValueAt(fila, 0).toString());
        GenerarVentaServicioInter.lblNombreCliente.setText(this.modeloCliente.getValueAt(fila, 3).toString() + " " + this.modeloCliente.getValueAt(fila, 4).toString());
        this.dispose();
    }//GEN-LAST:event_tblClienteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCliente;
    // End of variables declaration//GEN-END:variables

    private void refrescarVentana() {
        this.modeloCliente.setRowCount(0);
        cargarTablaCliente();
    }

    private void cargarTablaCliente() {
        Iterator<Cliente> itCliente = this.miControladoraVisual.traerCliente().iterator();
        Cliente unCliente;
        while (itCliente.hasNext()) {
            unCliente = itCliente.next();
            modeloCliente.addRow(new Object[]{unCliente.getCodigo(), unCliente.getDni(), unCliente.getCuil(), unCliente.getNombre(), unCliente.getApellido(), unCliente.getDireccion(), unCliente.getEmail(), unCliente.getTelefono()});
        }
    }
}
