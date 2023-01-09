package Modelo;

import Modelo.Carga;

public class Inicio extends javax.swing.JFrame {
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextPane1 = new javax.swing.JTextPane();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        Registrarme = new javax.swing.JButton();
        IniciarSesion = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextPane3 = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextPane1.setBackground(new java.awt.Color(51, 51, 51));
        jTextPane1.setBorder(null);
        jTextPane1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane1.setText("Correo:");
        jTextPane1.setAutoscrolls(false);
        jTextPane1.setCaretColor(new java.awt.Color(240, 240, 240));
        jPanel1.add(jTextPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jPasswordField1.setBackground(new java.awt.Color(240, 240, 240));
        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField1.setToolTipText("Ingresa tu contraseña");
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 320, 40));

        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_UrbanRooster.png"))); // NOI18N
        jLabel1.setToolTipText("Urban Roosters Logo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 201));

        Email.setBackground(new java.awt.Color(240, 240, 240));
        Email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Email.setText(" ");
        Email.setToolTipText("Ingresa tu correo electronico o número de telefono");
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        jPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 320, 40));

        Registrarme.setText("Registrarme");
        Registrarme.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        Registrarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarmeActionPerformed(evt);
            }
        });
        jPanel1.add(Registrarme, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 160, 40));

        IniciarSesion.setText("Iniciar Sesión");
        IniciarSesion.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(IniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 150, 40));

        jButton3.setText("x");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jTextPane3.setEditable(false);
        jTextPane3.setBackground(new java.awt.Color(51, 51, 51));
        jTextPane3.setBorder(null);
        jTextPane3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jTextPane3.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane3.setText("Contraseña:");
        jTextPane3.setAutoscrolls(false);
        jTextPane3.setCaretColor(new java.awt.Color(240, 240, 240));
        jPanel1.add(jTextPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("¿Estas sin conexión a internet? Prueba el modo sin conexión");
        jLabel2.setToolTipText("Modo del aplicativo sin conexión");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 280, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSesionActionPerformed
        
    }//GEN-LAST:event_IniciarSesionActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed

    }//GEN-LAST:event_EmailActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Carga carga = new Carga();
        carga.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void RegistrarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarmeActionPerformed
        
    }//GEN-LAST:event_RegistrarmeActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Inicio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JButton IniciarSesion;
    private javax.swing.JButton Registrarme;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane3;
    // End of variables declaration//GEN-END:variables
}
