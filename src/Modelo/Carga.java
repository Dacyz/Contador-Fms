package Modelo;

public class Carga extends javax.swing.JFrame {

    public Carga() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtnExit = new javax.swing.JButton();
        jbtnBack = new javax.swing.JButton();
        jbtnVotar = new javax.swing.JButton();
        btnEntrenar = new javax.swing.JButton();
        jTextPane1 = new javax.swing.JTextPane();
        Image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jbtnExit.setBackground(new java.awt.Color(255, 204, 51));
        jbtnExit.setText("x");
        jbtnExit.setToolTipText("Cerrar");
        jbtnExit.setBorder(null);
        jbtnExit.setContentAreaFilled(false);
        jbtnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnExit.setOpaque(true);
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnExit);
        jbtnExit.setBounds(310, 10, 40, 20);

        jbtnBack.setBackground(new java.awt.Color(102, 255, 51));
        jbtnBack.setText("<");
        jbtnBack.setToolTipText("Inicio");
        jbtnBack.setBorder(null);
        jbtnBack.setContentAreaFilled(false);
        jbtnBack.setOpaque(true);
        jbtnBack.setPreferredSize(new java.awt.Dimension(7, 15));
        jbtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnBack);
        jbtnBack.setBounds(260, 10, 40, 20);

        jbtnVotar.setBackground(new java.awt.Color(102, 255, 51));
        jbtnVotar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnVotar.setText("VOTAR");
        jbtnVotar.setToolTipText("Ir a votaciones");
        jbtnVotar.setBorder(null);
        jbtnVotar.setContentAreaFilled(false);
        jbtnVotar.setOpaque(true);
        jbtnVotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVotarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnVotar);
        jbtnVotar.setBounds(190, 430, 150, 30);

        btnEntrenar.setBackground(new java.awt.Color(102, 255, 51));
        btnEntrenar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEntrenar.setText("ENTRENAR");
        btnEntrenar.setToolTipText("Ir a entrenar");
        btnEntrenar.setBorder(null);
        btnEntrenar.setContentAreaFilled(false);
        btnEntrenar.setOpaque(true);
        btnEntrenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrenarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrenar);
        btnEntrenar.setBounds(20, 430, 140, 30);

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(240, 240, 240));
        jTextPane1.setBorder(null);
        jTextPane1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jTextPane1.setText("Freestyle Master Series:");
        jTextPane1.setAutoscrolls(false);
        jTextPane1.setCaretColor(new java.awt.Color(240, 240, 240));
        jPanel1.add(jTextPane1);
        jTextPane1.setBounds(30, 40, 220, 24);

        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Yamediosueno.png"))); // NOI18N
        jPanel1.add(Image);
        Image.setBounds(-60, 120, 500, 370);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrenarActionPerformed
        Entrenar entrenar = new Entrenar();
        entrenar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEntrenarActionPerformed

    private void jbtnVotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVotarActionPerformed
        Votar votar = new Votar();
        votar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnVotarActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackActionPerformed
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnBackActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Carga().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image;
    private javax.swing.JButton btnEntrenar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton jbtnBack;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnVotar;
    // End of variables declaration//GEN-END:variables
}
