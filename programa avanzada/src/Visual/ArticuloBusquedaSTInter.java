/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import Logica.Articulo;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pepe
 */
public class ArticuloBusquedaSTInter extends javax.swing.JInternalFrame {

    private ControladoraVisual miControladoraVisual;
    private DefaultTableModel modelosArticulo;

    /**
     * Creates new form ArticuloBuscquedaSTInter
     */
    public ArticuloBusquedaSTInter(ControladoraVisual miControladoraVisual) {
        initComponents();
        this.miControladoraVisual = miControladoraVisual;
        this.modelosArticulo = (DefaultTableModel) this.tblArticulo.getModel();
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
        tblArticulo = new javax.swing.JTable();

        setClosable(true);
        setResizable(true);
        setTitle("Articulos");

        tblArticulo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Descripcion", "Precio de Lista", "Precio de Venta", "Porcentaje Descuento", "Cantidad Minima", "Stock"
            }
        ));
        tblArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblArticuloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblArticulo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblArticuloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblArticuloMouseClicked
        GenerarServicioTecnico.lblCodigoArticulo.setText(null);
        GenerarServicioTecnico.lblNombreArticulo.setText(null);
        GenerarServicioTecnico.lblPrecio.setText(null);

        int fila = this.tblArticulo.rowAtPoint(evt.getPoint());

        GenerarServicioTecnico.lblCodigoArticulo.setText(this.modelosArticulo.getValueAt(fila, 0).toString());
        GenerarServicioTecnico.lblNombreArticulo.setText(this.modelosArticulo.getValueAt(fila, 1).toString());
        GenerarServicioTecnico.lblPrecio.setText(this.modelosArticulo.getValueAt(fila, 4).toString());
        this.dispose();
    }//GEN-LAST:event_tblArticuloMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblArticulo;
    // End of variables declaration//GEN-END:variables
    
    private void refrescarVentana() {
        modelosArticulo.setRowCount(0);
        cargarTablaArticulo();
    }

    public void cargarTablaArticulo() {
        Iterator<Articulo> itArticulo = this.miControladoraVisual.traerArticulo().iterator();
        Articulo unTipo;
        while (itArticulo.hasNext()) {
            unTipo = itArticulo.next();
            modelosArticulo.addRow(new Object[]{unTipo.getCodigo(),unTipo.getNombre(),unTipo.getDescripcion(),unTipo.getPrecioLista(),unTipo.getPrecioVenta(),unTipo.getDescuentoMayorista(),unTipo.getCantidadMinima(),unTipo.getCantidad()});
        }
    }
}
