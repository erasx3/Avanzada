/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

import java.awt.Dimension;



/**
 *
 * @author Facu
 */
public class MenuPrincipal extends javax.swing.JFrame {

    //Controladora Visual
    private ControladoraVisual miControladoraVisual;

   
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal(ControladoraVisual miControladoraVisual) 
    {
        this.miControladoraVisual = miControladoraVisual;
        initComponents();
        Dimension dimension = super.getToolkit().getScreenSize();
        super.setSize(dimension);
        this.jInternalFrame1.setSize(dimension);
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
        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuCompra = new javax.swing.JMenuItem();
        mnuLiquidacion = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuVentaServicio = new javax.swing.JMenuItem();
        mnuVentaArticulo = new javax.swing.JMenuItem();
        mnuProyecto = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        mnuActAdministrativa = new javax.swing.JMenuItem();
        mnuActProyecto = new javax.swing.JMenuItem();
        mnuActTecnica = new javax.swing.JMenuItem();
        mnuArticulo = new javax.swing.JMenuItem();
        mnuCliente = new javax.swing.JMenuItem();
        mnuEmpleado = new javax.swing.JMenuItem();
        mnuEquipo = new javax.swing.JMenuItem();
        mnuProveedor = new javax.swing.JMenuItem();
        manuTecnologia = new javax.swing.JMenuItem();
        mnuTipoTecnologia = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mnuTipoCompra = new javax.swing.JMenuItem();
        mnuTipoVenta = new javax.swing.JMenuItem();
        mnuTipoLiquidacion = new javax.swing.JMenuItem();
        mnuTipoEstado = new javax.swing.JMenuItem();
        mnuOrdendeTrabajo = new javax.swing.JMenuItem();
        mnuTurno = new javax.swing.JMenuItem();
        mnuConcepto = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        mnuServicioTecnico = new javax.swing.JMenuItem();
        mnuServicioTercero = new javax.swing.JMenuItem();
        mnuServicioProyecto = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        mnuBalanceVentas = new javax.swing.JMenuItem();
        mnuBalanceCompras = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setTitle("GuaraSoft S.R.L.");
        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 787, Short.MAX_VALUE)
        );

        jMenu1.setText("Archivo");

        mnuCompra.setText("Compra");
        mnuCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCompraActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCompra);

        mnuLiquidacion.setText("Liquidacion");
        mnuLiquidacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLiquidacionActionPerformed(evt);
            }
        });
        jMenu1.add(mnuLiquidacion);

        jMenu2.setText("Venta");

        mnuVentaServicio.setText("Facturar Servicio");
        mnuVentaServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVentaServicioActionPerformed(evt);
            }
        });
        jMenu2.add(mnuVentaServicio);

        mnuVentaArticulo.setText("Facturar Articulos");
        mnuVentaArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVentaArticuloActionPerformed(evt);
            }
        });
        jMenu2.add(mnuVentaArticulo);

        jMenu1.add(jMenu2);

        mnuProyecto.setText("Proyecto");
        mnuProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProyectoActionPerformed(evt);
            }
        });
        jMenu1.add(mnuProyecto);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("ABM");

        jMenu4.setText("Actividades");

        mnuActAdministrativa.setText("Administrativa");
        mnuActAdministrativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuActAdministrativaActionPerformed(evt);
            }
        });
        jMenu4.add(mnuActAdministrativa);

        mnuActProyecto.setText("Proyecto");
        mnuActProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuActProyectoActionPerformed(evt);
            }
        });
        jMenu4.add(mnuActProyecto);

        mnuActTecnica.setText("Tecnica");
        mnuActTecnica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuActTecnicaActionPerformed(evt);
            }
        });
        jMenu4.add(mnuActTecnica);

        jMenu3.add(jMenu4);

        mnuArticulo.setText("Articulo");
        mnuArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArticuloActionPerformed(evt);
            }
        });
        jMenu3.add(mnuArticulo);

        mnuCliente.setText("Cliente");
        mnuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuClienteActionPerformed(evt);
            }
        });
        jMenu3.add(mnuCliente);

        mnuEmpleado.setText("Empleado");
        mnuEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEmpleadoActionPerformed(evt);
            }
        });
        jMenu3.add(mnuEmpleado);

        mnuEquipo.setText("Equipo");
        mnuEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEquipoActionPerformed(evt);
            }
        });
        jMenu3.add(mnuEquipo);

        mnuProveedor.setText("Proveedor");
        mnuProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProveedorActionPerformed(evt);
            }
        });
        jMenu3.add(mnuProveedor);

        manuTecnologia.setText("Tecnologia");
        manuTecnologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manuTecnologiaActionPerformed(evt);
            }
        });
        jMenu3.add(manuTecnologia);

        mnuTipoTecnologia.setText("Tipo de Tecnologia");
        mnuTipoTecnologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTipoTecnologiaActionPerformed(evt);
            }
        });
        jMenu3.add(mnuTipoTecnologia);

        jMenu5.setText("Tipo de Comprobante");

        mnuTipoCompra.setText("Comprobante de Compra");
        mnuTipoCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTipoCompraActionPerformed(evt);
            }
        });
        jMenu5.add(mnuTipoCompra);

        mnuTipoVenta.setText("Comprobante de Venta");
        mnuTipoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTipoVentaActionPerformed(evt);
            }
        });
        jMenu5.add(mnuTipoVenta);

        mnuTipoLiquidacion.setText("Comprobante de Liquidacion");
        mnuTipoLiquidacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTipoLiquidacionActionPerformed(evt);
            }
        });
        jMenu5.add(mnuTipoLiquidacion);

        jMenu3.add(jMenu5);

        mnuTipoEstado.setText("Tipo de Estado");
        mnuTipoEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTipoEstadoActionPerformed(evt);
            }
        });
        jMenu3.add(mnuTipoEstado);

        mnuOrdendeTrabajo.setText("Orden de Trabajo");
        mnuOrdendeTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOrdendeTrabajoActionPerformed(evt);
            }
        });
        jMenu3.add(mnuOrdendeTrabajo);

        mnuTurno.setText("Turno");
        mnuTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTurnoActionPerformed(evt);
            }
        });
        jMenu3.add(mnuTurno);

        mnuConcepto.setText("Concepto");
        mnuConcepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConceptoActionPerformed(evt);
            }
        });
        jMenu3.add(mnuConcepto);

        jMenu7.setText("Servicio");

        mnuServicioTecnico.setText("S. Tecnico");
        mnuServicioTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuServicioTecnicoActionPerformed(evt);
            }
        });
        jMenu7.add(mnuServicioTecnico);

        mnuServicioTercero.setText("S. Tercero");
        mnuServicioTercero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuServicioTerceroActionPerformed(evt);
            }
        });
        jMenu7.add(mnuServicioTercero);

        mnuServicioProyecto.setText("Proyecto");
        mnuServicioProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuServicioProyectoActionPerformed(evt);
            }
        });
        jMenu7.add(mnuServicioProyecto);

        jMenu3.add(jMenu7);

        jMenuBar1.add(jMenu3);

        jMenu6.setText("Estadisticas");

        mnuBalanceVentas.setText("Balance Ventas");
        mnuBalanceVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBalanceVentasActionPerformed(evt);
            }
        });
        jMenu6.add(mnuBalanceVentas);

        mnuBalanceCompras.setText("Balance Compras");
        mnuBalanceCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBalanceComprasActionPerformed(evt);
            }
        });
        jMenu6.add(mnuBalanceCompras);

        jMenuBar1.add(jMenu6);

        jInternalFrame1.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(Escritorio)
                .addGap(0, 0, 0))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1)
                .addGap(0, 0, 0))
        );

        try {
            jInternalFrame1.setMaximum(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCompraActionPerformed
        GenerarCompraInter GenerarCompra = new GenerarCompraInter(this.miControladoraVisual);
        this.Escritorio.add(GenerarCompra);
        GenerarCompra.show();
    }//GEN-LAST:event_mnuCompraActionPerformed

    private void mnuActAdministrativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuActAdministrativaActionPerformed
        AltaActividadAdministrativaInter AltaActAdmin = new AltaActividadAdministrativaInter(this.miControladoraVisual);
        this.Escritorio.add(AltaActAdmin);
        AltaActAdmin.show();
    }//GEN-LAST:event_mnuActAdministrativaActionPerformed

    private void mnuActProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuActProyectoActionPerformed
        AltaActividadProyectoInter AltaActProyec = new AltaActividadProyectoInter(this.miControladoraVisual);
        this.Escritorio.add(AltaActProyec);
        AltaActProyec.show();
    }//GEN-LAST:event_mnuActProyectoActionPerformed

    private void mnuActTecnicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuActTecnicaActionPerformed
        AltaActividadTecnicaInter AltaActTec = new AltaActividadTecnicaInter(this.miControladoraVisual);
        this.Escritorio.add(AltaActTec);
        AltaActTec.show();
    }//GEN-LAST:event_mnuActTecnicaActionPerformed

    private void mnuArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArticuloActionPerformed
        AltaArticuloInter AltaArticulo = new AltaArticuloInter(this.miControladoraVisual);
        this.Escritorio.add(AltaArticulo);
        AltaArticulo.show();
    }//GEN-LAST:event_mnuArticuloActionPerformed

    private void mnuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuClienteActionPerformed
        AltaClienteInter AltaCliente = new AltaClienteInter(this.miControladoraVisual);
        this.Escritorio.add(AltaCliente);
        AltaCliente.show();
    }//GEN-LAST:event_mnuClienteActionPerformed

    private void mnuEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEmpleadoActionPerformed
        AltaEmpleadoInter AltaEmp = new AltaEmpleadoInter(this.miControladoraVisual);
        this.Escritorio.add(AltaEmp);
        AltaEmp.show();
    }//GEN-LAST:event_mnuEmpleadoActionPerformed

    private void mnuEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEquipoActionPerformed
        AltaEquipoInter AltaEquipo = new AltaEquipoInter(this.miControladoraVisual);
        this.Escritorio.add(AltaEquipo);
        AltaEquipo.show();
    }//GEN-LAST:event_mnuEquipoActionPerformed

    private void mnuProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProveedorActionPerformed
        AltaProveedorInter AltaProveedor = new AltaProveedorInter(this.miControladoraVisual);
        this.Escritorio.add(AltaProveedor);
        AltaProveedor.show();
    }//GEN-LAST:event_mnuProveedorActionPerformed

    private void manuTecnologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manuTecnologiaActionPerformed
        AltaTecnologiaInter AltaTecnologia = new AltaTecnologiaInter(this.miControladoraVisual);
        this.Escritorio.add(AltaTecnologia);
        AltaTecnologia.show();
    }//GEN-LAST:event_manuTecnologiaActionPerformed

    private void mnuTipoTecnologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTipoTecnologiaActionPerformed
        AltaTipoTecnologiaInter AltaTipoTecnologia = new AltaTipoTecnologiaInter(this.miControladoraVisual);
        this.Escritorio.add(AltaTipoTecnologia);
        AltaTipoTecnologia.show();
    }//GEN-LAST:event_mnuTipoTecnologiaActionPerformed

    private void mnuTipoCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTipoCompraActionPerformed
        AltaTipoCompraInter AltaTipoCompra = new AltaTipoCompraInter(this.miControladoraVisual);
        this.Escritorio.add(AltaTipoCompra);
        AltaTipoCompra.show();
    }//GEN-LAST:event_mnuTipoCompraActionPerformed

    private void mnuTipoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTipoVentaActionPerformed
        AltaTipoVentaInter AltaTipoVenta = new AltaTipoVentaInter(this.miControladoraVisual);
        this.Escritorio.add(AltaTipoVenta);
        AltaTipoVenta.show();
    }//GEN-LAST:event_mnuTipoVentaActionPerformed

    private void mnuTipoLiquidacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTipoLiquidacionActionPerformed
        AltaTipoLiquidacionInter AltaTipoLiquidacion = new AltaTipoLiquidacionInter(this.miControladoraVisual);
        this.Escritorio.add(AltaTipoLiquidacion);
        AltaTipoLiquidacion.show();
    }//GEN-LAST:event_mnuTipoLiquidacionActionPerformed

    private void mnuTipoEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTipoEstadoActionPerformed
        AltaTipoEstadoInter AltaTipoEstado = new AltaTipoEstadoInter(this.miControladoraVisual);
        this.Escritorio.add(AltaTipoEstado);
        AltaTipoEstado.show();
    }//GEN-LAST:event_mnuTipoEstadoActionPerformed

    private void mnuVentaServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVentaServicioActionPerformed
        GenerarVentaServicioInter VentaServicio = new GenerarVentaServicioInter(this.miControladoraVisual);
        this.Escritorio.add(VentaServicio);
        VentaServicio.show();
    }//GEN-LAST:event_mnuVentaServicioActionPerformed

    private void mnuVentaArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVentaArticuloActionPerformed
        GenerarVentaArticuloInter VentaArticulo = new GenerarVentaArticuloInter(this.miControladoraVisual);
        this.Escritorio.add(VentaArticulo);
        VentaArticulo.show();
    }//GEN-LAST:event_mnuVentaArticuloActionPerformed

    private void mnuLiquidacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLiquidacionActionPerformed
        GenerarLiquidacionInter Liquidacion = new GenerarLiquidacionInter(this.miControladoraVisual);
        this.Escritorio.add(Liquidacion);
        Liquidacion.show();
    }//GEN-LAST:event_mnuLiquidacionActionPerformed

    private void mnuBalanceVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBalanceVentasActionPerformed
        EstadVentasInter EstadVenta = new EstadVentasInter(this.miControladoraVisual);
        this.Escritorio.add(EstadVenta);
        EstadVenta.show();
    }//GEN-LAST:event_mnuBalanceVentasActionPerformed

    private void mnuBalanceComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBalanceComprasActionPerformed
        EstadComprasInter EstadCompra = new EstadComprasInter(this.miControladoraVisual);
        this.Escritorio.add(EstadCompra);
        EstadCompra.show();
    }//GEN-LAST:event_mnuBalanceComprasActionPerformed

    private void mnuOrdendeTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOrdendeTrabajoActionPerformed
        GenerarOrdenInter Orden = new GenerarOrdenInter(this.miControladoraVisual);
        this.Escritorio.add(Orden);
        Orden.show();
    }//GEN-LAST:event_mnuOrdendeTrabajoActionPerformed

    private void mnuTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTurnoActionPerformed
        GenerarTurnoInter Turno = new GenerarTurnoInter(this.miControladoraVisual);
        this.Escritorio.add(Turno);
        Turno.show();
    }//GEN-LAST:event_mnuTurnoActionPerformed

    private void mnuConceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConceptoActionPerformed
        AltaConceptoInter Concepto=new AltaConceptoInter(this.miControladoraVisual);
        this.Escritorio.add(Concepto);
        Concepto.show();
    }//GEN-LAST:event_mnuConceptoActionPerformed

    private void mnuProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProyectoActionPerformed
        AltaProyectoInter unProyecto = new AltaProyectoInter(miControladoraVisual);
        this.Escritorio.add(unProyecto);
        unProyecto.show();
    }//GEN-LAST:event_mnuProyectoActionPerformed

    private void mnuServicioTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuServicioTecnicoActionPerformed
        GenerarServicioTecnico unServicioTecnico = new GenerarServicioTecnico(miControladoraVisual);
        this.Escritorio.add(unServicioTecnico);
        unServicioTecnico.show();
    }//GEN-LAST:event_mnuServicioTecnicoActionPerformed

    private void mnuServicioTerceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuServicioTerceroActionPerformed
        GenerarServicioTercero unServicioTercero=new GenerarServicioTercero(miControladoraVisual);
        this.Escritorio.add(unServicioTercero);
        unServicioTercero.show();
    }//GEN-LAST:event_mnuServicioTerceroActionPerformed

    private void mnuServicioProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuServicioProyectoActionPerformed
        AltaProyectoInter unAltaProyectoInter = new AltaProyectoInter(miControladoraVisual);
        this.Escritorio.add(unAltaProyectoInter);
        unAltaProyectoInter.show();
    }//GEN-LAST:event_mnuServicioProyectoActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane Escritorio;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem manuTecnologia;
    private javax.swing.JMenuItem mnuActAdministrativa;
    private javax.swing.JMenuItem mnuActProyecto;
    private javax.swing.JMenuItem mnuActTecnica;
    private javax.swing.JMenuItem mnuArticulo;
    private javax.swing.JMenuItem mnuBalanceCompras;
    private javax.swing.JMenuItem mnuBalanceVentas;
    private javax.swing.JMenuItem mnuCliente;
    private javax.swing.JMenuItem mnuCompra;
    private javax.swing.JMenuItem mnuConcepto;
    private javax.swing.JMenuItem mnuEmpleado;
    private javax.swing.JMenuItem mnuEquipo;
    private javax.swing.JMenuItem mnuLiquidacion;
    private javax.swing.JMenuItem mnuOrdendeTrabajo;
    private javax.swing.JMenuItem mnuProveedor;
    private javax.swing.JMenuItem mnuProyecto;
    private javax.swing.JMenuItem mnuServicioProyecto;
    private javax.swing.JMenuItem mnuServicioTecnico;
    private javax.swing.JMenuItem mnuServicioTercero;
    private javax.swing.JMenuItem mnuTipoCompra;
    private javax.swing.JMenuItem mnuTipoEstado;
    private javax.swing.JMenuItem mnuTipoLiquidacion;
    private javax.swing.JMenuItem mnuTipoTecnologia;
    private javax.swing.JMenuItem mnuTipoVenta;
    private javax.swing.JMenuItem mnuTurno;
    private javax.swing.JMenuItem mnuVentaArticulo;
    private javax.swing.JMenuItem mnuVentaServicio;
    // End of variables declaration//GEN-END:variables

    
}
