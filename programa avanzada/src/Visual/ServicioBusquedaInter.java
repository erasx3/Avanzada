/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import Logica.Tecnico;
import Logica.Tercero;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pepe
 */
public class ServicioBusquedaInter extends javax.swing.JInternalFrame {

    private ControladoraVisual miControladoraVisual;
    private DefaultTableModel modeloServTecnico;
    private DefaultTableModel modeloServTercero;
    /**
     * Creates new form ServicioBusquedaInter
     */
    public ServicioBusquedaInter(ControladoraVisual miControladoraVisual) {
        initComponents();
        this.miControladoraVisual=miControladoraVisual;
        this.cmdAgregarServTecnico.setEnabled(false);
        this.cmdAgregarServTercero.setEnabled(false);
        this.modeloServTecnico=(DefaultTableModel)this.tblServicioTecnico.getModel();
        this.modeloServTercero=(DefaultTableModel)this.tblServicioTercero.getModel();
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
        tblServicioTecnico = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblServicioTercero = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmdAgregarServTecnico = new javax.swing.JButton();
        cmdAgregarServTercero = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("Servicios");

        tblServicioTecnico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codgio", "Descripcion", "Total"
            }
        ));
        tblServicioTecnico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblServicioTecnicoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblServicioTecnico);

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
        jScrollPane2.setViewportView(tblServicioTercero);

        jLabel1.setText("Servicios de Terceros:");

        jLabel2.setText("Servicios Tecnicos:");

        cmdAgregarServTecnico.setText("Agregar Servicio");

        cmdAgregarServTercero.setText("Agregar Servicio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 670, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdAgregarServTecnico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdAgregarServTercero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmdAgregarServTecnico)
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmdAgregarServTercero)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblServicioTecnicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblServicioTecnicoMouseClicked
        int fila = this.tblServicioTecnico.rowAtPoint(evt.getPoint());
        
        GenerarVentaServicioInter.lblCodigoServicio.setText(this.modeloServTecnico.getValueAt(fila, 0).toString());
        GenerarVentaServicioInter.lblNombreServicio.setText(this.modeloServTecnico.getValueAt(fila, 1).toString());
        GenerarVentaServicioInter.lblPrecio.setText(this.modeloServTecnico.getValueAt(fila, 2).toString());
        this.dispose();
    }//GEN-LAST:event_tblServicioTecnicoMouseClicked

    private void tblServicioTerceroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblServicioTerceroMouseClicked
        int fila = this.tblServicioTecnico.rowAtPoint(evt.getPoint());
        
        GenerarVentaServicioInter.lblCodigoServicio.setText(this.modeloServTercero.getValueAt(fila, 0).toString());
        GenerarVentaServicioInter.lblNombreServicio.setText(this.modeloServTercero.getValueAt(fila, 1).toString());
        GenerarVentaServicioInter.lblPrecio.setText(this.modeloServTercero.getValueAt(fila, 4).toString());
        this.dispose();
    }//GEN-LAST:event_tblServicioTerceroMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAgregarServTecnico;
    private javax.swing.JButton cmdAgregarServTercero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblServicioTecnico;
    private javax.swing.JTable tblServicioTercero;
    // End of variables declaration//GEN-END:variables

    private void refrescarVentana() {
        this.modeloServTecnico.setRowCount(0);
        this.modeloServTercero.setRowCount(0);
        cargarTablas();
    }

    private void cargarTablas() {
        Iterator<Tecnico> itTecnico= this.miControladoraVisual.traerServicioTecnico().iterator();
        Iterator<Tercero> itTercero= this.miControladoraVisual.traerServicioTercero().iterator();
        Tecnico unTecnico;
        Tercero unTercero;
        while(itTecnico.hasNext()){
            unTecnico=itTecnico.next();
            this.modeloServTecnico.addRow(new Object[]{unTecnico.getCodigo(),unTecnico.getDescripcion(),unTecnico.getSubtotal()});
        }
        while(itTercero.hasNext()){
            unTercero=itTercero.next();
            this.modeloServTercero.addRow(new Object[]{unTercero.getCodigo(),unTercero.getDescripcion(),unTercero.getMonto(),"%"+unTercero.getGanancia(),unTercero.getSubtotal()});
        }
    }
}
