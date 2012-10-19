/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Instancia.InstanceOf;
import Instancia.InstanceOfConsult;
import accesoDatos.OperacionesConsulta;
import clases.Consulta;
import java.util.Date;
import javax.swing.JOptionPane;
import org.freixas.jcalendar.*;

public class Consult extends javax.swing.JFrame {

    /** Creates new form Consult */
    static String fechaNac = "";
    Date fecha = null;
    String diagnostico;
    double racionAsignada;
    int JVPM;
    static String carnet = "";
    double peso;
    double estatura;
    String perimetroCefalico;
    String condSalud;
    OperacionesConsulta op = new OperacionesConsulta();

    public Consult() {
        initComponents();
        fecha = jcFechaConsulta.getDate();
        perimetroCefalico = jsPerimetroCefalico.getValue().toString();
        estatura = Double.parseDouble(jsEstatura.getValue().toString());
        peso = Double.parseDouble(jsPeso.getValue().toString());
    }
    
    public void limpiarGui(){
        jtfDiagnostico.setText("");
        jtfMedico.setText("");
        jtfOtraEnfermedad.setText("");
        jtfRacionAsignada.setText("");
        jsEstatura.setValue(0);
        jsPerimetroCefalico.setValue(0);
        jsPeso.setValue(0);
        jrbEDA.setSelected(false);
        jrbIRA.setSelected(false);
        jrbNiñoSano.setSelected(false);
        jrbOtra.setSelected(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        condicionSalud = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtfDiagnostico = new javax.swing.JEditorPane();
        jbCancelar = new javax.swing.JButton();
        jbAceptar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jlFechaNac = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jsPerimetroCefalico = new javax.swing.JSpinner();
        jsPeso = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jsEstatura = new javax.swing.JSpinner();
        jcFechaConsulta = new org.freixas.jcalendar.JCalendarCombo();
        jtfMedico = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jbAgregarMedico = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jlCarnet = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jrbOtra = new javax.swing.JRadioButton();
        jrbNiñoSano = new javax.swing.JRadioButton();
        jrbIRA = new javax.swing.JRadioButton();
        jrbEDA = new javax.swing.JRadioButton();
        jtfOtraEnfermedad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtfRacionAsignada = new javax.swing.JTextField();
        jcbPatologia = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nueva Consulta - Banco de Leche Humana");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(142, 180, 227));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        net.java.dev.koalalayout.KoalaLayout koalaLayout1 = new net.java.dev.koalalayout.KoalaLayout();
        koalaLayout1.setGridheight(10);
        koalaLayout1.setGridwidth(34);
        jPanel2.setLayout(koalaLayout1);

        jLabel10.setText("Notas:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        jPanel2.add(jLabel10, gridBagConstraints);

        jtfDiagnostico.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfDiagnosticoFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(jtfDiagnostico);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 32;
        gridBagConstraints.gridheight = 5;
        jPanel2.add(jScrollPane1, gridBagConstraints);

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 28;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 5;
        jPanel2.add(jbCancelar, gridBagConstraints);

        jbAceptar.setText("Aceptar");
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 22;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 5;
        jPanel2.add(jbAceptar, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(142, 180, 227));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        net.java.dev.koalalayout.KoalaLayout koalaLayout2 = new net.java.dev.koalalayout.KoalaLayout();
        koalaLayout2.setGridheight(34);
        koalaLayout2.setGridwidth(20);
        jPanel3.setLayout(koalaLayout2);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.gridheight = 2;
        jPanel3.add(jlFechaNac, gridBagConstraints);

        jLabel2.setText("Fecha de consulta:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 3;
        jPanel3.add(jLabel2, gridBagConstraints);

        jLabel3.setText("Per. cefálico (cm):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 21;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 3;
        jPanel3.add(jLabel3, gridBagConstraints);

        jLabel4.setText("Fecha de nacimiento:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 2;
        jPanel3.add(jLabel4, gridBagConstraints);

        jsPerimetroCefalico.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsPerimetroCefalicoStateChanged(evt);
            }
        });
        jsPerimetroCefalico.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jsPerimetroCefalicoFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 21;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        jPanel3.add(jsPerimetroCefalico, gridBagConstraints);

        jsPeso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsPesoStateChanged(evt);
            }
        });
        jsPeso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jsPesoFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        jPanel3.add(jsPeso, gridBagConstraints);

        jLabel6.setText("Peso (gr):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 3;
        jPanel3.add(jLabel6, gridBagConstraints);

        jLabel8.setText("Estatura (cm):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 3;
        jPanel3.add(jLabel8, gridBagConstraints);

        jsEstatura.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsEstaturaStateChanged(evt);
            }
        });
        jsEstatura.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jsEstaturaFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        jPanel3.add(jsEstatura, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.gridheight = 3;
        jPanel3.add(jcFechaConsulta, gridBagConstraints);

        jtfMedico.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfMedicoFocusLost(evt);
            }
        });
        jtfMedico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfMedicoKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 29;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.gridheight = 3;
        jPanel3.add(jtfMedico, gridBagConstraints);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Médico:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        jPanel3.add(jLabel12, gridBagConstraints);

        jbAgregarMedico.setText("Agregar");
        jbAgregarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarMedicoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 29;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        jPanel3.add(jbAgregarMedico, gridBagConstraints);

        jLabel13.setText("Carnet: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 3;
        jPanel3.add(jLabel13, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        jPanel3.add(jlCarnet, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(142, 180, 227));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        net.java.dev.koalalayout.KoalaLayout koalaLayout3 = new net.java.dev.koalalayout.KoalaLayout();
        koalaLayout3.setGridheight(34);
        koalaLayout3.setGridwidth(20);
        jPanel4.setLayout(koalaLayout3);

        jLabel9.setText("Condicion de salud:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 3;
        jPanel4.add(jLabel9, gridBagConstraints);

        condicionSalud.add(jrbOtra);
        jrbOtra.setText("Otra");
        jrbOtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbOtraActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 3;
        jPanel4.add(jrbOtra, gridBagConstraints);

        condicionSalud.add(jrbNiñoSano);
        jrbNiñoSano.setText("Niño sano");
        jrbNiñoSano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNiñoSanoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        jPanel4.add(jrbNiñoSano, gridBagConstraints);

        condicionSalud.add(jrbIRA);
        jrbIRA.setText("IRA");
        jrbIRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbIRAActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        jPanel4.add(jrbIRA, gridBagConstraints);

        condicionSalud.add(jrbEDA);
        jrbEDA.setText("EDA");
        jrbEDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEDAActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        jPanel4.add(jrbEDA, gridBagConstraints);

        jtfOtraEnfermedad.setEnabled(false);
        jtfOtraEnfermedad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfOtraEnfermedadFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.gridheight = 3;
        jPanel4.add(jtfOtraEnfermedad, gridBagConstraints);

        jLabel11.setText("Patologia:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        jPanel4.add(jLabel11, gridBagConstraints);

        jtfRacionAsignada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfRacionAsignadaFocusLost(evt);
            }
        });
        jtfRacionAsignada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfRacionAsignadaKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.gridheight = 3;
        jPanel4.add(jtfRacionAsignada, gridBagConstraints);

        jcbPatologia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguna", "Retinopatia severa", "Uropatia", "Apnea", "ECN", "Septis", "Neumonia Nosocomial", "Moniliasis", "Anemia", "Vomitos / Residuos", " " }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.gridheight = 3;
        jPanel4.add(jcbPatologia, gridBagConstraints);

        jLabel14.setText("Ración Asignada: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 3;
        jPanel4.add(jLabel14, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-650)/2, (screenSize.height-628)/2, 650, 628);
    }// </editor-fold>//GEN-END:initComponents

        private void jrbOtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbOtraActionPerformed
            // TODO add your handling code here:
            jtfOtraEnfermedad.setEnabled(true);
    }//GEN-LAST:event_jrbOtraActionPerformed

    private void jrbNiñoSanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNiñoSanoActionPerformed
        // TODO add your handling code here:
        jtfOtraEnfermedad.setEnabled(false);
        jtfOtraEnfermedad.setText("");
        condSalud = "Niño Sano";
    }//GEN-LAST:event_jrbNiñoSanoActionPerformed

    private void jrbIRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbIRAActionPerformed
        // TODO add your handling code here:
        jtfOtraEnfermedad.setEnabled(false);
        jtfOtraEnfermedad.setText("");
        condSalud = "IRA";
    }//GEN-LAST:event_jrbIRAActionPerformed

    private void jrbEDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEDAActionPerformed
        // TODO add your handling code here:
        jtfOtraEnfermedad.setEnabled(false);
        jtfOtraEnfermedad.setText("");
        condSalud = "EDA";
    }//GEN-LAST:event_jrbEDAActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:  
        ControlPaciente.jbNuevaConsulta.setEnabled(true);
    }//GEN-LAST:event_formWindowClosed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        limpiarGui();
      
    }//GEN-LAST:event_jbCancelarActionPerformed

private void jbAgregarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarMedicoActionPerformed
    AdministrarMedic.carnet = jlCarnet.getText();
    AdministrarMedic.fechaNac = jlFechaNac.getText();
    AdministrarMedic.peso = Double.parseDouble(String.valueOf(jsPeso.getValue()));
    AdministrarMedic.estatura = Double.parseDouble(String.valueOf(jsEstatura.getValue()));
    AdministrarMedic.pCefalico = Double.parseDouble(String.valueOf(jsPerimetroCefalico.getValue()));
    AdministrarMedic.notas = jtfDiagnostico.getText();
    AdministrarMedic.racion = jtfRacionAsignada.getText();
    new AdministrarMedic().setVisible(true);
    AdministrarMedic.jlIndiceOculto.setText("2");
    this.setVisible(false);

}//GEN-LAST:event_jbAgregarMedicoActionPerformed

    private void jtfRacionAsignadaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfRacionAsignadaKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_jtfRacionAsignadaKeyTyped

    private void jsPesoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsPesoStateChanged
        // TODO add your handling code here:
        peso = Double.parseDouble(jsPeso.getValue().toString());
    }//GEN-LAST:event_jsPesoStateChanged

    private void jsEstaturaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsEstaturaStateChanged
        // TODO add your handling code here:
        estatura = Double.parseDouble(jsEstatura.getValue().toString());
    }//GEN-LAST:event_jsEstaturaStateChanged

    private void jsPerimetroCefalicoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsPerimetroCefalicoStateChanged
        // TODO add your handling code here:
        perimetroCefalico = jsPerimetroCefalico.getValue().toString();
    }//GEN-LAST:event_jsPerimetroCefalicoStateChanged

    private void jtfMedicoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfMedicoFocusLost
        // TODO add your handling code here:
        JVPM = Integer.parseInt(jtfMedico.getText());
    }//GEN-LAST:event_jtfMedicoFocusLost

    private void jtfMedicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfMedicoKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfMedicoKeyTyped

    private void jtfOtraEnfermedadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfOtraEnfermedadFocusLost
        // TODO add your handling code here:
        condSalud = jtfOtraEnfermedad.getText();
    }//GEN-LAST:event_jtfOtraEnfermedadFocusLost

    private void jtfRacionAsignadaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfRacionAsignadaFocusLost
        // TODO add your handling code here:
        try {
            racionAsignada = Double.parseDouble(jtfRacionAsignada.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "¡Formato incorrecto! \n" + e.getMessage());
        }
    }//GEN-LAST:event_jtfRacionAsignadaFocusLost

    private void jtfDiagnosticoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfDiagnosticoFocusLost
        // TODO add your handling code here:
        diagnostico = jtfDiagnostico.getText();
    }//GEN-LAST:event_jtfDiagnosticoFocusLost

    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed
        // TODO add your handling code here:
         try {
            if (jtfMedico.getText().equals("") || jtfRacionAsignada.equals("")) {
                JOptionPane.showMessageDialog(rootPane, "¡Por favor, Complete los campos!");
            } else {

                JVPM = Integer.parseInt(jtfMedico.getText());
                diagnostico = jtfDiagnostico.getText();
                racionAsignada = Double.parseDouble(jtfRacionAsignada.getText());

                condSalud = jcbPatologia.getSelectedItem().toString();
                Consulta consulta = new Consulta(fecha, jlCarnet.getText(), peso, estatura, perimetroCefalico, JVPM, condSalud, racionAsignada, diagnostico);
                op.almacenarConsulta(consulta);
                int dato = Integer.parseInt(ControlPaciente.jlNumeroConsultas.getText());
                dato = dato +1;
                ControlPaciente.jlNumeroConsultas.setText(""+dato);
            }
            
            op.listarConsulta(ControlPaciente.jtConsultas, jlCarnet.getText());
            this.setVisible(false);
            ControlPaciente.jbNuevaConsulta.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jbAceptarActionPerformed

    private void jsPesoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jsPesoFocusLost
        // TODO add your handling code here:
        peso = Double.parseDouble(jsPeso.getValue().toString());
    }//GEN-LAST:event_jsPesoFocusLost

    private void jsEstaturaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jsEstaturaFocusLost
        // TODO add your handling code here:
         estatura = Double.parseDouble(jsEstatura.getValue().toString());
    }//GEN-LAST:event_jsEstaturaFocusLost

    private void jsPerimetroCefalicoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jsPerimetroCefalicoFocusLost
        // TODO add your handling code here:
         perimetroCefalico = jsPerimetroCefalico.getValue().toString();
    }//GEN-LAST:event_jsPerimetroCefalicoFocusLost

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
            java.util.logging.Logger.getLogger(Consult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Consult().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup condicionSalud;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbAgregarMedico;
    private javax.swing.JButton jbCancelar;
    private org.freixas.jcalendar.JCalendarCombo jcFechaConsulta;
    private javax.swing.JComboBox jcbPatologia;
    public static javax.swing.JLabel jlCarnet;
    public static javax.swing.JLabel jlFechaNac;
    private javax.swing.JRadioButton jrbEDA;
    private javax.swing.JRadioButton jrbIRA;
    private javax.swing.JRadioButton jrbNiñoSano;
    private javax.swing.JRadioButton jrbOtra;
    public static javax.swing.JSpinner jsEstatura;
    public static javax.swing.JSpinner jsPerimetroCefalico;
    public static javax.swing.JSpinner jsPeso;
    public static javax.swing.JEditorPane jtfDiagnostico;
    public static javax.swing.JTextField jtfMedico;
    private javax.swing.JTextField jtfOtraEnfermedad;
    public static javax.swing.JTextField jtfRacionAsignada;
    // End of variables declaration//GEN-END:variables
}
