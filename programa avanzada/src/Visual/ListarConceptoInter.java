/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import Logica.Concepto;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pepex3
 */
public class ListarConceptoInter extends javax.swing.JInternalFrame {
    
    private ControladoraVisual miControladoraVisual;
    private DefaultTableModel modeloConcepto;
    /**
     * Creates new form ListarConceptoInter
     */
    public ListarConceptoInter(ControladoraVisual miControladoraVisual) {
        initComponents();
        this.miControladoraVisual=miControladoraVisual;
        this.modeloConcepto=(DefaultTableModel)this.tblConcepto.getModel();
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
        tblConcepto = new javax.swing.JTable();

        setClosable(true);
        setResizable(true);
        setTitle("Conceptos");

        tblConcepto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Monto"
            }
        ));
        tblConcepto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblConceptoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblConcepto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblConceptoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConceptoMouseClicked
        int fila= this.tblConcepto.rowAtPoint(evt.getPoint());
        
        AltaProyectoInter.modeloConceptoProyec.addRow(new Object[]{this.modeloConcepto.getValueAt(fila, 0).toString(),this.modeloConcepto.getValueAt(fila, 1).toString(),this.modeloConcepto.getValueAt(fila, 2).toString()});
        this.dispose();
    }//GEN-LAST:event_tblConceptoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblConcepto;
    // End of variables declaration//GEN-END:variables

    private void refrescarVentana() {
        this.modeloConcepto.setRowCount(0);
        cargarTabla();
    }

    private void cargarTabla() {
        Iterator<Concepto> itConcepto= this.miControladoraVisual.traerConcepto().iterator();
        Concepto unConcepto;
        while(itConcepto.hasNext()){
            unConcepto=itConcepto.next();
            this.modeloConcepto.addRow(new Object[]{unConcepto.getCodigo(),unConcepto.getDescripcion(),unConcepto.getMonto()});
        }
    }
}
