package gui;

public class VentanaRutinas extends javax.swing.JFrame {

    public VentanaRutinas() {
        initComponents();

        Principal principal = new Principal();
        principal.buttonStyles(btnCrearRutina1);
        principal.buttonStyles(btnVerRutinas);
        principal.buttonStyles(btnAtras);
        
        this.setTitle("Creación de Rutinas");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCrearRutina1 = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnVerRutinas = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 173, 1));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 30, 30));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Rutinas");

        btnCrearRutina1.setBackground(new java.awt.Color(0, 0, 0));
        btnCrearRutina1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCrearRutina1.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearRutina1.setText("Crear Rutina");
        btnCrearRutina1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearRutina1ActionPerformed(evt);
            }
        });

        btnAtras.setBackground(new java.awt.Color(0, 0, 0));
        btnAtras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnVerRutinas.setBackground(new java.awt.Color(0, 0, 0));
        btnVerRutinas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVerRutinas.setForeground(new java.awt.Color(255, 255, 255));
        btnVerRutinas.setText("Ver Rutinas");
        btnVerRutinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerRutinasMouseClicked(evt);
            }
        });
        btnVerRutinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerRutinasActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(30, 30, 30));
        jLabel4.setText("© Double Commit 2024 - Todos los derechos reservados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(252, 252, 252))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVerRutinas, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCrearRutina1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)))
                .addComponent(btnCrearRutina1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnVerRutinas, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18))))
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

    private void btnCrearRutina1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearRutina1ActionPerformed
        this.dispose();
        CrearRutina crearRutina = new CrearRutina();
        crearRutina.setVisible(true);
        crearRutina.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCrearRutina1ActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.dispose();
        Principal principal = new Principal();
        principal.btnVolver(principal, btnAtras);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnVerRutinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerRutinasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerRutinasActionPerformed

    private void btnVerRutinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerRutinasMouseClicked
       this.dispose();
       VentanaRutinas verRutina = new VentanaRutinas();
       verRutina.setVisible(true);
       verRutina.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVerRutinasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCrearRutina1;
    private javax.swing.JButton btnVerRutinas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
