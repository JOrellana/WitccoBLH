package vistas;

import Instancia.InstanceOf;
import Instancia.InstanceOfConsult;
import Instancia.InstanceOfGeneralidades;
import Instancia.InstanceOfTransport;
import accesoDatos.OperacionesUsuarios;
import Operaciones.OperacionesReportes;
import javax.swing.JOptionPane;

public class SeleccionActividad extends javax.swing.JFrame {
    
    String usu = "w-out";
    OperacionesUsuarios opU = new OperacionesUsuarios();
    OperacionesReportes opr = new OperacionesReportes();
    public SeleccionActividad() {
        initComponents();
//        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jlDonacion = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jlConsultas = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jlRecDomiciliar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiAdmin = new javax.swing.JMenuItem();
        jmiNuevoUsuario = new javax.swing.JMenuItem();
        jmiAdmonUser = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmiAdmonMedico = new javax.swing.JMenuItem();
        jmiAdmMotoristas = new javax.swing.JMenuItem();
        jmiAdmVehiculos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmiActividades = new javax.swing.JMenuItem();
        jmiLaboratorista = new javax.swing.JMenuItem();
        jmiMedico = new javax.swing.JMenuItem();
        jmiMotorista = new javax.swing.JMenuItem();
        jmiProduccion = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmiAcercaDe = new javax.swing.JMenuItem();
        jmiAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seleccionar Actividad - Banco de Leche Humana");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setMinimumSize(new java.awt.Dimension(910, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(910, 400));
        net.java.dev.koalalayout.KoalaLayout koalaLayout1 = new net.java.dev.koalalayout.KoalaLayout();
        koalaLayout1.setGridheight(15);
        koalaLayout1.setGridwidth(15);
        jPanel1.setLayout(koalaLayout1);

        jPanel6.setBackground(new java.awt.Color(0, 74, 138));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccionar Actividad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        net.java.dev.koalalayout.KoalaLayout koalaLayout3 = new net.java.dev.koalalayout.KoalaLayout();
        koalaLayout3.setGridheight(15);
        koalaLayout3.setGridwidth(15);
        jPanel6.setLayout(koalaLayout3);

        jPanel7.setBackground(new java.awt.Color(0, 74, 138));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Donación", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel7.setLayout(new net.java.dev.koalalayout.KoalaLayout());

        jlDonacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlDonacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/madre2.png"))); // NOI18N
        jlDonacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlDonacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlDonacionMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.gridheight = 2;
        jPanel7.add(jlDonacion, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 4;
        jPanel6.add(jPanel7, gridBagConstraints);

        jPanel8.setBackground(new java.awt.Color(0, 74, 138));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Consultas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel8.setLayout(new net.java.dev.koalalayout.KoalaLayout());

        jlConsultas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/doctor-icon_1.png"))); // NOI18N
        jlConsultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlConsultasMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.gridheight = 2;
        jPanel8.add(jlConsultas, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 4;
        jPanel6.add(jPanel8, gridBagConstraints);

        jPanel9.setBackground(new java.awt.Color(0, 74, 138));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Recolección Domiciliar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel9.setLayout(new net.java.dev.koalalayout.KoalaLayout());

        jlRecDomiciliar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlRecDomiciliar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chof.png"))); // NOI18N
        jlRecDomiciliar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlRecDomiciliar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlRecDomiciliarMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        jPanel9.add(jlRecDomiciliar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.gridheight = 5;
        jPanel6.add(jPanel9, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 15;
        jPanel1.add(jPanel6, gridBagConstraints);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/witcco.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 8;
        jPanel1.add(jLabel5, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/logoHosp.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 5;
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/logoBLH.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 6;
        jPanel1.add(jLabel6, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/text0.1.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 3;
        jPanel1.add(jLabel4, gridBagConstraints);

        jScrollPane1.setBorder(null);
        jScrollPane1.setEnabled(false);
        jScrollPane1.setWheelScrollingEnabled(false);

        jEditorPane1.setEditable(false);
        jEditorPane1.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 13));
        jEditorPane1.setText("Desarrollado por estudiantes de la Universidad de El Salvador FMOcc, durante la asignatura \nDiseño de Sistemas - 2012.");
        jScrollPane1.setViewportView(jEditorPane1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.gridheight = 2;
        jPanel1.add(jScrollPane1, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/fondo.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(910, 400));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 15;
        gridBagConstraints.gridheight = 15;
        jPanel1.add(jLabel1, gridBagConstraints);

        jPanel2.add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Archivo");

        jmiSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jmiSalir.setText("Salir");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jmiSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jmiAdmin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jmiAdmin.setText("Administradores y Contraseñas");
        jmiAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAdminActionPerformed(evt);
            }
        });
        jMenu2.add(jmiAdmin);

        jmiNuevoUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jmiNuevoUsuario.setText("Nuevo Usuario");
        jmiNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNuevoUsuarioActionPerformed(evt);
            }
        });
        jMenu2.add(jmiNuevoUsuario);

        jmiAdmonUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        jmiAdmonUser.setText("Administrar Usuarios");
        jmiAdmonUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAdmonUserActionPerformed(evt);
            }
        });
        jMenu2.add(jmiAdmonUser);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Administrar Encargados");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jmiAdmonMedico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        jmiAdmonMedico.setText("Administrar Médicos");
        jmiAdmonMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAdmonMedicoActionPerformed(evt);
            }
        });
        jMenu2.add(jmiAdmonMedico);

        jmiAdmMotoristas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        jmiAdmMotoristas.setText("Administrar Motoristas");
        jmiAdmMotoristas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAdmMotoristasActionPerformed(evt);
            }
        });
        jMenu2.add(jmiAdmMotoristas);

        jmiAdmVehiculos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        jmiAdmVehiculos.setText("Administrar Vehículos");
        jmiAdmVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAdmVehiculosActionPerformed(evt);
            }
        });
        jMenu2.add(jmiAdmVehiculos);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Informes");

        jmiActividades.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jmiActividades.setText("Actividades");
        jmiActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiActividadesActionPerformed(evt);
            }
        });
        jMenu4.add(jmiActividades);

        jmiLaboratorista.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        jmiLaboratorista.setText("Laboratorista");
        jmiLaboratorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiLaboratoristaActionPerformed(evt);
            }
        });
        jMenu4.add(jmiLaboratorista);

        jmiMedico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        jmiMedico.setText("Medico");
        jmiMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMedicoActionPerformed(evt);
            }
        });
        jMenu4.add(jmiMedico);

        jmiMotorista.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK));
        jmiMotorista.setText("Motorista");
        jmiMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMotoristaActionPerformed(evt);
            }
        });
        jMenu4.add(jmiMotorista);

        jmiProduccion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jmiProduccion.setText("Producción");
        jmiProduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProduccionActionPerformed(evt);
            }
        });
        jMenu4.add(jmiProduccion);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Ayuda");

        jmiAcercaDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jmiAcercaDe.setText("Acerca de");
        jmiAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAcercaDeActionPerformed(evt);
            }
        });
        jMenu3.add(jmiAcercaDe);

        jmiAyuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jmiAyuda.setText("Ayuda");
        jMenu3.add(jmiAyuda);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-926)/2, (screenSize.height-606)/2, 926, 606);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAdminActionPerformed
        // TODO add your handling code here:
        new InstanceOf().administrador.setVisible(true);
    }//GEN-LAST:event_jmiAdminActionPerformed
    
    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        // TODO add your handling code here:   
        int msj = JOptionPane.showConfirmDialog(null, "¿En verdad desea Salir?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (msj == 0) {
            usu = opU.usuarioUp();
            opU.setEstado(usu, "down");
            System.exit(0);
        }
    }//GEN-LAST:event_jmiSalirActionPerformed
    
    private void jmiAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAcercaDeActionPerformed
        // TODO add your handling code here:
        new InstanceOfGeneralidades().acercaDe.setVisible(true);
    }//GEN-LAST:event_jmiAcercaDeActionPerformed
    
    private void jmiNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNuevoUsuarioActionPerformed
        // TODO add your handling code here:
        new InstanceOfGeneralidades().usuario.setVisible(true);
    }//GEN-LAST:event_jmiNuevoUsuarioActionPerformed
    
    private void jmiAdmonUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAdmonUserActionPerformed
        // TODO add your handling code here:
        new InstanceOfGeneralidades().admonUser.setVisible(true);
    }//GEN-LAST:event_jmiAdmonUserActionPerformed
    
private void jlDonacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlDonacionMouseClicked
    // TODO add your handling code here:
    new InstanceOf().donante.setVisible(true);
    this.setVisible(false);
}//GEN-LAST:event_jlDonacionMouseClicked
    
private void jlConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlConsultasMouseClicked
    // TODO add your handling code here:
    new ControlPaciente().setVisible(true);
    this.setVisible(false);
}//GEN-LAST:event_jlConsultasMouseClicked
    
private void jlRecDomiciliarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlRecDomiciliarMouseClicked
    // TODO add your handling code here:
    try {
        new InstanceOfTransport().transporte.setVisible(true);
        RecoleccionDomiciliar.jlIndiceOculto.setText("2");
        this.setVisible(false);
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage() + " - " + e.getLocalizedMessage());
    }
}//GEN-LAST:event_jlRecDomiciliarMouseClicked
    
private void jmiAdmonMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAdmonMedicoActionPerformed
    new InstanceOfConsult().Admed.setVisible(true);
    AdministrarMedic.jlIndiceOculto.setText("1");
    AdministrarMedic.jbAgregar.setEnabled(false);
    
}//GEN-LAST:event_jmiAdmonMedicoActionPerformed
    
private void jmiAdmMotoristasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAdmMotoristasActionPerformed
    new InstanceOfGeneralidades().admMotoristas.setVisible(true);
    AdministrarMotoristas.jlIndiceOculto.setText("1");
    AdministrarMotoristas.jbAgregarMotorista.setEnabled(false);
}//GEN-LAST:event_jmiAdmMotoristasActionPerformed
    
    private void jmiAdmVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAdmVehiculosActionPerformed
        // TODO add your handling code here:
        new AdministrarVehiculos().setVisible(true);
        AdministrarVehiculos.jlIndiceOculto.setText("1");
        AdministrarVehiculos.jbAgregar.setEnabled(false);
    }//GEN-LAST:event_jmiAdmVehiculosActionPerformed
    
private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
}//GEN-LAST:event_formWindowClosed
    
private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    usu = opU.usuarioUp();
    opU.setEstado(usu, "down");
}//GEN-LAST:event_formWindowClosing
    
private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
    if (opU.isAdmin()) {
        
    }
}//GEN-LAST:event_jMenu2ActionPerformed
    
private void jmiLaboratoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiLaboratoristaActionPerformed
    // TODO add your handling code here:
    InformeLaboratorista infL = new InformeLaboratorista();
    infL.setVisible(true);
    this.setVisible(false);
}//GEN-LAST:event_jmiLaboratoristaActionPerformed
    
private void jmiProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProduccionActionPerformed
    // TODO add your handling code here:
    InformeProduccion infP = new InformeProduccion();
    infP.setVisible(true);
    this.setVisible(false);
}//GEN-LAST:event_jmiProduccionActionPerformed

    private void jmiActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiActividadesActionPerformed
        // TODO add your handling code here:
        String archivo = System.getProperty("user.dir");
        archivo = archivo + "\\src\\reportes\\banner.png";
        opr.runReporte("Actividades", archivo);
    }//GEN-LAST:event_jmiActividadesActionPerformed

    private void jmiMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMedicoActionPerformed
        // TODO add your handling code here:
        String archivo = System.getProperty("user.dir");
        archivo = archivo + "\\src\\reportes\\banner.png";
        opr.runReporte("ListaMedicos", archivo);
    }//GEN-LAST:event_jmiMedicoActionPerformed

    private void jmiMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMotoristaActionPerformed
        // TODO add your handling code here:
        String archivo = System.getProperty("user.dir");
        archivo = archivo + "\\src\\reportes\\banner.png";
        opr.runReporte("ListarMotoristas", archivo);
    }//GEN-LAST:event_jmiMotoristaActionPerformed

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
 // TODO add your handling code here:
    new AdministrarEncargado().setVisible(true);
    this.setVisible(false);
}//GEN-LAST:event_jMenuItem1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(SeleccionActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new SeleccionActividad().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlConsultas;
    private javax.swing.JLabel jlDonacion;
    private javax.swing.JLabel jlRecDomiciliar;
    private javax.swing.JMenuItem jmiAcercaDe;
    private javax.swing.JMenuItem jmiActividades;
    private javax.swing.JMenuItem jmiAdmMotoristas;
    private javax.swing.JMenuItem jmiAdmVehiculos;
    private javax.swing.JMenuItem jmiAdmin;
    private javax.swing.JMenuItem jmiAdmonMedico;
    private javax.swing.JMenuItem jmiAdmonUser;
    private javax.swing.JMenuItem jmiAyuda;
    private javax.swing.JMenuItem jmiLaboratorista;
    private javax.swing.JMenuItem jmiMedico;
    private javax.swing.JMenuItem jmiMotorista;
    private javax.swing.JMenuItem jmiNuevoUsuario;
    private javax.swing.JMenuItem jmiProduccion;
    private javax.swing.JMenuItem jmiSalir;
    // End of variables declaration//GEN-END:variables
}
