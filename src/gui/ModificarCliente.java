package gui;

import entidad.Cliente;
import java.util.Locale;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import servicios.ServicioCliente;

public class ModificarCliente extends javax.swing.JFrame {
    
    ServicioCliente sc = new ServicioCliente();
    Cliente cliente = new Cliente();
    

    ModificarCliente(int idCliente) {
        initComponents();
        cargarAutos(idCliente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnModificarCliente = new javax.swing.JButton();
        btnvolverAltaCliente = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtObjetivoCliente = new javax.swing.JTextField();
        txtPesoCliente = new javax.swing.JTextField();
        txtAlturaCliente = new javax.swing.JTextField();
        txtEdadCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtIdCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 173, 1));

        jLabel16.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Modificacion de Clientes");

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\MAR\\Documents\\NetBeansProjects\\DesafioGrupalGymGrafico\\src\\imagenes\\logoGym (2).png")); // NOI18N

        btnModificarCliente.setBackground(new java.awt.Color(0, 0, 0));
        btnModificarCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnModificarCliente.setForeground(new java.awt.Color(255, 173, 1));
        btnModificarCliente.setText("Modificar");
        btnModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarClienteActionPerformed(evt);
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

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("ID:");

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

        txtObjetivoCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtObjetivoCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtObjetivoCliente.setForeground(new java.awt.Color(0, 0, 0));

        txtPesoCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtPesoCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtPesoCliente.setForeground(new java.awt.Color(0, 0, 0));

        txtAlturaCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtAlturaCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtAlturaCliente.setForeground(new java.awt.Color(0, 0, 0));

        txtEdadCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtEdadCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtEdadCliente.setForeground(new java.awt.Color(0, 0, 0));

        txtNombreCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNombreCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });

        txtIdCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtIdCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtIdCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(btnvolverAltaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdCliente)
                            .addComponent(txtNombreCliente)
                            .addComponent(txtEdadCliente)
                            .addComponent(txtAlturaCliente)
                            .addComponent(txtPesoCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtObjetivoCliente))))
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(47, 47, 47))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEdadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAlturaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPesoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtObjetivoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(31, 31, 31)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnvolverAltaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    
    private void btnModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarClienteActionPerformed
        int id = Integer.parseInt(txtIdCliente.getText());
        String nombre = txtNombreCliente.getText();
        int edad = Integer.parseInt(txtEdadCliente.getText());
        double altura = Double.parseDouble(txtAlturaCliente.getText());
        double peso = Double.parseDouble(txtPesoCliente.getText());
        String objetivo = txtObjetivoCliente.getText();
        
        sc.cambiarCliente(id, nombre, edad, altura, peso, objetivo);

        mostrarMensaje("Se modifico el cliente a la base de datos", "Info", "Modificacion exitosa");
        
        ConsultaCliente consulta = new ConsultaCliente();
        consulta.setVisible(true);
        consulta.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_btnModificarClienteActionPerformed

    private void btnvolverAltaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverAltaClienteActionPerformed
        this.dispose();
        
        ConsultaCliente consulta = new ConsultaCliente();
        consulta.setVisible(true);
        consulta.setLocationRelativeTo(null);
                
    }//GEN-LAST:event_btnvolverAltaClienteActionPerformed

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnModificarCliente;
    private javax.swing.JButton btnvolverAltaCliente;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAlturaCliente;
    private javax.swing.JTextField txtEdadCliente;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtObjetivoCliente;
    private javax.swing.JTextField txtPesoCliente;
    // End of variables declaration//GEN-END:variables

    private void cargarAutos(int idCliente) {
       cliente = sc.encontrarCliente(idCliente);
       txtIdCliente.setText(String.valueOf(cliente.getId()));
       txtIdCliente.setEditable(false);
       txtNombreCliente.setText(cliente.getNombre());
       txtEdadCliente.setText(String.valueOf(cliente.getEdad()));
       txtAlturaCliente.setText(String.valueOf(cliente.getAltura()));
       txtPesoCliente.setText(String.valueOf(cliente.getPeso()));
       txtObjetivoCliente.setText(cliente.getObjetivo());
    }
}
