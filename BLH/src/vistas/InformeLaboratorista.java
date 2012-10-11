/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * InformeLaboratorista2.java
 *
 * Created on 09-13-2012, 11:12:28 PM
 */
package vistas;

import Operaciones.OperacionesExcel;
import Operaciones.OperacionesInformes;
import Operaciones.OperacionesReportes;
import accesoDatos.Operaciones;
import Instancia.InstanceOf;
import accesoDatos.OperacionesUsuarios;
import clases.Informe;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jxl.write.WriteException;

/**
 *
 * @author Erick Cruz
 */
public class InformeLaboratorista extends javax.swing.JFrame {

    /** Creates new form InformeLaboratorista2 */
    Operaciones op = new Operaciones();
    OperacionesUsuarios opU = new OperacionesUsuarios();
    OperacionesReportes opr = new OperacionesReportes();
    OperacionesInformes opi = new OperacionesInformes();
    OperacionesExcel opx = new OperacionesExcel();
    String usu;
    public int filaAnterior = 0;
    RutaRecDomiciliar recoleccion = new RutaRecDomiciliar();

    public InformeLaboratorista() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        opi.listarInformeLab(jtInforme);
    }

    public void comoSalir() {
        new InstanceOf().actividad.setVisible(true);
        this.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtInforme = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jbNuevoInforme = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiImprimir = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informe Laboratorista");
        setMinimumSize(new java.awt.Dimension(741, 499));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(142, 180, 227));
        jPanel1.setMaximumSize(new java.awt.Dimension(701, 505));
        jPanel1.setMinimumSize(new java.awt.Dimension(701, 505));
        jPanel1.setPreferredSize(new java.awt.Dimension(701, 505));

        jtInforme.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Muestras", "Presencia N", "Presencia %", "Ausencia N", "Ausencia %"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtInforme.setRowHeight(25);
        jtInforme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtInformeMouseClicked(evt);
            }
        });
        jtInforme.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtInformeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtInformeKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtInforme);

        jPanel2.setBackground(new java.awt.Color(142, 180, 227));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 102))); // NOI18N
        net.java.dev.koalalayout.KoalaLayout koalaLayout1 = new net.java.dev.koalalayout.KoalaLayout();
        koalaLayout1.setGridheight(12);
        koalaLayout1.setGridwidth(10);
        jPanel2.setLayout(koalaLayout1);

        jbNuevoInforme.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbNuevoInforme.setText("Nuevo");
        jbNuevoInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoInformeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 2;
        jPanel2.add(jbNuevoInforme, gridBagConstraints);

        jbModificar.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbModificar.setText("Guardar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 2;
        jPanel2.add(jbModificar, gridBagConstraints);

        jbEliminar.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 2;
        jPanel2.add(jbEliminar, gridBagConstraints);

        jbCancelar.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 2;
        jPanel2.add(jbCancelar, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LAB.jpg"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("2012-03-22");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Ejemplo de fecha:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jMenu1.setText("Archivo");

        jmiImprimir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jmiImprimir.setText("Imprimir");
        jmiImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiImprimirActionPerformed(evt);
            }
        });
        jMenu1.add(jmiImprimir);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Exportar a Excel");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNuevoInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoInformeActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel model = (DefaultTableModel) jtInforme.getModel();
            Object fila[] = {"", "", "", "", "", ""};
            model.addRow(fila);
            this.jbNuevoInforme.setEnabled(false);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jbNuevoInformeActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        // TODO add your handling code here:
        try {
            if (jtInforme.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(rootPane, "¡Seleccione Informe a Almacenar!");
            } else if (jtInforme.getValueAt(jtInforme.getSelectedRow(), 0).equals("") || jtInforme.getValueAt(jtInforme.getSelectedRow(), 1).equals("") || jtInforme.getValueAt(jtInforme.getSelectedRow(), 2).equals("") || jtInforme.getValueAt(jtInforme.getSelectedRow(), 3).equals("") || jtInforme.getValueAt(jtInforme.getSelectedRow(), 4).equals("") || jtInforme.getValueAt(jtInforme.getSelectedRow(), 5).equals("")) {
                JOptionPane.showMessageDialog(rootPane, "¡Por favor, complete datos del Informe!");
            } else {

                Informe inf = new Informe(jtInforme.getValueAt(jtInforme.getSelectedRow(), 0).toString(), Integer.parseInt(jtInforme.getValueAt(jtInforme.getSelectedRow(), 1).toString()), Integer.parseInt(jtInforme.getValueAt(jtInforme.getSelectedRow(), 2).toString()), Double.parseDouble(jtInforme.getValueAt(jtInforme.getSelectedRow(), 3).toString()), Integer.parseInt(jtInforme.getValueAt(jtInforme.getSelectedRow(), 4).toString()), Double.parseDouble(jtInforme.getValueAt(jtInforme.getSelectedRow(), 5).toString()));

                opi.almacenarInforme(inf);
                this.jbNuevoInforme.setEnabled(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error al almacenar: " + e.getMessage());
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
        try {
            if (jtInforme.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(rootPane, "¡Seleccione Informe a Eliminar!");
            } else {
                int msj = JOptionPane.showConfirmDialog(rootPane, "¿En verdad desea eliminar?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if (msj == 0) {
                    if (opU.isAdmin()) {
                        usu = opU.usuarioUp();
                        opU.setEstado(usu, "El. Inf.Lab.Fecha: " + jtInforme.getValueAt(jtInforme.getSelectedRow(), 0).toString());
                        Informe inf = new Informe(jtInforme.getValueAt(jtInforme.getSelectedRow(), 0).toString(), Integer.parseInt(jtInforme.getValueAt(jtInforme.getSelectedRow(), 1).toString()), Integer.parseInt(jtInforme.getValueAt(jtInforme.getSelectedRow(), 2).toString()), Double.parseDouble(jtInforme.getValueAt(jtInforme.getSelectedRow(), 3).toString()), Integer.parseInt(jtInforme.getValueAt(jtInforme.getSelectedRow(), 4).toString()), Double.parseDouble(jtInforme.getValueAt(jtInforme.getSelectedRow(), 5).toString()));
                        opi.eliminarInforme(inf);
                        DefaultTableModel model = (DefaultTableModel) jtInforme.getModel();
                        model.removeRow(jtInforme.getSelectedRow());
                    } else {
                        JOptionPane.showMessageDialog(null, "Lo siento, usted no esta autorizado para realizar esta acción\nsolo un administrador puede hacerlo", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        comoSalir();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        comoSalir();
    }//GEN-LAST:event_formWindowClosed

    private void jmiImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiImprimirActionPerformed
        // TODO add your handling code here:
        String archivo = System.getProperty("user.dir");
        archivo = archivo + "\\src\\reportes\\banner.png";
        opr.runReporte("InfoLab", archivo);
    }//GEN-LAST:event_jmiImprimirActionPerformed

    private void jtInformeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtInformeKeyPressed
        // TODO add your handling code here:
        filaAnterior = jtInforme.getSelectedRow();
    }//GEN-LAST:event_jtInformeKeyPressed

    private void jtInformeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtInformeKeyReleased
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        //System.out.println("FILA: " + filaAnterior);
        if (key == KeyEvent.VK_TAB && !jtInforme.getValueAt(filaAnterior, 0).equals("") && !jtInforme.getValueAt(filaAnterior, 1).equals("") && !jtInforme.getValueAt(filaAnterior, 2).equals("") && !jtInforme.getValueAt(filaAnterior, 3).equals("") && !jtInforme.getValueAt(filaAnterior, 4).equals("") && !jtInforme.getValueAt(filaAnterior, 5).equals("")) {
            Informe inf = new Informe(jtInforme.getValueAt(jtInforme.getSelectedRow(), 0).toString(), Integer.parseInt(jtInforme.getValueAt(jtInforme.getSelectedRow(), 1).toString()), Integer.parseInt(jtInforme.getValueAt(jtInforme.getSelectedRow(), 2).toString()), Double.parseDouble(jtInforme.getValueAt(jtInforme.getSelectedRow(), 3).toString()), Integer.parseInt(jtInforme.getValueAt(jtInforme.getSelectedRow(), 4).toString()), Double.parseDouble(jtInforme.getValueAt(jtInforme.getSelectedRow(), 5).toString()));
            opi.almacenarInforme(inf);
            this.jbNuevoInforme.setEnabled(true);
        }
    }//GEN-LAST:event_jtInformeKeyReleased

    private void jtInformeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtInformeMouseClicked
        // TODO add your handling code here:
        filaAnterior = jtInforme.getSelectedRow();
    }//GEN-LAST:event_jtInformeMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        try {
            opx.exportarExcelLab(opi.obtenerRutaExcel(), jtInforme);
        } catch (IOException ex) {
            Logger.getLogger(ControlPaciente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (WriteException ex) {
            Logger.getLogger(ControlPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(InformeLaboratorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformeLaboratorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformeLaboratorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformeLaboratorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new InformeLaboratorista().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevoInforme;
    private javax.swing.JMenuItem jmiImprimir;
    private javax.swing.JTable jtInforme;
    // End of variables declaration//GEN-END:variables
}
