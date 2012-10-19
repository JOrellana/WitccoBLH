/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * RecoleccionDomiciliar.java
 *
 * Created on 17-abr-2012, 21:49:09
 */
package vistas;

import Instancia.InstanceOf;
import Instancia.InstanceOfConsult;
import Instancia.InstanceOfTransport;
import accesoDatos.Operaciones;
import java.awt.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.freixas.jcalendar.JCalendarCombo;

/**
 *
 * @author Usuario
 */
public class RecoleccionDomiciliar extends javax.swing.JFrame {

    Operaciones op = new Operaciones();

    /** Creates new form RecoleccionDomiciliar */
    public RecoleccionDomiciliar() {
        initComponents();
        op.listarRutas(jtRutas);
    }

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:     
    }

    public void comoSalir() {
        try {
            int var = Integer.parseInt(jlIndiceOculto.getText());
            switch (var) {
                case 1:
                    this.setVisible(false);
                    break;
                case 2:
                    this.setVisible(false);
                    new InstanceOf().actividad.setVisible(true);
                    break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jlIndiceOculto = new javax.swing.JLabel();
        jbAnyadir = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtRutas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jcbSeleccionBuscador = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jbNuevaRuta = new javax.swing.JButton();
        jbModificarRuta = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Recolección Domiciliar - Banco de Leche Humana");
        setMinimumSize(new java.awt.Dimension(783, 357));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(254, 254, 255));
        net.java.dev.koalalayout.KoalaLayout koalaLayout1 = new net.java.dev.koalalayout.KoalaLayout();
        koalaLayout1.setGridheight(30);
        koalaLayout1.setGridwidth(30);
        jPanel1.setLayout(koalaLayout1);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 27;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        jPanel1.add(jlIndiceOculto, gridBagConstraints);

        jbAnyadir.setText("Añadir");
        jbAnyadir.setEnabled(false);
        jbAnyadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnyadirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 22;
        gridBagConstraints.gridy = 27;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        jPanel1.add(jbAnyadir, gridBagConstraints);

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 26;
        gridBagConstraints.gridy = 27;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        jPanel1.add(jbSalir, gridBagConstraints);

        jtRutas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "5-6-12", "Cruz", "N42556", "Chavez", "13", "20", null}
            },
            new String [] {
                "Fecha", "Hora", "Lugar Salida", "Lugar Llegada", "Distancia", "Motorista", "Vehículo", "JVPM"
            }
        ));
        jtRutas.setRowHeight(25);
        jScrollPane1.setViewportView(jtRutas);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 28;
        gridBagConstraints.gridheight = 19;
        jPanel1.add(jScrollPane1, gridBagConstraints);

        jLabel1.setText("Buscar por:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        jPanel1.add(jLabel1, gridBagConstraints);

        jcbSeleccionBuscador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fecha\t", "Motorista", "Vehículo", "Médico", "Km recorridos", "Costo" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        jPanel1.add(jcbSeleccionBuscador, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(85, 142, 213));
        net.java.dev.koalalayout.KoalaLayout koalaLayout2 = new net.java.dev.koalalayout.KoalaLayout();
        koalaLayout2.setGridwidth(30);
        koalaLayout2.setGridheight(8);
        jPanel2.setLayout(koalaLayout2);

        jbNuevaRuta.setFont(new java.awt.Font("Tahoma", 1, 12));
        jbNuevaRuta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/newR.png"))); // NOI18N
        jbNuevaRuta.setText("       Nueva Ruta");
        jbNuevaRuta.setToolTipText("Crea una nueva ruta");
        jbNuevaRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevaRutaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 8;
        jPanel2.add(jbNuevaRuta, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 30;
        gridBagConstraints.gridheight = 3;
        jPanel1.add(jPanel2, gridBagConstraints);

        jbModificarRuta.setText("Modificar");
        jbModificarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarRutaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 27;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        jPanel1.add(jbModificarRuta, gridBagConstraints);

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 27;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        jPanel1.add(jButton2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 2;
        jPanel1.add(jTextField1, gridBagConstraints);

        jButton3.setText("Buscar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 17;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        jPanel1.add(jButton3, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-799)/2, (screenSize.height-509)/2, 799, 509);
    }// </editor-fold>//GEN-END:initComponents

private void jbNuevaRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevaRutaActionPerformed
//    String ind = RecoleccionDomiciliar.jlIndiceOculto.getText();
//    new InstanceOfTransport().ruta.setVisible(true);
    RutaRecDomiciliar rrd = new RutaRecDomiciliar();
    rrd.setVisible(true);
    RutaRecDomiciliar.jlIndiceOc.setText(jlIndiceOculto.getText());
    System.out.println(jlIndiceOculto.getText());
    this.setVisible(false);
}//GEN-LAST:event_jbNuevaRutaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        comoSalir();
    }//GEN-LAST:event_formWindowClosed

private void jbAnyadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnyadirActionPerformed
    System.out.println(jtRutas.getSelectedRow());
    if (jtRutas.getSelectedRow() == -1) {
        JOptionPane.showMessageDialog(this, "Debe seleccionar la ruta a añadir", "Error.", JOptionPane.ERROR_MESSAGE);
    } else {
        System.out.println("No tiene q entrar");
        this.hide();
        NuevaDonacion.jlIdRuta.setText(this.jtRutas.getValueAt(this.jtRutas.getSelectedRow(), 0).toString());
    }


}//GEN-LAST:event_jbAnyadirActionPerformed

private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
    System.out.println(jlIndiceOculto.getText());
    comoSalir();
    jlIndiceOculto.setText("");
}//GEN-LAST:event_jbSalirActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    // TODO add your handling code here:
    if (jtRutas.getSelectedRow() == -1) {
        JOptionPane.showMessageDialog(rootPane, "!Por favor, Seleccione la ruta a eliminar!");
    } else {
        int msj = JOptionPane.showConfirmDialog(rootPane, "¿En verdad desea eliminar?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (msj == 0) {
            DefaultTableModel model = (DefaultTableModel) jtRutas.getModel();
            op.eliminarRuta(Integer.parseInt(jtRutas.getValueAt(jtRutas.getSelectedRow(), 0).toString()));
            model.removeRow(jtRutas.getSelectedRow());
        }
    }
}//GEN-LAST:event_jButton2ActionPerformed

    private void jbModificarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarRutaActionPerformed
        // TODO add your handling code here:
    RutaRecDomiciliar rrd = new RutaRecDomiciliar();
    rrd.setVisible(true);
    RutaRecDomiciliar.jlIndiceOc.setText(jlIndiceOculto.getText());
    System.out.println(jlIndiceOculto.getText());
    op.modificarRuta(Integer.parseInt(jtRutas.getValueAt(jtRutas.getSelectedRow(), 0).toString()), RutaRecDomiciliar.jtTrayectos);
    this.setVisible(false);
        
    }//GEN-LAST:event_jbModificarRutaActionPerformed
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
            java.util.logging.Logger.getLogger(RecoleccionDomiciliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecoleccionDomiciliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecoleccionDomiciliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecoleccionDomiciliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new RecoleccionDomiciliar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JButton jbAnyadir;
    private javax.swing.JButton jbModificarRuta;
    private javax.swing.JButton jbNuevaRuta;
    public static javax.swing.JButton jbSalir;
    private javax.swing.JComboBox jcbSeleccionBuscador;
    public static javax.swing.JLabel jlIndiceOculto;
    private javax.swing.JTable jtRutas;
    // End of variables declaration//GEN-END:variables
}
