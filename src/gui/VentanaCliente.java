package gui;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class VentanaCliente extends javax.swing.JFrame {

    public VentanaCliente() {
        initComponents();
        Principal principal = new Principal();
        principal.addLabelImage(logoImage);
        redimensionarIcono(btnAltaCliente, 33, 33);
        redimensionarIcono(btnConsultaCliente, 33, 33);
        redimensionarIcono(btnSalirCliente, 28, 28);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logoImage = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnAltaCliente = new javax.swing.JButton();
        btnConsultaCliente = new javax.swing.JButton();
        btnSalirCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 173, 1));

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Clientes");

        btnAltaCliente.setBackground(new java.awt.Color(255, 173, 1));
        btnAltaCliente.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        btnAltaCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnAltaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar-usuario.png"))); // NOI18N
        btnAltaCliente.setText("Alta");
        btnAltaCliente.setToolTipText("Alta de Cliente.");
        btnAltaCliente.setBorder(null);
        btnAltaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAltaCliente.setIconTextGap(8);
        btnAltaCliente.setPreferredSize(new java.awt.Dimension(597, 512));
        btnAltaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaClienteActionPerformed(evt);
            }
        });

        btnConsultaCliente.setBackground(new java.awt.Color(255, 173, 1));
        btnConsultaCliente.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        btnConsultaCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnConsultaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/lupa.png"))); // NOI18N
        btnConsultaCliente.setText("Consulta");
        btnConsultaCliente.setToolTipText("Consulta, edición y baja.");
        btnConsultaCliente.setBorder(null);
        btnConsultaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnConsultaCliente.setIconTextGap(8);
        btnConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaClienteActionPerformed(evt);
            }
        });

        btnSalirCliente.setBackground(new java.awt.Color(255, 173, 1));
        btnSalirCliente.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        btnSalirCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnSalirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/flecha-izquierda.png"))); // NOI18N
        btnSalirCliente.setText("Volver");
        btnSalirCliente.setToolTipText("Volver al Menú");
        btnSalirCliente.setBorder(null);
        btnSalirCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalirCliente.setIconTextGap(8);
        btnSalirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAltaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(logoImage, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(304, 304, 304))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnAltaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsultaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logoImage, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

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

    private void btnSalirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirClienteActionPerformed
        this.dispose();        
        Principal principal = new Principal();
        principal.btnVolver(principal, btnAltaCliente);
    }//GEN-LAST:event_btnSalirClienteActionPerformed
    
    private void redimensionarIcono(JButton buttonIcon, int WIDTH, int HEIGHT) {
        Icon icono = buttonIcon.getIcon();
        if (icono instanceof ImageIcon) {
            ImageIcon iconoImagen = (ImageIcon) icono;
            Image dimensionarIcono = iconoImagen.getImage().getScaledInstance(WIDTH, HEIGHT, java.awt.Image.SCALE_SMOOTH);
            ImageIcon iconoDimensionado = new ImageIcon(dimensionarIcono);
            buttonIcon.setIcon(iconoDimensionado);
            buttonIcon.setFocusPainted(false);
        }
    }
    
    private void btnConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaClienteActionPerformed
        this.dispose();
        ConsultaCliente consultaC = new ConsultaCliente();
        consultaC.setVisible(true);
        consultaC.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnConsultaClienteActionPerformed

    private void btnAltaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaClienteActionPerformed
        this.dispose();
        AltaCliente altaC = new AltaCliente();
        altaC.setVisible(true);
        altaC.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAltaClienteActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaCliente;
    private javax.swing.JButton btnConsultaCliente;
    private javax.swing.JButton btnSalirCliente;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoImage;
    // End of variables declaration//GEN-END:variables
}
