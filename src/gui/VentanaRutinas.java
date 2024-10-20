package gui;

public class VentanaRutinas extends javax.swing.JFrame {

    public VentanaRutinas() {
        initComponents();

        Principal principal = new Principal();
        principal.buttonStyles(btnCrearRutina1);
        principal.buttonStyles(btnModificarRutina);
        principal.buttonStyles(btnEliminarRutina);
        principal.buttonStyles(btnVerRutinas);
        principal.buttonStyles(btnAtras);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnModificarRutina = new javax.swing.JButton();
        btnEliminarRutina = new javax.swing.JButton();
        btnCrearRutina1 = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnVerRutinas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 173, 1));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 30, 30));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Rutinas");

        btnModificarRutina.setBackground(new java.awt.Color(0, 0, 0));
        btnModificarRutina.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnModificarRutina.setText("Modificar Rutina");
        btnModificarRutina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarRutinaActionPerformed(evt);
            }
        });

        btnEliminarRutina.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminarRutina.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminarRutina.setText("Eliminar Rutina");
        btnEliminarRutina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRutinaActionPerformed(evt);
            }
        });

        btnCrearRutina1.setBackground(new java.awt.Color(0, 0, 0));
        btnCrearRutina1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCrearRutina1.setText("Crear Rutina");
        btnCrearRutina1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearRutina1ActionPerformed(evt);
            }
        });

        btnAtras.setBackground(new java.awt.Color(0, 0, 0));
        btnAtras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnVerRutinas.setBackground(new java.awt.Color(0, 0, 0));
        btnVerRutinas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVerRutinas.setText("Ver Rutinas");
        btnVerRutinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerRutinasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificarRutina, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCrearRutina1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarRutina, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVerRutinas, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(263, 263, 263))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(btnCrearRutina1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificarRutina, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVerRutinas, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarRutina, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
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

    private void btnModificarRutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarRutinaActionPerformed

    }//GEN-LAST:event_btnModificarRutinaActionPerformed

    private void btnEliminarRutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRutinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarRutinaActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCrearRutina1;
    private javax.swing.JButton btnEliminarRutina;
    private javax.swing.JButton btnModificarRutina;
    private javax.swing.JButton btnVerRutinas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
