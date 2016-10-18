/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;
import Logica.Empresa;
/**
 *
 * @author Facu
 */
public class MenuPrincipal extends javax.swing.JFrame {
    
    //Controladora Logica
    private Empresa unaEmpresa = new Empresa();
    
    //Relaciones
    private AgregarOrdenDeTrabajo unAgregarOrdenDeTrabajo = new AgregarOrdenDeTrabajo();
    private AgregarServicioOrden unAgregarServicioOrden = new AgregarServicioOrden();
    private AltaActividadAdministrativa unAltaActividadAdministrativa = new AltaActividadAdministrativa();
    private AltaActividadProyecto unAltaActividadProyecto = new AltaActividadProyecto();
    private AltaActividadTecnica unAltaActividadTecnica = new AltaActividadTecnica();
    private AltaArticulo unAltaArticulo = new AltaArticulo();
    private AltaCliente unAltaCliente = new AltaCliente();
    private AltaEmpleado unAltaEmpleado = new AltaEmpleado();
    private AltaEquipo unAltaEquipo = new AltaEquipo();
    private AltaProveedor unAltaProveedor = new AltaProveedor();
    private AltaProyecto unAltaProyecto = new AltaProyecto();
    private AltaTecnologia unAltaTecnologia = new AltaTecnologia();
    private AltaTipoTecnologia unAltaTipoTecnologia = new AltaTipoTecnologia();
    private AltaTipoCompra unAltaTipoCompra = new AltaTipoCompra();
    private AltaTipoEstado unAltaTipoEstado = new AltaTipoEstado();
    private AltaTipoLiquidacion unAltaTipoLiquidacion = new AltaTipoLiquidacion();
    private AltaTipoVenta unAltaTipoVenta = new AltaTipoVenta();
    private AsignarEmpleadoProyecto unAsignarEmpleadoProyecto = new AsignarEmpleadoProyecto();
    private AsignarEmpleadoServicio unAsignarEmpleadoServicio = new AsignarEmpleadoServicio();
    private GenerarCompra unGenerarCompra = new GenerarCompra();
    private GenerarIngresoEquipo unGenerarIngresoEquipo = new GenerarIngresoEquipo();
    private GenerarSalidaEquipo unGenerarSalidaEquipo = new GenerarSalidaEquipo();
    private GenerarOrden unGenerarOrden = new GenerarOrden();
    private GenerarLiquidacion unGenerarLiquidacion = new GenerarLiquidacion();
    private VentaArticulo unVentaArticulo = new VentaArticulo();
    private VentaServicio unVentaServicio = new VentaServicio();
    
    
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mitActividadAdministrativa = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        jMenu1.setText("File");

        mitActividadAdministrativa.setText("Actividad Administrativa");
        mitActividadAdministrativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitActividadAdministrativaActionPerformed(evt);
            }
        });
        jMenu1.add(mitActividadAdministrativa);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jInternalFrame1.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 249, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mitActividadAdministrativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitActividadAdministrativaActionPerformed
           // TODO add your handling code here:
    }//GEN-LAST:event_mitActividadAdministrativaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mitActividadAdministrativa;
    // End of variables declaration//GEN-END:variables
}
