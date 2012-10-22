/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AdministrarMotoristas.java
 *
 * Created on 11-jun-2012, 23:45:51
 */
package vistas;

import Instancia.InstanceOf;
import accesoDatos.Operaciones;
import accesoDatos.OperacionesUsuarios;
import Operaciones.OperacionesReportes;
import clases.Motorista;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class AdministrarMotoristas extends javax.swing.JFrame {

    public int filaAnterior = 0;
    /** Creates new form AdministrarMotoristas */
    OperacionesUsuarios opU = new OperacionesUsuarios();
    Operaciones op = new Operaciones();
    OperacionesReportes opr = new OperacionesReportes();
    RutaRecDomiciliar recoleccionDomiciliar = new RutaRecDomiciliar();
    String usu;

    public AdministrarMotoristas() {
        initComponents();
        this.setLocationRelativeTo(null);
        op.listarMotoristas(jtMotoristas);
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
        jtMotoristas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jbEliminar = new javax.swing.JButton();
        jbNuevoMotorista = new javax.swing.JButton();
        jbModificar2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jbCancelar = new javax.swing.JButton();
        jbAgregarMotorista = new javax.swing.JButton();
        jlIndiceOculto = new javax.swing.JLabel();
        jlIndiceOculto1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiImprimir = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrar Motorista");
        setMinimumSize(new java.awt.Dimension(701, 505));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(142, 180, 227));

        jtMotoristas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Luis", "Chavez", "1"},
                {"Josué", "Orellana", "2"},
                {"Erick", "Cruz", "3"}
            },
            new String [] {
                "Nombres", "Apellidos", "Licencia"
            }
        ));
        jtMotoristas.setRowHeight(25);
        jtMotoristas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMotoristasMouseClicked(evt);
            }
        });
        jtMotoristas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtMotoristasKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtMotoristasKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtMotoristas);

        jPanel2.setBackground(new java.awt.Color(142, 180, 227));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 102))); // NOI18N
        net.java.dev.koalalayout.KoalaLayout koalaLayout1 = new net.java.dev.koalalayout.KoalaLayout();
        koalaLayout1.setGridheight(10);
        koalaLayout1.setGridwidth(10);
        jPanel2.setLayout(koalaLayout1);

        jbEliminar.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbEliminar.setText("Eliminar Motorista");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 2;
        jPanel2.add(jbEliminar, gridBagConstraints);

        jbNuevoMotorista.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbNuevoMotorista.setText("Nuevo Motorista");
        jbNuevoMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoMotoristaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 2;
        jPanel2.add(jbNuevoMotorista, gridBagConstraints);

        jbModificar2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbModificar2.setText("Guardar");
        jbModificar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificar2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 2;
        jPanel2.add(jbModificar2, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(142, 180, 227));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        net.java.dev.koalalayout.KoalaLayout koalaLayout2 = new net.java.dev.koalalayout.KoalaLayout();
        koalaLayout2.setGridheight(10);
        koalaLayout2.setGridwidth(15);
        jPanel3.setLayout(koalaLayout2);

        jbCancelar.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 6;
        jPanel3.add(jbCancelar, gridBagConstraints);

        jbAgregarMotorista.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbAgregarMotorista.setText("Agregar");
        jbAgregarMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarMotoristaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 6;
        jPanel3.add(jbAgregarMotorista, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridheight = 3;
        jPanel3.add(jlIndiceOculto, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridheight = 3;
        jPanel3.add(jlIndiceOculto1, gridBagConstraints);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/driver.jpg"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE))
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

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Salir");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
    try {
        if (jtMotoristas.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione motorista a eliminar!");
        } else {
            int msj = JOptionPane.showConfirmDialog(rootPane, "¿En verdad desea eliminar?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (msj == 0) {
                if (opU.isAdmin()) {
                    String D = jtMotoristas.getValueAt(jtMotoristas.getSelectedRow(), 2).toString();
                    usu = opU.usuarioUp();
                    opU.setEstado(usu, "El. Motorista " + D);
                    Motorista motorista = new Motorista(jtMotoristas.getValueAt(jtMotoristas.getSelectedRow(), 0).toString(), jtMotoristas.getValueAt(jtMotoristas.getSelectedRow(), 1).toString(), jtMotoristas.getValueAt(jtMotoristas.getSelectedRow(), 2).toString());
                    op.eliminarMotorista(motorista);
                    DefaultTableModel model = (DefaultTableModel) jtMotoristas.getModel();
                    model.removeRow(jtMotoristas.getSelectedRow());

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
    comoSalir2();
}//GEN-LAST:event_jbCancelarActionPerformed

private void jbAgregarMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarMotoristaActionPerformed
    if (jtMotoristas.getSelectedRow() == -1) {
        JOptionPane.showMessageDialog(rootPane, "¡Debe seleccionar un Motorista!");
    } else {
        try {
            comoSalir();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error: " + e.getMessage());
        }
    }
}//GEN-LAST:event_jbAgregarMotoristaActionPerformed

private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
    comoSalir2();
}//GEN-LAST:event_formWindowClosed
    public void comoSalir() {
        int var = Integer.parseInt(jlIndiceOculto.getText());
        switch (var) {
            case 1:
                this.hide();
                break;
            case 2:
//                new InstanceOfConsult().consulta.setVisible(true);
//                ControlPacientes.jtfMedico.setText(this.jtMedicos.getValueAt(this.jtMedicos.getSelectedRow(), 0).toString());

                RutaRecDomiciliar.motorista = (this.jtMotoristas.getValueAt(jtMotoristas.getSelectedRow(), 2).toString());
                new InstanceOf().rutRecDom.setVisible(true);
                RutaRecDomiciliar.jlIndiceOc.setText(jlIndiceOculto1.getText());

                //                Consult.jtfMedico.setText(this.jtMedicos.getValueAt(this.jtMedicos.getSelectedRow(), 0).toString());
//                RutaRecDomiciliar.jlIndiceOc.setText(jlIndiceOculto1.getText());
                this.hide();
                break;
        }
    }

    public void comoSalir2() {
        int var = Integer.parseInt(jlIndiceOculto.getText());
        switch (var) {
            case 1:
                this.hide();
                break;
            case 2:
                new InstanceOf().rutRecDom.setVisible(true);
//                ControlPacientes.jtfMedico.setText(this.jtMedicos.getValueAt(this.jtMedicos.getSelectedRow(), 0).toString());
//                Consult.jtfMedico.setText(this.jtMedicos.getValueAt(this.jtMedicos.getSelectedRow(), 0).toString());
//                RutaRecDomiciliar.jlIndiceOc.setText(jlIndiceOculto1.getText());
                RutaRecDomiciliar.jlIndiceOc.setText(jlIndiceOculto1.getText());
                this.hide();
                break;
        }
    }
private void jbNuevoMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoMotoristaActionPerformed
    // TODO add your handling code here:
    try {
        DefaultTableModel model = (DefaultTableModel) jtMotoristas.getModel();
        Object fila[] = {"", "", ""};
        model.addRow(fila);
        filaAnterior = jtMotoristas.getSelectedRow();
        this.jbAgregarMotorista.setEnabled(false);
    } catch (Exception e) {
    }
}//GEN-LAST:event_jbNuevoMotoristaActionPerformed

private void jbModificar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificar2ActionPerformed
    // TODO add your handling code here:
    try {
        if (jtMotoristas.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(rootPane, "¡Seleccione Motorista para Almacenar!");
        } else if (jtMotoristas.getValueAt(jtMotoristas.getSelectedRow(), 0).equals("") || jtMotoristas.getValueAt(jtMotoristas.getSelectedRow(), 1).equals("") || jtMotoristas.getValueAt(jtMotoristas.getSelectedRow(), 2).equals("")) {
            JOptionPane.showMessageDialog(rootPane, "¡Por favor, complete datos del Motorista!");
        } else {
            Motorista motorista = new Motorista(jtMotoristas.getValueAt(jtMotoristas.getSelectedRow(), 0).toString(), jtMotoristas.getValueAt(jtMotoristas.getSelectedRow(), 1).toString(), jtMotoristas.getValueAt(jtMotoristas.getSelectedRow(), 2).toString());
            op.almacenarMotorista(motorista);
            this.jbAgregarMotorista.setEnabled(true);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, "Error al almacenar: " + e.getMessage());
    }
}//GEN-LAST:event_jbModificar2ActionPerformed

private void jtMotoristasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMotoristasKeyPressed
    filaAnterior = jtMotoristas.getSelectedRow();
}//GEN-LAST:event_jtMotoristasKeyPressed

private void jtMotoristasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMotoristasKeyReleased
    int key = evt.getKeyChar();
    System.out.println("FILA: " + filaAnterior);
    if (key == KeyEvent.VK_TAB && !jtMotoristas.getValueAt(filaAnterior, 0).equals("") && !jtMotoristas.getValueAt(filaAnterior, 1).equals("") && !jtMotoristas.getValueAt(filaAnterior, 2).equals("")) {
        Motorista motorista = new Motorista(jtMotoristas.getValueAt(filaAnterior, 0).toString(), jtMotoristas.getValueAt(filaAnterior, 1).toString(), jtMotoristas.getValueAt(filaAnterior, 2).toString());
        op.almacenarMotorista(motorista);
        this.jbAgregarMotorista.setEnabled(true);
    }
}//GEN-LAST:event_jtMotoristasKeyReleased

private void jtMotoristasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMotoristasMouseClicked
    filaAnterior = jtMotoristas.getSelectedRow();
}//GEN-LAST:event_jtMotoristasMouseClicked

private void jmiImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiImprimirActionPerformed
    // TODO add your handling code here:
    String archivo = System.getProperty("user.dir");
    archivo = archivo + "\\src\\reportes\\banner.png";
    opr.runReporte("ListarMotoristas", archivo);
}//GEN-LAST:event_jmiImprimirActionPerformed

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
            java.util.logging.Logger.getLogger(AdministrarMotoristas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministrarMotoristas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministrarMotoristas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministrarMotoristas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new AdministrarMotoristas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JButton jbAgregarMotorista;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar2;
    private javax.swing.JButton jbNuevoMotorista;
    public static javax.swing.JLabel jlIndiceOculto;
    public static javax.swing.JLabel jlIndiceOculto1;
    private javax.swing.JMenuItem jmiImprimir;
    private javax.swing.JTable jtMotoristas;
    // End of variables declaration//GEN-END:variables
}
