/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import Logica.Articulo;
import Logica.Consumible;
import Logica.DetalleCompraVenta;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pepe
 */
public class GenerarServicioTecnico extends javax.swing.JInternalFrame {

    private ControladoraVisual miControladoraVisual;
    private DefaultTableModel modeloArticulo;
    private List<DetalleCompraVenta> unosDetalleCompraVenta;
    /**
     * Creates new form GenerarServicioTecnico
     */
    public GenerarServicioTecnico(ControladoraVisual miControladoraVisual) {
        initComponents();
        this.miControladoraVisual=miControladoraVisual;
        this.modeloArticulo=(DefaultTableModel)this.tblArticulo.getModel();
        this.cmdGenerarServicio.setEnabled(false);
        this.cmdAgregarArticulo.setEnabled(false);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCodigoArticulo = new javax.swing.JLabel();
        lblNombreArticulo = new javax.swing.JLabel();
        cmdBuscarArticulo = new javax.swing.JButton();
        cmdAgregarArticulo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblArticulo = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPrecioServicio = new javax.swing.JTextField();
        cmdGenerarServicio = new javax.swing.JButton();
        cmdVerServicios = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("Servicio Tecnico");

        jLabel1.setText("Descripcion:");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        jLabel2.setText("Codigo Articulo:");

        jLabel3.setText("Articulo:");

        lblCodigoArticulo.setText("xxxxxx");

        lblNombreArticulo.setText("Nombre");

        cmdBuscarArticulo.setText("Buscar Articulo");
        cmdBuscarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarArticuloActionPerformed(evt);
            }
        });

        cmdAgregarArticulo.setText("Agregar Articulo");
        cmdAgregarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAgregarArticuloActionPerformed(evt);
            }
        });

        tblArticulo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Cantidad", "Articulo", "Subtotal"
            }
        ));
        jScrollPane2.setViewportView(tblArticulo);

        jLabel4.setText("Cantidad:");

        jLabel5.setText("Precio:");

        jLabel6.setText("$");

        lblPrecio.setText("0.00");

        jLabel7.setText("Total:");

        jLabel8.setText("$");

        lblTotal.setText("0.00");

        jLabel9.setText("Precio del Servicio:");

        txtPrecioServicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioServicioKeyTyped(evt);
            }
        });

        cmdGenerarServicio.setText("Generar Servicio Tecnico");
        cmdGenerarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGenerarServicioActionPerformed(evt);
            }
        });

        cmdVerServicios.setText("Ver Servicios");
        cmdVerServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdVerServiciosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNombreArticulo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmdAgregarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCodigoArticulo)
                                        .addGap(134, 134, 134)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblPrecio)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                                        .addComponent(cmdBuscarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPrecioServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(57, 57, 57)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cmdGenerarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdVerServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPrecioServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(lblCodigoArticulo)
                                .addComponent(cmdBuscarArticulo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblNombreArticulo)
                            .addComponent(cmdAgregarArticulo)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(lblPrecio))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(lblTotal)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(cmdGenerarServicio))))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdVerServicios)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdBuscarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarArticuloActionPerformed
        ArticuloBusquedaSTInter articuloBusqueda = new ArticuloBusquedaSTInter(miControladoraVisual);
        MenuPrincipal.Escritorio.add(articuloBusqueda);
        articuloBusqueda.show();
        cmdAgregarArticulo.setEnabled(true);
        cmdBuscarArticulo.setEnabled(false);
    }//GEN-LAST:event_cmdBuscarArticuloActionPerformed

    private void cmdAgregarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAgregarArticuloActionPerformed
        try {
            if (this.miControladoraVisual.comprobarStock(Integer.parseInt(lblCodigoArticulo.getText()), Integer.parseInt(txtCantidad.getText()))) {
                Consumible unConsumible = this.miControladoraVisual.buscarArticulo(Integer.parseInt(lblCodigoArticulo.getText()));
                Double subtotal = Integer.parseInt(txtCantidad.getText()) * Double.parseDouble(lblPrecio.getText());
                Double total = subtotal + Double.parseDouble(lblTotal.getText());
                this.lblTotal.setText(String.valueOf(total));
                int codigo = this.miControladoraVisual.generarDetalleCompraVenta(Integer.parseInt(txtCantidad.getText()), unConsumible, subtotal);
                this.miControladoraVisual.descontarArticulo(Integer.parseInt(txtCantidad.getText()), Integer.parseInt(lblCodigoArticulo.getText()));
                cargarTablaDetaller(codigo);
                refrescarVentanaArticulo();
                this.cmdAgregarArticulo.setEnabled(false);
                this.cmdBuscarArticulo.setEnabled(true);
                this.cmdGenerarServicio.setEnabled(true);
            } else {
                System.out.print("no existe sufienciente cantidad");
            }
        } catch (Exception ex) {
            
        }
    }//GEN-LAST:event_cmdAgregarArticuloActionPerformed

    private void txtPrecioServicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioServicioKeyTyped
        this.lblTotal.setText(txtPrecioServicio.getText());
    }//GEN-LAST:event_txtPrecioServicioKeyTyped

    private void cmdGenerarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGenerarServicioActionPerformed
        this.unosDetalleCompraVenta= new LinkedList();
        DetalleCompraVenta unDetalleCompraVenta;
        int codigo;
        for(int i=0;i<this.modeloArticulo.getRowCount();i++){
            codigo=Integer.parseInt(this.modeloArticulo.getValueAt(i, 0).toString());
            unDetalleCompraVenta=this.miControladoraVisual.buscarDetalleCompraVenta(codigo);
            this.unosDetalleCompraVenta.add(unDetalleCompraVenta);
        }
        try {
            this.miControladoraVisual.generarServicioTecnico(txtDescripcion.getText(), Double.parseDouble(lblTotal.getText()), this.unosDetalleCompraVenta);
            refrescarVentana();
        } catch (Exception ex) {
            Logger.getLogger(GenerarServicioTecnico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmdGenerarServicioActionPerformed

    private void cmdVerServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdVerServiciosActionPerformed
        
    }//GEN-LAST:event_cmdVerServiciosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAgregarArticulo;
    private javax.swing.JButton cmdBuscarArticulo;
    private javax.swing.JButton cmdGenerarServicio;
    private javax.swing.JButton cmdVerServicios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JLabel lblCodigoArticulo;
    public static javax.swing.JLabel lblNombreArticulo;
    public static javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblArticulo;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtPrecioServicio;
    // End of variables declaration//GEN-END:variables

    private void refrescarVentana() {
        this.txtDescripcion.setText(null);
        this.txtCantidad.setText(null);
        this.txtPrecioServicio.setText("0.00");
        GenerarServicioTecnico.lblCodigoArticulo.setText("xxxxxx");
        GenerarServicioTecnico.lblNombreArticulo.setText("Nombre");
        GenerarServicioTecnico.lblPrecio.setText("0.00");
        this.modeloArticulo.setRowCount(0);
    }

    private void cargarTablaDetaller(int codigo) {
        DetalleCompraVenta unDetalleCompraVenta = this.miControladoraVisual.buscarDetalleCompraVenta(codigo);
        modeloArticulo.addRow(new Object[]{unDetalleCompraVenta.getCodigo(), unDetalleCompraVenta.getCantidad(), unDetalleCompraVenta.getUnConsumible(), unDetalleCompraVenta.getSubtotal()});
    }

    private void refrescarVentanaArticulo() {
        this.txtCantidad.setText(null);
        GenerarServicioTecnico.lblCodigoArticulo.setText("xxxxxx");
        GenerarServicioTecnico.lblNombreArticulo.setText("Nombre");
        GenerarServicioTecnico.lblPrecio.setText("0.00");
    }
}
