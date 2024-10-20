package gui;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import servicios.ServicioCliente;

public class AltaCliente extends javax.swing.JFrame {

    ServicioCliente sc = new ServicioCliente();

    public AltaCliente() {
        initComponents();

        Principal principal = new Principal();
        principal.addLabelImage(logoImage);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        logoImage = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        txtIdCliente = new javax.swing.JTextField();
        txtEdadCliente = new javax.swing.JTextField();
        txtAlturaCliente = new javax.swing.JTextField();
        txtObjetivoCliente = new javax.swing.JTextField();
        txtPesoCliente = new javax.swing.JTextField();
        btnLimpiarCampoCliente = new javax.swing.JButton();
        btnAgregarCliente = new javax.swing.JButton();
        btnvolverAltaCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel.setBackground(new java.awt.Color(255, 173, 1));

        jLabel16.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Alta Clientes");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombre:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Edad:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Altura:");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Peso:");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Objetivo:");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("ID:");

        txtNombreCliente.setBackground(new java.awt.Color(221, 221, 221));
        txtNombreCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNombreCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });

        txtIdCliente.setBackground(new java.awt.Color(221, 221, 221));
        txtIdCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtIdCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtIdCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClienteActionPerformed(evt);
            }
        });

        txtEdadCliente.setBackground(new java.awt.Color(221, 221, 221));
        txtEdadCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtEdadCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtEdadCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEdadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadClienteActionPerformed(evt);
            }
        });

        txtAlturaCliente.setBackground(new java.awt.Color(221, 221, 221));
        txtAlturaCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtAlturaCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtAlturaCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtObjetivoCliente.setBackground(new java.awt.Color(221, 221, 221));
        txtObjetivoCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtObjetivoCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtObjetivoCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        txtPesoCliente.setBackground(new java.awt.Color(221, 221, 221));
        txtPesoCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtPesoCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtPesoCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnLimpiarCampoCliente.setBackground(new java.awt.Color(0, 0, 0));
        btnLimpiarCampoCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLimpiarCampoCliente.setForeground(new java.awt.Color(255, 173, 1));
        btnLimpiarCampoCliente.setText("Limpiar");
        btnLimpiarCampoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCampoClienteActionPerformed(evt);
            }
        });

        btnAgregarCliente.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregarCliente.setForeground(new java.awt.Color(255, 173, 1));
        btnAgregarCliente.setText("Agregar");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });

        btnvolverAltaCliente.setBackground(new java.awt.Color(0, 0, 0));
        btnvolverAltaCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnvolverAltaCliente.setForeground(new java.awt.Color(255, 173, 1));
        btnvolverAltaCliente.setText("Volver");
        btnvolverAltaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverAltaClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(txtNombreCliente)
                            .addComponent(txtEdadCliente)
                            .addComponent(txtAlturaCliente)
                            .addComponent(txtPesoCliente)
                            .addComponent(txtObjetivoCliente)))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(btnvolverAltaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(btnLimpiarCampoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addComponent(logoImage, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(229, 229, 229))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel16)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEdadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAlturaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPesoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtObjetivoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiarCampoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnvolverAltaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(logoImage, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);

        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdClienteActionPerformed

    private void btnLimpiarCampoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCampoClienteActionPerformed
        txtIdCliente.setText("");
        txtNombreCliente.setText("");
        txtEdadCliente.setText("");
        txtAlturaCliente.setText("");
        txtPesoCliente.setText("");
        txtObjetivoCliente.setText("");
    }//GEN-LAST:event_btnLimpiarCampoClienteActionPerformed

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        String idStr = txtIdCliente.getText();
        String nombre = txtNombreCliente.getText();
        String edadStr = txtEdadCliente.getText();
        String alturaStr = txtAlturaCliente.getText();
        String pesoStr = txtPesoCliente.getText();
        String objetivo = txtObjetivoCliente.getText();

        if (idStr.isEmpty() || nombre.isEmpty() || edadStr.isEmpty() || alturaStr.isEmpty() || pesoStr.isEmpty() || objetivo.isEmpty()) {
            mostrarMensaje("Es necesario completar todos los campos!", "Error", "Formulario Vacío");
        } else {
            int id = Integer.parseInt(idStr);
            int edad = Integer.parseInt(edadStr);
            double altura = Double.parseDouble(alturaStr);
            double peso = Double.parseDouble(pesoStr);
            
            sc.agregarCliente(id, nombre, edad, altura, peso, objetivo);

            txtIdCliente.setText("");
            txtNombreCliente.setText("");
            txtEdadCliente.setText("");
            txtAlturaCliente.setText("");
            txtPesoCliente.setText("");
            txtObjetivoCliente.setText("");
            mostrarMensaje("Se agrego el cliente a la base de datos", "Info", "Alta exitosa");
        }
    }//GEN-LAST:event_btnAgregarClienteActionPerformed


    private void btnvolverAltaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverAltaClienteActionPerformed
        this.dispose();
        VentanaCliente ventanaC = new VentanaCliente();
        ventanaC.setVisible(true);
        ventanaC.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnvolverAltaClienteActionPerformed

    private void txtEdadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnLimpiarCampoCliente;
    private javax.swing.JButton btnvolverAltaCliente;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel logoImage;
    private javax.swing.JTextField txtAlturaCliente;
    private javax.swing.JTextField txtEdadCliente;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtObjetivoCliente;
    private javax.swing.JTextField txtPesoCliente;
    // End of variables declaration//GEN-END:variables
}
